package ProfileSystem;

import MainSystem.MainDriver;
import MainSystem.User;
import Utility.ModuleDriver;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ProfileDriver implements ModuleDriver {
    private final MainDriver main;
    private static ProfileDriver instance = null;
    private volatile boolean runningFlag = false;

    private ProfileUI UI;

    public Personal personal;

    public Path path;

    public User user;

    public ProfilePanel Panel;


    public MainDriver getMain() {
        return main;
    }

    private ProfileDriver(MainDriver main) {
        this.main = main;
    }

    public static ProfileDriver getInstance(MainDriver main) {
        if (instance == null)
            instance = new ProfileDriver(main);
        return instance;
    }

    @Override
    public void quitModule() {
        // quitting
        UI.dispose();;
        runningFlag = false;
    }

    public void exitProcedure() {
        main.quit(this);
    }

    @Override
    public boolean isRunning() {
        return this.runningFlag;
    }

    @Override
    public void run() {
        personal = new Personal();

        getPath();

        // starting
        UI = new ProfileUI(this);
        UI.setVisible(true);

        readJSON();
        this.runningFlag = true;

    }

    public void getPath() {
        user = main.getUser();
        String username = "resources/users/" + user.getUsername() + "/profile";
        path = Paths.get(username);
    }

    public void installGoalInfo(String name, boolean isCheck) {
        CheckBox cB = new CheckBox();
        cB.setName(name);
        cB.setCheck(isCheck);

        personal.goals.add(cB);
        writeJSON();
    }

    public void writeJSON() {

        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(personal, writer);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void readJSON() {
        Gson gson = new Gson();

        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

            personal = gson.fromJson(reader, personal.getClass());

            if (personal == null) {
                personal = new Personal();
            }

            if (UI != null && UI.isDisplayable()) {
                UI.storeBackToJGoals();
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }

}
