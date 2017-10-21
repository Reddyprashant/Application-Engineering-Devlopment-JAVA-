/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supplier_ui;

import Person_ui.*;
import Business.Business;
import Business.Person.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Supplier.*;
/**
 *
 * @author raj
 */
public class SupplierJPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanelForm
     */
    private JPanel userProcessContainer;
    private Business business;
    public SupplierJPanelForm(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        populateSupplierTable();
    }
    
    public void populateSupplierTable(){
        DefaultTableModel dtm = (DefaultTableModel)supplierTable.getModel();
        dtm.setRowCount(0);
        
        for (Supplier supplier:business.getSupplierDirectory().getSupplierList()){ 
                    Object row[] = new Object[4];
                    row[0] = supplier;
                    row[1] = supplier.getSupplierId();
                    row[2] = supplier.getUserName();
                    row[3] = supplier.getPassword();
                    
                    
                    dtm.addRow(row);  
            }
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
        jLabel1 = new javax.swing.JLabel();
        addSupplierButton = new javax.swing.JButton();
        updateSupplier = new javax.swing.JButton();
        deleteSupplier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplier");

        addSupplierButton.setText("Add Supplier");
        addSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierButtonActionPerformed(evt);
            }
        });

        updateSupplier.setText("Update Supplier");
        updateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSupplierActionPerformed(evt);
            }
        });

        deleteSupplier.setText("Delete Supplier");
        deleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSupplierActionPerformed(evt);
            }
        });

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Id", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(supplierTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addSupplierButton)
                            .addComponent(updateSupplier)
                            .addComponent(deleteSupplier))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addSupplierButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateSupplier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteSupplier))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void updateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSupplierActionPerformed
        int selectedrow=supplierTable.getSelectedRow();
        
        if(selectedrow>=0)
        {  
        Supplier res=(Supplier)supplierTable.getValueAt(selectedrow,0);
        UpdateSupplier up= new UpdateSupplier(userProcessContainer,business,res);
        userProcessContainer.add("ManageSupplierAdministrative", up);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else
            JOptionPane.showMessageDialog(updateSupplier,"Please select a row first");
    }//GEN-LAST:event_updateSupplierActionPerformed

    private void addSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierButtonActionPerformed
        CreateSupplier cp= new CreateSupplier(userProcessContainer, business);
        userProcessContainer.add("ManageSupplierAdministrative", cp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addSupplierButtonActionPerformed

    private void deleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSupplierActionPerformed
       int selectedrow= supplierTable.getSelectedRow();
       if(selectedrow>=0)
        {    
            JOptionPane.showMessageDialog(deleteSupplier,"Are you sure you want to delete this entry?");
            Supplier res=(Supplier)supplierTable.getValueAt(selectedrow,0);
            business.getSupplierDirectory().deleteSupplier(res);
            populateSupplierTable();
             JOptionPane.showMessageDialog(deleteSupplier,"Person deleted");
        }
       else
            JOptionPane.showMessageDialog(updateSupplier,"Please select a row first");
    }//GEN-LAST:event_deleteSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSupplierButton;
    private javax.swing.JButton deleteSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable supplierTable;
    private javax.swing.JButton updateSupplier;
    // End of variables declaration//GEN-END:variables
}
