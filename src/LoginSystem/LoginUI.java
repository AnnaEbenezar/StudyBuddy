package LoginSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginUI extends JDialog {
    User loginUser;
    public LoginUI(JFrame frame) {
        super(frame, "Login", true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setContentPane(LoginFrame);
        this.setResizable(false);
        this.pack();

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                // search username password here and modify further

                loginUser = new User(username, password);
                dispose();
            }
        });
    }
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JButton cancelButton;
    private JButton loginButton;
    private JPanel LoginFrame;
    private JLabel errorField;

    public User getUser() {
        return loginUser;
    }
}
