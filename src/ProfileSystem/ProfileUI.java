package ProfileSystem;

import javax.swing.*;

public class ProfileUI extends JFrame {

    ProfileDriver driver;
    ProfileUI(ProfileDriver driver) {
        initComponents();
        setVisible(true);
    }

    private void initComponents() {

        jLabel_Profile = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        label_FNAME = new java.awt.Label();
        textField_FName = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profile");

        jLabel_Profile.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel_Profile.setText(" PROFILE ");
        jLabel_Profile.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel_Profile, java.awt.BorderLayout.EAST);

        panel2.setBackground(new java.awt.Color(242, 242, 242));

        label_FNAME.setText("label4");

        textField_FName.setText("textField4");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField_FName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_FNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_FNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        getContentPane().add(panel2, java.awt.BorderLayout.CENTER);

        pack();
    }

    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.JLabel jLabel_Profile;
    private java.awt.Label label_DOB;
    private java.awt.Label label_FNAME;
    private java.awt.Label label_LName;
    private java.awt.Label label_Major;
    private java.awt.Label label_PhoneNo;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.TextField textField_DOB;
    private java.awt.TextField textField_FName;
    private java.awt.TextField textField_LName;
    private java.awt.TextField textField_Major;
    private java.awt.TextField textField_PhoneNo;
}

