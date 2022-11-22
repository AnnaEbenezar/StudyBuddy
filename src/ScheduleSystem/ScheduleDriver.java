package ScheduleSystem;

import java.util.Date;
import java.util.List;

import javax.management.openmbean.CompositeType;
import javax.security.auth.Subject;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.tools.DiagnosticCollector;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import org.jdesktop.swingx.JXDatePicker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import MainSystem.MainDriver;
import Utility.ModuleDriver;
import MainSystem.User;

public class ScheduleDriver implements ModuleDriver {
    private final MainDriver main;
    private static ScheduleDriver instance;
    private volatile boolean runningFlag = false;

    private ScheduleUI UI;

    private ArrayList<Courses> course;

    private Path path;

    private User user;

    private DateS selectedDate;

    private ScheduleDriver(MainDriver main) {
        this.main = main;
    }

    public static ScheduleDriver getInstance(MainDriver main) {
        if (instance == null)
            instance = new ScheduleDriver(main);
        return instance;
    }

    @Override
    public void quitModule() {
        // quitting
        runningFlag = false;
    }

    @Override
    public boolean isRunning() {
        return this.runningFlag;
    }

    @Override
    public void run() {
        course = new ArrayList<Courses>();

        user = main.getUser();
        String username = "resources/users/" + user.getUsername() + "/schedule";
        path = Paths.get(username);

        readJSON();

        UI = new ScheduleUI(this);
        UI.setVisible(true);
        // starting
        this.runningFlag = true;

    }

