package LoginSystem;

import Utility.CustomException;
import MainSystem.MainDriver;
import MainSystem.User;

import java.util.regex.Pattern;

public class LoginDriver implements Runnable {
    private User loginUser;
    private static LoginDriver instance = null;
    private final MainDriver main;
    private LoginUI UI;

    private LoginDriver(MainDriver main) {
        this.main = main;
    }

    public static final int CHECK_VALID = 0;
    public static final int CHECK_PATTERN_ERROR = 1;
    public static final int CHECK_DUPLICATE = 2;
    public static final int CHECK_EMPTY_ERROR = 3;
    public static final int CHECK_TOO_LONG = 4;
    public static final int CHECK_TOO_SHORT = 5;

    private static final int MINIMUM_USERNAME_LENGTH = 6;
    private static final int MAXIMUM_USERNAME_LENGTH = 20;
    private static final int MINIMUM_PASSWORD_LENGTH = 6;
    private static final int MAXIMUM_PASSWORD_LENGTH = 20;


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

    public int checkUsername(String username) {
        String pattern = "^[a-zA-Z0-9_]*$";
        if(username.length() < MINIMUM_USERNAME_LENGTH) return CHECK_TOO_SHORT;
        if(username.length() > MAXIMUM_USERNAME_LENGTH) return CHECK_TOO_LONG;
        if(!username.matches(pattern)) return CHECK_PATTERN_ERROR;
        //if duplicate return CHECK_DUPLICATE
        //TODO
        return CHECK_VALID;
    }
}
