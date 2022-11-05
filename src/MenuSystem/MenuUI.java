package MenuSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MenuUI extends JFrame {
    private MenuDriver driver;
    private JPanel MenuPanel;
    private JButton exitButton;
    private JButton logoutButton;
    private JButton scheduleButton;
    private JButton toDoListButton;
    private JButton profileButton;

    MenuUI(MenuDriver driver) {
        super("MainSystem.Main Menu");
        this.driver = driver;
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setContentPane(MenuPanel);
        this.setResizable(false);
        this.pack();

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
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.menuSelection(MenuDriver.MENU_PROFILE);
            }
        });
        scheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.menuSelection(MenuDriver.MENU_SCHEDULE);
            }
        });
        toDoListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.menuSelection(MenuDriver.MENU_TODO);
            }
        });
    }
}
