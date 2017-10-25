/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Business;
import Business.Customer;
import Business.Market.Market;
import Business.Person.Person;
import Market_ui.UpdateMarket;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raj
 */
public class ManageCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private Person person;
    

    ManageCustomersJPanel(JPanel userProcessContainer, Business business, Person person) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.person=  person;
        this.business= business;
        nameTextField.setText(person.getName());
       
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
        jLabel5 = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ServeCustomerButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        totalOrderList = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Xerox Sales Console ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 24, -1, 57));

        UserNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameJLabel.setText("Name:");
        jPanel1.add(UserNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 97, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 24, 112, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Activity: Manage Customers");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 97, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Customer Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 173, -1, -1));

        customerNameTextField.setBackground(new java.awt.Color(51, 51, 51));
        customerNameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(customerNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 170, 207, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 24, 112, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 24, 112, -1));

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 98, 120, -1));

        ServeCustomerButton.setText("Serve Customer");
        ServeCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServeCustomerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ServeCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 241, -1, -1));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, -1, -1));

        totalOrderList.setText("View Orders");
        totalOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalOrderListActionPerformed(evt);
            }
        });
        jPanel1.add(totalOrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ServeCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServeCustomerButtonActionPerformed
   boolean a=false;
        for (Market market : business.getMarketList().getMarketList()) {
            for (Customer customer : market.getCustomerList()) {
                if(customerNameTextField.getText().equals(customer.getName()))
                {   a=true;
                          ServeCustomerJPanel customerPanel= new ServeCustomerJPanel(userProcessContainer,business, customer, person);
        userProcessContainer.add("ServeCustomerJPanel", customerPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                }
               
                
            }
            
        }
        if(!a){
             
                
                    JOptionPane.showMessageDialog(null, "Please Enter valid customer name");
                
        }
        
             

      
        
      
    }//GEN-LAST:event_ServeCustomerButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logoutButtonActionPerformed
    private void totalOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalOrderListActionPerformed
        // TODO add your handling code here:
        TotalOrderStatus tos= new TotalOrderStatus(userProcessContainer,business,person);
        userProcessContainer.add("TotalOrderStatus", tos);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_totalOrderListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ServeCustomerButton;
    private javax.swing.JLabel UserNameJLabel;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton totalOrderList;
    // End of variables declaration//GEN-END:variables
}
