package Utility;

import javax.swing.*;
import java.awt.*;

public interface CustomException {
    class ModuleIsRunningException extends RuntimeException {
        public ModuleIsRunningException() {
            super("This module is already running");
        }
    }

    class ModuleIsNotRunningException extends RuntimeException {
        public ModuleIsNotRunningException() {
            super("This module is not running");
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

        public LoginError() {
            super("");
        }

        public LoginError(String s) {
            super(s);
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setAdvice(String s) {
            advice = s;
        }

        public String getAdvice() {
            return advice;
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

        public void showErrorMessage() {
            showErrorMessage(null);
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setField(String s) {
            field = s;
        }

        public String getField() {
            return field;
        }

        public void setAdvice(String s) {
            advice = s;
        }

        public String getAdvice() {
            return advice;
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
