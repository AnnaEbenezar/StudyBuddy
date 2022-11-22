package ScheduleSystem;

import java.util.Date;
import java.util.List;

import javax.management.openmbean.CompositeType;
import javax.security.auth.Subject;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.tools.DiagnosticCollector;

import java.awt.*;
import java.awt.event.*;
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

    private String month[];

    private JButton dayCalendar[];

    private int calMonth; // Calendar Month 0-11
    private int calYear;

    private DateS today;

    private ArrayList<ActionListener> dayButtonAction;

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

        month = new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        user = main.getUser();
        String username = "resources/users/" + user.getUsername() + "/schedule";
        path = Paths.get(username);

        UI = new ScheduleUI(this);
        UI.setVisible(true);

        dayButtonAction = new ArrayList<ActionListener>();

        Calendar c = Calendar.getInstance();
        calMonth = c.get(Calendar.MONTH);
        calYear = c.get(Calendar.YEAR);

        today = new DateS();
        today.setDate(c.get(Calendar.DATE));
        today.setMonth(calMonth + 1);
        today.setYear(calYear);

        addButton();
        addDate(calMonth, calYear);

        readJSON();
        // starting
        this.runningFlag = true;

    }

    // Add from original course arrayList when open schudel read file first if it
    // empty creat an empty ArrayList new Arra... ()
    public void addCourse() {
        Courses newCourse = new Courses();

        if (UI.courseName.getText() != null && UI.courseId.getText() != null && UI.classTimeHr.getValue() != null
                && UI.classTimeMin.getValue() != null && getDateJX(UI.midtermExam) != null
                && getDateJX(UI.finalExam) != null) {

            newCourse.setCourseName(UI.courseName.getText());
            UI.courseName.setText("");
            newCourse.setCourseId(UI.courseId.getText());
            UI.courseId.setText("");

            int classTime = (Integer) UI.classTimeHr.getValue();
            newCourse.classTime.setHours(classTime);
            UI.classTimeHr.setValue(Integer.valueOf("0"));
            classTime = (Integer) UI.classTimeMin.getValue();
            newCourse.classTime.setMins(classTime);
            UI.classTimeMin.setValue(Integer.valueOf("0"));

            DateS examDate = new DateS();
            examDate = getDateJX(UI.midtermExam);
            newCourse.setMidtermExam(examDate);
            UI.midtermExam.setDate(null);

            examDate = getDateJX(UI.finalExam);
            newCourse.setFinalExam(examDate);
            UI.finalExam.setDate(null);

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
            JSpinner dayMin[] = new JSpinner[] { UI.mondayMin, UI.tuesdayMin, UI.wednesdayMin, UI.thursdayMin,
                    UI.fridayMin,
                    UI.saturdayMin, UI.sundayMin };
            for (int i = 0; i < radioDays.length; i++) {
                if (radioDays[i].isSelected()) {
                    radioDays[i].setSelected(false);
                    studyD.setDayOfWeek(day[i]);
                    TimeS sTime = getStudyTimePday(dayHr[i], dayMin[i]);
                    studyD.setStudyTime(sTime);

                    newCourse.studyDays.add(new DateS(studyD));
                }
            }

            course.add(newCourse);
            writeJSON();
            UI.jComboBox1.addItem(newCourse.courseName);
        }
        this.subjectInfo();;

    }

    public String setDayOfWeekString(int dayOfWeek) {
        String day[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        return day[dayOfWeek - 1];
    }

    public DateS getDateJX(JXDatePicker places) {

        if (places.getDate() != null) {
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
        return null;

    }

    public TimeS getStudyTimePday(JSpinner dayHr, JSpinner dayMin) {
        TimeS t = new TimeS();

        t.hours = Integer.parseInt((String) dayHr.getValue());
        dayHr.setModel(new SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
        t.mins = Integer.parseInt((String) dayMin.getValue());
        dayMin.setModel(new SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));

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

            if (course == null) {
                course = new ArrayList<Courses>();
            }

            UI.jComboBox1.removeAllItems();

            for (Courses c : course) {
                UI.jComboBox1.addItem(c.courseName);
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }

    // public void getClassS() {
    // course = readJSON();

    // for (Courses c : course) {
    // System.out.println(c);
    // }
    // }

    public ArrayList<Courses> subjectInDay() {
        ArrayList<Courses> subjects = new ArrayList<Courses>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (Courses c : course) {

            // if (c.midtermExam.weekOfYear == selectedDate.weekOfYear && c.midtermExam.year
            // == selectedDate.year) {
            // continue;
            // }

            // if (c.finalExam.weekOfYear == selectedDate.weekOfYear && c.finalExam.year ==
            // selectedDate.year) {
            // continue;
            // }

            try {

                Date fdate = dateFormat.parse(c.finalExam.toString()); // The day that course end
                Date startDate = dateFormat.parse(c.startDate.toString());

                for (DateS d : c.studyDays) { // Days that has class (DSA has class on Monday and Tuesday)

                    // Date dDate = dateFormat.parse(d.toString());
                    Date sDate = dateFormat.parse(selectedDate.toString());
                    // Date fDate = dateFormat.parse(c.finalExam.dateString);

                    // if (d.dayOfWeek == selectedDate.dayOfWeek && (sDate.after(dDate) &&
                    // sDate.before(fdate))) {
                    // subjects.add(new Courses(c));
                    // break;
                    // }

                    if (d.dayOfWeek.equals(selectedDate.dayOfWeek)
                            && (sDate.after(startDate) || sDate.equals(startDate))
                            && (sDate.before(fdate) || sDate.equals(fdate))) {
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

        // getSelectedDate();
        // System.out.println(selectedDate + " " + selectedDate.dayOfWeek);
        ArrayList<Courses> subjects = subjectInDay();
        // System.out.println(subjects.size());

        for (Courses sub : subjects) {
            SubjectDetail detail = new SubjectDetail();
            UI.jPanel3.add(detail);

            detail.className.setText(sub.courseName);
            detail.classId.setText(sub.courseId);

            for (DateS d : sub.studyDays) {
                if (d.dayOfWeek.equals(selectedDate.dayOfWeek)) {
                    int newMin = (d.studyTime.mins + sub.classTime.mins) % 60;
                    int addOneHr = (int) ((d.studyTime.mins + sub.classTime.mins) / 60);
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

    // public void getSelectedDate() {
    // selectedDate = getDateJX(UI.midtermExam);
    // }

    public void addSubjectCombo(String subjectName) {
        UI.jComboBox1.addItem(subjectName);
    }

    public void removeSubject() {

        String subject = UI.jComboBox1.getSelectedItem().toString();

        for (int i = 0; i < course.size(); i++) {

            if (course.get(i).courseName.equals(subject)) {
                course.remove(i);
                writeJSON();
                UI.jComboBox1.removeItem(UI.jComboBox1.getSelectedItem());
                break;
            }
        }

        this.subjectInfo();;
    }

    public void addButton() {
        dayCalendar = new JButton[] { UI.d1, UI.d2, UI.d3, UI.d4, UI.d5, UI.d6, UI.d7, UI.d8, UI.d9, UI.d10, UI.d11,
                UI.d12, UI.d13, UI.d14, UI.d15, UI.d16, UI.d17, UI.d18, UI.d19, UI.d20, UI.d21, UI.d22, UI.d23, UI.d24,
                UI.d25, UI.d26,
                UI.d27, UI.d28, UI.d29, UI.d30, UI.d31, UI.d32, UI.d33, UI.d34, UI.d35, UI.d36, UI.d37, UI.d38, UI.d39,
                UI.d40, UI.d41,
                UI.d42 };

        // dayButtonAction = List.of(
        // e ->
        // )
    }

    public void addDate(int cMonth, int cYear) {

        UI.jLabel8.setText(month[cMonth] + " - " + cYear);
        int bMonth = cMonth - 1;
        int aMonth = cMonth + 1;

        if (bMonth < 0) {
            bMonth = 11;
        } else if (aMonth > 11) {
            aMonth = 0;
        }

        UI.jButton3.setText(month[bMonth]);
        UI.jButton4.setText(month[aMonth]);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, cMonth);
        cal.set(Calendar.YEAR, cYear);
        cal.set(Calendar.DATE, 1);
        cal.add(Calendar.DATE, (-cal.get(Calendar.DAY_OF_WEEK)) + 1);

        boolean notThisMonth = false;

        // for (JButton b: dayCalendar) {
        // b.setText(Integer.toString(cal.get(Calendar.DATE)));
        // String dOfWeek = setDayOfWeekString(cal.get(Calendar.DAY_OF_WEEK));

        // b.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // setSelectedDate(cal.get(Calendar.DATE), cal.get(Calendar.MONTH)+1,
        // cal.get(Calendar.YEAR), dOfWeek);
        // // System.out.println(cal.get(Calendar.DATE) + " " + cMonth + cYear +
        // dOfWeek);
        // System.out.println(selectedDate);

        // }
        // });

        // cal.add(Calendar.DATE, 1);
        //

        dayButtonAction.removeAll(dayButtonAction);

        for (int i = 0; i < dayCalendar.length; i++) {
            int d = cal.get(Calendar.DATE);
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
            String dOfWeek = setDayOfWeekString(cal.get(Calendar.DAY_OF_WEEK));

            if (((month > (cMonth + 1) || (month == 1 && cMonth == 11))) && dOfWeek.equals("Sunday")) {
                notThisMonth = true;
            }

            if (notThisMonth) {
                dayCalendar[i].setText("");
            } else {
                dayCalendar[i].setText(Integer.toString(d));

                if (month == (cMonth + 1)) {
                    dayCalendar[i].setForeground(new Color(68, 68, 68));
                } else {
                    dayCalendar[i].setForeground(new Color(169, 169, 169));
                }
                dayButtonAction.add(e -> setSelectedDate(d, month, year, dOfWeek));

                dayCalendar[i].addActionListener(dayButtonAction.get(i));
            }

            if (d == today.getDate() && month == today.getMonth() && year == today.year) {
                dayCalendar[i].setForeground(Color.red);
            }

            cal.add(Calendar.DATE, 1);

        }

    }

    public void removeAction() {
        for (int i = 0; i < dayButtonAction.size(); i++) {
            dayCalendar[i].removeActionListener(dayButtonAction.get(i));
        }
    }

    public void setSelectedDate(int selectDate, int selectMonth, int selectYear, String selectDayOfWeek) {
        selectedDate = new DateS();
        selectedDate.setDate(selectDate);
        selectedDate.setMonth(selectMonth);
        selectedDate.setYear(selectYear);
        selectedDate.setDayOfWeek(selectDayOfWeek);
        // System.out.println(selectedDate);
        this.subjectInfo();
    }

    public void monthBack() {
        if (calMonth == 0) {
            calMonth = 11;
            calYear--;
        } else {
            calMonth--;
        }

        removeAction();

        addDate(calMonth, calYear);
    }

    public void monthFront() {
        if (calMonth == 11) {
            calMonth = 0;
            calYear++;
        } else {
            calMonth++;
        }

        removeAction();

        addDate(calMonth, calYear);
    }
}
