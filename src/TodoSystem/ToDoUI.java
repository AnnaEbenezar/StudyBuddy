package TodoSystem;

import javax.swing.*;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class ToDoUI extends JFrame{
    private ToDoDriver driver;

    //read from file and store them
    private ArrayList<String> SchoolStringList = new ArrayList<String>();
    private ArrayList<String> HealthStringList = new ArrayList<String>();
    private ArrayList<String> OthersStringList = new ArrayList<String>();

    private ArrayList<Boolean> SchoolBool = new ArrayList<Boolean>();
    private ArrayList<Boolean> HealthBool = new ArrayList<Boolean>();
    private ArrayList<Boolean> OthersBool = new ArrayList<Boolean>();


    private ArrayList<JCheckBox> SchoolCheckBoxList = new ArrayList<JCheckBox>();
    private ArrayList<JCheckBox> HealthCheckBoxList = new ArrayList<JCheckBox>();
    private ArrayList<JCheckBox> OthersCheckBoxList = new ArrayList<JCheckBox>();

    //start: count from the item of each category from a file
    private int SchoolSize;
    private int HealthSize;
    private int OthersSize;

    private int SchoolCheck;
    private int HealthCheck;
    private int OthersCheck;


    ToDoUI(ToDoDriver driver) {
        initComponents();

        this.setVisible(true);
    }

    private void initComponents() {
        ReadFileAndAssign();
        setMaximumSize(new java.awt.Dimension(1600, 800));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1 = new javax.swing.JPanel();
        EnterTaskLabel = new javax.swing.JLabel();
        TaskNameTextField = new javax.swing.JTextField();
        CategoryLabel = new javax.swing.JLabel();
        CategoryComboBox = new javax.swing.JComboBox<>();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();
        SchoolWorkPanel = new javax.swing.JPanel();
        SchoolWorkLabel = new javax.swing.JLabel();
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
        SchoolProgressBar = new javax.swing.JProgressBar();
        HealthPanel = new javax.swing.JPanel();
        HealthLabel = new javax.swing.JLabel();
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
        HealthProgressBar = new javax.swing.JProgressBar();
        OthersPanel = new javax.swing.JPanel();
        othersLabel = new javax.swing.JLabel();
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
        OthersProgressBar = new javax.swing.JProgressBar();

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

        //default setting of bool arraylist
        for(int a = 0; a < 10; a++) {
            SchoolBool.add(false);
            HealthBool.add(false);
            OthersBool.add(false);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        EnterTaskLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        EnterTaskLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterTaskLabel.setText("Enter Task:");

        CategoryLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        CategoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        CategoryLabel.setText("Category:");

        CategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Work", "Health", "Others" }));

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

        MenuButton.setText("MENU");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(AddButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(MenuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnterTaskLabel)
                            .addComponent(CategoryLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TaskNameTextField)
                            .addComponent(CategoryComboBox, 0, 118, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterTaskLabel)
                    .addComponent(TaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryLabel)
                    .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(DeleteButton))
                .addContainerGap(24, Short.MAX_VALUE))
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
                    .addComponent(School10)
                    .addComponent(School1)
                    .addComponent(SchoolWorkLabel)
                    .addComponent(School2)
                    .addComponent(School3)
                    .addComponent(School4)
                    .addComponent(School5)
                    .addComponent(School6)
                    .addComponent(School7)
                    .addComponent(School8)
                    .addComponent(School9)
                    .addComponent(SchoolProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        SchoolWorkPanelLayout.setVerticalGroup(
            SchoolWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchoolWorkPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(SchoolWorkLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SchoolProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(24, 24, 24))
        );

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
                    .addComponent(HealthProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(HealthLabel))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        HealthPanelLayout.setVerticalGroup(
            HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(HealthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HealthProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(12, 12, 12)
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
                .addGap(29, 29, 29))
        );

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
                    .addComponent(OthersProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(othersLabel))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        OthersPanelLayout.setVerticalGroup(
            OthersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(othersLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OthersProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(13, 13, 13)
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
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(SchoolWorkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(HealthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(OthersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SchoolWorkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HealthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OthersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {

        boolean found = false;
        JCheckBox tmp;
        String strtmp;
        if(evt.getSource() == DeleteButton) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;

            textAns = TaskNameTextField.getText();
            CategoryAns = (String)CategoryComboBox.getSelectedItem();
            if(CategoryAns == "School Work") {
               for(i = 0; i < SchoolSize; i++) {
                    if(textAns.equals(SchoolStringList.get(i))){
                        tmp = SchoolCheckBoxList.get(i);
                        tmp.setText("");
                        found = true;
                        
                        break;
                    }
               }
               if(found){
                if(i < SchoolSize) {
                    //string tmp = get text from the last item
                    tmp = SchoolCheckBoxList.get(SchoolSize-1);
                    strtmp = tmp.getText();

                    tmp.setText(""); 

                    tmp = SchoolCheckBoxList.get(i);
                    tmp.setText(strtmp);

                    SchoolSize--;
                    SchoolStringList.remove(SchoolSize);
                    SchoolStringList.set(i, strtmp);
                    System.out.println(SchoolStringList.get(i-1));
                    System.out.println(SchoolStringList.get(i));
                    System.out.println(SchoolStringList.get(i+1));
                }
           }
               

            }
            else if(CategoryAns == "Health") {
                System.out.println(HealthSize);
                for(i2 = 0; i2 < HealthSize; i2++) {
                    if(textAns.equals((String)HealthStringList.get(i2))){
                        tmp = HealthCheckBoxList.get(i2);
                        tmp.setText("");
                        found = true;
                        
                        break;
                    }
               }
               if(found){
                    if(i2 < HealthSize) {
                        tmp = HealthCheckBoxList.get(HealthSize-1);
                        strtmp = tmp.getText();

                        tmp.setText("");

                        tmp = HealthCheckBoxList.get(i2);
                        tmp.setText(strtmp);

                        HealthSize--;
                        HealthStringList.remove(HealthSize);
                        HealthStringList.set(i2, strtmp);
               }
            }
               
            }
            else if (CategoryAns == "Others"){
                for(i3 = 0; i3 < OthersSize; i3++) {
                    if(textAns.equals(OthersStringList.get(i3))){
                        tmp = OthersCheckBoxList.get(i3);
                        tmp.setText("");
                        found = true;
                        
                        break;
                    }
               }
               if(found){
                if(i3 < OthersSize) {
                    tmp = OthersCheckBoxList.get(OthersSize-1);
                    strtmp = tmp.getText();

                    tmp.setText("");

                    tmp = OthersCheckBoxList.get(i3);
                    tmp.setText(strtmp);

                    OthersSize--;
                    OthersStringList.remove(OthersSize);
                    OthersStringList.set(i, strtmp);
           }

                

            }


            }
        }
        }
        
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource() == AddButton) {
            textAns = TaskNameTextField.getText();
            CategoryAns = (String)CategoryComboBox.getSelectedItem();



            if(CategoryAns == "School Work") {
                SchoolStringList.add(textAns);
                SchoolSize++;
                System.out.println(SchoolSize);

                SchoolCheckBoxList.get(SchoolSize-1).setText(textAns);
            }
            else if(CategoryAns == "Health") {
                HealthStringList.add(textAns);
                HealthSize++;

                HealthCheckBoxList.get(HealthSize-1).setText(textAns);
            }
            else{
                OthersStringList.add(textAns);
                OthersSize++;

                OthersCheckBoxList.get(OthersSize-1).setText(textAns);

            }
        }
    }

    private void ReadFileAndAssign() {
        //read file and assign it to arraylist, update each arraylistsize variable, boolean varaible

        //update the todo gui (to do and progress bar)

    }

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {
        //clear file and write the file with string arraylist and boolean arraylist

        //go back to menu
    }


                 

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddButton;
    private javax.swing.JComboBox<String> CategoryComboBox;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel EnterTaskLabel;
    private javax.swing.JCheckBox H1;
    private javax.swing.JCheckBox H10;
    private javax.swing.JCheckBox H2;
    private javax.swing.JCheckBox H3;
    private javax.swing.JCheckBox H4;
    private javax.swing.JCheckBox H5;
    private javax.swing.JCheckBox H6;
    private javax.swing.JCheckBox H7;
    private javax.swing.JCheckBox H8;
    private javax.swing.JCheckBox H9;
    private javax.swing.JLabel HealthLabel;
    private javax.swing.JPanel HealthPanel;
    private javax.swing.JProgressBar HealthProgressBar;
    private javax.swing.JCheckBox O1;
    private javax.swing.JCheckBox O10;
    private javax.swing.JCheckBox O2;
    private javax.swing.JCheckBox O3;
    private javax.swing.JCheckBox O4;
    private javax.swing.JCheckBox O5;
    private javax.swing.JCheckBox O6;
    private javax.swing.JCheckBox O7;
    private javax.swing.JCheckBox O8;
    private javax.swing.JCheckBox O9;
    private javax.swing.JPanel OthersPanel;
    private javax.swing.JProgressBar OthersProgressBar;
    private javax.swing.JCheckBox School10;
    private javax.swing.JCheckBox School1;
    private javax.swing.JCheckBox School2;
    private javax.swing.JCheckBox School3;
    private javax.swing.JCheckBox School4;
    private javax.swing.JCheckBox School5;
    private javax.swing.JCheckBox School6;
    private javax.swing.JCheckBox School7;
    private javax.swing.JCheckBox School8;
    private javax.swing.JCheckBox School9;
    private javax.swing.JProgressBar SchoolProgressBar;
    private javax.swing.JLabel SchoolWorkLabel;
    private javax.swing.JPanel SchoolWorkPanel;
    private javax.swing.JTextField TaskNameTextField;
    private javax.swing.JButton MenuButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel othersLabel;

    private String textAns;                 
    private String CategoryAns;
}



