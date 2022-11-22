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
import java.util.Arrays;
import java.util.List;

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

    public ArrayList<Task> Imp = new ArrayList<>();
    public ArrayList<Task> SchoolWork = new ArrayList<>();
    public ArrayList<Task> Health = new ArrayList<>();
    public ArrayList<Task> Others = new ArrayList<>();

    public ArrayList<Info> AllCombined;


    private ToDoDriver(MainDriver main) {
        this.main = main;
        user = main.getUser();
        String username = "resources/users/" + user.getUsername() + "/todo";
        path = Paths.get(username);
        AllCombined = readJSON();
        
        for(int i = 0; i < AllCombined.size(); i++) {
            if(AllCombined.get(i).getCategory().equals("School Work")) {
                SchoolWork.add(new Task(AllCombined.get(i).getText(), AllCombined.get(i).getSelected()));
            }
            else if (AllCombined.get(i).getCategory().equals("Health")) {
                Health.add(new Task(AllCombined.get(i).getText(), AllCombined.get(i).getSelected()));
            }
            else if (AllCombined.get(i).getCategory().equals("Others")) {
                Others.add(new Task(AllCombined.get(i).getText(), AllCombined.get(i).getSelected()));
            }
            else if(AllCombined.get(i).getCategory().equals("Star")) {
                Imp.add(new Task(AllCombined.get(i).getText(), false));
            }
        }
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

        // user = main.getUser();
        // String username = "resources/users/" + user.getUsername() + "/todo";
        // path = Paths.get(username);

        int impcount = 0;
        
        // AllCombined = readJSON();
        // System.out.println(AllCombined.size());
        
        for(int i = 0; i < SchoolWork.size(); i++) {
            UI.SchoolCheckBoxList.add(new Info(SchoolWork.get(i), "School Work"));
        }
        UI.SchoolSize = SchoolWork.size();

        for(int i = 0; i < Health.size(); i++) {
            UI.HealthCheckBoxList.add(new Info(Health.get(i), "Health"));
        }
        UI.HealthSize = Health.size();

        for(int i = 0; i < Others.size(); i++) {
            UI.OthersCheckBoxList.add(new Info(Others.get(i), "Others"));
        }
        UI.OthersSize = Others.size();

        for(int i = 0; i < Imp.size(); i++) {
            UI.ImportantCheckBoxList.add(new Info(Imp.get(i), "Star"));
        }
        UI.ImportantSize = Imp.size();

        // for(int i = 0; i < AllCombined.size(); i++) {
        //     if(AllCombined.get(i).getCategory().equals("School Work")) {
        //         UI.SchoolCheckBoxList.add(new Info(new JCheckBox(AllCombined.get(i).getText()), "School Work"));
        //         UI.SchoolCheckBoxList.get(UI.SchoolSize).getCheckBox().setSelected(AllCombined.get(i).getSelected());
        //         UI.SchoolSize++;

        //         SchoolWork.add(new Task(AllCombined.get(i).getText(), AllCombined.get(i).getSelected()));
        //     }
        //     else if (AllCombined.get(i).getCategory().equals("Health")) {
        //         UI.HealthCheckBoxList.add(new Info(new JCheckBox(AllCombined.get(i).getText()), "Health"));
        //         UI.HealthCheckBoxList.get(UI.HealthSize).getCheckBox().setSelected(AllCombined.get(i).getSelected());
        //         UI.HealthSize++;

        //         Health.add(new Task(AllCombined.get(i).getText(), AllCombined.get(i).getSelected()));
        //     }
        //     else if (AllCombined.get(i).getCategory().equals("Others")) {
        //         UI.OthersCheckBoxList.add(new Info(new JCheckBox(AllCombined.get(i).getText()), "Others"));
        //         UI.OthersCheckBoxList.get(UI.OthersSize).getCheckBox().setSelected(AllCombined.get(i).getSelected());
        //         UI.OthersSize++;

        //         Others.add(new Task(AllCombined.get(i).getText(), AllCombined.get(i).getSelected()));
        //     }
        //     else if(AllCombined.get(i).getCategory().equals("Star")) {
        //         UI.ImportantCheckBoxList.get(impcount).setText(AllCombined.get(i).getText());
        //         impcount++;
        //         UI.ImportantSize++;

        //         Imp.add(new Task(AllCombined.get(i).getText(), false));
        //     }
        // }

        for(int i = 0; i < UI.SchoolCheckBoxList.size();i++) {
            UI.SchoolWorkPanel.add(UI.SchoolCheckBoxList.get(i).getCheckBox());
            UI.SchoolCheckBoxList.get(i).loading();
        }
        for(int i = 0; i < UI.HealthCheckBoxList.size(); i++) {
            UI.HealthPanel.add(UI.HealthCheckBoxList.get(i).getCheckBox());
            UI.HealthCheckBoxList.get(i).loading();
        }
        for(int i = 0; i < UI.OthersCheckBoxList.size(); i++) {
            UI.OthersPanel.add(UI.OthersCheckBoxList.get(i).getCheckBox());
            UI.OthersCheckBoxList.get(i).loading();
        }
        for(int i = 0; i < UI.ImportantSize; i++) {
            UI.ImportantCheckBoxList.get(i).getCheckBox().setText(Imp.get(i).taskName);
            UI.ImportantCheckBoxList.get(i).loading();
        }

        for(int k = 0; k < UI.SchoolCheckBoxList.size(); k++) {
            int tmpK = k;
            UI.SchoolCheckBoxList.get(k).getCheckBox().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        UI.SchoolActionPerformed();
                        UI.setTaskName(SchoolWork.get(tmpK).taskName);
                }
            });
        }
        
        for(int k = 0; k < UI.HealthCheckBoxList.size(); k++) {
            int tmpK = k;
            UI.HealthCheckBoxList.get(k).getCheckBox().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        UI.HealthActionPerformed();
                        UI.setTaskName(Health.get(tmpK).taskName);
                }
            });
        }
        for(int k = 0; k < UI.OthersCheckBoxList.size(); k++) {
            int tmpK = k;
            UI.OthersCheckBoxList.get(k).getCheckBox().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        UI.OthersActionPerformed();
                        UI.setTaskName(Others.get(tmpK).taskName);
                }
            });
        }

        UI.SchoolActionPerformed();
        UI.HealthActionPerformed();
        UI.OthersActionPerformed();

        this.runningFlag = true;
    }

    public void writeJSON(ArrayList<Info> all) {
        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

            Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
            gson.toJson(all, writer);
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }


    }

    public ArrayList<Info> readJSON() {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        ArrayList<Info> all;

        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            Type courseList = new TypeToken<ArrayList<Info>>() {
            }.getType();

            // AllCombined.removeAll(AllCombined);

            all = gson.fromJson(reader, courseList);
            // List<Info> infos = Arrays.asList(gson.fromJson(reader, Info[].class));
            // UI.AllCombined.addAll(infos);
            
            if (all == null) {
                all = new ArrayList<Info>();
            }
            return all;

        } catch (IOException e) {
            e.getMessage();
            
        }

        return new ArrayList<Info>();
    }

    public void addTask(Task t, String category) {
        if(category.equals("School Work")) {
            SchoolWork.add(t);
        }
        else if(category.equals("Heath")) {
            Health.add(t);
        }
        else if(category.equals("Others")) {
            Others.add(t);
        }
        else if(category.equals("Star")) {
            Imp.add(t);
        }

        AllCombined.add(new Info(t, category));

        if(UI.isDisplayable()){
            if(category == "Star") UI.addStarList(t);
            else UI.addTask(t, category);
        }

        

        save();
    }


    public void save() {
        AllCombined.removeAll(AllCombined);

        // for(int i = 0; i < UI.SchoolSize; i++) {
        //     UI.SchoolCheckBoxList.get(i).loading();
        // }
        // for(int i = 0; i < UI.HealthSize; i++) {
        //     UI.HealthCheckBoxList.get(i).loading();
        // }
        // for(int i = 0; i < UI.OthersSize; i++) {
        //     UI.OthersCheckBoxList.get(i).loading();
        // }
        // for(int i = 0; i < UI.ImportantSize; i++) {
        //     UI.ImportantCheckBoxList.get(i).loading();
        // }

        for(int i = 0; i < SchoolWork.size(); i++) {
            AllCombined.add(new Info(SchoolWork.get(i), "School Work"));
        }
        for(int i = 0; i < Health.size(); i++) {
            AllCombined.add(new Info(Health.get(i), "Health"));
        }
        for(int i = 0; i < Others.size(); i++) {
            AllCombined.add(new Info(Others.get(i), "Others"));
        }
        for(int i = 0; i < Imp.size(); i++) {
            AllCombined.add(new Info(Imp.get(i), "Star"));
        }

        writeJSON(AllCombined);
    }
    // -------------------------------------------------------------------------------------------

}
// package TodoSystem;

