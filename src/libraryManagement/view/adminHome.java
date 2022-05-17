/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryManagement.view;

/**
 *
 * @author marwan
 */
public class adminHome extends javax.swing.JFrame {

    /**
     * Creates new form admin_home
     */
    public adminHome() {
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

        NewStudentButton = new javax.swing.JButton();
        NewBookButton = new javax.swing.JButton();
        StatisticsButton = new javax.swing.JButton();
        IssueBookButton = new javax.swing.JButton();
        ReturnBookButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(225, 125));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewStudentButton.setBackground(new java.awt.Color(255, 255, 204));
        NewStudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/member-add-on-300x300.png"))); // NOI18N
        NewStudentButton.setText("New Student");
        NewStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStudentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NewStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 160, -1));

        NewBookButton.setBackground(new java.awt.Color(255, 255, 204));
        NewBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/New book.png"))); // NOI18N
        NewBookButton.setText("New Book");
        NewBookButton.setPreferredSize(new java.awt.Dimension(159, 59));
        NewBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NewBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        StatisticsButton.setBackground(new java.awt.Color(255, 255, 204));
        StatisticsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/Statics.png"))); // NOI18N
        StatisticsButton.setText("Statistics");
        StatisticsButton.setPreferredSize(new java.awt.Dimension(159, 59));
        StatisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(StatisticsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        IssueBookButton.setBackground(new java.awt.Color(255, 255, 204));
        IssueBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/issue.png"))); // NOI18N
        IssueBookButton.setText("Issue Book");
        IssueBookButton.setPreferredSize(new java.awt.Dimension(159, 59));
        IssueBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IssueBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, -1));

        ReturnBookButton.setBackground(new java.awt.Color(255, 255, 204));
        ReturnBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/return-book-1-560407.png"))); // NOI18N
        ReturnBookButton.setText("Return Book");
        ReturnBookButton.setPreferredSize(new java.awt.Dimension(159, 59));
        ReturnBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/exit.png"))); // NOI18N
        jButton6.setText("Logout");
        jButton6.setPreferredSize(new java.awt.Dimension(159, 59));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/issue book.png"))); // NOI18N
        jButton1.setText("Available Books");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 160, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/Library_Book_532388_1366x768.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1200, 600));
        jLabel2.setMinimumSize(new java.awt.Dimension(1200, 600));
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStudentButtonActionPerformed
        new newStudent().setVisible(true);
    }//GEN-LAST:event_NewStudentButtonActionPerformed

    private void NewBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBookButtonActionPerformed
        new newBook().setVisible(true);
    }//GEN-LAST:event_NewBookButtonActionPerformed

    private void StatisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsButtonActionPerformed
        new issueTable();
    }//GEN-LAST:event_StatisticsButtonActionPerformed

    private void IssueBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueBookButtonActionPerformed
        new issueBook().setVisible(true);
    }//GEN-LAST:event_IssueBookButtonActionPerformed

    private void ReturnBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBookButtonActionPerformed
        new returnBook().setVisible(true);
    }//GEN-LAST:event_ReturnBookButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new availableBook();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IssueBookButton;
    private javax.swing.JButton NewBookButton;
    private javax.swing.JButton NewStudentButton;
    private javax.swing.JButton ReturnBookButton;
    private javax.swing.JButton StatisticsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
