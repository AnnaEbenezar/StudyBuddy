import LoginSystem.LoginDriver;
import LoginSystem.User;
import MenuSystem.MenuDriver;
import ProfileSystem.ProfileDriver;
import ScheduleSystem.ScheduleDriver;
import TodoSystem.ToDoDriver;

import javax.swing.*;

/**
 * Main driver class of the program
 */
class MainDriver {
    public static void main(String[] args) {
        User currentUser;
        JFrame main = new JFrame();
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // for testing

        LoginDriver login = new LoginDriver(main);
        currentUser = login.getUser();
        if(currentUser == null) {System.exit(0);}  // if failed to get user --> exit
        System.out.println(currentUser);  // for testing

        // pack with JPanel later :))
        int nextSelection = 0;
        while (true) {
            switch(nextSelection) {
                case 1:  // profile
                    ProfileDriver profile = new ProfileDriver(main);
                    nextSelection = 0;
                    break;
                case 2:  // Schedule
                    ScheduleDriver schedule = new ScheduleDriver(main);
                    nextSelection = 0;
                    break; // To-do
                case 3:
                    ToDoDriver toDo = new ToDoDriver(main);
                    nextSelection = 0;
                    break;
                case -1:  // exit
                    System.exit(0);
                    break;
                default:  // back to menu
                    MenuDriver menu = new MenuDriver(main, currentUser);
                    nextSelection = menu.getSelection();
                    break;

            }
        }
    }
}