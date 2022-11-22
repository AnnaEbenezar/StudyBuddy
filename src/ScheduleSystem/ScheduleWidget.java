/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ScheduleSystem;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.BoxLayout;

/**
 *
 * @author pantilakosalaraksa
 */
public class ScheduleWidget extends javax.swing.JPanel {

    /**
     * Creates new form ScheduleWidget
     */
    private ScheduleDriver driver;
    private DateS today;

    public ScheduleWidget(ScheduleDriver scheduleDriver) {

        initComponents();

        this.driver = scheduleDriver;
        driver.widget = this;
        driver.getPath();
        driver.readJSON();

        Calendar calendar = Calendar.getInstance();

        today = new DateS();

        today.date = calendar.get(Calendar.DATE);
        today.month = calendar.get(Calendar.MONTH) + 1;
        today.year = calendar.get(Calendar.YEAR);
        today.dayOfWeek = driver.setDayOfWeekString(calendar.get(Calendar.DAY_OF_WEEK));

        driver.setSelectedDate(today.date, today.month, today.year, today.dayOfWeek);

        updateClass();
    }

    public void updateClass() {
        ArrayList<Courses> todayCourses = driver.subjectInDay(today);

        jPanel2.removeAll();
        jPanel2.revalidate();
        jPanel2.repaint();

        String classTime = "";

        for (Courses c: todayCourses) {

            for (DateS d : c.studyDays) {
                if (d.dayOfWeek.equals(driver.selectedDate.dayOfWeek)) {
                    int newMin = (d.studyTime.mins + c.classTime.mins) % 60;
                    int addOneHr = (int) ((d.studyTime.mins + c.classTime.mins) / 60);
                    int newHr = (addOneHr + d.studyTime.hours + c.classTime.hours) % 24;

                    classTime = d.studyTime.toString() + "-" + String.format("%02d:%02d", newHr, newMin);
                    break;
                }
            }

            DateS midterm = c.getMidtermExam();
            DateS finalexam = c.getFinalExam();

            TodaySubject todaySub = new TodaySubject(c.courseName, classTime, midterm.toString(), finalexam.toString());
            jPanel2.add(todaySub);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel2);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Today Class");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}