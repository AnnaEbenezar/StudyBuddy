package ProfileSystem;

import javax.swing.*;

public class ProfileUI extends JFrame {

    ProfileDriver driver;
    ProfileUI(ProfileDriver driver) {
        initComponents();
        setVisible(true);
    }

    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel_Profile = new javax.swing.JLabel();
        button3 = new java.awt.Button();
        panel2 = new java.awt.Panel();
        label3 = new java.awt.Label();
        textField3 = new java.awt.TextField();
        label_FNAME = new java.awt.Label();
        textField_FName = new java.awt.TextField();
        label_LName = new java.awt.Label();
        textField_LName = new java.awt.TextField();
        label_DOB = new java.awt.Label();
        textField_DOB = new java.awt.TextField();
        label_PhoneNo = new java.awt.Label();
        textField_PhoneNo = new java.awt.TextField();
        label_Major = new java.awt.Label();
        textField_Major = new java.awt.TextField();
        button4 = new java.awt.Button();
        button2 = new java.awt.Button();
        panel3 = new java.awt.Panel();
        button1 = new java.awt.Button();
        button5 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profile");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(600, 400));

        panel1.setPreferredSize(new java.awt.Dimension(250, 400));

        jLabel_Profile.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel_Profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Profile.setText(" PROFILE ");
        jLabel_Profile.setToolTipText("");
        jLabel_Profile.setAlignmentY(0.0F);
        jLabel_Profile.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        button3.setLabel("button3");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.EAST);

        panel2.setBackground(new java.awt.Color(242, 242, 242));
        panel2.setPreferredSize(new java.awt.Dimension(300, 400));

        label3.setText("label3");

        textField3.setText("textField3");

        label_FNAME.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        label_FNAME.setPreferredSize(new java.awt.Dimension(58, 20));
        label_FNAME.setText("FIRST NAME:");

        textField_FName.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        textField_FName.setMinimumSize(new java.awt.Dimension(180, 22));

        label_LName.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        label_LName.setPreferredSize(new java.awt.Dimension(58, 20));
        label_LName.setText("LAST NAME:");

        textField_LName.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        textField_LName.setMinimumSize(new java.awt.Dimension(180, 22));

        label_DOB.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        label_DOB.setPreferredSize(new java.awt.Dimension(58, 20));
        label_DOB.setText("DATE OF BIRTH:");

        textField_DOB.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        textField_DOB.setMinimumSize(new java.awt.Dimension(180, 22));

        label_PhoneNo.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        label_PhoneNo.setPreferredSize(new java.awt.Dimension(58, 20));
        label_PhoneNo.setText("PHONE NO.");

        textField_PhoneNo.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        textField_PhoneNo.setMinimumSize(new java.awt.Dimension(180, 22));

        label_Major.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        label_Major.setPreferredSize(new java.awt.Dimension(58, 20));
        label_Major.setText("MAJOR:");

        textField_Major.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        textField_Major.setMinimumSize(new java.awt.Dimension(180, 22));

        button4.setLabel("button4");

        button2.setLabel("button2");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_FName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_LName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_PhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_Major, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Major, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_PhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_LName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_FNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label_FNAME, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_FName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_LName, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_LName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_PhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_PhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Major, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_Major, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panel2, java.awt.BorderLayout.WEST);

        panel3.setMinimumSize(new java.awt.Dimension(125, 100));
        panel3.setPreferredSize(new java.awt.Dimension(150, 328));

        button1.setLabel("button1");

        button5.setLabel("button1");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(panel3, java.awt.BorderLayout.CENTER);

        pack();
    }

    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private javax.swing.JLabel jLabel_Profile;
    private java.awt.Label label3;
    private java.awt.Label label_DOB;
    private java.awt.Label label_FNAME;
    private java.awt.Label label_LName;
    private java.awt.Label label_Major;
    private java.awt.Label label_PhoneNo;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.TextField textField3;
    private java.awt.TextField textField_DOB;
    private java.awt.TextField textField_FName;
    private java.awt.TextField textField_LName;
    private java.awt.TextField textField_Major;
    private java.awt.TextField textField_PhoneNo;
}

