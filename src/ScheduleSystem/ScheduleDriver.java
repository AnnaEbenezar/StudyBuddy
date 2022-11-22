package ScheduleSystem;

import MainSystem.MainDriver;
import Utility.ModuleDriver;


public class ScheduleDriver implements ModuleDriver {
    private final MainDriver main;
    private static ScheduleDriver instance;
    private volatile boolean runningFlag = false;

    private ScheduleDriver(MainDriver main) {
        this.main = main;
    }

    public static ScheduleDriver getInstance(MainDriver main) {
        if (instance == null) instance = new ScheduleDriver(main);
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
        // starting
        this.runningFlag = true;

    }
}
