package LoginSystem;

import Utility.CustomException;
import MainSystem.MainDriver;
import MainSystem.User;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;


public class LoginDriver implements Runnable {
    private User loginUser;
    private static LoginDriver instance = null;
    private final MainDriver main;
    private LoginUI UI;
    public final CreateAccountDriver createDriver = new CreateAccountDriver();
    private HashMap<String, String> userPasswordMap;

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
        userPasswordMap = LoginFileHandler.getUserPasswordMap();
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

    public void login() {
        String username = UI.getUsername();
        char[] password = UI.getPassword();
        if (!userPasswordMap.containsKey(username)) {
            UI.setLoginErrorMessage("This username does not exist. Would you like to create account instead?");
            return;
        }

        String storedPassword = userPasswordMap.get(username);
        if (!PasswordManager.verifyPassword(password, storedPassword)) {
            UI.setLoginErrorMessage("Wrong password. Try entering again.");
            return;
        }
        // return user
        setUser(initialiseUser(username));
        UI.dispose();
        main.finishLogin(this.getUser());
    }


    public User initialiseUser(String username) throws CustomException.MissingDirectoryError {
        File parentDirectory = new File("resources/users/" + username);
        File settings = new File(parentDirectory, "settings");
        String firstName, lastName;
        try {
            Scanner settingsReader = new Scanner(settings);
            String[] name = settingsReader.nextLine().split(",");
            firstName = name[0];
            lastName = name[1];
        } catch (FileNotFoundException e) {
            throw new CustomException.MissingDirectoryError();
        }
        return new User(username, firstName, lastName, settings, new File(parentDirectory, "profile"),
                new File(parentDirectory, "schedule"), new File(parentDirectory, "todo"));

    }

    class CreateAccountDriver {
        boolean checkUsername() {
            String username = UI.createUI.getUsername();
            String pattern = "^[a-zA-Z0-9_]*$";
            if (username.length() < MINIMUM_USERNAME_LENGTH) {
                UI.createUI.setUsernameError("Username must be at least " + MINIMUM_USERNAME_LENGTH + " characters.");
                return false;
            }
            if (username.length() > MAXIMUM_USERNAME_LENGTH) {
                UI.createUI.setUsernameError("Username must be " + MAXIMUM_USERNAME_LENGTH + " characters or fewer.");
                return false;
            }
            if (!username.matches(pattern)) {
                UI.createUI.setUsernameError("Username can only contain a-z, A-Z, 0-9, and _(underscore).");
                return false;
            }
            if (userPasswordMap.containsKey(username.toLowerCase())) {
                UI.createUI.setUsernameError("This username already exist. Use another username.");
            }

            UI.createUI.setUsernameError(" ");
            return true;
        }

        boolean checkPassword() {
            String password = String.valueOf(UI.createUI.getPassword());
            if (password.length() < MINIMUM_PASSWORD_LENGTH) {
                UI.createUI.setPasswordError("Password must be at least " + MINIMUM_PASSWORD_LENGTH + " characters.");
                return false;
            }
            if (password.length() > MAXIMUM_PASSWORD_LENGTH) {
                UI.createUI.setPasswordError("Password must be " + MAXIMUM_PASSWORD_LENGTH + " characters or fewer.");
                return false;
            }

            UI.createUI.setPasswordError(" ");
            return true;
        }

        boolean confirmPassword() {
            if (String.valueOf(UI.createUI.getConfirmPassword()).equals(String.valueOf(UI.createUI.getPassword()))) {
                UI.createUI.setConfirmPasswordError(" ");
                return true;
            }

            UI.createUI.setConfirmPasswordError("This does not match with your password.");
            return false;
        }

        boolean confirmName() {
            if (UI.createUI.getFirstName().isBlank()) {
                UI.createUI.setNameError("Firstname cannot be empty.");
                return false;
            } else {
                UI.createUI.setNameError(" ");
                return true;
            }
        }

        boolean confirmLastName() {
            if (UI.createUI.getLastName().isBlank()) {
                UI.createUI.setLastNameError("Lastname cannot be empty.");
                return false;
            } else {
                UI.createUI.setLastNameError(" ");
                return true;
            }
        }

        void createAccount() {
            String username = UI.createUI.getUsername();
            char[] password = UI.createUI.getPassword();
            String firstName = UI.createUI.getFirstName();
            String lastName = UI.createUI.getLastName();

            if (checkUsername() && checkPassword() && confirmPassword() && confirmName() && confirmLastName()) {
                LoginFileHandler.addUser(username, PasswordManager.hashPassword(password), userPasswordMap, firstName, lastName);
                setUser(initialiseUser(username));
                UI.dispose();
                main.finishLogin(getUser());
            }
        }
    }


    private static class LoginFileHandler {
        public static HashMap<String, String> getUserPasswordMap() {
            File userPassCSV = new File("resources/logindata/login.csv");
            try {
                Scanner reader = new Scanner(userPassCSV);

                //  check if it is a username password csv file
                if (!reader.nextLine().equals("username,password")) {
                    throw new FileNotFoundException();
                }

                HashMap<String, String> userPasswordMap = new HashMap<>();

                while (reader.hasNextLine()) {
                    String[] parts = reader.nextLine().split(",");
                    String username = parts[0];
                    String password = parts[1];
                    userPasswordMap.put(username, password);
                }

                reader.close();
                return userPasswordMap;

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Login data is missing. Creating empty file", "Warning", JOptionPane.WARNING_MESSAGE);
                try {
                    File dir = new File("resources/logindata");
                    dir.mkdir();
                    userPassCSV.createNewFile();
                    FileWriter writer = new FileWriter(userPassCSV);
                    writer.write("username,password");
                    writer.close();
                    return new HashMap<String, String>();

                } catch (IOException fileEx) {
                    JOptionPane.showMessageDialog(null, "Cannot create files.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(1);
                    return null;
                }
            }
        }

        public static void addUser(String username, String password, HashMap<String, String> userPasswordMap, String name, String lastName) {
            File userPassCSV = new File("resources/logindata/login.csv");
            try {
                FileWriter writer = new FileWriter(userPassCSV, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.newLine();
                bufferedWriter.write(username);
                bufferedWriter.write(",");
                bufferedWriter.write(password);
                bufferedWriter.close();

                File dir = new File("resources/users/" + username);
                if (!dir.mkdir()) {
                    throw new CustomException.CreateAccountFileError();
                }

                File settings = new File(dir, "settings");
                File profile = new File(dir, "profile");
                File schedule = new File(dir, "schedule");
                File todo = new File(dir, "todo");

                if (!(settings.createNewFile() && profile.createNewFile() && schedule.createNewFile() && todo.createNewFile())) {
                    settings.delete();
                    profile.delete();
                    schedule.delete();
                    todo.delete();
                    dir.delete();
                    throw new CustomException.CreateAccountFileError();
                }

                FileWriter settingsWriter = new FileWriter(settings);
                settingsWriter.write(name + "," + lastName);
                settingsWriter.close();
                userPasswordMap.put(username, password);

            } catch (IOException e) {
                throw new CustomException.CreateAccountFileError();
            }
        }
    }

}
