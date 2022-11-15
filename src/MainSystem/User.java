package MainSystem;

import java.io.File;

public class User {
    //general info
    private final String username;
    private final String firstName;
    private final String lastName;

    // directories for data
    private final File settings;
    private final File profile;
    private final File schedule;
    private final File todo;


    public User(String user, String firstName, String lastName, File settingsDir, File profileDir, File scheduleDir, File todoDir) {
        this.username = user;
        this.firstName = firstName;
        this.lastName = lastName;

        this.settings = settingsDir;
        this.profile = profileDir;
        this.schedule = scheduleDir;
        this.todo = todoDir;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public File getSettings() {
        return settings;
    }

    public File getProfile() {
        return profile;
    }

    public File getSchedule() {
        return schedule;
    }

    public File getTodo() {
        return todo;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", settings='" + settings + '\'' +
                ", profile='" + profile + '\'' +
                ", schedule='" + schedule + '\'' +
                ", todo='" + todo + '\'' +
                '}';
    }
}