// import java.io.IOException;
// import java.io.Reader;
// import java.io.Writer;
// import java.lang.reflect.Type;
// import java.nio.charset.StandardCharsets;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.security.AllPermission;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// import javax.swing.JCheckBox;

// import com.google.gson.Gson;
// import com.google.gson.GsonBuilder;
// import com.google.gson.reflect.TypeToken;

// import MainSystem.MainDriver;
// import MainSystem.User;
// import Utility.ModuleDriver;



// public class ToDoDriver implements ModuleDriver {
//     public final MainDriver main;
//     private static ToDoDriver instance = null;
//     private volatile boolean runningFlag = false;
//     private ToDoUI UI;

//     public Path path;
//     private User user;

//     public ArrayList<Task> Imp = new ArrayList<>();
//     public ArrayList<Task> SchoolWork = new ArrayList<>();
//     public ArrayList<Task> Health = new ArrayList<>();
//     public ArrayList<Task> Others = new ArrayList<>();


//     private ToDoDriver(MainDriver main) {
//         this.main = main;
//     }

//     public static ToDoDriver getInstance(MainDriver main) {
//         if (instance == null) instance = new ToDoDriver(main);
//         return instance;
//     }

//     @Override
//     public void quitModule() {
//         // quitting
//         this.runningFlag = false;
//     }

