package LoginSystem;

import MainSystem.User;
import Utility.ImagePanel;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;


public class LoginUI extends JFrame {
    public final LoginDriver driver;
    CreateAccountUI createUI;

    public LoginUI(LoginDriver driver) {
        super();
        this.driver = driver;
        $$$setupUI$$$();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setTitle("Login");
        this.setLayout(new BorderLayout());
        this.setContentPane(new ImagePanel("resources/img/8bitbg.jpg"));

        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(1000, 800));
        createLoginUI();
//        this.setUndecorated(true);

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
        donTHaveAnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAccountUI();
            }
        });

        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                cancelButton.setOpaque(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseEntered(e);
                cancelButton.setOpaque(false);
            }
        });
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                loginButton.setOpaque(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                loginButton.setOpaque(false);
            }
        });
        donTHaveAnButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                donTHaveAnButton.setOpaque(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                donTHaveAnButton.setOpaque(false);
            }
        });
    }

    public void createLoginUI() {
        if (createUI != null) {
            this.remove(createUI);
            createUI = null;
        }
        this.add(LoginFrame);
        this.setMinimumSize(new Dimension(600, 600));
        this.invalidate();
        this.validate();
        this.repaint();
    }

    private void createAccountUI() {
        this.remove(LoginFrame);
        createUI = new CreateAccountUI(this);
        this.add(createUI);
        this.setMinimumSize(new Dimension(750, 700));
        this.invalidate();
        this.validate();
        this.repaint();
    }

    private JPasswordField passwordField;
    private JTextField usernameField;
    private JButton cancelButton;
    private JButton loginButton;
    private JPanel LoginFrame;
    private JButton donTHaveAnButton;

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        panel1.setOpaque(false);
        LoginFrame = new JPanel();
        LoginFrame.setLayout(new GridBagLayout());
        LoginFrame.setBackground(new Color(-14737633));
        LoginFrame.setForeground(new Color(-14737633));
        LoginFrame.setOpaque(false);
        panel1.add(LoginFrame, BorderLayout.CENTER);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setOpaque(false);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        LoginFrame.add(panel2, gbc);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Consolas", Font.BOLD, 72, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-1447447));
        label1.setHorizontalAlignment(0);
        label1.setHorizontalTextPosition(0);
        label1.setText("Welcome.");
        label1.setVerticalTextPosition(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.ipady = 30;
        gbc.insets = new Insets(30, 0, 0, 0);
        panel2.add(label1, gbc);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        panel3.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 30;
        gbc.ipady = 50;
        LoginFrame.add(panel3, gbc);
        final JLabel label2 = new JLabel();
        label2.setBackground(new Color(-2829100));
        Font label2Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-1447447));
        label2.setText("Username: ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(label2, gbc);
        final JLabel label3 = new JLabel();
        label3.setBackground(new Color(-2829100));
        Font label3Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-1447447));
        label3.setText("Password: ");
        label3.setVerticalAlignment(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.ipady = 20;
        panel3.add(label3, gbc);
        passwordField = new JPasswordField();
        passwordField.setBackground(new Color(-14737633));
        passwordField.setCaretColor(new Color(-2829100));
        Font passwordFieldFont = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, passwordField.getFont());
        if (passwordFieldFont != null) passwordField.setFont(passwordFieldFont);
        passwordField.setForeground(new Color(-1447447));
        passwordField.setOpaque(false);
        passwordField.setSelectedTextColor(new Color(-14737633));
        passwordField.setSelectionColor(new Color(-5811170));
        passwordField.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 500;
        gbc.ipady = 5;
        panel3.add(passwordField, gbc);
        usernameField = new JTextField();
        usernameField.setBackground(new Color(-14737633));
        usernameField.setCaretColor(new Color(-2829100));
        Font usernameFieldFont = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, usernameField.getFont());
        if (usernameFieldFont != null) usernameField.setFont(usernameFieldFont);
        usernameField.setForeground(new Color(-1447447));
        usernameField.setOpaque(false);
        usernameField.setSelectedTextColor(new Color(-14737633));
        usernameField.setSelectionColor(new Color(-5811170));
        usernameField.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 500;
        gbc.ipady = 5;
        panel3.add(usernameField, gbc);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridBagLayout());
        panel4.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        LoginFrame.add(panel4, gbc);
        cancelButton = new JButton();
        cancelButton.setBackground(new Color(-12171706));
        cancelButton.setBorderPainted(false);
        cancelButton.setFocusPainted(false);
        Font cancelButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 20, cancelButton.getFont());
        if (cancelButtonFont != null) cancelButton.setFont(cancelButtonFont);
        cancelButton.setForeground(new Color(-2829100));
        cancelButton.setOpaque(false);
        cancelButton.setText("Exit");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 20;
        gbc.ipady = 10;
        panel4.add(cancelButton, gbc);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new GridBagLayout());
        panel5.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 20, 0, 20);
        panel4.add(panel5, gbc);
        loginButton = new JButton();
        loginButton.setBackground(new Color(-12171706));
        loginButton.setBorderPainted(false);
        loginButton.setFocusPainted(false);
        Font loginButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 20, loginButton.getFont());
        if (loginButtonFont != null) loginButton.setFont(loginButtonFont);
        loginButton.setForeground(new Color(-2829100));
        loginButton.setOpaque(false);
        loginButton.setText("Login");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.ipadx = 20;
        gbc.ipady = 10;
        panel4.add(loginButton, gbc);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new GridBagLayout());
        panel6.setEnabled(true);
        panel6.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.insets = new Insets(20, 0, 0, 0);
        LoginFrame.add(panel6, gbc);
        donTHaveAnButton = new JButton();
        donTHaveAnButton.setBackground(new Color(-12171706));
        donTHaveAnButton.setBorderPainted(false);
        donTHaveAnButton.setEnabled(true);
        donTHaveAnButton.setFocusPainted(false);
        Font donTHaveAnButtonFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 14, donTHaveAnButton.getFont());
        if (donTHaveAnButtonFont != null) donTHaveAnButton.setFont(donTHaveAnButtonFont);
        donTHaveAnButton.setForeground(new Color(-2829100));
        donTHaveAnButton.setOpaque(false);
        donTHaveAnButton.setText("Don't have an account yet?");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 50;
        gbc.insets = new Insets(20, 0, 0, 0);
        panel6.add(donTHaveAnButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

}
