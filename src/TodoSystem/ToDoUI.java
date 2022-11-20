package TodoSystem;

import javax.swing.*;

import java.awt.Color;
import java.util.*;
public class ToDoUI extends JFrame{

    ToDoDriver driver;

    /*file
     * SchoolSize
     * text, bool
     * ....
     * HealthSize
     * text, bool
     * .....
     * OthersSize
     * text, bool
     * ......
     * ImportantSize
     * text
     * ......
     */

     /*todo:
      * read file and assign function
      * menu close, clear and write a final file
      */
    private ArrayList<JCheckBox> SchoolCheckBoxList = new ArrayList<JCheckBox>();
    private ArrayList<JCheckBox> HealthCheckBoxList = new ArrayList<JCheckBox>();
    private ArrayList<JCheckBox> OthersCheckBoxList = new ArrayList<JCheckBox>();
    private ArrayList<JCheckBox> ImportantCheckBoxList = new ArrayList<JCheckBox>();

    private int SchoolSize;
    private int HealthSize;
    private int OthersSize;
    private int ImportantSize;

    private int SchoolCheck;
    private int HealthCheck;
    private int OthersCheck;

    private String textAns;                 
    private String CategoryAns;

    ToDoUI(ToDoDriver driver) {
        initComponents();
        setVisible(true);
    }

    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        EnterTaskLabel = new javax.swing.JLabel();
        TaskNameTextField = new javax.swing.JTextField();
        CategoryLabel = new javax.swing.JLabel();
        CategoryComboBox = new javax.swing.JComboBox<>();
        DeleteButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();
        ImpButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        SchoolScrollPane = new javax.swing.JScrollPane();
        SchoolWorkPanel = new javax.swing.JPanel();
        SchoolWorkLabel = new javax.swing.JLabel();
        SchoolWorkLabel.setForeground(Color.white);
        School21 = new javax.swing.JCheckBox();
        School22 = new javax.swing.JCheckBox();
        School23 = new javax.swing.JCheckBox();
        School24 = new javax.swing.JCheckBox();
        School25 = new javax.swing.JCheckBox();
        School26 = new javax.swing.JCheckBox();
        School27 = new javax.swing.JCheckBox();
        School28 = new javax.swing.JCheckBox();
        School29 = new javax.swing.JCheckBox();
        School30 = new javax.swing.JCheckBox();
        SchoolProgressBar = new javax.swing.JProgressBar();
        School1 = new javax.swing.JCheckBox();
        School2 = new javax.swing.JCheckBox();
        School3 = new javax.swing.JCheckBox();
        School4 = new javax.swing.JCheckBox();
        School5 = new javax.swing.JCheckBox();
        School6 = new javax.swing.JCheckBox();
        School7 = new javax.swing.JCheckBox();
        School8 = new javax.swing.JCheckBox();
        School9 = new javax.swing.JCheckBox();
        School10 = new javax.swing.JCheckBox();
        School11 = new javax.swing.JCheckBox();
        School12 = new javax.swing.JCheckBox();
        School13 = new javax.swing.JCheckBox();
        School14 = new javax.swing.JCheckBox();
        School15 = new javax.swing.JCheckBox();
        School16 = new javax.swing.JCheckBox();
        School17 = new javax.swing.JCheckBox();
        School18 = new javax.swing.JCheckBox();
        School19 = new javax.swing.JCheckBox();
        School20 = new javax.swing.JCheckBox();
        OthersScrollPane = new javax.swing.JScrollPane();
        OthersPanel = new javax.swing.JPanel();
        othersLabel = new javax.swing.JLabel();
        othersLabel.setForeground(Color.white);
        O11 = new javax.swing.JCheckBox();
        O12 = new javax.swing.JCheckBox();
        O13 = new javax.swing.JCheckBox();
        O14 = new javax.swing.JCheckBox();
        O15 = new javax.swing.JCheckBox();
        O16 = new javax.swing.JCheckBox();
        O17 = new javax.swing.JCheckBox();
        O18 = new javax.swing.JCheckBox();
        O19 = new javax.swing.JCheckBox();
        O20 = new javax.swing.JCheckBox();
        OthersProgressBar = new javax.swing.JProgressBar();
        O1 = new javax.swing.JCheckBox();
        O2 = new javax.swing.JCheckBox();
        O3 = new javax.swing.JCheckBox();
        O4 = new javax.swing.JCheckBox();
        O5 = new javax.swing.JCheckBox();
        O6 = new javax.swing.JCheckBox();
        O7 = new javax.swing.JCheckBox();
        O8 = new javax.swing.JCheckBox();
        O9 = new javax.swing.JCheckBox();
        O10 = new javax.swing.JCheckBox();
        O30 = new javax.swing.JCheckBox();
        O29 = new javax.swing.JCheckBox();
        O28 = new javax.swing.JCheckBox();
        O27 = new javax.swing.JCheckBox();
        O26 = new javax.swing.JCheckBox();
        O25 = new javax.swing.JCheckBox();
        O24 = new javax.swing.JCheckBox();
        O23 = new javax.swing.JCheckBox();
        O22 = new javax.swing.JCheckBox();
        O21 = new javax.swing.JCheckBox();
        HealthScrollPane = new javax.swing.JScrollPane();
        HealthPanel = new javax.swing.JPanel();
        HealthLabel = new javax.swing.JLabel();
        HealthLabel.setForeground(Color.white);
        H11 = new javax.swing.JCheckBox();
        H12 = new javax.swing.JCheckBox();
        H13 = new javax.swing.JCheckBox();
        H14 = new javax.swing.JCheckBox();
        H15 = new javax.swing.JCheckBox();
        H16 = new javax.swing.JCheckBox();
        H17 = new javax.swing.JCheckBox();
        H18 = new javax.swing.JCheckBox();
        H19 = new javax.swing.JCheckBox();
        H20 = new javax.swing.JCheckBox();
        HealthProgressBar = new javax.swing.JProgressBar();
        H1 = new javax.swing.JCheckBox();
        H2 = new javax.swing.JCheckBox();
        H3 = new javax.swing.JCheckBox();
        H4 = new javax.swing.JCheckBox();
        H5 = new javax.swing.JCheckBox();
        H6 = new javax.swing.JCheckBox();
        H7 = new javax.swing.JCheckBox();
        H8 = new javax.swing.JCheckBox();
        H9 = new javax.swing.JCheckBox();
        H10 = new javax.swing.JCheckBox();
        H21 = new javax.swing.JCheckBox();
        H22 = new javax.swing.JCheckBox();
        H23 = new javax.swing.JCheckBox();
        H24 = new javax.swing.JCheckBox();
        H25 = new javax.swing.JCheckBox();
        H26 = new javax.swing.JCheckBox();
        H27 = new javax.swing.JCheckBox();
        H28 = new javax.swing.JCheckBox();
        H29 = new javax.swing.JCheckBox();
        H30 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        ImportantWorkPanel = new javax.swing.JPanel();
        Imp1 = new javax.swing.JCheckBox();
        Imp3 = new javax.swing.JCheckBox();
        Imp2 = new javax.swing.JCheckBox();
        Imp4 = new javax.swing.JCheckBox();
        Imp5 = new javax.swing.JCheckBox();
        BUDDY = new javax.swing.JLabel();
        STUDY = new javax.swing.JLabel();
        PriorityTaskLabel = new javax.swing.JLabel();

