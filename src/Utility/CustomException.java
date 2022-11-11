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

        public static final int PATTERN_ERROR = 1;
        public static final int DUPLICATE = 2;
        public static final int EMPTY_ERROR = 3;
        public static final int TOO_LONG = 4;
        public static final int TOO_SHORT = 5;
        int errorCode;
        String field;
        String advice;

        public LoginError() {
            super("");
        }
        public LoginError(String s) {
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

    class LoginPatternError extends LoginError {
        public LoginPatternError(String s) {
            super("Pattern does not match.");
            errorCode = PATTERN_ERROR;
            setField(s);
            advice = "Field contains an illegal character(s)";
        }

        public LoginPatternError(String s, String adv) {
            super("Pattern does not match.");
            errorCode = PATTERN_ERROR;
            setField(s);
            advice = adv;
        }
    }

    class LoginDuplicateError extends LoginError {
        public LoginDuplicateError(String s) {
            super("Duplicate found in database");
            errorCode = DUPLICATE;
            setField(s);
            advice = "This has already been taken. Try another.";
        }

        public LoginDuplicateError(String s, String adv) {
            super("Duplicate found in database");
            errorCode = DUPLICATE;
            setField(s);
            advice = adv;
        }
    }

    class LoginTooLongError extends LoginError {
        public LoginTooLongError(String s) {
            super("Field exceeds maximum length");
            errorCode = TOO_LONG;
            setField(s);
            advice = "This is too long.";
        }

        public LoginTooLongError(String s, String adv) {
            super("Field exceeds maximum length");
            errorCode = TOO_LONG;
            setField(s);
            advice = adv;
        }
    }

    class LoginTooShortError extends LoginError {
        public LoginTooShortError(String s) {
            super("Field does not reach minimum length");
            errorCode = TOO_SHORT;
            setField(s);
            advice = "This is too long.";
        }

        public LoginTooShortError(String s, String adv) {
            super("Field does not reach minimum length");
            errorCode = TOO_SHORT;
            setField(s);
            advice = adv;
        }
    }

}
