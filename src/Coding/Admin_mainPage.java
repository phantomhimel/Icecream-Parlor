/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Admin_mainPage extends javax.swing.JFrame {

    /**
     * Creates new form Admin_mainPage
     */
    public Admin_mainPage() {
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
        pnlAddFlavour = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlViewFlavour = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlnewstuff = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlviewstuffinfo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlreset = new javax.swing.JPanel();
        lblreset = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(77, 0, 77));

        pnlAddFlavour.setBackground(new java.awt.Color(77, 0, 77));
        pnlAddFlavour.setToolTipText("Add new flavor and price");
        pnlAddFlavour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAddFlavour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAddFlavourMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAddFlavourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAddFlavourMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add Flavour Name and Price");

        javax.swing.GroupLayout pnlAddFlavourLayout = new javax.swing.GroupLayout(pnlAddFlavour);
        pnlAddFlavour.setLayout(pnlAddFlavourLayout);
        pnlAddFlavourLayout.setHorizontalGroup(
            pnlAddFlavourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddFlavourLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(81, 81, 81))
        );
        pnlAddFlavourLayout.setVerticalGroup(
            pnlAddFlavourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddFlavourLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlViewFlavour.setBackground(new java.awt.Color(77, 0, 77));
        pnlViewFlavour.setToolTipText("See total sold flavors and total earned money form each flavor");
        pnlViewFlavour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlViewFlavour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlViewFlavourMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlViewFlavourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlViewFlavourMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Selling Info");

        javax.swing.GroupLayout pnlViewFlavourLayout = new javax.swing.GroupLayout(pnlViewFlavour);
        pnlViewFlavour.setLayout(pnlViewFlavourLayout);
        pnlViewFlavourLayout.setHorizontalGroup(
            pnlViewFlavourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewFlavourLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlViewFlavourLayout.setVerticalGroup(
            pnlViewFlavourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewFlavourLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );

        pnlnewstuff.setBackground(new java.awt.Color(77, 0, 77));
        pnlnewstuff.setToolTipText("Register new stuff information");
        pnlnewstuff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlnewstuff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlnewstuffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlnewstuffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlnewstuffMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register New Staff");

        javax.swing.GroupLayout pnlnewstuffLayout = new javax.swing.GroupLayout(pnlnewstuff);
        pnlnewstuff.setLayout(pnlnewstuffLayout);
        pnlnewstuffLayout.setHorizontalGroup(
            pnlnewstuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnewstuffLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlnewstuffLayout.setVerticalGroup(
            pnlnewstuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlnewstuffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(25, 25, 25))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("-");
        jLabel6.setToolTipText("Minimize");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("X");
        jLabel7.setToolTipText("Close");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        pnlviewstuffinfo.setBackground(new java.awt.Color(77, 0, 77));
        pnlviewstuffinfo.setToolTipText("See all stuff information and delete any stuff information");
        pnlviewstuffinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlviewstuffinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlviewstuffinfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlviewstuffinfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlviewstuffinfoMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("View Staff Info");
        jLabel4.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jLabel4CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        javax.swing.GroupLayout pnlviewstuffinfoLayout = new javax.swing.GroupLayout(pnlviewstuffinfo);
        pnlviewstuffinfo.setLayout(pnlviewstuffinfoLayout);
        pnlviewstuffinfoLayout.setHorizontalGroup(
            pnlviewstuffinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlviewstuffinfoLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlviewstuffinfoLayout.setVerticalGroup(
            pnlviewstuffinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlviewstuffinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home Page");

        pnlreset.setBackground(new java.awt.Color(77, 0, 77));
        pnlreset.setToolTipText("Reset full system");
        pnlreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlresetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlresetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlresetMouseExited(evt);
            }
        });

        lblreset.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblreset.setForeground(new java.awt.Color(255, 255, 255));
        lblreset.setText("Reset All Data");
        lblreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlresetLayout = new javax.swing.GroupLayout(pnlreset);
        pnlreset.setLayout(pnlresetLayout);
        pnlresetLayout.setHorizontalGroup(
            pnlresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlresetLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblreset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlresetLayout.setVerticalGroup(
            pnlresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlresetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblreset)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Log out");
        jLabel8.setToolTipText("Log out");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlViewFlavour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlnewstuff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlviewstuffinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlreset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAddFlavour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)))
                .addGap(39, 39, 39)
                .addComponent(pnlAddFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlViewFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlnewstuff, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlviewstuffinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlreset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(530, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     private void setColor(JPanel panel)
    {
        panel.setBackground(new Color(51, 0, 51));
    }
     private void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(77,0,77));
    }
    private void pnlAddFlavourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddFlavourMouseEntered
        
        setColor(pnlAddFlavour);
        
    }//GEN-LAST:event_pnlAddFlavourMouseEntered

    private void pnlAddFlavourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddFlavourMouseExited
        
        resetColor(pnlAddFlavour);
    }//GEN-LAST:event_pnlAddFlavourMouseExited

    private void pnlViewFlavourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFlavourMouseEntered
        
        setColor(pnlViewFlavour);
    }//GEN-LAST:event_pnlViewFlavourMouseEntered

    private void pnlViewFlavourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFlavourMouseExited
        
        resetColor(pnlViewFlavour);
    }//GEN-LAST:event_pnlViewFlavourMouseExited

    private void pnlnewstuffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlnewstuffMouseEntered
        // TODO add your handling code here:
        
        setColor(pnlnewstuff);
    }//GEN-LAST:event_pnlnewstuffMouseEntered

    private void pnlnewstuffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlnewstuffMouseExited
        // TODO add your handling code here:
        
        resetColor(pnlnewstuff);
    }//GEN-LAST:event_pnlnewstuffMouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void pnlviewstuffinfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlviewstuffinfoMouseEntered
        // TODO add your handling code here:
        
        setColor(pnlviewstuffinfo);
    }//GEN-LAST:event_pnlviewstuffinfoMouseEntered

    private void pnlviewstuffinfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlviewstuffinfoMouseExited
        // TODO add your handling code here:
        
        resetColor(pnlviewstuffinfo);
    }//GEN-LAST:event_pnlviewstuffinfoMouseExited

    private void pnlAddFlavourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddFlavourMouseClicked
        // TODO add your handling code here:
        
        new Adding_Flavour().show();
        this.dispose();
    }//GEN-LAST:event_pnlAddFlavourMouseClicked

    private void pnlViewFlavourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFlavourMouseClicked
        // TODO add your handling code here:
        
        new View_Flavour().show();
        this.dispose();
    }//GEN-LAST:event_pnlViewFlavourMouseClicked

    private void pnlnewstuffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlnewstuffMouseClicked
        // TODO add your handling code here:
        
        new Stuff_Info().show();
        this.dispose();
    }//GEN-LAST:event_pnlnewstuffMouseClicked

    private void pnlviewstuffinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlviewstuffinfoMouseClicked
        // TODO add your handling code here:
        
        new viewStuff().show();
        this.dispose();
    }//GEN-LAST:event_pnlviewstuffinfoMouseClicked

    private void pnlresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlresetMouseClicked
        // TODO add your handling code here:
        new Reset_AllData().show();
        this.dispose();
    }//GEN-LAST:event_pnlresetMouseClicked

    private void pnlresetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlresetMouseEntered
        // TODO add your handling code here:
        setColor(pnlreset);
    }//GEN-LAST:event_pnlresetMouseEntered

    private void pnlresetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlresetMouseExited
        // TODO add your handling code here:
        resetColor(pnlreset);
    }//GEN-LAST:event_pnlresetMouseExited

    private void jLabel4CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel4CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4CaretPositionChanged

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:

        new FirstPage().show();
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_mainPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblreset;
    private javax.swing.JPanel pnlAddFlavour;
    private javax.swing.JPanel pnlViewFlavour;
    private javax.swing.JPanel pnlnewstuff;
    private javax.swing.JPanel pnlreset;
    private javax.swing.JPanel pnlviewstuffinfo;
    // End of variables declaration//GEN-END:variables
}
