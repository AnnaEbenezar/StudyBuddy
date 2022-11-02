package LoginSystem;

import javax.swing.*;

public class LoginDriver {
    public User getUser(JFrame mainFrame) {
        LoginUI UI = new LoginUI(mainFrame);
        UI.setVisible(true);
        return UI.getUser();
    }

//    public static void main(String[] args) {
//        LoginUI UI = new LoginUI();
//        UI.setVisible(true);
//    }
}