//     @Override
//     public boolean isRunning() {
//         return this.runningFlag;
//     }

//     @Override
//     public void run() {
//         // starting
//         UI = new ToDoUI(this);

//         user = main.getUser();
//         String username = "resources/users/" + user.getUsername() + "/todo";
//         path = Paths.get(username);

//         int impcount = 0;
        
//         readJSON();
//         System.out.println(UI.AllCombined.size());

//         for(int i = 0; i < UI.AllCombined.size(); i++) {
//             if(UI.AllCombined.get(i).getCategory().equals("School Work")) {
//                 UI.SchoolCheckBoxList.add(new Info(new JCheckBox(UI.AllCombined.get(i).getText()), "School Work"));
//                 UI.SchoolCheckBoxList.get(UI.SchoolSize).getCheckBox().setSelected(UI.AllCombined.get(i).getSelected());
//                 UI.SchoolSize++;

//                 SchoolWork.add(new Task(UI.AllCombined.get(i).getText(), UI.AllCombined.get(i).getSelected()));
//             }
//             else if (UI.AllCombined.get(i).getCategory().equals("Health")) {
//                 UI.HealthCheckBoxList.add(new Info(new JCheckBox(UI.AllCombined.get(i).getText()), "Health"));
//                 UI.HealthCheckBoxList.get(UI.HealthSize).getCheckBox().setSelected(UI.AllCombined.get(i).getSelected());
//                 UI.HealthSize++;

//                 Health.add(new Task(UI.AllCombined.get(i).getText(), UI.AllCombined.get(i).getSelected()));
//             }
//             else if (UI.AllCombined.get(i).getCategory().equals("Others")) {
//                 UI.OthersCheckBoxList.add(new Info(new JCheckBox(UI.AllCombined.get(i).getText()), "Others"));
//                 UI.OthersCheckBoxList.get(UI.OthersSize).getCheckBox().setSelected(UI.AllCombined.get(i).getSelected());
//                 UI.OthersSize++;

//                 Others.add(new Task(UI.AllCombined.get(i).getText(), UI.AllCombined.get(i).getSelected()));
//             }
//             else if(UI.AllCombined.get(i).getCategory().equals("Star")) {
//                 UI.ImportantCheckBoxList.get(impcount).setText(UI.AllCombined.get(i).getText());
//                 impcount++;
//                 UI.ImportantSize++;

//                 Imp.add(new Task(UI.AllCombined.get(i).getText(), false));
//             }
//         }

//         for(int i = 0; i < UI.SchoolCheckBoxList.size();i++) {
//             UI.SchoolWorkPanel.add(UI.SchoolCheckBoxList.get(i).getCheckBox());
//         }
//         for(int i = 0; i < UI.HealthCheckBoxList.size(); i++) {
//             UI.HealthPanel.add(UI.HealthCheckBoxList.get(i).getCheckBox());
//         }
//         for(int i = 0; i < UI.OthersCheckBoxList.size(); i++) {
//             UI.OthersPanel.add(UI.OthersCheckBoxList.get(i).getCheckBox());
//         }
//         this.runningFlag = true;
//     }

//     public void writeJSON() {
        

//         try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

//             Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
//             gson.toJson(UI.AllCombined, writer);
//             writer.close();
//         } catch (IOException e) {
//             e.getMessage();
//         }


//     }

//     public void readJSON() {
//         Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        

//         try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
//             Type courseList = new TypeToken<ArrayList<Info>>() {
//             }.getType();

//             UI.AllCombined.removeAll(UI.AllCombined);

//             UI.AllCombined = gson.fromJson(reader, courseList);
//             // List<Info> infos = Arrays.asList(gson.fromJson(reader, Info[].class));
//             // UI.AllCombined.addAll(infos);
            
//             if (UI.AllCombined == null) {
//                 UI.AllCombined = new ArrayList<Info>();
//             }

//         } catch (IOException e) {
//             e.getMessage();
//         }
//     }

//     // -------------------------------------------------------------------------------------------

// }