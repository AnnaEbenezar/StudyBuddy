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

    public boolean checkUsername(String username) throws CustomException.LoginError {
        String pattern = "^[a-zA-Z0-9_]*$";
        if(username.length() < MINIMUM_USERNAME_LENGTH) {
            throw new CustomException.LoginTooShortError(
                    "Username", "Username must be at least " + MINIMUM_USERNAME_LENGTH + " characters.");
        }
        if(username.length() > MAXIMUM_USERNAME_LENGTH) {
            throw new CustomException.LoginTooLongError(
                    "Username", "Username must be " + MAXIMUM_USERNAME_LENGTH + " characters or fewer.");
        }
        if(!username.matches(pattern)) {
            throw new CustomException.LoginPatternError(
                    "Username", "Username can only contain a-z, A-Z, 0-9, and _(underscore).");
        }
        //if duplicate return CHECK_DUPLICATE
        //TODO
        return true;
    }

    public boolean checkPassword(String password) throws CustomException.LoginError{
        if(password.length() < MINIMUM_PASSWORD_LENGTH) {
            throw new CustomException.LoginTooShortError(
                    "Password", "Password must be at least " + MINIMUM_PASSWORD_LENGTH + " characters.");
        }
        if(password.length() > MAXIMUM_PASSWORD_LENGTH) {
            throw new CustomException.LoginTooLongError(
                    "Password", "Password must be " + MAXIMUM_PASSWORD_LENGTH + " characters or fewer.");
        }

        return true;
    }
}