        SchoolCheckBoxList.add(School1);
        SchoolCheckBoxList.add(School2);
        SchoolCheckBoxList.add(School3);
        SchoolCheckBoxList.add(School4);
        SchoolCheckBoxList.add(School5);
        SchoolCheckBoxList.add(School6);
        SchoolCheckBoxList.add(School7);
        SchoolCheckBoxList.add(School8);
        SchoolCheckBoxList.add(School9);
        SchoolCheckBoxList.add(School10);
        SchoolCheckBoxList.add(School11);
        SchoolCheckBoxList.add(School12);
        SchoolCheckBoxList.add(School13);
        SchoolCheckBoxList.add(School14);
        SchoolCheckBoxList.add(School15);
        SchoolCheckBoxList.add(School16);
        SchoolCheckBoxList.add(School17);
        SchoolCheckBoxList.add(School18);
        SchoolCheckBoxList.add(School19);
        SchoolCheckBoxList.add(School20);
        SchoolCheckBoxList.add(School21);
        SchoolCheckBoxList.add(School22);
        SchoolCheckBoxList.add(School23);
        SchoolCheckBoxList.add(School24);
        SchoolCheckBoxList.add(School25);
        SchoolCheckBoxList.add(School26);
        SchoolCheckBoxList.add(School27);
        SchoolCheckBoxList.add(School28);
        SchoolCheckBoxList.add(School29);
        SchoolCheckBoxList.add(School30);

