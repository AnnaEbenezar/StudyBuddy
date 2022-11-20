package TodoSystem;

import MainSystem.MainDriver;
import Utility.ModuleDriver;


public class ToDoDriver implements ModuleDriver {
    public final MainDriver main;
    private static ToDoDriver instance = null;
    private volatile boolean runningFlag = false;
    private ToDoUI UI;



    private ToDoDriver(MainDriver main) {
        this.main = main;
    }

    public static ToDoDriver getInstance(MainDriver main) {
        if (instance == null) instance = new ToDoDriver(main);
        return instance;
    }

    @Override
    public void quitModule() {
        // quitting
        this.runningFlag = false;
    }

    @Override
    public boolean isRunning() {
        return this.runningFlag;
    }

    @Override
    public void run() {
        // starting
        UI = new ToDoUI(this);
        this.runningFlag = true;
    }

    class Info{
        String name;
        Boolean isSelect;
        String Category;

        
    }
}