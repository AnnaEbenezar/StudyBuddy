package MenuSystem;

import LoginSystem.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MenuUI extends JDialog {
    User currentUser;
    int selection = -1;
    private JPanel MenuPanel;
    private JButton exitButton;

    MenuUI(JFrame mainFrame, User curUser) {
        super(mainFrame, "Main Menu", true);
        this.currentUser = curUser;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setContentPane(MenuPanel);
        this.setResizable(false);
        this.pack();

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(MenuPanel,
                        "Do you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {  //yes
                    selection = -1;
                    dispose();
                } else {  //no
                    return;
                }
            }
        });
    }

    public int getSelection() {
        return this.selection;
    }
}
