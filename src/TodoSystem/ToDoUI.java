package TodoSystem;

import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.util.ArrayList;

public class ToDoUI extends JFrame{
    private ToDoDriver driver;

    private ArrayList<String> SchoolWork = new ArrayList<String>();
    private ArrayList<String> Health = new ArrayList<String>();
    private ArrayList<String> Others = new ArrayList<String>();


    ToDoUI(ToDoDriver driver) {
        initComponents();

        this.setVisible(true);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ToDoLabel = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        SchoolPanel = new javax.swing.JPanel();
        SchoolProgress = new javax.swing.JProgressBar();
        SchoolLabel = new javax.swing.JLabel();
        sc1 = new javax.swing.JCheckBox();
        sc2 = new javax.swing.JCheckBox();
        sc3 = new javax.swing.JCheckBox();
        sc4 = new javax.swing.JCheckBox();
        sc5 = new javax.swing.JCheckBox();
        sc6 = new javax.swing.JCheckBox();
        sc7 = new javax.swing.JCheckBox();
        sc8 = new javax.swing.JCheckBox();
        sc9 = new javax.swing.JCheckBox();
        sc10 = new javax.swing.JCheckBox();
        HealthPanel = new javax.swing.JPanel();
        HealthProgress = new javax.swing.JProgressBar();
        HealthLabel = new javax.swing.JLabel();
        h1 = new javax.swing.JCheckBox();
        h2 = new javax.swing.JCheckBox();
        h3 = new javax.swing.JCheckBox();
        h4 = new javax.swing.JCheckBox();
        h5 = new javax.swing.JCheckBox();
        h6 = new javax.swing.JCheckBox();
        h7 = new javax.swing.JCheckBox();
        h8 = new javax.swing.JCheckBox();
        h9 = new javax.swing.JCheckBox();
        h10 = new javax.swing.JCheckBox();
        OthersPanel = new javax.swing.JPanel();
        OthersProgress = new javax.swing.JProgressBar();
        OthersLabel = new javax.swing.JLabel();
        ot1 = new javax.swing.JCheckBox();
        ot2 = new javax.swing.JCheckBox();
        ot3 = new javax.swing.JCheckBox();
        ot4 = new javax.swing.JCheckBox();
        ot5 = new javax.swing.JCheckBox();
        ot6 = new javax.swing.JCheckBox();
        ot7 = new javax.swing.JCheckBox();
        ot8 = new javax.swing.JCheckBox();
        ot9 = new javax.swing.JCheckBox();
        ot10 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        EnterTask = new javax.swing.JLabel();
        taskTextField = new javax.swing.JTextField();
        OptionTask = new javax.swing.JComboBox<>();
        TaskOption = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 75));

        ToDoLabel.setBackground(new java.awt.Color(204, 204, 204));
        ToDoLabel.setFont(new java.awt.Font("Kefa", 0, 24)); // NOI18N
        ToDoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ToDoLabel.setText("To Do List");

        Exit.setFont(new java.awt.Font("Kefa", 0, 13)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(ToDoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToDoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SchoolPanel.setBackground(new java.awt.Color(0, 153, 204));
        SchoolPanel.setMaximumSize(new java.awt.Dimension(550, 800));
        SchoolPanel.setMinimumSize(new java.awt.Dimension(150, 300));

        SchoolProgress.setBackground(new java.awt.Color(255, 255, 255));

        SchoolLabel.setFont(new java.awt.Font("Kefa", 0, 18)); // NOI18N
        SchoolLabel.setText("School Work");

        sc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sc4ActionPerformed(evt);
            }
        });

        sc8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sc8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SchoolPanelLayout = new javax.swing.GroupLayout(SchoolPanel);
        SchoolPanel.setLayout(SchoolPanelLayout);
        SchoolPanelLayout.setHorizontalGroup(
            SchoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchoolPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(SchoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SchoolPanelLayout.createSequentialGroup()
                        .addComponent(sc1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SchoolPanelLayout.createSequentialGroup()
                        .addGroup(SchoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SchoolPanelLayout.createSequentialGroup()
                                .addComponent(SchoolLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(SchoolProgress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(63, 63, 63))
                    .addGroup(SchoolPanelLayout.createSequentialGroup()
                        .addGroup(SchoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sc10)
                            .addComponent(sc9)
                            .addComponent(sc8)
                            .addComponent(sc7)
                            .addComponent(sc6)
                            .addComponent(sc5)
                            .addComponent(sc4)
                            .addComponent(sc3)
                            .addComponent(sc2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        SchoolPanelLayout.setVerticalGroup(
            SchoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchoolPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(SchoolLabel)
                .addGap(18, 18, 18)
                .addComponent(SchoolProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(sc1)
                .addGap(27, 27, 27)
                .addComponent(sc2)
                .addGap(28, 28, 28)
                .addComponent(sc3)
                .addGap(29, 29, 29)
                .addComponent(sc4)
                .addGap(30, 30, 30)
                .addComponent(sc5)
                .addGap(35, 35, 35)
                .addComponent(sc6)
                .addGap(37, 37, 37)
                .addComponent(sc7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sc8)
                .addGap(38, 38, 38)
                .addComponent(sc9)
                .addGap(34, 34, 34)
                .addComponent(sc10)
                .addGap(93, 93, 93))
        );

        HealthPanel.setBackground(new java.awt.Color(102, 204, 0));
        HealthPanel.setMaximumSize(new java.awt.Dimension(550, 800));
        HealthPanel.setMinimumSize(new java.awt.Dimension(150, 300));

        HealthProgress.setBackground(new java.awt.Color(255, 255, 255));

        HealthLabel.setFont(new java.awt.Font("Kefa", 0, 18)); // NOI18N
        HealthLabel.setText("Health");

        h4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h4ActionPerformed(evt);
            }
        });

        h8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HealthPanelLayout = new javax.swing.GroupLayout(HealthPanel);
        HealthPanel.setLayout(HealthPanelLayout);
        HealthPanelLayout.setHorizontalGroup(
            HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HealthPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HealthPanelLayout.createSequentialGroup()
                        .addComponent(HealthLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(HealthProgress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGap(48, 48, 48))
            .addGroup(HealthPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h1)
                    .addComponent(h10)
                    .addComponent(h9)
                    .addComponent(h8)
                    .addComponent(h7)
                    .addComponent(h6)
                    .addComponent(h5)
                    .addComponent(h4)
                    .addComponent(h3)
                    .addComponent(h2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HealthPanelLayout.setVerticalGroup(
            HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(HealthLabel)
                .addGap(18, 18, 18)
                .addComponent(HealthProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(h1)
                .addGap(27, 27, 27)
                .addComponent(h2)
                .addGap(28, 28, 28)
                .addComponent(h3)
                .addGap(29, 29, 29)
                .addComponent(h4)
                .addGap(30, 30, 30)
                .addComponent(h5)
                .addGap(35, 35, 35)
                .addComponent(h6)
                .addGap(37, 37, 37)
                .addComponent(h7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(h8)
                .addGap(38, 38, 38)
                .addComponent(h9)
                .addGap(34, 34, 34)
                .addComponent(h10)
                .addGap(100, 100, 100))
        );

        OthersPanel.setBackground(new java.awt.Color(255, 204, 51));
        OthersPanel.setMaximumSize(new java.awt.Dimension(550, 800));
        OthersPanel.setMinimumSize(new java.awt.Dimension(150, 300));

        OthersProgress.setBackground(new java.awt.Color(255, 255, 255));

        OthersLabel.setFont(new java.awt.Font("Kefa", 0, 18)); // NOI18N
        OthersLabel.setText("Others");

        ot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ot4ActionPerformed(evt);
            }
        });

        ot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ot8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OthersPanelLayout = new javax.swing.GroupLayout(OthersPanel);
        OthersPanel.setLayout(OthersPanelLayout);
        OthersPanelLayout.setHorizontalGroup(
            OthersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OthersPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(OthersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, OthersPanelLayout.createSequentialGroup()
                        .addComponent(OthersLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(OthersProgress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(OthersPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(OthersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ot1)
                    .addComponent(ot10)
                    .addComponent(ot9)
                    .addComponent(ot8)
                    .addComponent(ot7)
                    .addComponent(ot6)
                    .addComponent(ot5)
                    .addComponent(ot4)
                    .addComponent(ot3)
                    .addComponent(ot2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OthersPanelLayout.setVerticalGroup(
            OthersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(OthersLabel)
                .addGap(18, 18, 18)
                .addComponent(OthersProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ot1)
                .addGap(27, 27, 27)
                .addComponent(ot2)
                .addGap(28, 28, 28)
                .addComponent(ot3)
                .addGap(29, 29, 29)
                .addComponent(ot4)
                .addGap(30, 30, 30)
                .addComponent(ot5)
                .addGap(35, 35, 35)
                .addComponent(ot6)
                .addGap(37, 37, 37)
                .addComponent(ot7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ot8)
                .addGap(38, 38, 38)
                .addComponent(ot9)
                .addGap(34, 34, 34)
                .addComponent(ot10)
                .addGap(96, 96, 96))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        EnterTask.setForeground(new java.awt.Color(255, 255, 255));
        EnterTask.setText("Enter Task:");

        taskTextField.setText("jTextField1");
        taskTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTextFieldActionPerformed(evt);
            }
        });

        OptionTask.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Work", "Health", "Others" }));

        TaskOption.setForeground(new java.awt.Color(255, 255, 255));
        TaskOption.setText("Task Options:");

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteButton)
                    .addComponent(AddButton)
                    .addComponent(TaskOption)
                    .addComponent(OptionTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterTask))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(EnterTask)
                .addGap(18, 18, 18)
                .addComponent(taskTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(TaskOption)
                .addGap(18, 18, 18)
                .addComponent(OptionTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(AddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(SchoolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(HealthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(OthersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(148, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HealthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SchoolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OthersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void taskTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void sc4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void sc8ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void h4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void h8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void ot4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void ot8ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }         
    
    
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }    

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource() == AddButton) {
            
        }
    }
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        
        if(evt.getSource() == AddButton) {
            System.out.println("click");
            text = taskTextField.getText();
            OptionCombobox = (String)OptionTask.getSelectedItem();
            System.out.println(text);
            System.out.println(OptionCombobox);
            
            tmp = new JCheckBox(text);
            if(OptionCombobox == "School Work") {
                SchoolWork.add(text);
                int size = SchoolWork.size();
                if(size == 1) {
                    sc1.setText(text);
                }
                if(size == 2) {
                    sc2.setText(text);
                }
                if(size == 3) {
                    sc3.setText(text);
                }
                if(size == 4) {
                    sc4.setText(text);
                }
                if(size == 5) {
                    sc5.setText(text);
                }
                if(size == 6) {
                    sc6.setText(text); 
                }
                if(size == 7) {
                    sc7.setText(text);
                }
                if(size == 8) {
                    sc8.setText(text);
                }
                if(size == 9) {
                    sc9.setText(text);
                }
                if(size == 10) {
                    sc10.setText(text);
                }
                
                
            }
            else if(OptionCombobox == "Health") {
                
                Health.add(text);
                int size = Health.size();
                if(size == 1) {
                    h1.setText(text);
                }
                if(size == 2) {
                    h2.setText(text);
                }
                if(size == 3) {
                    h3.setText(text);
                }
                if(size == 4) {
                    h4.setText(text);
                }
                if(size == 5) {
                    h5.setText(text);
                }
                if(size == 6) {
                    h6.setText(text); 
                }
                if(size == 7) {
                    h7.setText(text);
                }
                if(size == 8) {
                    h8.setText(text);
                }
                if(size == 9) {
                    h9.setText(text);
                }
                if(size == 10) {
                    h10.setText(text);
                }
                
            }
                
            else{
                
                Others.add(text);
                int size = Others.size();
                if(size == 1) {
                    ot1.setText(text);
                }
                if(size == 2) {
                    ot2.setText(text);
                }
                if(size == 3) {
                    ot3.setText(text);
                }
                if(size == 4) {
                    ot4.setText(text);
                }
                if(size == 5) {
                    ot5.setText(text);
                }
                if(size == 6) {
                    ot6.setText(text); 
                }
                if(size == 7) {
                    ot7.setText(text);
                }
                if(size == 8) {
                    ot8.setText(text);
                }
                if(size == 9) {
                    ot9.setText(text);
                }
                if(size == 10) {
                    ot10.setText(text);
                }
                             
            }                    
            this.pack();
        }
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify                     
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel EnterTask;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel HealthLabel;
    private javax.swing.JPanel HealthPanel;
    private javax.swing.JProgressBar HealthProgress;
    private javax.swing.JComboBox<String> OptionTask;
    private javax.swing.JLabel OthersLabel;
    private javax.swing.JPanel OthersPanel;
    private javax.swing.JProgressBar OthersProgress;
    private javax.swing.JLabel SchoolLabel;
    private javax.swing.JPanel SchoolPanel;
    private javax.swing.JProgressBar SchoolProgress;
    private javax.swing.JLabel TaskOption;
    private javax.swing.JLabel ToDoLabel;
    private javax.swing.JCheckBox h1;
    private javax.swing.JCheckBox h10;
    private javax.swing.JCheckBox h2;
    private javax.swing.JCheckBox h3;
    private javax.swing.JCheckBox h4;
    private javax.swing.JCheckBox h5;
    private javax.swing.JCheckBox h6;
    private javax.swing.JCheckBox h7;
    private javax.swing.JCheckBox h8;
    private javax.swing.JCheckBox h9;
    private javax.swing.JCheckBox sc1;
    private javax.swing.JCheckBox sc2;
    private javax.swing.JCheckBox sc3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox ot1;
    private javax.swing.JCheckBox ot10;
    private javax.swing.JCheckBox ot2;
    private javax.swing.JCheckBox ot3;
    private javax.swing.JCheckBox ot4;
    private javax.swing.JCheckBox ot5;
    private javax.swing.JCheckBox ot6;
    private javax.swing.JCheckBox ot7;
    private javax.swing.JCheckBox ot8;
    private javax.swing.JCheckBox ot9;
    private javax.swing.JCheckBox sc10;
    private javax.swing.JCheckBox sc4;
    private javax.swing.JCheckBox sc5;
    private javax.swing.JCheckBox sc6;
    private javax.swing.JCheckBox sc7;
    private javax.swing.JCheckBox sc8;
    private javax.swing.JCheckBox sc9;
    private javax.swing.JTextField taskTextField;
    // End of variables declaration                   

    // Variables declaration - do not modify    
    private JCheckBox tmp;
    private String text;                 
    private String OptionCombobox;
              
}
