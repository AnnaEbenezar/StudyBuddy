package ProfileSystem;

import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import MainSystem.MainDriver;
import MainSystem.User;
import Utility.CustomException;
import Utility.ModuleDriver;


import java.io.*;
import java.util.Scanner;

public class ProfileDriver implements ModuleDriver {
    private final MainDriver main;
    private static ProfileDriver instance = null;
    private volatile boolean runningFlag = false;
    private ProfileUI UI;

    public Path path;
    private static User user;
    public String name;
    public String major;
    public String quote;

    private ProfileDriver(MainDriver main) {
        this.main = main;
    }

    public MainDriver getMain(){
        return this.main;
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

        user = main.getUser();
        String username = "resources/users/" + user.getUsername() + "/profile.csv";
        path = Paths.get(username);

    }

    public void writeJSON() {
        // path = Paths.get("resources/users/123456/schedule");

        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(Personal, writer);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void readJSON() {
        Gson gson = new Gson();
        // path = Paths.get("resources/users/123456/schedule");

        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            Type courseList = new TypeToken<ArrayList<Courses>>() {
            }.getType();

            course.removeAll(course);

            course = gson.fromJson(reader, courseList);

        } catch (IOException e) {
            e.getMessage();
        }
    }

    //CSV reader and writer

    /* public void ProfileFileReader() {
        File profileCSV = new File("resources/users/" + user.getUsername() + "/profile.csv");
            
        try (Scanner reader = new Scanner(profileCSV);) {
        //  check if it is a username password csv file
                
            if (!reader.nextLine().equals("name,major,quote")) {
                    throw new FileNotFoundException();
            }
            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split(",");
                name = parts[0];
                major = parts[1];
                quote = parts[2];
            }
                
        reader.close();
        }
            
        catch (FileNotFoundException e) {
                javax.swing.JOptionPane.showMessageDialog(null, "Profile data is missing. Creating empty file", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
                
            // try {
            //     File dir = new File("resources/logindata");
            //     dir.mkdir();
            //     userPassCSV.createNewFile();
            //     FileWriter writer = new FileWriter(userPassCSV);
            //     writer.write("username,password");
            //     writer.close();
            //     return new HashMap<String, String>();                
            // } 

            // catch (IOException fileEx) {
            //     JOptionPane.showMessageDialog(null, "Cannot create files.", "Error", JOptionPane.ERROR_MESSAGE);
            //     System.exit(1);
            //     return null;
            // } 
        }
    }

    public void ProfileFileWriter() {
        File profileCSV = new File("resources/users" + user.getUsername() + "/profile.csv");
        try {
            FileWriter writer = new FileWriter(profileCSV);
            writer.write("name,major,quote");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.newLine();
            bufferedWriter.write(name);
            bufferedWriter.write(",");
            bufferedWriter.write(major);
            bufferedWriter.write(",");
            bufferedWriter.write(quote);
            bufferedWriter.close(); 
        } 
        catch (IOException e) {
            throw new CustomException.CreateAccountFileError();
        }
    } */
}

     

    

    

