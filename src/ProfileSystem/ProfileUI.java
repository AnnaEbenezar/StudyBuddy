package ProfileSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import MainSystem.User;

public class ProfileUI extends JFrame {

    private java.awt.Button button_Profile;
    private javax.swing.JButton jButton_addPG;
    private javax.swing.JButton jButton_delPG;
    private javax.swing.JLabel jLabel_PG;
    private javax.swing.JLabel jLabel_Welcome;
    private javax.swing.JLabel jLabel_major;
    private javax.swing.JList<String> jList_Accomp;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Btns;
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
        }
    }

    private void initComponents() {

        jPanel_Header = new javax.swing.JPanel();
        jLabel_Welcome = new javax.swing.JLabel();
        button_Profile = new java.awt.Button();
        jLabel_major = new javax.swing.JLabel();
        jScrollPane_PerGoals = new javax.swing.JScrollPane();
        panel_PerGoals = new javax.swing.JPanel();
        jScrollPane_Accomplisments = new javax.swing.JScrollPane();
        jList_Accomp = new javax.swing.JList<>();
        jPanel_Quote = new javax.swing.JPanel();
        jScrollPane_Quote = new javax.swing.JScrollPane();
        jTextArea_Quote = new javax.swing.JTextArea();
        jPanel_Btns = new javax.swing.JPanel();
        jTextField_ipPG = new javax.swing.JTextField();
        jButton_addPG = new javax.swing.JButton();
        jButton_delPG = new javax.swing.JButton();
        jLabel_PG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //setTitle("Profile");
        setBackground(new java.awt.Color(229, 217, 182));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(800, 450));

        jPanel_Header.setBackground(new java.awt.Color(40, 84, 48));
        jPanel_Header.setPreferredSize(new java.awt.Dimension(800, 120));

        jLabel_Welcome.setFont(new java.awt.Font("Century Schoolbook", 0, 48)); // NOI18N
        jLabel_Welcome.setForeground(new java.awt.Color(229, 217, 182));
        jLabel_Welcome.setText("Welcome, " + driver.getMain().getUser().getFirstName());

        button_Profile.setBackground(new java.awt.Color(229, 217, 182));
        button_Profile.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        button_Profile.setLabel("SET PROFILE");
        button_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ProfileActionPerformed(evt);
            }
        });

        jLabel_major.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel_major.setForeground(new java.awt.Color(229, 217, 182));
        
        String major = "";
        if (driver.personal.getMajor() != null) {
            major = driver.personal.getMajor();
        }
        jLabel_major.setText(major);

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_major, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                        .addComponent(jLabel_Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(179, 179, 179)
                        .addComponent(button_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel_Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_major)
                .addGap(209, 209, 209))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
        );

        jScrollPane_PerGoals.setMinimumSize(new java.awt.Dimension(250, 200));
        jScrollPane_PerGoals.setPreferredSize(new java.awt.Dimension(250, 200));

        panel_PerGoals.setBackground(new java.awt.Color(164, 190, 123));
        panel_PerGoals.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        panel_PerGoals.setMaximumSize(new java.awt.Dimension(32767, 32767));
        panel_PerGoals.setMinimumSize(new java.awt.Dimension(250, 200));
        panel_PerGoals.setPreferredSize(new java.awt.Dimension(250, 200));
        panel_PerGoals.setLayout(new javax.swing.BoxLayout(panel_PerGoals, javax.swing.BoxLayout.Y_AXIS));        
        jScrollPane_PerGoals.setViewportView(panel_PerGoals);

        jScrollPane_Accomplisments.setMinimumSize(new java.awt.Dimension(250, 200));
        jScrollPane_Accomplisments.setPreferredSize(new java.awt.Dimension(250, 200));

        jList_Accomp.setBackground(new java.awt.Color(164, 190, 123));
        jList_Accomp.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jList_Accomp.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jList_Accomp.setMinimumSize(new java.awt.Dimension(250, 200));
        jList_Accomp.setPreferredSize(new java.awt.Dimension(250, 200));
        jScrollPane_Accomplisments.setViewportView(jList_Accomp);

        jPanel_Quote.setBackground(new java.awt.Color(95, 141, 78));
        jPanel_Quote.setPreferredSize(new java.awt.Dimension(222, 222));

        jScrollPane_Quote.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane_Quote.setHorizontalScrollBar(null);
        jScrollPane_Quote.setMinimumSize(new java.awt.Dimension(197, 86));
        jScrollPane_Quote.setRowHeaderView(null);

        jTextArea_Quote.setEditable(false);
        jTextArea_Quote.setBackground(new java.awt.Color(229, 217, 182));
        jTextArea_Quote.setColumns(18);
        jTextArea_Quote.setFont(new java.awt.Font("Edwardian Script ITC", 0, 24)); // NOI18N
        jTextArea_Quote.setLineWrap(true);
        jTextArea_Quote.setRows(5);
        jTextArea_Quote.setText(driver.personal.getQuote());
        jTextArea_Quote.setWrapStyleWord(true);
        jTextArea_Quote.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea_Quote.setMinimumSize(new java.awt.Dimension(246, 149));
        jScrollPane_Quote.setViewportView(jTextArea_Quote);

        javax.swing.GroupLayout jPanel_QuoteLayout = new javax.swing.GroupLayout(jPanel_Quote);
        jPanel_Quote.setLayout(jPanel_QuoteLayout);
        jPanel_QuoteLayout.setHorizontalGroup(
            jPanel_QuoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_QuoteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_Quote, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_QuoteLayout.setVerticalGroup(
            jPanel_QuoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_QuoteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_Quote, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Btns.setBackground(new java.awt.Color(95, 141, 78));

        jTextField_ipPG.setBackground(new java.awt.Color(229, 217, 182));
        jTextField_ipPG.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N

        jButton_addPG.setBackground(new java.awt.Color(229, 217, 182));
        jButton_addPG.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        jButton_addPG.setText("ADD");
        // jButton_addPG.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         jButton_addPGActionPerformed(evt);
        //     }
        // });

        jButton_delPG.setBackground(new java.awt.Color(229, 217, 182));
        jButton_delPG.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        jButton_delPG.setText("DEL");
        // jButton_delPG.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         jButton_delPGActionPerformed(evt);
        //     }
        // });

        jLabel_PG.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel_PG.setForeground(new java.awt.Color(229, 217, 182));
        jLabel_PG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_PG.setText("Personal Goals");

        javax.swing.GroupLayout jPanel_BtnsLayout = new javax.swing.GroupLayout(jPanel_Btns);
        jPanel_Btns.setLayout(jPanel_BtnsLayout);
        jPanel_BtnsLayout.setHorizontalGroup(
            jPanel_BtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_ipPG, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_BtnsLayout.createSequentialGroup()
                        .addComponent(jButton_addPG, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButton_delPG, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_BtnsLayout.setVerticalGroup(
            jPanel_BtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_PG, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_ipPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_BtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_addPG)
                    .addComponent(jButton_delPG))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_Quote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Btns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_PerGoals, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane_Accomplisments, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_PerGoals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Quote, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel_Btns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane_Accomplisments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }

    private void button_ProfileActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        
        driver.personal.setMajor(JOptionPane.showInputDialog(this, "What is your Major? ", JOptionPane.INFORMATION_MESSAGE));
         
        driver.personal.setQuote(JOptionPane.showInputDialog(this, "Enter your favourite quote!", JOptionPane.INFORMATION_MESSAGE));
        
        jLabel_major.setText("Major: " + driver.personal.getMajor());
        jTextArea_Quote.setText(driver.personal.getQuote());
        
        driver.writeJSON();   
    }
    
}
