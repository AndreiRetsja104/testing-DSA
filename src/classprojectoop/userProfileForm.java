/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classprojectoop;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author arets
 */
public class userProfileForm extends javax.swing.JFrame {
    DatabaseTableCreater dbc = new DatabaseTableCreater();
    
    
    
    /**
     * Creates new form userProfileForm
     */
    public userProfileForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        emailTF = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();
        mainPageBtn = new javax.swing.JButton();
        mainPageText1 = new javax.swing.JLabel();
        CreateNewUserBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        userNameLbl = new java.awt.Label();
        label4 = new java.awt.Label();
        passwordLbl = new java.awt.Label();
        passwordTF = new javax.swing.JTextField();
        ageConfirm = new java.awt.Label();
        ageConfirmCB = new javax.swing.JCheckBox();
        mainPageText = new javax.swing.JLabel();
        mainPageRightImage = new javax.swing.JLabel();
        mainPageLeftImage = new javax.swing.JLabel();
        MainPageBackgroundImage = new javax.swing.JLabel();
        mainPageText2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(730, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(730, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 370, 40));

        userName.setToolTipText("");
        userName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 370, 40));

        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 80, 40));

        mainPageBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mainPageBtn.setText("Main Page");
        mainPageBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        mainPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainPageBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mainPageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 110, 40));
        mainPageBtn.getAccessibleContext().setAccessibleDescription("");

        mainPageText1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        mainPageText1.setForeground(new java.awt.Color(102, 0, 102));
        mainPageText1.setText("Please Add User Details");
        jPanel1.add(mainPageText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 500, 40));

        CreateNewUserBtn.setBackground(new java.awt.Color(0, 102, 255));
        CreateNewUserBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CreateNewUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateNewUserBtn.setText("Create");
        CreateNewUserBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        CreateNewUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CreateNewUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 120, 40));

        returnBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnBtn.setText("Return");
        returnBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jPanel1.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 90, 40));

        userNameLbl.setAlignment(java.awt.Label.CENTER);
        userNameLbl.setBackground(new java.awt.Color(255, 255, 255));
        userNameLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userNameLbl.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        userNameLbl.setName(""); // NOI18N
        userNameLbl.setText("First Name");
        jPanel1.add(userNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 120, 40));

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(255, 255, 255));
        label4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        label4.setText("Email");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 120, 40));

        passwordLbl.setAlignment(java.awt.Label.CENTER);
        passwordLbl.setBackground(new java.awt.Color(255, 255, 255));
        passwordLbl.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        passwordLbl.setText("Password");
        jPanel1.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 40));

        passwordTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 370, 40));

        ageConfirm.setAlignment(java.awt.Label.CENTER);
        ageConfirm.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ageConfirm.setText(" I confirm +18");
        jPanel1.add(ageConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 120, 40));

        ageConfirmCB.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.add(ageConfirmCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 40, 40));

        mainPageText.setBackground(new java.awt.Color(255, 255, 255));
        mainPageText.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        mainPageText.setForeground(new java.awt.Color(255, 255, 255));
        mainPageText.setText("Account User Profile Form");
        mainPageText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 3, true));
        jPanel1.add(mainPageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 510, 50));

        mainPageRightImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/User_profile_Front_Back_1.png"))); // NOI18N
        mainPageRightImage.setToolTipText("");
        jPanel1.add(mainPageRightImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        mainPageLeftImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/User_profile_Front_Back_1.png"))); // NOI18N
        jPanel1.add(mainPageLeftImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 330, -1));

        MainPageBackgroundImage.setForeground(new java.awt.Color(255, 153, 0));
        MainPageBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_chat/Form_BackGround.png3.png"))); // NOI18N
        jPanel1.add(MainPageBackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 500));
        MainPageBackgroundImage.getAccessibleContext().setAccessibleDescription("");

        mainPageText2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        mainPageText2.setForeground(new java.awt.Color(102, 0, 102));
        mainPageText2.setText("Account User Profile Form");
        jPanel1.add(mainPageText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 500, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPageBtnActionPerformed

        // TODO add your handling code here:
        frontPage fp = new frontPage ();
        fp.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_mainPageBtnActionPerformed

    private void CreateNewUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewUserBtnActionPerformed
        // TODO add your handling code here:
        String user = userName.getText();
        String password = passwordTF.getText();
        String email = emailTF.getText();
        String ageConfirm = ageConfirmCB.getText();
        String createTableUsers = "CREATE TABLE IF NOT EXISTS users(userName,password,email) VALUES('"+user+"','"+password+"','"+email+"')";
        System.out.println("Users Table Created");     
        
        
        
    }//GEN-LAST:event_CreateNewUserBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
     System.exit(WIDTH);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        FrameForPanels ffp = new FrameForPanels();
        ffp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBtnActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(userProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userProfileForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateNewUserBtn;
    private javax.swing.JLabel MainPageBackgroundImage;
    private java.awt.Label ageConfirm;
    private javax.swing.JCheckBox ageConfirmCB;
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label4;
    private javax.swing.JButton mainPageBtn;
    private javax.swing.JLabel mainPageLeftImage;
    private javax.swing.JLabel mainPageRightImage;
    private javax.swing.JLabel mainPageText;
    private javax.swing.JLabel mainPageText1;
    private javax.swing.JLabel mainPageText2;
    private java.awt.Label passwordLbl;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JButton returnBtn;
    private javax.swing.JTextField userName;
    private java.awt.Label userNameLbl;
    // End of variables declaration//GEN-END:variables
}
