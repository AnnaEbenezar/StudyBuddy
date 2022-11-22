package MenuSystem;

import ProfileSystem.ProfileDriver;
import ScheduleSystem.ScheduleDriver;
import TodoSystem.ToDoDriver;
import Utility.CustomException;
import MainSystem.MainDriver;
import Utility.ModuleDriver;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;


public class MenuDriver implements ModuleDriver {
    public static final int MENU_EXIT = -1;
    public static final int MENU_LOGOUT = -2;
    public static final int MENU_PROFILE = 1;
    public static final int MENU_SCHEDULE = 2;
    public static final int MENU_TODO = 3;

    private MenuUI UI;
    public final MainDriver main;
    private volatile boolean runningFlag = false;
    private static MenuDriver instance = null;

    private MenuDriver(MainDriver main) {
        this.main = main;
    }

    public static MenuDriver getInstance(MainDriver main) {
        if (instance == null) {
            instance = new MenuDriver(main);
        }
        return instance;
    }

    @Override
    public void run() {
        if (UI != null && UI.isDisplayable()) {
            throw new CustomException.DuplicateUIException();
        }
        UI = new MenuUI(this);
        UI.setVisible(true);
        runningFlag = true;
    }

    @Override
    public void quitModule() {
        UI.clock.stop();
        UI.dispose();
        runningFlag = false;
    }

    public boolean isRunning() {
        return runningFlag;
    }

    public void exitProcedure() {
        int confirm = JOptionPane.showConfirmDialog(UI,
                "Do you want to exit?\n" +
                        "Any unsaved change will be lost."
                , "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {  //yes
            menuSelection(MenuDriver.MENU_EXIT);
        }
    }

    public void logoutProcedure() {
        int confirm = JOptionPane.showConfirmDialog(UI,
                "Do you want to logout?\n" +
                        "Any unsaved change will be lost."
                , "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {  //yes
            menuSelection(MenuDriver.MENU_LOGOUT);
        }
    }

    public void menuSelection(int selection) {
        try {
            switch (selection) {
                case MENU_EXIT -> main.gracefulExit();
                case MENU_LOGOUT -> main.reLogin();
                case MENU_PROFILE -> main.runModule(ProfileDriver.getInstance(main));
                case MENU_SCHEDULE -> main.runModule(ScheduleDriver.getInstance(main));
                case MENU_TODO -> main.runModule(ToDoDriver.getInstance(main));
            }
        } catch (CustomException.DuplicateUIException | CustomException.ModuleIsRunningException e) {
            JOptionPane.showMessageDialog(UI, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
