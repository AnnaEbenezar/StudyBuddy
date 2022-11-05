package LoginSystem;

import MainSystem.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginUI extends JDialog {
    LoginDriver driver;

    public LoginUI(LoginDriver driver) {
        super();
        this.driver = driver;
        this.setModal(true);
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setContentPane(LoginFrame);
        this.setResizable(false);
        this.pack();

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.quit();
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                // search username password here and modify further

                driver.setUser(new User(username, password));
                driver.finishLogin();
            }
        });
    }

    private JPasswordField passwordField;
    private JTextField usernameField;
    private JButton cancelButton;
    private JButton loginButton;
    private JPanel LoginFrame;
    private JLabel errorField;
}
