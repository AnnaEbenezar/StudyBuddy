package LoginSystem;

import javax.swing.*;

public class LoginDriver {
    User loginUser;
    public LoginDriver(JFrame mainFrame) {
        LoginUI UI = new LoginUI(mainFrame);
        UI.setVisible(true);
        this.loginUser = UI.getUser();
    }
    public User getUser() {
        return loginUser;
    }

//    public static void main(String[] args) {
//        LoginUI UI = new LoginUI();
//        UI.setVisible(true);
//    }
}
