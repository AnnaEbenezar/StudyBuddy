package MainSystem;

import Utility.CustomException;
import LoginSystem.LoginDriver;
import MenuSystem.MenuDriver;
import Utility.ModuleDriver;

import javax.swing.*;
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
    }

    private void login() {
        LoginDriver login = LoginDriver.getInstance(this);
        login.run();
    }

    public void finishLogin(User loginUser) {
        if (loginUser == null) {
            JOptionPane.showMessageDialog(null, "Login Error", "Login Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        currentUser = loginUser;
        this.runModule(MenuDriver.getInstance(this));
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