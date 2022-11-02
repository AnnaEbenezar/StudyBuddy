import LoginSystem.LoginDriver;
import LoginSystem.User;
import ProfileSystem.ProfileDriver;
import ScheduleSystem.ScheduleDriver;

import javax.swing.*;

/**
 * Main driver class of the program
 */
class MainDriver {
    public static void main(String[] args) {
        User currentUser;
        JFrame main = new JFrame("Main");
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // for testing

        LoginDriver login = new LoginDriver();
        currentUser = login.getUser(main);
        System.out.println(currentUser);

        // pack with JPanel later :))
        main.setVisible(true);
    }
}