package MainSystem;

import Utility.CustomException;
import LoginSystem.LoginDriver;
import MenuSystem.MenuDriver;
import Utility.ModuleDriver;

import java.util.Stack;


/**
 * MainSystem.Main driver class of the program
 */
public class MainDriver implements Runnable {
    private User currentUser;
    private final Stack<ModuleDriver> moduleStack = new Stack<>();

    @Override
    public void run() {
        login();
        runModule(MenuDriver.getInstance(this));
    }

    private void login() {
        LoginDriver login = LoginDriver.getInstance(this);
        login.run();

        currentUser = login.getUser();
        if (currentUser == null) {
            System.exit(0);
        }  // if failed to get user --> exit
    }

    public void reLogin() {
        currentUser = null;
        quitAllModules();
        run();
    }

    public User getUser() {
        return currentUser;
    }

    public void runModule(ModuleDriver module) {
        if (module.isRunning()) {
            throw new CustomException.ModuleIsRunningException();
        }
        module.run();
        moduleStack.push(module);
    }

    public void quitAllModules() {
        while (!moduleStack.isEmpty()) {
            moduleStack.pop().quitModule();
        }
    }

    public void gracefulExit() {
        quitAllModules();
    }
}