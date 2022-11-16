package LoginSystem;

import Utility.CustomException;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

public class CreateAccountUI extends JPanel {
    private final LoginUI mainUI;
    private JButton cancelButton;
    private JButton createAccountButton;
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JPanel createAccountPanel;
    private JLabel usernameError;
    private JLabel passwordError;
    private JLabel confirmPasswordError;
    private JLabel nameError;
    private JLabel lastNameError;
    private JPasswordField confirmPasswordField;
    private JTextField nameField;
    private JTextField lastnameField;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    public CreateAccountUI(LoginUI main) {
        this.mainUI = main;
        this.setLayout(new BorderLayout());
        this.add(createAccountPanel);
        this.setOpaque(false);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI.createLoginUI();
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
                super.mouseExited(e);
                cancelButton.setOpaque(false);
            }
        });
        createAccountButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                createAccountButton.setOpaque(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                createAccountButton.setOpaque(false);
            }
        });
        usernameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                mainUI.driver.createDriver.checkUsername();
            }
        });
        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                mainUI.driver.createDriver.checkPassword();
            }
        });
        confirmPasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                mainUI.driver.createDriver.confirmPassword();
            }
        });
        nameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                mainUI.driver.createDriver.confirmName();
            }
        });
        lastnameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                mainUI.driver.createDriver.confirmLastName();
            }
        });
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI.driver.createDriver.createAccount();
            }
        });
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public char[] getPassword() {
        return passwordField.getPassword();
    }

    public char[] getConfirmPassword() {
        return confirmPasswordField.getPassword();
    }

    public String getFirstName() {
        return nameField.getText();
    }

    public String getLastName() {
        return lastnameField.getText();
    }

    public void setUsernameError(String message) {
        this.usernameError.setText(message);
    }

    public void setPasswordError(String message) {
        this.passwordError.setText(message);
    }

    public void setConfirmPasswordError(String message) {
        this.confirmPasswordError.setText(message);
    }

    public void setNameError(String message) {
        this.nameError.setText(message);
    }

    public void setLastNameError(String message) {
        this.lastNameError.setText(message);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createAccountPanel = new JPanel();
        createAccountPanel.setLayout(new BorderLayout(0, 0));
        createAccountPanel.setOpaque(false);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setOpaque(false);
        createAccountPanel.add(panel1, BorderLayout.NORTH);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Consolas", Font.BOLD, 72, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-1447447));
        label1.setHorizontalAlignment(0);
        label1.setHorizontalTextPosition(0);
        label1.setText("Hello There!");
        label1.setVerticalTextPosition(3);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(60, 0, 0, 0);
        panel1.add(label1, gbc);
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$("Consolas", Font.BOLD, 18, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-1447447));
        label2.setHorizontalAlignment(0);
        label2.setHorizontalTextPosition(0);
        label2.setText("Welcome to StudyBuddy application! To use, create your account first!");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel1.add(label2, gbc);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setMinimumSize(new Dimension(1200, 300));
        panel2.setOpaque(false);
        panel2.setPreferredSize(new Dimension(1200, 300));
        createAccountPanel.add(panel2, BorderLayout.CENTER);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(0, 0));
        panel3.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel2.add(panel3, gbc);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout(0, 0));
        panel4.setOpaque(false);
        panel3.add(panel4, BorderLayout.NORTH);
        final JLabel label3 = new JLabel();
        label3.setBackground(new Color(-2829100));
        Font label3Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-1447447));
        label3.setText("Username: ");
        panel4.add(label3, BorderLayout.NORTH);
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
        panel4.add(usernameField, BorderLayout.CENTER);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new BorderLayout(0, 0));
        panel5.setMinimumSize(new Dimension(550, 24));
        panel5.setOpaque(false);
        panel5.setPreferredSize(new Dimension(550, 24));
        panel4.add(panel5, BorderLayout.EAST);
        usernameError = new JLabel();
        usernameError.setForeground(new Color(-3504317));
        usernameError.setMaximumSize(new Dimension(10, 16));
        usernameError.setMinimumSize(new Dimension(10, 16));
        usernameError.setPreferredSize(new Dimension(10, 16));
        usernameError.setText(" ");
        panel3.add(usernameError, BorderLayout.SOUTH);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new BorderLayout(0, 0));
        panel6.setMinimumSize(new Dimension(1050, 135));
        panel6.setOpaque(false);
        panel6.setPreferredSize(new Dimension(1050, 135));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel2.add(panel6, gbc);
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new BorderLayout(0, 0));
        panel7.setMaximumSize(new Dimension(500, 200));
        panel7.setMinimumSize(new Dimension(500, 200));
        panel7.setOpaque(false);
        panel7.setPreferredSize(new Dimension(500, 200));
        panel6.add(panel7, BorderLayout.WEST);
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new BorderLayout(0, 0));
        panel8.setOpaque(false);
        panel7.add(panel8, BorderLayout.NORTH);
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new BorderLayout(0, 0));
        panel9.setOpaque(false);
        panel8.add(panel9, BorderLayout.NORTH);
        final JLabel label4 = new JLabel();
        label4.setBackground(new Color(-2829100));
        Font label4Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-1447447));
        label4.setText("Password: ");
        label4.setVerticalAlignment(3);
        panel9.add(label4, BorderLayout.NORTH);
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
        panel9.add(passwordField, BorderLayout.CENTER);
        passwordError = new JLabel();
        passwordError.setForeground(new Color(-3504317));
        passwordError.setHorizontalTextPosition(0);
        passwordError.setText(" ");
        panel8.add(passwordError, BorderLayout.CENTER);
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new BorderLayout(0, 0));
        panel10.setOpaque(false);
        panel7.add(panel10, BorderLayout.CENTER);
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new BorderLayout(0, 0));
        panel11.setOpaque(false);
        panel10.add(panel11, BorderLayout.NORTH);
        final JLabel label5 = new JLabel();
        label5.setBackground(new Color(-2829100));
        Font label5Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-1447447));
        label5.setText("Name:");
        label5.setVerticalAlignment(3);
        panel11.add(label5, BorderLayout.NORTH);
        nameField = new JTextField();
        nameField.setBackground(new Color(-14737633));
        nameField.setCaretColor(new Color(-2829100));
        Font nameFieldFont = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, nameField.getFont());
        if (nameFieldFont != null) nameField.setFont(nameFieldFont);
        nameField.setForeground(new Color(-1447447));
        nameField.setOpaque(false);
        nameField.setSelectedTextColor(new Color(-14737633));
        nameField.setSelectionColor(new Color(-5811170));
        nameField.setText("");
        panel11.add(nameField, BorderLayout.CENTER);
        nameError = new JLabel();
        nameError.setForeground(new Color(-3504317));
        nameError.setText(" ");
        nameError.setVerticalTextPosition(1);
        panel10.add(nameError, BorderLayout.SOUTH);
        final JPanel panel12 = new JPanel();
        panel12.setLayout(new GridBagLayout());
        panel12.setMinimumSize(new Dimension(50, 50));
        panel12.setOpaque(false);
        panel12.setPreferredSize(new Dimension(50, 50));
        panel6.add(panel12, BorderLayout.CENTER);
        final JPanel panel13 = new JPanel();
        panel13.setLayout(new BorderLayout(0, 0));
        panel13.setMaximumSize(new Dimension(500, 200));
        panel13.setMinimumSize(new Dimension(500, 200));
        panel13.setOpaque(false);
        panel13.setPreferredSize(new Dimension(500, 200));
        panel6.add(panel13, BorderLayout.EAST);
        final JPanel panel14 = new JPanel();
        panel14.setLayout(new BorderLayout(0, 0));
        panel14.setOpaque(false);
        panel13.add(panel14, BorderLayout.NORTH);
        final JPanel panel15 = new JPanel();
        panel15.setLayout(new BorderLayout(0, 0));
        panel15.setOpaque(false);
        panel14.add(panel15, BorderLayout.NORTH);
        final JLabel label6 = new JLabel();
        label6.setBackground(new Color(-2829100));
        Font label6Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setForeground(new Color(-1447447));
        label6.setText("Confirm Password:");
        label6.setVerticalAlignment(3);
        panel15.add(label6, BorderLayout.NORTH);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBackground(new Color(-14737633));
        confirmPasswordField.setCaretColor(new Color(-2829100));
        Font confirmPasswordFieldFont = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, confirmPasswordField.getFont());
        if (confirmPasswordFieldFont != null) confirmPasswordField.setFont(confirmPasswordFieldFont);
        confirmPasswordField.setForeground(new Color(-1447447));
        confirmPasswordField.setOpaque(false);
        confirmPasswordField.setSelectedTextColor(new Color(-14737633));
        confirmPasswordField.setSelectionColor(new Color(-5811170));
        confirmPasswordField.setText("");
        panel15.add(confirmPasswordField, BorderLayout.CENTER);
        confirmPasswordError = new JLabel();
        confirmPasswordError.setForeground(new Color(-3504317));
        confirmPasswordError.setHorizontalAlignment(2);
        confirmPasswordError.setText(" ");
        panel14.add(confirmPasswordError, BorderLayout.CENTER);
        final JPanel panel16 = new JPanel();
        panel16.setLayout(new BorderLayout(0, 0));
        panel16.setOpaque(false);
        panel13.add(panel16, BorderLayout.CENTER);
        final JPanel panel17 = new JPanel();
        panel17.setLayout(new BorderLayout(0, 0));
        panel17.setOpaque(false);
        panel16.add(panel17, BorderLayout.NORTH);
        final JLabel label7 = new JLabel();
        label7.setBackground(new Color(-2829100));
        Font label7Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setForeground(new Color(-1447447));
        label7.setText("Last Name:");
        label7.setVerticalAlignment(3);
        panel17.add(label7, BorderLayout.NORTH);
        lastnameField = new JTextField();
        lastnameField.setBackground(new Color(-14737633));
        lastnameField.setCaretColor(new Color(-2829100));
        Font lastnameFieldFont = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, lastnameField.getFont());
        if (lastnameFieldFont != null) lastnameField.setFont(lastnameFieldFont);
        lastnameField.setForeground(new Color(-1447447));
        lastnameField.setOpaque(false);
        lastnameField.setSelectedTextColor(new Color(-14737633));
        lastnameField.setSelectionColor(new Color(-5811170));
        lastnameField.setText("");
        panel17.add(lastnameField, BorderLayout.CENTER);
        lastNameError = new JLabel();
        lastNameError.setForeground(new Color(-3504317));
        lastNameError.setText(" ");
        lastNameError.setVerticalTextPosition(1);
        panel16.add(lastNameError, BorderLayout.SOUTH);
        final JPanel panel18 = new JPanel();
        panel18.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel18.setOpaque(false);
        createAccountPanel.add(panel18, BorderLayout.SOUTH);
        cancelButton = new JButton();
        cancelButton.setBackground(new Color(-12171706));
        cancelButton.setBorderPainted(false);
        cancelButton.setFocusPainted(false);
        Font cancelButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 20, cancelButton.getFont());
        if (cancelButtonFont != null) cancelButton.setFont(cancelButtonFont);
        cancelButton.setForeground(new Color(-2829100));
        cancelButton.setMaximumSize(new Dimension(150, 50));
        cancelButton.setMinimumSize(new Dimension(150, 50));
        cancelButton.setOpaque(false);
        cancelButton.setPreferredSize(new Dimension(150, 50));
        cancelButton.setText("Back");
        panel18.add(cancelButton);
        final JPanel panel19 = new JPanel();
        panel19.setLayout(new GridBagLayout());
        panel19.setMinimumSize(new Dimension(50, 50));
        panel19.setOpaque(false);
        panel19.setPreferredSize(new Dimension(50, 50));
        panel18.add(panel19);
        createAccountButton = new JButton();
        createAccountButton.setBackground(new Color(-12171706));
        createAccountButton.setBorderPainted(false);
        createAccountButton.setFocusPainted(false);
        Font createAccountButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 20, createAccountButton.getFont());
        if (createAccountButtonFont != null) createAccountButton.setFont(createAccountButtonFont);
        createAccountButton.setForeground(new Color(-2829100));
        createAccountButton.setMaximumSize(new Dimension(200, 50));
        createAccountButton.setMinimumSize(new Dimension(200, 50));
        createAccountButton.setOpaque(false);
        createAccountButton.setPreferredSize(new Dimension(200, 50));
        createAccountButton.setText("Create Account");
        panel18.add(createAccountButton);
        label4.setLabelFor(passwordField);
        passwordField.setNextFocusableComponent(confirmPasswordField);
        passwordError.setLabelFor(passwordField);
        nameField.setNextFocusableComponent(lastnameField);
        label6.setLabelFor(confirmPasswordField);
        confirmPasswordField.setNextFocusableComponent(nameField);
        confirmPasswordError.setLabelFor(confirmPasswordField);
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

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return createAccountPanel;
    }


}
