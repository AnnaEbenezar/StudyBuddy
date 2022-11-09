package LoginSystem;

import Utility.CustomException;
import MainSystem.MainDriver;
import MainSystem.User;

public class LoginDriver implements Runnable {
    private User loginUser;
    private static LoginDriver instance = null;
    private final MainDriver main;
    private LoginUI UI;

    private LoginDriver(MainDriver main) {
        this.main = main;
    }

    public static LoginDriver getInstance(MainDriver main) {
        if (instance == null) {
            instance = new LoginDriver(main);
        }
        return instance;
    }

    @Override
    public void run() {
        if (UI != null && UI.isDisplayable()) {
            throw new CustomException.DuplicateUIException();
        }

        UI = new LoginUI(this);
        UI.setVisible(true);
    }

    public void quit() {
        System.exit(0);
    }

    public User getUser() {
        return this.loginUser;
    }

    public void setUser(User u) {
        this.loginUser = u;
    }

    public void finishLogin() {
        UI.dispose();
        main.finishLogin(this.getUser());
    }

//    public static void main(String[] args) {
//        LoginUI UI = new LoginUI();
//        UI.setVisible(true);
//    }
}
