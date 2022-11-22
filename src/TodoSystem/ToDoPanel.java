package TodoSystem;

import javax.swing.JPanel;

public class ToDoPanel extends JPanel{
    ToDoDriver driver;

    public ToDoPanel(ToDoDriver driver) {
        this.driver = driver;
        initComponents();
        setVisible(true);
    }

    public void setProgressBarSchool(int value) {
        ProgressSchoolWork.setValue(value);
    }

    public void setProgressBarHealth(int value) {
        ProgressHealth.setValue(value);
    }

    public void setProgressBarOthers(int value) {
        ProgressOthers.setValue(value);
    }

    public void setTaskTextField(String task) {
        TextfAdd.setText(task);
    }

    public String getTaskTextField() {
        return TextfAdd.getText();
    }

    private void initComponents() {
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LabelSchool = new javax.swing.JLabel();
        ProgressSchoolWork = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        LabelHealth = new javax.swing.JLabel();
        ProgressHealth = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        ProgressOthers = new javax.swing.JProgressBar();
        LabelOthers = new javax.swing.JLabel();
        // ImpPanel = new javax.swing.JPanel();
        // cbImp1 = new javax.swing.JCheckBox();
        // cbImp2 = new javax.swing.JCheckBox();
        // cbImp3 = new javax.swing.JCheckBox();
        // cbImp4 = new javax.swing.JCheckBox();
        // cbImp5 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        RdSchool = new javax.swing.JRadioButton();
        RdHealth = new javax.swing.JRadioButton();
        TextfAdd = new javax.swing.JTextField();
        RdImp = new javax.swing.JRadioButton();
        Add = new javax.swing.JButton();
        RdOthers = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(385, 517));

        LabelSchool.setText("School Work");

        ProgressSchoolWork.setMaximumSize(new java.awt.Dimension(500, 50));
        ProgressSchoolWork.setMinimumSize(new java.awt.Dimension(300, 50));
        ProgressSchoolWork.setPreferredSize(new java.awt.Dimension(300, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProgressSchoolWork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelSchool)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelSchool)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProgressSchoolWork, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 50));

        LabelHealth.setText("Health");

        ProgressHealth.setMinimumSize(new java.awt.Dimension(300, 50));
        ProgressHealth.setPreferredSize(new java.awt.Dimension(300, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelHealth)
                    .addComponent(ProgressHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelHealth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        ProgressOthers.setMinimumSize(new java.awt.Dimension(300, 50));
        ProgressOthers.setPreferredSize(new java.awt.Dimension(300, 50));

        LabelOthers.setText("Others");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LabelOthers)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ProgressOthers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOthers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        // ImpPanel.setBackground(new java.awt.Color(153, 153, 153));

        // javax.swing.GroupLayout ImpPanelLayout = new javax.swing.GroupLayout(ImpPanel);
        // ImpPanel.setLayout(ImpPanelLayout);
        // ImpPanelLayout.setHorizontalGroup(
        //     ImpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        //     .addGroup(ImpPanelLayout.createSequentialGroup()
        //         .addGap(23, 23, 23)
        //         .addGroup(ImpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        //             .addComponent(cbImp5)
        //             .addComponent(cbImp4)
        //             .addComponent(cbImp3)
        //             .addComponent(cbImp2)
        //             .addComponent(cbImp1))
        //         .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        // );
        // ImpPanelLayout.setVerticalGroup(
        //     ImpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        //     .addGroup(ImpPanelLayout.createSequentialGroup()
        //         .addGap(18, 18, 18)
        //         .addComponent(cbImp1)
        //         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //         .addComponent(cbImp2)
        //         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //         .addComponent(cbImp3)
        //         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //         .addComponent(cbImp4)
        //         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //         .addComponent(cbImp5)
        //         .addContainerGap(13, Short.MAX_VALUE))
        // );

        buttonGroup3.add(RdSchool);
        RdSchool.setText("School Work");
        RdSchool.setActionCommand("School Work");

        buttonGroup3.add(RdHealth);
        RdHealth.setText("Health");
        RdHealth.setActionCommand("Health");

        buttonGroup3.add(RdImp);
        RdImp.setText("Priority Task");
        RdImp.setActionCommand("Star");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driver.widgetAdd();
            }

        });

        buttonGroup3.add(RdOthers);
        RdOthers.setText("Others");
        RdOthers.setActionCommand("Others");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RdSchool)
                            .addComponent(RdOthers))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RdImp)
                            .addComponent(RdHealth)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(TextfAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdSchool)
                    .addComponent(RdHealth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdImp)
                    .addComponent(RdOthers))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextfAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                // .addComponent(ImpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                // .addComponent(ImpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

    }
    
    
    
    private javax.swing.JButton Add;
    // private javax.swing.JPanel ImpPanel;
    private javax.swing.JLabel LabelHealth;
    private javax.swing.JLabel LabelOthers;
    private javax.swing.JLabel LabelSchool;
    private javax.swing.JProgressBar ProgressHealth;
    private javax.swing.JProgressBar ProgressOthers;
    private javax.swing.JProgressBar ProgressSchoolWork;
    private javax.swing.JRadioButton RdHealth;
    private javax.swing.JRadioButton RdImp;
    private javax.swing.JRadioButton RdOthers;
    private javax.swing.JRadioButton RdSchool;
    private javax.swing.JTextField TextfAdd;
    public javax.swing.ButtonGroup buttonGroup3;
    // private javax.swing.JCheckBox cbImp1;
    // private javax.swing.JCheckBox cbImp2;
    // private javax.swing.JCheckBox cbImp3;
    // private javax.swing.JCheckBox cbImp4;
    // private javax.swing.JCheckBox cbImp5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;

}

