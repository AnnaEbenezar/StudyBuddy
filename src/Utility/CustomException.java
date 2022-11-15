package Utility;

import javax.swing.*;
import java.awt.*;

public interface CustomException {
    class ModuleIsRunningException extends RuntimeException {
        public ModuleIsRunningException() {
            super("This module is already running");
        }
    }

    class DuplicateUIException extends RuntimeException {
        public DuplicateUIException() {
            super("UI Windows are duplicated. (This shouldn't happen)");
        }
    }

    abstract class LoginError extends RuntimeException {
        public static final int USERNAME_DOES_NOT_EXIST = 1;
        public static final int PASSWORD_DOES_NOT_MATCH = 2;
        public static final int PASSWORD_TOO_LONG = 3;
        public static final int DIRECTORY_CORRUPTED = -1;

        int errorCode;
        String advice;

        public LoginError() {super("");}
        public LoginError(String s) {super(s);}
        public int getErrorCode() {return errorCode;}
        public void setAdvice(String s) {advice = s;}
        public String getAdvice() {return advice;}
    }

    class NoUsernameError extends LoginError {
        public NoUsernameError() {
            super("Username is not found in database.");
            errorCode = USERNAME_DOES_NOT_EXIST;
            advice = "This username does not exist. Would you like to create account instead?";
        }
        public NoUsernameError(String adv) {
            super("Username is not found in database.");
            errorCode = USERNAME_DOES_NOT_EXIST;
            advice = adv;
        }
    }

    class PasswordError extends LoginError {
        public PasswordError() {
            super("Password does not match.");
            errorCode = USERNAME_DOES_NOT_EXIST;
            advice = "Wrong password. Try entering again.";
        }
        public PasswordError(String adv) {
            super("Password does not match.");
            errorCode = USERNAME_DOES_NOT_EXIST;
            advice = adv;
        }
    }

    class MissingDirectoryError extends LoginError {
        public MissingDirectoryError() {
            super("Directory is corrupted");
            errorCode = DIRECTORY_CORRUPTED;
            advice = "Some of the files are missing.";
        }

        public MissingDirectoryError(String adv) {
            super("Directory is corrupted");
            errorCode = DIRECTORY_CORRUPTED;
            advice = adv;
        }
    }
    abstract class CreateAccountError extends RuntimeException {

        public static final int PATTERN_ERROR = 1;
        public static final int DUPLICATE = 2;
        public static final int EMPTY_ERROR = 3;
        public static final int TOO_LONG = 4;
        public static final int TOO_SHORT = 5;
        public static final int FILE_ERROR = -1;
        int errorCode;
        String field;
        String advice;

        public CreateAccountError() {
            super("");
        }
        public CreateAccountError(String s) {
            super(s);
        }

        public void showErrorMessage(Component window) {
            String message = this.getMessage() + "\n" + getField() + "\nerror: " + errorCode;
            JOptionPane.showMessageDialog(window, message, "Error", JOptionPane.ERROR_MESSAGE);
        }
        public void showErrorMessage() {showErrorMessage(null);}
        public int getErrorCode() {return errorCode;}
        public void setField(String s) {field = s;}
        public String getField() {return field;}
        public void setAdvice(String s) {advice = s;}
        public String getAdvice() {return advice;}
    }

    class CreateAccountPatternError extends CreateAccountError {
        public CreateAccountPatternError(String s) {
            super("Pattern does not match.");
            errorCode = PATTERN_ERROR;
            setField(s);
            advice = "Field contains an illegal character(s)";
        }

        public CreateAccountPatternError(String s, String adv) {
            super("Pattern does not match.");
            errorCode = PATTERN_ERROR;
            setField(s);
            advice = adv;
        }
    }

    class CreateAccountDuplicateError extends CreateAccountError {
        public CreateAccountDuplicateError(String s) {
            super("Duplicate found in database");
            errorCode = DUPLICATE;
            setField(s);
            advice = "This has already been taken. Try another.";
        }

        public CreateAccountDuplicateError(String s, String adv) {
            super("Duplicate found in database");
            errorCode = DUPLICATE;
            setField(s);
            advice = adv;
        }
    }

    class CreateAccountTooLongError extends CreateAccountError {
        public CreateAccountTooLongError(String s) {
            super("Field exceeds maximum length");
            errorCode = TOO_LONG;
            setField(s);
            advice = "This is too long.";
        }

        public CreateAccountTooLongError(String s, String adv) {
            super("Field exceeds maximum length");
            errorCode = TOO_LONG;
            setField(s);
            advice = adv;
        }
    }

    class CreateAccountTooShortError extends CreateAccountError {
        public CreateAccountTooShortError(String s) {
            super("Field does not reach minimum length");
            errorCode = TOO_SHORT;
            setField(s);
            advice = "This is too long.";
        }

        public CreateAccountTooShortError(String s, String adv) {
            super("Field does not reach minimum length");
            errorCode = TOO_SHORT;
            setField(s);
            advice = adv;
        }
    }

    class CreateAccountFileError extends CreateAccountError {
        public CreateAccountFileError() {
            super("Cannot write user data to file.");
            errorCode = FILE_ERROR;
            advice = "Cannot create account.";
        }

        public CreateAccountFileError(String adv) {
            super("Cannot write user data to file.");
            errorCode = FILE_ERROR;
            advice = adv;
        }
    }

}
