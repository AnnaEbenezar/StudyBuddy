package MenuSystem;

import LoginSystem.User;

import javax.swing.*;

public class MenuDriver {
    private int selection = -1;

    public MenuDriver(JFrame mainFrame, User currentUser){
        MenuUI UI = new MenuUI(mainFrame, currentUser);
        UI.setVisible(true);
        selection = UI.getSelection();
    }

    public int getSelection() {
        return this.selection;
    }

}
