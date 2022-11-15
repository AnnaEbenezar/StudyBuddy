package MainSystem;

import java.io.File;

public class User {
    //general info
    public final String username;
    public final String firstName;
    public final String lastName;

    // directories for data
    public final File settings;
    public final File profile;
    public final File schedule;
    public final File todo;


    public User(String user, String firstName, String lastName, File settingsDir, File profileDir, File scheduleDir, File todoDir) {
        this.username = user;
        this.firstName = firstName;
        this.lastName = lastName;

        this.settings = settingsDir;
        this.profile = profileDir;
        this.schedule = scheduleDir;
        this.todo = todoDir;
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
