package ProfileSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import MainSystem.User;

public class ProfileUI extends JFrame {

    private javax.swing.JButton button_Profile;
    private javax.swing.JButton jButton_addPG;
    private javax.swing.JButton jButton_delPG;
    private javax.swing.JLabel jLabel_PG;
    private javax.swing.JLabel jLabel_Welcome;
    private javax.swing.JLabel jLabel_major;
    private javax.swing.JList<String> jList_Accomp;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Btns;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Quote;
    private javax.swing.JScrollPane jScrollPane_Accomplisments;
    private javax.swing.JScrollPane jScrollPane_PerGoals;
    private javax.swing.JScrollPane jScrollPane_Quote;
    private javax.swing.JTextArea jTextArea_Quote;
    private javax.swing.JTextField jTextField_ipPG;
    private javax.swing.JPanel panel_PerGoals;
    DefaultListModel<String> listModel = new DefaultListModel<String>();

    private ArrayList<JCheckBox> jGoals;

    ProfileDriver driver;

    ProfileUI(ProfileDriver driver) {
        this.driver = driver;

        jGoals = new ArrayList<JCheckBox>();

        initComponents();

        jButton_addPG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addGoals();

            }
        });

        jButton_delPG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteAccom();

            }
        });

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                driver.exitProcedure();
            }
        });

        setVisible(true);
    }

    public void addGoals() {

        if (jTextField_ipPG.getText() != null) {
            String g = jTextField_ipPG.getText();

            JCheckBox goal = new JCheckBox(g);
            goal.setSelected(false);

            this.driver.installGoalInfo(g, false);

            goal.addActionListener(e -> boxChecked(goal));

            jGoals.add(goal);

            panel_PerGoals.add(goal);

            this.invalidate();
            this.validate();
            this.repaint();

            jTextField_ipPG.setText(null);
        }
    }

    public void boxChecked(JCheckBox box) {
        panel_PerGoals.remove(box);

        for (int i = 0; i < jGoals.size(); i++) {

            if (box.getText().equals(jGoals.get(i).getText())) {
                jGoals.remove(i);
                driver.personal.goals.remove(i);
            }
        }

        panel_PerGoals.invalidate();
        panel_PerGoals.validate();
        panel_PerGoals.repaint();
        listModel.addElement(box.getText());
        driver.personal.accomplishment.add(box.getText());

        driver.writeJSON();
        this.driver.Panel.upload();
    }

    public void storeBackToJGoals() {
        if (jGoals != null) {
            jGoals.removeAll(jGoals);
        }

        for (int i = 0; i < driver.personal.goals.size(); i++) {
            JCheckBox cB = new JCheckBox(driver.personal.goals.get(i).getName());
            cB.setSelected(driver.personal.goals.get(i).isCheck());
            cB.addActionListener(e -> boxChecked(cB));

            panel_PerGoals.add(cB);

            this.invalidate();
            this.validate();
            this.repaint();

            jGoals.add(cB);
        }

        for (String ac : driver.personal.accomplishment) {
            listModel.addElement(ac);
        }

        jLabel_major.setText("Major: " + driver.personal.getMajor());
        jTextArea_Quote.setText(driver.personal.getQuote());
    }

    public void deleteAccom() {

        if (jList_Accomp.getSelectedIndex() != -1) {
            int accDelIndex = jList_Accomp.getSelectedIndex();

            // jTextField_ipPG.setText(jList_Accomp.getSelectedValue(accDelIndex));
            driver.personal.accomplishment.remove(accDelIndex);
            listModel.remove(accDelIndex);

            jList_Accomp.invalidate();
            jList_Accomp.validate();
            jList_Accomp.repaint();

            driver.writeJSON();

            jTextField_ipPG.setText(null);
            this.driver.Panel.upload();
        }
    }

    private void initComponents() {

        jPanel_Header = new javax.swing.JPanel();
        jLabel_Welcome = new javax.swing.JLabel();
        button_Profile = new javax.swing.JButton();
        jLabel_major = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_Btns = new javax.swing.JPanel();
        jLabel_PG = new javax.swing.JLabel();
        jTextField_ipPG = new javax.swing.JTextField();
        jButton_addPG = new javax.swing.JButton();
        jButton_delPG = new javax.swing.JButton();
        jScrollPane_PerGoals = new javax.swing.JScrollPane();
        panel_PerGoals = new javax.swing.JPanel();
        jScrollPane_Accomplisments = new javax.swing.JScrollPane();
        jList_Accomp = new javax.swing.JList<String>(listModel);
        jPanel_Quote = new javax.swing.JPanel();
        jScrollPane_Quote = new javax.swing.JScrollPane();
        jTextArea_Quote = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Header.setBackground(new java.awt.Color(40, 84, 48));

        jLabel_Welcome.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jLabel_Welcome.setForeground(new java.awt.Color(229, 217, 182));
        jLabel_Welcome.setText("Welcome, " + driver.getMain().getUser().getFirstName());

        button_Profile.setBackground(new java.awt.Color(229, 217, 182));
        button_Profile.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        button_Profile.setText("SET PROFILE");
        button_Profile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button_ProfileActionPerformed(e);
            }
        });

        jLabel_major.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel_major.setForeground(new java.awt.Color(229, 217, 182));
        String major = "";
        if (driver.personal.getMajor() != null) {
            major = driver.personal.getMajor();
        }
        jLabel_major.setText("Major: " + major);

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
                jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel_HeaderLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel_Welcome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button_Profile)
                                        .addContainerGap())
                        .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel_major)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel_HeaderLayout.setVerticalGroup(
                jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                                .addGroup(jPanel_HeaderLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(button_Profile))
                                        .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                                                .addContainerGap(25, Short.MAX_VALUE)
                                                .addComponent(jLabel_Welcome)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_major)
                                .addContainerGap(12, Short.MAX_VALUE)));

        jPanel_Btns.setBackground(new java.awt.Color(95, 141, 78));

        jLabel_PG.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel_PG.setForeground(new java.awt.Color(153, 51, 0));
        jLabel_PG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_PG.setText("Personal Goals");

        jTextField_ipPG.setBackground(new java.awt.Color(229, 217, 182));
        jTextField_ipPG.setText(null);

        jButton_addPG.setText("Add");

        jButton_delPG.setText("DEL");

        javax.swing.GroupLayout jPanel_BtnsLayout = new javax.swing.GroupLayout(jPanel_Btns);
        jPanel_Btns.setLayout(jPanel_BtnsLayout);
        jPanel_BtnsLayout.setHorizontalGroup(
                jPanel_BtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_BtnsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_BtnsLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_PG, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_ipPG)
                                        .addGroup(jPanel_BtnsLayout.createSequentialGroup()
                                                .addComponent(jButton_addPG)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_delPG)))
                                .addContainerGap()));
        jPanel_BtnsLayout.setVerticalGroup(
                jPanel_BtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_BtnsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_PG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ipPG, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_BtnsLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_addPG)
                                        .addComponent(jButton_delPG))
                                .addContainerGap(53, Short.MAX_VALUE)));

        jScrollPane_PerGoals.setBackground(new java.awt.Color(242, 242, 242));

        panel_PerGoals.setBackground(new java.awt.Color(164, 190, 123));
        panel_PerGoals.setLayout(new javax.swing.BoxLayout(panel_PerGoals, javax.swing.BoxLayout.LINE_AXIS));

        panel_PerGoals.setLayout(new BoxLayout(panel_PerGoals, BoxLayout.Y_AXIS));

        jScrollPane_PerGoals.setViewportView(panel_PerGoals);

        jList_Accomp.setBackground(new java.awt.Color(164, 190, 123));
        jScrollPane_Accomplisments.setViewportView(jList_Accomp);

        jPanel_Quote.setBackground(new java.awt.Color(95, 141, 78));

        jTextArea_Quote.setColumns(20);
        jTextArea_Quote.setRows(5);
        jScrollPane_Quote.setViewportView(jTextArea_Quote);

        javax.swing.GroupLayout jPanel_QuoteLayout = new javax.swing.GroupLayout(jPanel_Quote);
        jPanel_Quote.setLayout(jPanel_QuoteLayout);
        jPanel_QuoteLayout.setHorizontalGroup(
                jPanel_QuoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_QuoteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane_Quote, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel_QuoteLayout.setVerticalGroup(
                jPanel_QuoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_QuoteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane_Quote, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel_Quote, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel_Btns, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane_PerGoals, javax.swing.GroupLayout.DEFAULT_SIZE, 258,
                                        Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane_Accomplisments, javax.swing.GroupLayout.DEFAULT_SIZE, 259,
                                        Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane_Accomplisments)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jPanel_Quote, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel_Btns, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jScrollPane_PerGoals))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        pack();
    }

    private void button_ProfileActionPerformed(java.awt.event.ActionEvent evt) {
        driver.personal
                .setMajor(JOptionPane.showInputDialog(this, "What is your Major? ", JOptionPane.INFORMATION_MESSAGE));
        // }
        driver.personal.setQuote(
                JOptionPane.showInputDialog(this, "Enter your favourite quote!", JOptionPane.INFORMATION_MESSAGE));

        jLabel_major.setText("Major: " + driver.personal.getMajor());
        jTextArea_Quote.setText(driver.personal.getQuote());
        driver.writeJSON();

    }

}
