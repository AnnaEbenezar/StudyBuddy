package MenuSystem;

import Utility.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;

public class MenuUI extends JFrame {
    private MenuDriver driver;
    private JPanel MenuPanel;
    private JButton exitButton;
    private JButton logoutButton;
    private JButton scheduleButton;
    private JButton toDoListButton;
    private JButton profileButton;

    MenuUI(MenuDriver driver) {
        super("Main Menu");
        this.driver = driver;
        $$$setupUI$$$();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setContentPane(MenuPanel);
        this.setSize(new Dimension(1000, 700));

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(MenuPanel,
                        "Do you want to exit?\n" +
                                "Any unsaved change will be lost."
                        , "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {  //yes
                    driver.menuSelection(MenuDriver.MENU_EXIT);
                }
            }
        });
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                exitButton.setBackground(new Color(20, 20, 20));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exitButton.setBackground(new Color(39, 42, 44));
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(MenuPanel,
                        "Do you want to logout?\n" +
                                "Any unsaved change will be lost."
                        , "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {  //yes
                    driver.menuSelection(MenuDriver.MENU_LOGOUT);
                }
            }
        });
        logoutButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logoutButton.setBackground(new Color(20, 20, 20));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                logoutButton.setBackground(new Color(39, 42, 44));
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.menuSelection(MenuDriver.MENU_PROFILE);
            }
        });
        profileButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                profileButton.setBackground(new Color(20, 20, 20));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                profileButton.setBackground(new Color(39, 42, 44));
            }
        });
        scheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.menuSelection(MenuDriver.MENU_SCHEDULE);
            }
        });
        scheduleButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                scheduleButton.setBackground(new Color(20, 20, 20));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                scheduleButton.setBackground(new Color(39, 42, 44));
            }
        });
        toDoListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.menuSelection(MenuDriver.MENU_TODO);
            }
        });
        toDoListButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                toDoListButton.setBackground(new Color(20, 20, 20));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                toDoListButton.setBackground(new Color(39, 42, 44));
            }
        });
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        MenuPanel = new JPanel();
        MenuPanel.setLayout(new BorderLayout(0, 0));
        MenuPanel.setBackground(new Color(-12696762));
        MenuPanel.setOpaque(true);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(new Color(-14210516));
        panel1.setOpaque(true);
        MenuPanel.add(panel1, BorderLayout.NORTH);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Consolas", Font.BOLD, 72, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-1447447));
        label1.setHorizontalAlignment(0);
        label1.setHorizontalTextPosition(0);
        label1.setText("Dashboard.");
        label1.setVerticalTextPosition(3);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 2.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(15, 20, 10, 50);
        panel1.add(label1, gbc);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(new Color(-14210516));
        panel2.setOpaque(true);
        MenuPanel.add(panel2, BorderLayout.WEST);
        profileButton = new JButton();
        profileButton.setBackground(new Color(-14210516));
        profileButton.setBorderPainted(false);
        profileButton.setFocusPainted(false);
        Font profileButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 26, profileButton.getFont());
        if (profileButtonFont != null) profileButton.setFont(profileButtonFont);
        profileButton.setForeground(new Color(-2829100));
        profileButton.setHorizontalTextPosition(11);
        profileButton.setOpaque(true);
        profileButton.setText("Profile");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(profileButton, gbc);
        scheduleButton = new JButton();
        scheduleButton.setBackground(new Color(-14210516));
        scheduleButton.setBorderPainted(false);
        scheduleButton.setFocusPainted(false);
        Font scheduleButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 26, scheduleButton.getFont());
        if (scheduleButtonFont != null) scheduleButton.setFont(scheduleButtonFont);
        scheduleButton.setForeground(new Color(-2829100));
        scheduleButton.setOpaque(true);
        scheduleButton.setText("Schedule");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(scheduleButton, gbc);
        toDoListButton = new JButton();
        toDoListButton.setBackground(new Color(-14210516));
        toDoListButton.setBorderPainted(false);
        toDoListButton.setFocusPainted(false);
        toDoListButton.setFocusTraversalPolicyProvider(false);
        Font toDoListButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 26, toDoListButton.getFont());
        if (toDoListButtonFont != null) toDoListButton.setFont(toDoListButtonFont);
        toDoListButton.setForeground(new Color(-2829100));
        toDoListButton.setOpaque(true);
        toDoListButton.setText("To-Do List");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(toDoListButton, gbc);
        logoutButton = new JButton();
        logoutButton.setBackground(new Color(-14210516));
        logoutButton.setBorderPainted(false);
        logoutButton.setFocusPainted(false);
        Font logoutButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 26, logoutButton.getFont());
        if (logoutButtonFont != null) logoutButton.setFont(logoutButtonFont);
        logoutButton.setForeground(new Color(-2829100));
        logoutButton.setOpaque(true);
        logoutButton.setText("Logout");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(logoutButton, gbc);
        exitButton = new JButton();
        exitButton.setBackground(new Color(-14210516));
        exitButton.setBorderPainted(false);
        exitButton.setFocusPainted(false);
        Font exitButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 26, exitButton.getFont());
        if (exitButtonFont != null) exitButton.setFont(exitButtonFont);
        exitButton.setForeground(new Color(-2829100));
        exitButton.setOpaque(true);
        exitButton.setText("Exit");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(exitButton, gbc);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        panel3.setBackground(new Color(-12696762));
        panel3.setOpaque(true);
        MenuPanel.add(panel3, BorderLayout.EAST);
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$("Consolas", Font.BOLD, 36, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setText("PLACEHOLDER");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(label2, gbc);
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
        return MenuPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