        int k = 0;
        for(k = 0; k < 30; k++) {
            int tmpK = k;
            SchoolCheckBoxList.get(k).setForeground(Color.white);
            SchoolCheckBoxList.get(k).addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    if(SchoolCheckBoxList.get(tmpK).getText() == "") {
                        SchoolCheckBoxList.get(tmpK).setSelected(false);
                    }
                    else{
                        SchoolActionPerformed(evt, tmpK);
                    }     
                }
            });
        }

        HealthCheckBoxList.add(H1);
        HealthCheckBoxList.add(H2);
        HealthCheckBoxList.add(H3);
        HealthCheckBoxList.add(H4);
        HealthCheckBoxList.add(H5);
        HealthCheckBoxList.add(H6);
        HealthCheckBoxList.add(H7);
        HealthCheckBoxList.add(H8);
        HealthCheckBoxList.add(H9);
        HealthCheckBoxList.add(H10);
        HealthCheckBoxList.add(H11);
        HealthCheckBoxList.add(H12);
        HealthCheckBoxList.add(H13);
        HealthCheckBoxList.add(H14);
        HealthCheckBoxList.add(H15);
        HealthCheckBoxList.add(H16);
        HealthCheckBoxList.add(H17);
        HealthCheckBoxList.add(H18);
        HealthCheckBoxList.add(H19);
        HealthCheckBoxList.add(H20);
        HealthCheckBoxList.add(H21);
        HealthCheckBoxList.add(H22);
        HealthCheckBoxList.add(H23);
        HealthCheckBoxList.add(H24);
        HealthCheckBoxList.add(H25);
        HealthCheckBoxList.add(H26);
        HealthCheckBoxList.add(H27);
        HealthCheckBoxList.add(H28);
        HealthCheckBoxList.add(H29);
        HealthCheckBoxList.add(H30);

        k = 0;
        for(k = 0; k < 30; k++) {
            HealthCheckBoxList.get(k).setForeground(Color.white);
            int tmpK = k;
            HealthCheckBoxList.get(k).addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    if(HealthCheckBoxList.get(tmpK).getText() == "") {
                        HealthCheckBoxList.get(tmpK).setSelected(false);
                    }
                    else{
                        HealthActionPerformed(evt, tmpK);
                    }     
                }
            });
        }

        OthersCheckBoxList.add(O1);
        OthersCheckBoxList.add(O2);
        OthersCheckBoxList.add(O3);
        OthersCheckBoxList.add(O4);
        OthersCheckBoxList.add(O5);
        OthersCheckBoxList.add(O6);
        OthersCheckBoxList.add(O7);
        OthersCheckBoxList.add(O8);
        OthersCheckBoxList.add(O9);
        OthersCheckBoxList.add(O10);
        OthersCheckBoxList.add(O11);
        OthersCheckBoxList.add(O12);
        OthersCheckBoxList.add(O13);
        OthersCheckBoxList.add(O14);
        OthersCheckBoxList.add(O15);
        OthersCheckBoxList.add(O16);
        OthersCheckBoxList.add(O17);
        OthersCheckBoxList.add(O18);
        OthersCheckBoxList.add(O19);
        OthersCheckBoxList.add(O20);
        OthersCheckBoxList.add(O21);
        OthersCheckBoxList.add(O22);
        OthersCheckBoxList.add(O23);
        OthersCheckBoxList.add(O24);
        OthersCheckBoxList.add(O25);
        OthersCheckBoxList.add(O26);
        OthersCheckBoxList.add(O27);
        OthersCheckBoxList.add(O28);
        OthersCheckBoxList.add(O29);
        OthersCheckBoxList.add(O30);

        k = 0;
        for(k = 0; k < 30; k++) {
            int tmpK = k;
            OthersCheckBoxList.get(k).setForeground(Color.white);
            OthersCheckBoxList.get(k).addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    if(OthersCheckBoxList.get(tmpK).getText() == "") {
                        OthersCheckBoxList.get(tmpK).setSelected(false);
                    }
                    else{
                        OthersActionPerformed(evt, tmpK);
                    }     
                }
            });
        }

        ImportantCheckBoxList.add(Imp1);
        Imp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 0);
            }
        });

        ImportantCheckBoxList.add(Imp2);
        Imp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 1);
            }
        });

        ImportantCheckBoxList.add(Imp3);
        Imp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 2);
            }
        });

        ImportantCheckBoxList.add(Imp4);
        Imp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 3);
            }
        });

        ImportantCheckBoxList.add(Imp5);
        Imp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 4);
            }
        });



        SchoolProgressBar.setStringPainted(true);
        HealthProgressBar.setStringPainted(true);
        OthersProgressBar.setStringPainted(true);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setSize(new java.awt.Dimension(700, 550));

        TopPanel.setBackground(new java.awt.Color(51, 51, 51));
        TopPanel.setForeground(new java.awt.Color(102, 102, 102));

        EnterTaskLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        EnterTaskLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterTaskLabel.setText("Enter Task:");

        CategoryLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        CategoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        CategoryLabel.setText("Category:");

        CategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Work", "Health", "Others"}));

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });


        MenuButton.setText("MENU");

        ImpButton.setText("⭐");
        ImpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(MenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(EnterTaskLabel)
                .addGap(18, 18, 18)
                .addComponent(TaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(CategoryLabel)
                .addGap(18, 18, 18)
                .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TopPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(MenuButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryLabel)
                            .addComponent(TaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterTaskLabel)
                            .addComponent(AddButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ImpButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        
        SchoolWorkPanel.setBackground(new java.awt.Color(-14087068));


        SchoolWorkLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        SchoolWorkLabel.setText("School Work");


        javax.swing.GroupLayout SchoolWorkPanelLayout = new javax.swing.GroupLayout(SchoolWorkPanel);
        SchoolWorkPanel.setLayout(SchoolWorkPanelLayout);
        SchoolWorkPanelLayout.setHorizontalGroup(
            SchoolWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchoolWorkPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(SchoolWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(School20)
                    .addComponent(School11)
                    .addComponent(School12)
                    .addComponent(School13)
                    .addComponent(School14)
                    .addComponent(School15)
                    .addComponent(School16)
                    .addComponent(School17)
                    .addComponent(School18)
                    .addComponent(School19)
                    .addComponent(School10)
                    .addComponent(School1)
                    .addComponent(School2)
                    .addComponent(School3)
                    .addComponent(School4)
                    .addComponent(School5)
                    .addComponent(School6)
                    .addComponent(School7)
                    .addComponent(School8)
                    .addComponent(School9)
                    .addComponent(School30)
                    .addComponent(School21)
                    .addComponent(SchoolWorkLabel)
                    .addComponent(School22)
                    .addComponent(School23)
                    .addComponent(School24)
                    .addComponent(School25)
                    .addComponent(School26)
                    .addComponent(School27)
                    .addComponent(School28)
                    .addComponent(School29)
                    .addComponent(SchoolProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        SchoolWorkPanelLayout.setVerticalGroup(
            SchoolWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchoolWorkPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(SchoolWorkLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SchoolProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(School1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School6)
                .addGap(18, 18, 18)
                .addComponent(School7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School16)
                .addGap(18, 18, 18)
                .addComponent(School17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(School21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School26)
                .addGap(18, 18, 18)
                .addComponent(School27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(School30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SchoolScrollPane.setViewportView(SchoolWorkPanel);

        OthersPanel.setBackground(new java.awt.Color(-14087068));

        othersLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        othersLabel.setForeground(Color.white);
        othersLabel.setText("Others");



        javax.swing.GroupLayout OthersPanelLayout = new javax.swing.GroupLayout(OthersPanel);
        OthersPanel.setLayout(OthersPanelLayout);
        OthersPanelLayout.setHorizontalGroup(
            OthersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(OthersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(O30)
                    .addComponent(O21)
                    .addComponent(O22)
                    .addComponent(O23)
                    .addComponent(O24)
                    .addComponent(O25)
                    .addComponent(O26)
                    .addComponent(O27)
                    .addComponent(O28)
                    .addComponent(O29)
                    .addComponent(O10)
                    .addComponent(O1)
                    .addComponent(O2)
                    .addComponent(O3)
                    .addComponent(O4)
                    .addComponent(O5)
                    .addComponent(O6)
                    .addComponent(O7)
                    .addComponent(O8)
                    .addComponent(O9)
                    .addComponent(O20)
                    .addComponent(O11)
                    .addComponent(O12)
                    .addComponent(O13)
                    .addComponent(O14)
                    .addComponent(O15)
                    .addComponent(O16)
                    .addComponent(O17)
                    .addComponent(O18)
                    .addComponent(O19)
                    .addComponent(othersLabel)
                    .addComponent(OthersProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        OthersPanelLayout.setVerticalGroup(
            OthersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(othersLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OthersProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(O1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O6)
                .addGap(18, 18, 18)
                .addComponent(O7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O10)
                .addGap(18, 18, 18)
                .addComponent(O11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O16)
                .addGap(18, 18, 18)
                .addComponent(O17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O26)
                .addGap(18, 18, 18)
                .addComponent(O27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O30)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        OthersScrollPane.setViewportView(OthersPanel);

        HealthPanel.setBackground(new java.awt.Color(-14087068));

        HealthLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        HealthLabel.setText("Health");


        javax.swing.GroupLayout HealthPanelLayout = new javax.swing.GroupLayout(HealthPanel);
        HealthPanel.setLayout(HealthPanelLayout);
        HealthPanelLayout.setHorizontalGroup(
            HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H30)
                    .addComponent(H21)
                    .addComponent(H22)
                    .addComponent(H23)
                    .addComponent(H24)
                    .addComponent(H25)
                    .addComponent(H26)
                    .addComponent(H27)
                    .addComponent(H28)
                    .addComponent(H29)
                    .addComponent(H10)
                    .addComponent(H1)
                    .addComponent(H2)
                    .addComponent(H3)
                    .addComponent(H4)
                    .addComponent(H5)
                    .addComponent(H6)
                    .addComponent(H7)
                    .addComponent(H8)
                    .addComponent(H9)
                    .addComponent(H20)
                    .addComponent(H11)
                    .addComponent(H12)
                    .addComponent(H13)
                    .addComponent(H14)
                    .addComponent(H15)
                    .addComponent(H16)
                    .addComponent(H17)
                    .addComponent(H18)
                    .addComponent(H19)
                    .addComponent(HealthLabel)
                    .addComponent(HealthProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        HealthPanelLayout.setVerticalGroup(
            HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(HealthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HealthProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(H1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H6)
                .addGap(18, 18, 18)
                .addComponent(H7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H10)
                .addGap(29, 29, 29)
                .addComponent(H11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H16)
                .addGap(18, 18, 18)
                .addComponent(H17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H26)
                .addGap(18, 18, 18)
                .addComponent(H27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H30)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        HealthScrollPane.setViewportView(HealthPanel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ImportantWorkPanel.setBackground(new java.awt.Color(204, 204, 204));



        javax.swing.GroupLayout ImportantWorkPanelLayout = new javax.swing.GroupLayout(ImportantWorkPanel);
        ImportantWorkPanel.setLayout(ImportantWorkPanelLayout);
        ImportantWorkPanelLayout.setHorizontalGroup(
            ImportantWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImportantWorkPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ImportantWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imp5)
                    .addComponent(Imp4)
                    .addComponent(Imp2)
                    .addComponent(Imp3)
                    .addComponent(Imp1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ImportantWorkPanelLayout.setVerticalGroup(
            ImportantWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImportantWorkPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Imp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Imp3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Imp4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imp5)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        BUDDY.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        BUDDY.setText("Plan and track your progress with study buddy");

        STUDY.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 36)); // NOI18N
        STUDY.setText("S T U D Y  B U D D Y");

        PriorityTaskLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 20)); // NOI18N
        PriorityTaskLabel.setText("Priority Task");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PriorityTaskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(486, 486, 486))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SchoolScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(HealthScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(OthersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImportantWorkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(STUDY)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BUDDY)
                                .addGap(170, 170, 170))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HealthScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SchoolScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(OthersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PriorityTaskLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImportantWorkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(STUDY)
                        .addGap(18, 18, 18)
                        .addComponent(BUDDY)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>           
    
    private void ImpActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource() == ImpButton) {
            textAns = TaskNameTextField.getText();

            ImportantSize++;
            ImportantCheckBoxList.get(ImportantSize-1).setText(textAns);
        }
    }

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {

        boolean found = false;
        JCheckBox tmp;
        String strtmp;
        Boolean booltmp;
        if(evt.getSource() == DeleteButton) {
            System.out.println("Delete match");
            int i = 0;
            int i2 = 0;
            int i3 = 0;

            boolean last_selected = false;

            textAns = TaskNameTextField.getText();
            CategoryAns = (String)CategoryComboBox.getSelectedItem();
            if(CategoryAns == "School Work") {
               for(i = 0; i < SchoolSize; i++) {
                System.out.println(textAns);
                System.out.println(SchoolCheckBoxList.get(i).getText());
                    if(textAns.equals(SchoolCheckBoxList.get(i).getText())){
                        System.out.println("found match");
                        SchoolCheckBoxList.get(i).setText("");
                        SchoolCheckBoxList.get(i).setSelected(false);

                        found = true;
                        SchoolSize--;
                        
                        break;
                    }
               }
               if(found){
                if(i < SchoolSize) {
                    System.out.println("swap");

                    //get text for last item
                    strtmp = SchoolCheckBoxList.get(SchoolSize).getText();
                    last_selected = SchoolCheckBoxList.get(SchoolSize).isSelected();

                    //set the delete item text a text from last item
                    SchoolCheckBoxList.get(i).setText(strtmp); 
                    SchoolCheckBoxList.get(i).setSelected(last_selected); 

                    //delete text of last item
                    SchoolCheckBoxList.get(SchoolSize).setText("");
                    SchoolCheckBoxList.get(i).setSelected(false);
                    
                    
                }
                SchoolActionPerformed(evt, -1);
 

           }
               

            }
            else if(CategoryAns == "Health") {
                for(i2 = 0; i2 < HealthSize; i2++) {
                    System.out.println(textAns);
                    System.out.println(HealthCheckBoxList.get(i2).getText());
                        if(textAns.equals(HealthCheckBoxList.get(i2).getText())){
                            System.out.println("found match");
                            HealthCheckBoxList.get(i2).setText("");
                            HealthCheckBoxList.get(i).setSelected(false);
                            
                            found = true;
                            HealthSize--;
                            
                            break;
                        }
                   }
                   if(found){
                    if(i2 < HealthSize) {
                        System.out.println("swap");
    
                        //get text for last item
                        strtmp = HealthCheckBoxList.get(HealthSize).getText();
                        last_selected = HealthCheckBoxList.get(HealthSize).isSelected();
    
                        //set the delete item text a text from last item
                        HealthCheckBoxList.get(i2).setText(strtmp);
                        HealthCheckBoxList.get(i).setSelected(last_selected); 
                         
    
                        //delete text of last item
                        HealthCheckBoxList.get(HealthSize).setText("");
                        HealthCheckBoxList.get(i).setSelected(false);
                        
                        
                    }
                    HealthActionPerformed(evt, -1);
 
            }
               
            }
            else if (CategoryAns == "Others"){
                for(i3 = 0; i3 < OthersSize; i3++) {
                    System.out.println(textAns);
                    System.out.println(OthersCheckBoxList.get(i3).getText());
                        if(textAns.equals(OthersCheckBoxList.get(i3).getText())){
                            System.out.println("found match");
                            OthersCheckBoxList.get(i).setText("");
                            OthersCheckBoxList.get(i).setSelected(false);
                            
                            found = true;
                            OthersSize--;
                            
                            break;
                        }
                   }
                   if(found){
                    if(i3 < OthersSize) {
                        System.out.println("swap");
    
                        //get text for last item
                        strtmp = OthersCheckBoxList.get(OthersSize).getText();
                        last_selected = OthersCheckBoxList.get(OthersSize).isSelected();
    
                        //set the delete item text a text from last item
                        OthersCheckBoxList.get(i3).setText(strtmp); 
                        OthersCheckBoxList.get(i).setSelected(last_selected); 
    
                        //delete text of last item
                        OthersCheckBoxList.get(OthersSize).setText("");
                        OthersCheckBoxList.get(i).setSelected(false);
                        
                        
                    }
                    OthersActionPerformed(evt, -1);
                

            }


        }
    }
        
}
        
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource() == AddButton) {
            textAns = TaskNameTextField.getText();
            CategoryAns = (String)CategoryComboBox.getSelectedItem();

            if(CategoryAns == "School Work" && SchoolSize < 30) {
                SchoolSize++;
                System.out.println(SchoolSize);

                SchoolCheckBoxList.get(SchoolSize-1).setText(textAns);
                SchoolActionPerformed(evt, -1);


            }
            else if(CategoryAns == "Health" && HealthSize < 30) {

                HealthSize++;

                HealthCheckBoxList.get(HealthSize-1).setText(textAns);
                HealthActionPerformed(evt, -1);

            }
            else if(CategoryAns == "Others" && OthersSize < 30){

                OthersSize++;

                OthersCheckBoxList.get(OthersSize-1).setText(textAns);
                OthersActionPerformed(evt, -1);



            }
        }
    }

    private void SchoolActionPerformed(java.awt.event.ActionEvent evt, int id) {
        if(id != -1){
            TaskNameTextField.setText(SchoolCheckBoxList.get(id).getText());
        }
        System.out.println("click");
        SchoolCheck = 0;

        for(int count = 0; count < SchoolSize; count++) {
            if(SchoolCheckBoxList.get(count).isSelected()) {
                System.out.println("isselected");
                System.out.println("cout" + count);

                SchoolCheck++;
            }
        }
        System.out.println("school check" + SchoolCheck);
        System.out.println("school size:" + SchoolSize);

        double double_SchoolCheck = SchoolCheck;
        double double_SchoolSize = SchoolSize;

        double proportion = (double_SchoolCheck/double_SchoolSize) * 100;

        int int_proportion = (int)proportion;
        System.out.println(proportion);
        SchoolProgressBar.setValue(int_proportion);
    }

    private void HealthActionPerformed(java.awt.event.ActionEvent evt, int id) {
        if(id != -1){
            TaskNameTextField.setText(HealthCheckBoxList.get(id).getText());
        }
        System.out.println("click");
        HealthCheck = 0;

        for(int count = 0; count < HealthSize; count++) {
            if(HealthCheckBoxList.get(count).isSelected()) {
                System.out.println("isselected");
                System.out.println("cout" + count);
                HealthCheck++;
            }
        }
        System.out.println("school check" + HealthCheck);
        System.out.println("school size:" + HealthSize);

        double double_HealthCheck = HealthCheck;
        double double_HealthSize = HealthSize;

        double proportion = (double_HealthCheck/double_HealthSize) * 100;

        int int_proportion = (int)proportion;
        System.out.println(proportion);
        HealthProgressBar.setValue(int_proportion);
    }

    private void OthersActionPerformed(java.awt.event.ActionEvent evt, int id) {
        if(id != -1){
            TaskNameTextField.setText(OthersCheckBoxList.get(id).getText());
        }
        System.out.println("click");
        OthersCheck = 0;

        for(int count = 0; count < OthersSize; count++) {
            if(OthersCheckBoxList.get(count).isSelected()) {
                System.out.println("isselected");
                System.out.println("cout" + count);
                OthersCheck++;
            }
        }
        System.out.println("school check" + OthersCheck);
        System.out.println("school size:" + OthersSize);

        double double_OthersCheck = OthersCheck;
        double double_OthersSize = OthersSize;

        double proportion = (double_OthersCheck/double_OthersSize) * 100;

        int int_proportion = (int)proportion;
        System.out.println(proportion);
        OthersProgressBar.setValue(int_proportion);
    }

    private void Imp2ActionPerformed(java.awt.event.ActionEvent evt, int id) {
        if(ImportantCheckBoxList.get(id).getText().equals("")) {
            ImportantCheckBoxList.get(id).setSelected(false);
        }
        else {
            String imp_tmp = ImportantCheckBoxList.get(ImportantSize-1).getText();
            boolean imp_bool = ImportantCheckBoxList.get(ImportantSize-1).isSelected();

            ImportantCheckBoxList.get(id).setText(imp_tmp);
            ImportantCheckBoxList.get(id).setSelected(imp_bool);

            ImportantCheckBoxList.get(ImportantSize-1).setText("");
            ImportantCheckBoxList.get(ImportantSize-1).setSelected(false);

            ImportantSize--;
        }
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel BUDDY;
    private javax.swing.JComboBox<String> CategoryComboBox;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ImpButton;
    private javax.swing.JLabel EnterTaskLabel;
    private javax.swing.JCheckBox H1;
    private javax.swing.JCheckBox H10;
    private javax.swing.JCheckBox H11;
    private javax.swing.JCheckBox H12;
    private javax.swing.JCheckBox H13;
    private javax.swing.JCheckBox H14;
    private javax.swing.JCheckBox H15;
    private javax.swing.JCheckBox H16;
    private javax.swing.JCheckBox H17;
    private javax.swing.JCheckBox H18;
    private javax.swing.JCheckBox H19;
    private javax.swing.JCheckBox H2;
    private javax.swing.JCheckBox H20;
    private javax.swing.JCheckBox H21;
    private javax.swing.JCheckBox H22;
    private javax.swing.JCheckBox H23;
    private javax.swing.JCheckBox H24;
    private javax.swing.JCheckBox H25;
    private javax.swing.JCheckBox H26;
    private javax.swing.JCheckBox H27;
    private javax.swing.JCheckBox H28;
    private javax.swing.JCheckBox H29;
    private javax.swing.JCheckBox H3;
    private javax.swing.JCheckBox H30;
    private javax.swing.JCheckBox H4;
    private javax.swing.JCheckBox H5;
    private javax.swing.JCheckBox H6;
    private javax.swing.JCheckBox H7;
    private javax.swing.JCheckBox H8;
    private javax.swing.JCheckBox H9;
    private javax.swing.JLabel HealthLabel;
    private javax.swing.JPanel HealthPanel;
    private javax.swing.JScrollPane HealthScrollPane;
    private javax.swing.JCheckBox Imp1;
    private javax.swing.JCheckBox Imp2;
    private javax.swing.JCheckBox Imp3;
    private javax.swing.JCheckBox Imp4;
    private javax.swing.JCheckBox Imp5;
    private javax.swing.JPanel ImportantWorkPanel;
    private javax.swing.JButton MenuButton;
    private javax.swing.JCheckBox O1;
    private javax.swing.JCheckBox O10;
    private javax.swing.JCheckBox O11;
    private javax.swing.JCheckBox O12;
    private javax.swing.JCheckBox O13;
    private javax.swing.JCheckBox O14;
    private javax.swing.JCheckBox O15;
    private javax.swing.JCheckBox O16;
    private javax.swing.JCheckBox O17;
    private javax.swing.JCheckBox O18;
    private javax.swing.JCheckBox O19;
    private javax.swing.JCheckBox O2;
    private javax.swing.JCheckBox O20;
    private javax.swing.JCheckBox O21;
    private javax.swing.JCheckBox O22;
    private javax.swing.JCheckBox O23;
    private javax.swing.JCheckBox O24;
    private javax.swing.JCheckBox O25;
    private javax.swing.JCheckBox O26;
    private javax.swing.JCheckBox O27;
    private javax.swing.JCheckBox O28;
    private javax.swing.JCheckBox O29;
    private javax.swing.JCheckBox O3;
    private javax.swing.JCheckBox O30;
    private javax.swing.JCheckBox O4;
    private javax.swing.JCheckBox O5;
    private javax.swing.JCheckBox O6;
    private javax.swing.JCheckBox O7;
    private javax.swing.JCheckBox O8;
    private javax.swing.JCheckBox O9;
    private javax.swing.JPanel OthersPanel;
    private javax.swing.JScrollPane OthersScrollPane;
    private javax.swing.JLabel PriorityTaskLabel;
    private javax.swing.JLabel STUDY;
    private javax.swing.JCheckBox School1;
    private javax.swing.JCheckBox School10;
    private javax.swing.JCheckBox School11;
    private javax.swing.JCheckBox School12;
    private javax.swing.JCheckBox School13;
    private javax.swing.JCheckBox School14;
    private javax.swing.JCheckBox School15;
    private javax.swing.JCheckBox School16;
    private javax.swing.JCheckBox School17;
    private javax.swing.JCheckBox School18;
    private javax.swing.JCheckBox School19;
    private javax.swing.JCheckBox School2;
    private javax.swing.JCheckBox School20;
    private javax.swing.JCheckBox School21;
    private javax.swing.JCheckBox School22;
    private javax.swing.JCheckBox School23;
    private javax.swing.JCheckBox School24;
    private javax.swing.JCheckBox School25;
    private javax.swing.JCheckBox School26;
    private javax.swing.JCheckBox School27;
    private javax.swing.JCheckBox School28;
    private javax.swing.JCheckBox School29;
    private javax.swing.JCheckBox School3;
    private javax.swing.JCheckBox School30;
    private javax.swing.JCheckBox School4;
    private javax.swing.JCheckBox School5;
    private javax.swing.JCheckBox School6;
    private javax.swing.JCheckBox School7;
    private javax.swing.JCheckBox School8;
    private javax.swing.JCheckBox School9;
    private javax.swing.JScrollPane SchoolScrollPane;
    private javax.swing.JLabel SchoolWorkLabel;
    private javax.swing.JPanel SchoolWorkPanel;
    private javax.swing.JTextField TaskNameTextField;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar SchoolProgressBar;
    private javax.swing.JProgressBar HealthProgressBar;
    private javax.swing.JProgressBar OthersProgressBar;
    private javax.swing.JLabel othersLabel;
    // End of variables declaration                   

    
}
