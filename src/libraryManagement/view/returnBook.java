/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryManagement.view;

import controller.issueControl;
import javax.swing.JOptionPane;

/**
 *
 * @author marwan
 */
public class returnBook extends javax.swing.JFrame {

    /**
     * Creates new form returnBook
     */
    public returnBook() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bookIdField = new javax.swing.JTextField();
        studentIdField = new javax.swing.JTextField();
        DueDateField = new javax.swing.JTextField();
        returnButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/123456.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        bookIdField.setBackground(new java.awt.Color(204, 255, 204));
        bookIdField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdFieldActionPerformed(evt);
            }
        });
        getContentPane().add(bookIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 239, -1));

        studentIdField.setBackground(new java.awt.Color(204, 255, 204));
        studentIdField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdFieldActionPerformed(evt);
            }
        });
        getContentPane().add(studentIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 239, -1));

        DueDateField.setBackground(new java.awt.Color(204, 255, 204));
        DueDateField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DueDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DueDateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(DueDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 239, -1));

        returnButton.setBackground(new java.awt.Color(255, 255, 204));
        returnButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/return book png.png"))); // NOI18N
        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 119, -1));

        closeButton.setBackground(new java.awt.Color(204, 255, 204));
        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/red-x-mark-transparent-background-3.png"))); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 110, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryManagement/view/Icons/123456.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdFieldActionPerformed
       
    }//GEN-LAST:event_studentIdFieldActionPerformed

    private void bookIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdFieldActionPerformed
      
    }//GEN-LAST:event_bookIdFieldActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed

       int bookId = Integer.parseInt(bookIdField.getText());   
       int studentId=Integer.parseInt(studentIdField.getText());
       String returnDate=DueDateField.getText();
       String checkBookId=String.valueOf(bookId);
       if(issueControl.isissued(checkBookId)){
            JOptionPane.showMessageDialog(null, "Book Hasbeen Returned");
           issueControl.returnBook(bookId, studentId, returnDate);
       }
       else{
           JOptionPane.showMessageDialog(null, "Failed to return the book");
       }
       
    }//GEN-LAST:event_returnButtonActionPerformed

    private void DueDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DueDateFieldActionPerformed

    }//GEN-LAST:event_DueDateFieldActionPerformed

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
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DueDateField;
    private javax.swing.JTextField bookIdField;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField studentIdField;
    // End of variables declaration//GEN-END:variables
}
