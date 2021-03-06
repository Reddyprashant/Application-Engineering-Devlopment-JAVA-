/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Business;
import Business.Person.Person;
import Business.Product.Product;
import Business.Supplier.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raj
 */
public class BrowseProductCatalogueJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    //private JPanel userProcessContainer;
    private Person person;
    
    BrowseProductCatalogueJpanel(JPanel userProcessContainer,Business business,Person person) {
       initComponents();
       this.userProcessContainer=userProcessContainer;
       this.business=business;
       this.person=person;
       nameTextField.setText(person.getName());
       catalogueComboBox.removeAllItems();
       for (Supplier s : business.getSupplierDirectory().getSupplierList()) {
            catalogueComboBox.addItem(s);
            
        }
        populateTable();
    }

    public void populateTable(){
        Supplier supplier= (Supplier)catalogueComboBox.getSelectedItem();
        DefaultTableModel dtm = (DefaultTableModel)productTable.getModel();
        dtm.setRowCount(0);
        //for(Supplier s: business.getSupplierDirectory().getSupplierList())
        //{
            for(Product p: supplier.getProductCatalog().getProductList())
            {
               // if(supplier.equals(supplier.getSupplierName()))
                
                    Object row[] = new Object[6];
                    row[0] = p;
                    row[1] = p.getProductId();
                    row[2]=  p.getPrice();
                    row[3]= p.getAvailability();
                    
 
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

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserNameJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        catalogueComboBox = new javax.swing.JComboBox();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();

        jLabel4.setText("jLabel4");

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Xerox Sales Console ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, -1, 57));

        UserNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameJLabel.setText("Sales Person's Name:");
        jPanel1.add(UserNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 65, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 2, 112, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Activity: Browse Product Catalogue");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 377, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 2, 112, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 2, 112, -1));

        nameTextField.setBackground(new java.awt.Color(51, 51, 51));
        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 66, 106, -1));

        catalogueComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogueComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(catalogueComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, 210, -1));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Product Price", "Availability"
            }
        ));
        jScrollPane1.setViewportView(productTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 730, 250));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    
    }//GEN-LAST:event_backButtonActionPerformed

    private void catalogueComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogueComboBoxActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_catalogueComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserNameJLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox catalogueComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
