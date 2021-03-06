/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Business;
import Business.Person.Person;
import Business.Product.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author raj
 */
public class ViewDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetailsJPanel
     */
    private JPanel userProcessContainer;
//    public ViewDetailsJPanel() {
//        initComponents();
//    }
    private Business business;
  private  Product product ;
   public ViewDetailsJPanel(JPanel userProcessContainer,Business business, Product product) {
       initComponents();
       this.userProcessContainer=userProcessContainer;
       this.business=business;
       this.product= product;
       pidTF.setText(product.getProductId());
       pnTF.setText(product.getProductName());
       tpTF.setText(String.valueOf(product.getPrice()));
       availTF.setText(String.valueOf(product.getAvailability()));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pidTF = new javax.swing.JTextField();
        pnTF = new javax.swing.JTextField();
        tpTF = new javax.swing.JTextField();
        availTF = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Details ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 28, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 102, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 174, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 231, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Availability :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 288, -1, -1));

        pidTF.setEditable(false);
        pidTF.setEnabled(false);
        jPanel1.add(pidTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 191, -1));

        pnTF.setEditable(false);
        pnTF.setEnabled(false);
        jPanel1.add(pnTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 162, 191, -1));

        tpTF.setEditable(false);
        tpTF.setEnabled(false);
        jPanel1.add(tpTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 219, 191, -1));

        availTF.setEditable(false);
        availTF.setEnabled(false);
        jPanel1.add(availTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 276, 191, -1));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 365, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 28, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    
    }//GEN-LAST:event_BackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField availTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pidTF;
    private javax.swing.JTextField pnTF;
    private javax.swing.JTextField tpTF;
    // End of variables declaration//GEN-END:variables
}
