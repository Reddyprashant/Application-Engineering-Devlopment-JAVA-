/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Dhruv Patel
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnPerson = new javax.swing.JButton();
        btnMarket = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("System Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, -1, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnBack.setText("Back");
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1180, 220, 90));

        btnSupplier.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnSupplier.setText("Supplier");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });
        add(btnSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 340, 130));

        btnPerson.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnPerson.setText("Person");
        add(btnPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 340, 130));

        btnMarket.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnMarket.setText("Market");
        add(btnMarket, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 800, 340, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMarket;
    private javax.swing.JButton btnPerson;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
