package ProfileSystem;

import MainSystem.MainDriver;
import MainSystem.User;
import Utility.ModuleDriver;

import java.io.File;

public class ProfileDriver implements ModuleDriver {
    private final MainDriver main;
    private static ProfileDriver instance = null;
    private volatile boolean runningFlag = false;
    private ProfileUI UI;

    private ProfileDriver(MainDriver main) {
        this.main = main;
    }

    public static ProfileDriver getInstance(MainDriver main) {
        if (instance == null) instance = new ProfileDriver(main);
        return instance;
    }

    @Override
    public void quitModule() {
        //quitting
        runningFlag = false;
    }

    @Override
    public boolean isRunning() {
        return this.runningFlag;
    }

    @Override
    public void run() {
        UI = new ProfileUI(this);
        this.runningFlag = true;


    }

    
}
