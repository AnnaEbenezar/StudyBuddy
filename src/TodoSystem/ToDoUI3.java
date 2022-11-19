package TodoSystem;

import javax.swing.*;
import java.util.ArrayList;

public class ToDoUI3 extends JFrame{
    private ToDoDriver driver;

    private String textAns;                 
    private String CategoryAns;

    private int SchoolSize;
    private int HealthSize;
    private int OthersSize;
    private int ToDoSize;

    private int SchoolCheck;
    private int HealthCheck;
    private int OthersCheck;

    ArrayList<info> SchoolInfoList = new ArrayList<info>();
    ArrayList<info> HealthInfoList = new ArrayList<info>();
    ArrayList<info> OthersInfoList = new ArrayList<info>();

    ArrayList<JCheckBox> ToDoList = new ArrayList<JCheckBox>();

    ToDoUI3(ToDoDriver driver) {
        initComponents();
        setVisible(true);
    }
    private void initComponents() {

        //declare a variable
        jPanel1 = new javax.swing.JPanel();
        EnterTaskLabel = new javax.swing.JLabel();
        TaskNameTextField = new javax.swing.JTextField();
        CategoryLabel = new javax.swing.JLabel();
        CategoryComboBox = new javax.swing.JComboBox<>();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        DetailButton = new javax.swing.JButton();
        SchoolScrollPane = new javax.swing.JScrollPane();
        SchoolWorkPanel = new javax.swing.JPanel();
        SchoolWorkLabel = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ToDo = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        textArea1 = new java.awt.TextArea();
        
        ToDoList.add(jCheckBox1);
        ToDoList.add(jCheckBox2);
        ToDoList.add(jCheckBox3);
        ToDoList.add(jCheckBox4);
        ToDoList.add(jCheckBox5);

        //assign info with checkbox to a schoolinfo lsit
        info SchoolInfo1 = new info();
        SchoolInfo1.checkbox = School1;
        SchoolInfoList.add(SchoolInfo1);
        info SchoolInfo2 = new info();
        SchoolInfo2.checkbox = School2;
        SchoolInfoList.add(SchoolInfo2);
        info SchoolInfo3 = new info();
        SchoolInfo3.checkbox = School3;
        SchoolInfoList.add(SchoolInfo3);
        info SchoolInfo4 = new info();
        SchoolInfo4.checkbox = School4;
        SchoolInfoList.add(SchoolInfo4);
        info SchoolInfo5 = new info();
        SchoolInfo5.checkbox = School5;
        SchoolInfoList.add(SchoolInfo5);
        info SchoolInfo6 = new info();
        SchoolInfo6.checkbox = School6;
        SchoolInfoList.add(SchoolInfo6);
        info SchoolInfo7 = new info();
        SchoolInfo7.checkbox = School7;
        SchoolInfoList.add(SchoolInfo7);
        info SchoolInfo8 = new info();
        SchoolInfo8.checkbox = School8;
        SchoolInfoList.add(SchoolInfo8);
        info SchoolInfo9 = new info();
        SchoolInfo9.checkbox = School9;
        SchoolInfoList.add(SchoolInfo9);
        info SchoolInfo10 = new info();
        SchoolInfo10.checkbox = School10;
        SchoolInfoList.add(SchoolInfo10);
        info SchoolInfo11 = new info();
        SchoolInfo11.checkbox = School11;
        SchoolInfoList.add(SchoolInfo11);
        info SchoolInfo12 = new info();
        SchoolInfo12.checkbox = School12;
        SchoolInfoList.add(SchoolInfo12);
        info SchoolInfo13 = new info();
        SchoolInfo13.checkbox = School13;
        SchoolInfoList.add(SchoolInfo13);
        info SchoolInfo14 = new info();
        SchoolInfo14.checkbox = School14;
        SchoolInfoList.add(SchoolInfo14);
        info SchoolInfo15 = new info();
        SchoolInfo15.checkbox = School15;
        SchoolInfoList.add(SchoolInfo15);
        info SchoolInfo16 = new info();
        SchoolInfo16.checkbox = School16;
        SchoolInfoList.add(SchoolInfo16);
        info SchoolInfo17 = new info();
        SchoolInfo17.checkbox = School17;
        SchoolInfoList.add(SchoolInfo17);
        info SchoolInfo18 = new info();
        SchoolInfo18.checkbox = School18;
        SchoolInfoList.add(SchoolInfo18);
        info SchoolInfo19 = new info();
        SchoolInfo19.checkbox = School19;
        SchoolInfoList.add(SchoolInfo19);
        info SchoolInfo20 = new info();
        SchoolInfo20.checkbox = School20;
        SchoolInfoList.add(SchoolInfo20);
        info SchoolInfo21 = new info();
        SchoolInfo21.checkbox = School21;
        SchoolInfoList.add(SchoolInfo21);
        info SchoolInfo22 = new info();
        SchoolInfo22.checkbox = School22;
        SchoolInfoList.add(SchoolInfo22);
        info SchoolInfo23 = new info();
        SchoolInfo23.checkbox = School23;
        SchoolInfoList.add(SchoolInfo23);
        info SchoolInfo24 = new info();
        SchoolInfo24.checkbox = School24;
        SchoolInfoList.add(SchoolInfo24);
        info SchoolInfo25 = new info();
        SchoolInfo25.checkbox = School25;
        SchoolInfoList.add(SchoolInfo25);
        info SchoolInfo26 = new info();
        SchoolInfo26.checkbox = School26;
        SchoolInfoList.add(SchoolInfo26);
        info SchoolInfo27 = new info();
        SchoolInfo27.checkbox = School27;
        SchoolInfoList.add(SchoolInfo27);
        info SchoolInfo28 = new info();
        SchoolInfo28.checkbox = School28;
        SchoolInfoList.add(SchoolInfo28);
        info SchoolInfo29 = new info();
        SchoolInfo29.checkbox = School29;
        SchoolInfoList.add(SchoolInfo29);
        info SchoolInfo30 = new info();
        SchoolInfo30.checkbox = School30;
        SchoolInfoList.add(SchoolInfo30);

        //use for loop to add action listener
        int k = 0;
        for(k = 0; k < 30; k++) {
            int tmpK = k;
            SchoolInfoList.get(k).checkbox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    if(SchoolInfoList.get(tmpK).checkbox.getText() == "") {
                        SchoolInfoList.get(tmpK).checkbox.setSelected(false);
                    }
                    else{
                        SchoolActionPerformed(evt, tmpK);
                    }     
                }
            });
        }

        //assign info with checkbox to a healthinfo lsit
        info HealthInfo1 = new info();
        HealthInfo1.checkbox = H1;
        HealthInfoList.add(HealthInfo1);
        info HealthInfo2 = new info();
        HealthInfo2.checkbox = H2;
        HealthInfoList.add(HealthInfo2);
        info HealthInfo3 = new info();
        HealthInfo3.checkbox = H3;
        HealthInfoList.add(HealthInfo3);
        info HealthInfo4 = new info();
        HealthInfo4.checkbox = H4;
        HealthInfoList.add(HealthInfo4);
        info HealthInfo5 = new info();
        HealthInfo5.checkbox = H5;
        HealthInfoList.add(HealthInfo5);
        info HealthInfo6 = new info();
        HealthInfo6.checkbox = H6;
        HealthInfoList.add(HealthInfo6);
        info HealthInfo7 = new info();
        HealthInfo7.checkbox = H7;
        HealthInfoList.add(HealthInfo7);
        info HealthInfo8 = new info();
        HealthInfo8.checkbox = H8;
        HealthInfoList.add(HealthInfo8);
        info HealthInfo9 = new info();
        HealthInfo9.checkbox = H9;
        HealthInfoList.add(HealthInfo9);
        info HealthInfo10 = new info();
        HealthInfo10.checkbox = H10;
        HealthInfoList.add(HealthInfo10);
        info HealthInfo11 = new info();
        HealthInfo11.checkbox = H11;
        HealthInfoList.add(HealthInfo11);
        info HealthInfo12 = new info();
        HealthInfo12.checkbox = H12;
        HealthInfoList.add(HealthInfo12);
        info HealthInfo13 = new info();
        HealthInfo13.checkbox = H13;
        HealthInfoList.add(HealthInfo13);
        info HealthInfo14 = new info();
        HealthInfo14.checkbox = H14;
        HealthInfoList.add(HealthInfo14);
        info HealthInfo15 = new info();
        HealthInfo15.checkbox = H15;
        HealthInfoList.add(HealthInfo15);
        info HealthInfo16 = new info();
        HealthInfo16.checkbox = H16;
        HealthInfoList.add(HealthInfo16);
        info HealthInfo17 = new info();
        HealthInfo17.checkbox = H17;
        HealthInfoList.add(HealthInfo17);
        info HealthInfo18 = new info();
        HealthInfo18.checkbox = H18;
        HealthInfoList.add(HealthInfo18);
        info HealthInfo19 = new info();
        HealthInfo19.checkbox = H19;
        HealthInfoList.add(HealthInfo19);
        info HealthInfo20 = new info();
        HealthInfo20.checkbox = H20;
        HealthInfoList.add(HealthInfo20);
        info HealthInfo21 = new info();
        HealthInfo21.checkbox = H21;
        HealthInfoList.add(HealthInfo21);
        info HealthInfo22 = new info();
        HealthInfo22.checkbox = H22;
        HealthInfoList.add(HealthInfo22);
        info HealthInfo23 = new info();
        HealthInfo23.checkbox = H23;
        HealthInfoList.add(HealthInfo23);
        info HealthInfo24 = new info();
        HealthInfo24.checkbox = H24;
        HealthInfoList.add(HealthInfo24);
        info HealthInfo25 = new info();
        HealthInfo25.checkbox = H25;
        HealthInfoList.add(HealthInfo25);
        info HealthInfo26 = new info();
        HealthInfo26.checkbox = H26;
        HealthInfoList.add(HealthInfo26);
        info HealthInfo27 = new info();
        HealthInfo27.checkbox = H27;
        HealthInfoList.add(HealthInfo27);
        info HealthInfo28 = new info();
        HealthInfo28.checkbox = H28;
        HealthInfoList.add(HealthInfo28);
        info HealthInfo29 = new info();
        HealthInfo29.checkbox = H29;
        HealthInfoList.add(HealthInfo29);
        info HealthInfo30 = new info();
        HealthInfo30.checkbox = H30;
        HealthInfoList.add(HealthInfo30);

       //use for loop to add action listener
       int m = 0;
       for(m = 0; m < 30; m++) {
           int tmpM = m;
           HealthInfoList.get(tmpM).checkbox.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                   if(HealthInfoList.get(tmpM).checkbox.getText() == "") {
                       HealthInfoList.get(tmpM).checkbox.setSelected(false);
                   }
                   else{
                       HealthActionPerformed(evt, tmpM);
                   }     
               }
           });
       }

        //assign info with checkbox to othersinfolist
        info OthersInfo1 = new info();
        OthersInfo1.checkbox = O1;
        OthersInfoList.add(OthersInfo1);
        info OthersInfo2 = new info();
        OthersInfo2.checkbox = O2;
        OthersInfoList.add(OthersInfo2);
        info OthersInfo3 = new info();
        OthersInfo3.checkbox = O3;
        OthersInfoList.add(OthersInfo3);
        info OthersInfo4 = new info();
        OthersInfo4.checkbox = O4;
        OthersInfoList.add(OthersInfo4);
        info OthersInfo5 = new info();
        OthersInfo5.checkbox = O5;
        OthersInfoList.add(OthersInfo5);
        info OthersInfo6 = new info();
        OthersInfo6.checkbox = O6;
        OthersInfoList.add(OthersInfo6);
        info OthersInfo7 = new info();
        OthersInfo7.checkbox = O7;
        OthersInfoList.add(OthersInfo7);
        info OthersInfo8 = new info();
        OthersInfo8.checkbox = O8;
        OthersInfoList.add(OthersInfo8);
        info OthersInfo9 = new info();
        OthersInfo9.checkbox = O9;
        OthersInfoList.add(OthersInfo9);
        info OthersInfo10 = new info();
        OthersInfo10.checkbox = O10;
        OthersInfoList.add(OthersInfo10);
        info OthersInfo11 = new info();
        OthersInfo11.checkbox = O11;
        OthersInfoList.add(OthersInfo11);
        info OthersInfo12 = new info();
        OthersInfo12.checkbox = O12;
        OthersInfoList.add(OthersInfo12);
        info OthersInfo13 = new info();
        OthersInfo13.checkbox = O13;
        OthersInfoList.add(OthersInfo13);
        info OthersInfo14 = new info();
        OthersInfo14.checkbox = O14;
        OthersInfoList.add(OthersInfo14);
        info OthersInfo15 = new info();
        OthersInfo15.checkbox = O15;
        OthersInfoList.add(OthersInfo15);
        info OthersInfo16 = new info();
        OthersInfo16.checkbox = O16;
        OthersInfoList.add(OthersInfo16);
        info OthersInfo17 = new info();
        OthersInfo17.checkbox = O17;
        OthersInfoList.add(OthersInfo17);
        info OthersInfo18 = new info();
        OthersInfo18.checkbox = O18;
        OthersInfoList.add(OthersInfo18);
        info OthersInfo19 = new info();
        OthersInfo19.checkbox = O19;
        OthersInfoList.add(OthersInfo19);
        info OthersInfo20 = new info();
        OthersInfo20.checkbox = O20;
        OthersInfoList.add(OthersInfo20);
        info OthersInfo21 = new info();
        OthersInfo21.checkbox = O21;
        OthersInfoList.add(OthersInfo21);
        info OthersInfo22 = new info();
        OthersInfo22.checkbox = O22;
        OthersInfoList.add(OthersInfo22);
        info OthersInfo23 = new info();
        OthersInfo23.checkbox = O23;
        OthersInfoList.add(OthersInfo23);
        info OthersInfo24 = new info();
        OthersInfo24.checkbox = O24;
        OthersInfoList.add(OthersInfo24);
        info OthersInfo25 = new info();
        OthersInfo25.checkbox = O1;
        OthersInfoList.add(OthersInfo25);
        info OthersInfo26 = new info();
        OthersInfo26.checkbox = O26;
        OthersInfoList.add(OthersInfo26);
        info OthersInfo27 = new info();
        OthersInfo27.checkbox = O27;
        OthersInfoList.add(OthersInfo27);
        info OthersInfo28 = new info();
        OthersInfo28.checkbox = O28;
        OthersInfoList.add(OthersInfo28);
        info OthersInfo29 = new info();
        OthersInfo29.checkbox = O29;
        OthersInfoList.add(OthersInfo29);
        info OthersInfo30 = new info();
        OthersInfo30.checkbox = O30;
        OthersInfoList.add(OthersInfo30);


        //use for loop to add action listener
        int n = 0;
        for(n = 0; n < 30; n++) {
            int tmpN = n;
            OthersInfoList.get(tmpN).checkbox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    if(OthersInfoList.get(tmpN).checkbox.getText() == "") {
                        OthersInfoList.get(tmpN).checkbox.setSelected(false);
                    }
                    else{
                        OthersActionPerformed(evt, tmpN);
                    }     
                }
            });
        }

       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(700, 550));
        setSize(new java.awt.Dimension(700, 550));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        EnterTaskLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        EnterTaskLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterTaskLabel.setText("Enter Task:");

        CategoryLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        CategoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        CategoryLabel.setText("Category:");

        CategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Work", "Health", "Others", "To Do" }));

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jButton1.setText("MENU");

        DetailButton.setText("Detail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(EnterTaskLabel)
                .addGap(18, 18, 18)
                .addComponent(TaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(CategoryLabel)
                .addGap(18, 18, 18)
                .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DetailButton)
                    .addComponent(DeleteButton)
                    .addComponent(AddButton))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton)
                            .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryLabel)
                            .addComponent(TaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterTaskLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(DetailButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        SchoolWorkPanel.setBackground(new java.awt.Color(121, 186, 203));

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
                    .addComponent(SchoolProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(380, Short.MAX_VALUE))
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

        OthersPanel.setBackground(new java.awt.Color(221, 236, 244));

        othersLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
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
                    .addComponent(OthersProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(371, Short.MAX_VALUE))
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

        HealthPanel.setBackground(new java.awt.Color(170, 220, 242));

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
                    .addComponent(HealthProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(344, Short.MAX_VALUE))
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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        textArea1.setColumns(20);
        textArea1.setRows(5);
        jScrollPane1.setViewportView(textArea1);

        ToDo.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout ToDoLayout = new javax.swing.GroupLayout(ToDo);
        ToDo.setLayout(ToDoLayout);
        ToDoLayout.setHorizontalGroup(
            ToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToDoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(ToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TaskNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DeleteButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15))
        );
        ToDoLayout.setVerticalGroup(
            ToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToDoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ToDoLayout.createSequentialGroup()
                        .addGroup(ToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1)
                            .addComponent(TaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(ToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(AddButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2))
                    .addComponent(DeleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addGap(12, 12, 12)
                .addComponent(jCheckBox5)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1)
                .addGap(29, 29, 29)
                .addComponent(ToDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(ToDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(SchoolScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(HealthScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(OthersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HealthScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SchoolScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(OthersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>  
    
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
                System.out.println(SchoolInfoList.get(i).checkbox.getText());
                    if(textAns.equals(SchoolInfoList.get(i).checkbox.getText())){
                        System.out.println("found match");
                        SchoolInfoList.get(i).checkbox.setText("");
                        SchoolInfoList.get(i).checkbox.setSelected(false);

                        found = true;
                        SchoolSize--;
                        
                        break;
                    }
               }
               if(found){
                if(i < SchoolSize) {
                    System.out.println("swap");

                    //get text for last item
                    strtmp = SchoolInfoList.get(SchoolSize).checkbox.getText();
                    last_selected = SchoolInfoList.get(SchoolSize).checkbox.isSelected();

                    //set the delete item text a text from last item
                    SchoolInfoList.get(i).checkbox.setText(strtmp); 
                    SchoolInfoList.get(i).checkbox.setSelected(last_selected); 

                    //delete text of last item
                    SchoolInfoList.get(SchoolSize).checkbox.setText("");
                    SchoolInfoList.get(i).checkbox.setSelected(false);
                    
                    
                }
                SchoolActionPerformed(evt, -1);
 

           }
               

            }
            else if(CategoryAns == "Health") {
                for(i2 = 0; i2 < HealthSize; i2++) {
                    System.out.println(textAns);
                    System.out.println(HealthInfoList.get(i2).checkbox.getText());
                        if(textAns.equals(HealthInfoList.get(i2).checkbox.getText())){
                            System.out.println("found match");
                            HealthInfoList.get(i2).checkbox.setText("");
                            HealthInfoList.get(i).checkbox.setSelected(false);
                            
                            found = true;
                            HealthSize--;
                            
                            break;
                        }
                   }
                   if(found){
                    if(i2 < HealthSize) {
                        System.out.println("swap");
    
                        //get text for last item
                        strtmp = HealthInfoList.get(HealthSize).checkbox.getText();
                        last_selected = HealthInfoList.get(HealthSize).checkbox.isSelected();
    
                        //set the delete item text a text from last item
                        HealthInfoList.get(i2).checkbox.setText(strtmp);
                        HealthInfoList.get(i).checkbox.setSelected(last_selected); 
                         
    
                        //delete text of last item
                        HealthInfoList.get(HealthSize).checkbox.setText("");
                        HealthInfoList.get(i).checkbox.setSelected(false);
                        
                        
                    }
                    HealthActionPerformed(evt, -1);
 
            }
               
            }
            else if (CategoryAns == "Others"){
                for(i3 = 0; i3 < OthersSize; i3++) {
                    System.out.println(textAns);
                    System.out.println(OthersInfoList.get(i3).checkbox.getText());
                        if(textAns.equals(OthersInfoList.get(i3).checkbox.getText())){
                            System.out.println("found match");
                            OthersInfoList.get(i).checkbox.setText("");
                            OthersInfoList.get(i).checkbox.setSelected(false);
                            
                            found = true;
                            OthersSize--;
                            
                            break;
                        }
                   }
                   if(found){
                    if(i3 < OthersSize) {
                        System.out.println("swap");
    
                        //get text for last item
                        strtmp = OthersInfoList.get(OthersSize).checkbox.getText();
                        last_selected = OthersInfoList.get(OthersSize).checkbox.isSelected();
    
                        //set the delete item text a text from last item
                        OthersInfoList.get(i3).checkbox.setText(strtmp); 
                        OthersInfoList.get(i).checkbox.setSelected(last_selected); 
    
                        //delete text of last item
                        OthersInfoList.get(OthersSize).checkbox.setText("");
                        OthersInfoList.get(i).checkbox.setSelected(false);
                        
                        
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

                SchoolInfoList.get(SchoolSize-1).checkbox.setText(textAns);
                SchoolActionPerformed(evt, -1);


            }
            else if(CategoryAns == "Health" && HealthSize < 30) {

                HealthSize++;

                HealthInfoList.get(HealthSize-1).checkbox.setText(textAns);
                HealthActionPerformed(evt, -1);

            }
            else if(CategoryAns == "Others" && OthersSize < 30){

                OthersSize++;

                OthersInfoList.get(OthersSize-1).checkbox.setText(textAns);
                OthersActionPerformed(evt, -1);

            }
        }
    }

    private void SchoolActionPerformed(java.awt.event.ActionEvent evt, int id) {
        if(id != -1){
            TaskNameTextField.setText(SchoolInfoList.get(id).checkbox.getText());
        }
        System.out.println("click");
        SchoolCheck = 0;

        for(int count = 0; count < SchoolSize; count++) {
            if(SchoolInfoList.get(count).checkbox.isSelected()) {
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
            TaskNameTextField.setText(HealthInfoList.get(id).checkbox.getText());
        }
        System.out.println("click");
        HealthCheck = 0;

        for(int count = 0; count < HealthSize; count++) {
            if(HealthInfoList.get(count).checkbox.isSelected()) {
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
            TaskNameTextField.setText(OthersInfoList.get(id).checkbox.getText());
        }
        System.out.println("click");
        OthersCheck = 0;

        for(int count = 0; count < OthersSize; count++) {
            if(OthersInfoList.get(count).checkbox.isSelected()) {
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


    
     // Variables declaration - do not modify                     
     private javax.swing.JButton AddButton;
     private javax.swing.JButton AddButton1;
     private javax.swing.JComboBox<String> CategoryComboBox;
     private javax.swing.JLabel CategoryLabel;
     private javax.swing.JButton DeleteButton;
     private javax.swing.JButton DeleteButton1;
     private javax.swing.JButton DetailButton;
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
     private javax.swing.JPanel ToDo;
     private javax.swing.JButton jButton1;
     private javax.swing.JCheckBox jCheckBox1;
     private javax.swing.JCheckBox jCheckBox2;
     private javax.swing.JCheckBox jCheckBox3;
     private javax.swing.JCheckBox jCheckBox4;
     private javax.swing.JCheckBox jCheckBox5;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JProgressBar SchoolProgressBar;
     private javax.swing.JProgressBar HealthProgressBar;
     private javax.swing.JProgressBar OthersProgressBar;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JLabel othersLabel;
     private java.awt.TextArea textArea1;
     // End of variables declaration                 

    public class info {
        public JCheckBox checkbox;
        public boolean select;
        public ArrayList<JCheckBox> checkboxList;
        public String description;
    }

}
