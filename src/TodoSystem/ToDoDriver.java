package TodoSystem;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.AllPermission;
import java.util.ArrayList;

import javax.swing.JCheckBox;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import MainSystem.MainDriver;
import MainSystem.User;
import Utility.ModuleDriver;



public class ToDoDriver implements ModuleDriver {
    public final MainDriver main;
    private static ToDoDriver instance = null;
    private volatile boolean runningFlag = false;
    private ToDoUI UI;

    public Path path;
    private User user;
    



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

        user = main.getUser();
        String username = "resources/users/" + user.getUsername() + "/todo";
        path = Paths.get(username);

        int impcount = 0;
        
        readJSON();

        for(int i = 0; i < UI.AllCombined.size(); i++) {
            if(UI.AllCombined.get(i).getCategory().equals("School Work")) {
                UI.SchoolCheckBoxList.add(new Info(new JCheckBox(UI.AllCombined.get(i).getText()), "School Work"));
                UI.SchoolCheckBoxList.get(UI.SchoolSize).getCheckBox().setSelected(UI.AllCombined.get(i).getSelected());
                UI.SchoolSize++;
            }
            else if (UI.AllCombined.get(i).getCategory().equals("Health")) {
                UI.HealthCheckBoxList.add(new Info(new JCheckBox(UI.AllCombined.get(i).getText()), "Health"));
                UI.HealthCheckBoxList.get(UI.HealthSize).getCheckBox().setSelected(UI.AllCombined.get(i).getSelected());
                UI.HealthSize++;
            }
            else if (UI.AllCombined.get(i).getCategory().equals("Others")) {
                UI.OthersCheckBoxList.add(new Info(new JCheckBox(UI.AllCombined.get(i).getText()), "Others"));
                UI.OthersCheckBoxList.get(UI.OthersSize).getCheckBox().setSelected(UI.AllCombined.get(i).getSelected());
                UI.OthersSize++;
            }
            else if(UI.AllCombined.get(i).getCategory().equals("Star")) {
                UI.ImportantCheckBoxList.get(impcount).setText(UI.AllCombined.get(i).getText());
                impcount++;
                UI.ImportantSize++;
            }
        }
        this.runningFlag = true;
    }

    public void writeJSON() {
        

        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

            var gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(UI.AllCombined, writer);
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }


    }

    public void readJSON() {
        Gson gson = new Gson();
        

        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            Type courseList = new TypeToken<ArrayList<Info>>() {
            }.getType();

            UI.AllCombined.removeAll(UI.AllCombined);

            UI.AllCombined = gson.fromJson(reader, courseList);

        } catch (IOException e) {
            e.getMessage();
        }
    }

    
}