    // Add from original course arrayList when open schudel read file first if it
    // empty creat an empty ArrayList new Arra... ()
    public void addCourse() {
        Courses newCourse = new Courses();

        newCourse.setCourseName(UI.courseName.getText());
        newCourse.setCourseId(UI.courseId.getText());

        int classTime = (Integer) UI.classTimeHr.getValue();
        newCourse.classTime.setHours(classTime);
        classTime = (Integer) UI.classTimeMin.getValue();
        newCourse.classTime.setMins(classTime);

        DateS examDate = new DateS();
        examDate = getDateJX(UI.midtermExam);
        newCourse.setMidtermExam(examDate);

        examDate = getDateJX(UI.finalExam);
        newCourse.setFinalExam(examDate);

        DateS startDate = new DateS();
        Calendar calendar = Calendar.getInstance();
        startDate.setDate(calendar.get(Calendar.DATE));
        startDate.setMonth(calendar.get(Calendar.MONTH) + 1);
        startDate.setYear(calendar.get(Calendar.YEAR));
        startDate.setWeekOfYear(calendar.get(Calendar.WEEK_OF_YEAR));
        startDate.setDayOfWeek(setDayOfWeekString(calendar.get(Calendar.DAY_OF_WEEK)));
        newCourse.setStartDate(startDate);

        DateS studyD = new DateS();

        String day[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        JRadioButton radioDays[] = new JRadioButton[] { UI.mondayRadioB, UI.tuesdayRadioB, UI.wednesdayRadioB,
                UI.thursdayRadioB, UI.fridayRadioB, UI.saturdayRadioB, UI.sundayRadioB };
        JSpinner dayHr[] = new JSpinner[] { UI.mondayHr, UI.tuesdayHr, UI.wednesdayHr, UI.thursdayHr, UI.fridayHr,
                UI.saturdayHr, UI.sundayHr };
        JSpinner dayMin[] = new JSpinner[] { UI.mondayMin, UI.tuesdayMin, UI.wednesdayMin, UI.thursdayMin, UI.fridayMin,
                UI.saturdayMin, UI.sundayMin };
        for (int i = 0; i < radioDays.length; i++) {
            if (radioDays[i].isSelected()) {
                studyD.setDayOfWeek(day[i]);
                TimeS sTime = getStudyTimePday(dayHr[i], dayMin[i]);
                studyD.setStudyTime(sTime);

                newCourse.studyDays.add(new DateS(studyD));
            }
        }

        course.add(newCourse);
        writeJSON();

    }

    public String setDayOfWeekString(int dayOfWeek) {
        String day[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        return day[dayOfWeek - 1];
    }

    public DateS getDateJX(JXDatePicker places) {
        DateS examDate = new DateS();

        Date d = places.getDate();

        // DateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
        // examDate.setDateString(dFormat.format(d));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        examDate.setDate(calendar.get(Calendar.DATE));
        examDate.setMonth(calendar.get(Calendar.MONTH) + 1);
        examDate.setYear(calendar.get(Calendar.YEAR));
        examDate.setWeekOfYear(calendar.get(Calendar.WEEK_OF_YEAR));
        examDate.setDayOfWeek(setDayOfWeekString(calendar.get(Calendar.DAY_OF_WEEK)));

        return new DateS(examDate);

    }

    public TimeS getStudyTimePday(JSpinner dayHr, JSpinner dayMin) {
        TimeS t = new TimeS();

        t.hours = Integer.parseInt((String) dayHr.getValue());
        t.mins = Integer.parseInt((String) dayMin.getValue());

        return new TimeS(t);
    }

    public void writeJSON() {
        // path = Paths.get("resources/users/123456/schedule");

        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(course, writer);
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

    // public void getClassS() {
    //     course = readJSON();

    //     for (Courses c : course) {
    //         System.out.println(c);
    //     }
    // }

    public ArrayList<Courses> subjectInDay() {
        ArrayList<Courses> subjects = new ArrayList<Courses>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(course.size());
        for (Courses c : course) {

            // if (c.midtermExam.weekOfYear == selectedDate.weekOfYear && c.midtermExam.year == selectedDate.year) {
            //     continue;
            // }

            // if (c.finalExam.weekOfYear == selectedDate.weekOfYear && c.finalExam.year == selectedDate.year) {
            //     continue;
            // }

            try {
                System.out.println(c.finalExam);
                System.out.println(c.midtermExam);

                Date fdate = dateFormat.parse(c.finalExam.toString()); // The day that course end
                Date startDate = dateFormat.parse(c.startDate.toString());

                for (DateS d : c.studyDays) { // Days that has class (DSA has class on Monday and Tuesday)

                    // Date dDate = dateFormat.parse(d.toString());
                    Date sDate = dateFormat.parse(selectedDate.toString());
                    // Date fDate = dateFormat.parse(c.finalExam.dateString);

                    // if (d.dayOfWeek == selectedDate.dayOfWeek && (sDate.after(dDate) && sDate.before(fdate))) {
                    //     subjects.add(new Courses(c));
                    //     break;
                    // }

                    System.out.println(sDate.after(startDate));
                    System.out.println(sDate.before(fdate));
                    System.out.println(d.dayOfWeek + " " + selectedDate.dayOfWeek);
                    System.out.println(d.dayOfWeek.equals(selectedDate.dayOfWeek));

                    if (d.dayOfWeek.equals(selectedDate.dayOfWeek) && sDate.after(startDate) && sDate.before(fdate)) {
                        subjects.add(new Courses(c));
                        break;
                    }


                }
            } catch (ParseException e) {
                e.getMessage();
            }
        }

        return subjects;
    }

    public void addPanel() {
        SubjectDetail addSubject = new SubjectDetail();
        
        UI.jPanel3.add(addSubject);
        UI.setVisible(true);
    }

    public void subjectInfo() {
        UI.jPanel3.removeAll();
        UI.jPanel3.revalidate();
        UI.jPanel3.repaint();
        
        getSelectedDate();
        System.out.println(selectedDate + " " + selectedDate.dayOfWeek);
        ArrayList<Courses> subjects = subjectInDay();
        System.out.println(subjects.size());

        for (Courses sub: subjects) {
            SubjectDetail detail = new SubjectDetail();
            UI.jPanel3.add(detail);
            System.out.println(sub);
            
            detail.className.setText(sub.courseName);
            detail.classId.setText(sub.courseId);
            
            for (DateS d: sub.studyDays) {
                if(d.dayOfWeek.equals(selectedDate.dayOfWeek)) {
                    int newMin = (d.studyTime.mins + sub.classTime.mins) % 60;
                    int addOneHr = (int)((d.studyTime.mins + sub.classTime.mins) / 60);
                    int newHr = (addOneHr + d.studyTime.hours + sub.classTime.hours) % 24;
                    
                    detail.time.setText(d.studyTime.toString() + "-" + String.format("%02d:%02d", newHr, newMin));
                    break;
                }
            }

            detail.midterm.setText(sub.midtermExam.toString());
            detail.finalExam.setText(sub.finalExam.toString());
            UI.setVisible(true); 
        }
    }

    public void getSelectedDate() {
        selectedDate = getDateJX(UI.jXDatePicker3);
    }
}
