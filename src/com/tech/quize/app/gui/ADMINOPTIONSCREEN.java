/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.quize.app.gui;

import com.tech.quize.app.entityPoJo.UsersProfilePojo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author vaibh
 */
public class ADMINOPTIONSCREEN extends javax.swing.JFrame {

    /**
     * Creates new form ADMINSCREENS
     */
    public ADMINOPTIONSCREEN() {
        initComponents();
          setLocationRelativeTo(null);
        setTitle("Tech Quiz App");
        lblshowUserName.setText(UsersProfilePojo.getUserId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        lblshowUserName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbSetPaperframe = new javax.swing.JRadioButton();
        jrbEditFrame = new javax.swing.JRadioButton();
        jrbRegisterFrame = new javax.swing.JRadioButton();
        jrbViewScore = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 153, 0));
        lblLogout.setText("LOGOUT");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblshowUserName.setBackground(new java.awt.Color(0, 0, 0));
        lblshowUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblshowUserName.setForeground(new java.awt.Color(255, 153, 0));
        lblshowUserName.setText("USERNAME");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("     Online Quiz Administration Panel    ");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staticfile/admin.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Choose Any One Operation");

        jrbSetPaperframe.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbSetPaperframe);
        jrbSetPaperframe.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbSetPaperframe.setForeground(new java.awt.Color(255, 153, 0));
        jrbSetPaperframe.setText("Set A Paper");

        jrbEditFrame.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbEditFrame);
        jrbEditFrame.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbEditFrame.setForeground(new java.awt.Color(255, 153, 0));
        jrbEditFrame.setText("Edit Paper");

        jrbRegisterFrame.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbRegisterFrame);
        jrbRegisterFrame.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbRegisterFrame.setForeground(new java.awt.Color(255, 153, 0));
        jrbRegisterFrame.setText("Register Student");

        jrbViewScore.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbViewScore);
        jrbViewScore.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbViewScore.setForeground(new java.awt.Color(255, 153, 0));
        jrbViewScore.setText("View Score");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DO TASK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblshowUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbEditFrame)
                                    .addComponent(jrbSetPaperframe)
                                    .addComponent(jrbRegisterFrame)
                                    .addComponent(jrbViewScore)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout)
                    .addComponent(lblshowUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jrbSetPaperframe)
                        .addGap(18, 18, 18)
                        .addComponent(jrbEditFrame)
                        .addGap(18, 18, 18)
                        .addComponent(jrbRegisterFrame)
                        .addGap(18, 18, 18)
                        .addComponent(jrbViewScore)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        int ans=JOptionPane.showConfirmDialog(null,"Your realy want to Logout","Conformation",JOptionPane.YES_NO_OPTION);
       if(ans==JOptionPane.YES_OPTION)
       {
        LOGINSCREEN scr=new LOGINSCREEN();
        scr.setVisible(true);
        this.dispose();
       }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(jrbSetPaperframe.isSelected())
       {
           SetPaperFrame setPaperFrame=new SetPaperFrame();
           setPaperFrame.setVisible(true);
       }
       else if(jrbEditFrame.isSelected())
       {
           EditPaperFrame editPaperFrame=new EditPaperFrame();
           editPaperFrame.setVisible(true);
       }
       else if(jrbRegisterFrame.isSelected())
       {
           RegisterStudentFrame registerStudentFrame=new RegisterStudentFrame();
           registerStudentFrame.setVisible(true);
        }
       else if(jrbViewScore.isSelected())
       {
           ViewScoresFrame viewScoresFrame=new ViewScoresFrame();
           viewScoresFrame.setVisible(true);
        }
       else
       {
           JOptionPane.showMessageDialog(null,"Please Select Any One Button","Select Option",JOptionPane.ERROR_MESSAGE);
         return;
       }
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.white);
        lblLogout.setFont(new Font("Tahoma", Font.ITALIC, 12));
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setFont(new Font("Tahoma",Font.BOLD,14));
        lblLogout.setForeground(new Color(255,153,0));
        
    }//GEN-LAST:event_lblLogoutMouseExited

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
            java.util.logging.Logger.getLogger(ADMINOPTIONSCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMINOPTIONSCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMINOPTIONSCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMINOPTIONSCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMINOPTIONSCREEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbEditFrame;
    private javax.swing.JRadioButton jrbRegisterFrame;
    private javax.swing.JRadioButton jrbSetPaperframe;
    private javax.swing.JRadioButton jrbViewScore;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblshowUserName;
    // End of variables declaration//GEN-END:variables
}