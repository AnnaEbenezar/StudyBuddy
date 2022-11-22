package ScheduleSystem;

import java.util.ArrayList;

public class Courses {
    
    String courseName;
    String courseId;
    TimeS classTime;
    DateS midtermExam;
    DateS finalExam;
    DateS startDate;

    ArrayList<DateS> studyDays;

    Courses() {
        this.courseName = "";
        this.courseId = "";
        this.classTime = new TimeS();
        this.midtermExam = new DateS();
        this.finalExam = new DateS();
        this.startDate = new DateS();
        this.studyDays = new ArrayList<DateS>();
    }

    Courses(Courses source) {
        this.courseName = source.courseName;
        this.courseId = source.courseId;
        this.classTime = new TimeS(source.classTime);
        this.midtermExam = new DateS(source.midtermExam);
        this.finalExam = new DateS(source.finalExam);
        this.startDate = new DateS(source.startDate);
        this.studyDays = new ArrayList<DateS>();
        
        for (DateS sDay: source.studyDays) {
            studyDays.add(new DateS(sDay));
        }
    }

    public TimeS getClassTime() {
        return new TimeS(this.classTime);
    }

    public String getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }

    public DateS getMidtermExam() {
        return new DateS(this.midtermExam);
    }

    public DateS getFinalExam() {
        return new DateS(this.finalExam);
    }

    public DateS getStartDate() {
        return new DateS(this.startDate);
    }

    public void setClassTime(TimeS classTime) {
        this.classTime = new TimeS(classTime);
    }
    
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMidtermExam(DateS midtermExam) {
        this.midtermExam = new DateS(midtermExam);
    }

    public void setFinalExam(DateS finalExam) {
        this.finalExam = new DateS(finalExam);
    }

    public void setStartDate(DateS startDate) {
        this.startDate = new DateS(startDate);
    }

    public String classEndTime(TimeS studyTime) {
        int newMin = (classTime.mins + studyTime.mins) % 60;
        int oneHr = (int)((classTime.mins + studyTime.mins) / 60 );

        int newHr = (classTime.hours + studyTime.hours + oneHr) % 24;

        return newHr + ":" + newMin;
    }

    @Override
    public String toString() {
        return "Class Name: " + courseName +  " \nCourse Id:" + courseId;
    }

}

class DateS {

    int date; // 1 - 31
    int month; // 1 - 12
    int year; // 20XX
    int weekOfYear;

    String dayOfWeek; // Monday - Sunday

    TimeS studyTime;

    DateS() {
        this.dayOfWeek = "";
        this.studyTime = new TimeS();
    }

    DateS(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
        this.dayOfWeek = "";
        this.studyTime = new TimeS();
    }

    DateS(DateS source) {
        this.date = source.date;
        this.month = source.month;
        this.year = source.year;
        this.dayOfWeek = source.dayOfWeek;
        this.studyTime = new TimeS(source.studyTime);
        this.weekOfYear = source.weekOfYear;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public TimeS getStudyTime() {
        return new TimeS(studyTime);
    }

    public int getWeekOfYear() {
        return weekOfYear;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setStudyTime(TimeS studyTime) {
        this.studyTime = new TimeS(studyTime);
    }

    public void setWeekOfYear(int weekOfYear) {
        this.weekOfYear = weekOfYear;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%02d/%02d/%02d", date, month, year);
    }
}

class TimeS {

    int hours;
    int mins;


    TimeS() {
    }

    TimeS(TimeS source) {
        this.hours = source.hours;
        this.mins = source.mins;
    }

    public int getHours() {
        return hours;
    }

    public int getMins() {
        return mins;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, mins);
    }

}
