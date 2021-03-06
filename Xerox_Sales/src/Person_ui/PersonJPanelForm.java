/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person_ui;

import Business.Business;
import Business.Person.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raj
 */
public class PersonJPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanelForm
     */
    private JPanel userProcessContainer;
    private Business business;
    public PersonJPanelForm(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        populatePersonTable();
    }
    
    public void populatePersonTable(){
        DefaultTableModel dtm = (DefaultTableModel)personTable.getModel();
        dtm.setRowCount(0);
        
        for (Person person: business.getEmployeeDirectory().getPersonList()){ 
                    Object row[] = new Object[4];
                    row[0] = person;
                    row[1] = person.getName();
                    row[2] = person.getUserName();
                    //row[3] = person.getPassword();
                    row[3] = person.getRole();
                    
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
        addPersonButton = new javax.swing.JButton();
        updatePerson = new javax.swing.JButton();
        deletePerson = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Person");

        addPersonButton.setText("Add Person");
        addPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonButtonActionPerformed(evt);
            }
        });

        updatePerson.setText("Update Person");
        updatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePersonActionPerformed(evt);
            }
        });

        deletePerson.setText("Delete Person");
        deletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonActionPerformed(evt);
            }
        });

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Name", "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personTable);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPersonButton)
                            .addComponent(updatePerson)
                            .addComponent(deletePerson))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addPersonButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updatePerson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletePerson)))
                .addGap(4, 27, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void updatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePersonActionPerformed
        int selectedrow=personTable.getSelectedRow();
        
        if(selectedrow>=0)
        {  
        Person res=(Person)personTable.getValueAt(selectedrow,0);
        UpdatePersonJPanel up= new UpdatePersonJPanel(userProcessContainer,business,res);
        userProcessContainer.add("UpdatePersonJPanel", up);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else
            JOptionPane.showMessageDialog(updatePerson,"Please select a row first");
    }//GEN-LAST:event_updatePersonActionPerformed

    private void addPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonButtonActionPerformed
        CreatePerson cp= new CreatePerson(userProcessContainer, business);
        userProcessContainer.add("CreatePerson", cp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPersonButtonActionPerformed

    private void deletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonActionPerformed
       int selectedrow= personTable.getSelectedRow();
       if(selectedrow>=0)
        {    
            JOptionPane.showMessageDialog(deletePerson,"Are you sure you want to delete this entry?");
            Person p=(Person)personTable.getValueAt(selectedrow,0);
            business.getEmployeeDirectory().deletePerson(p);
            populatePersonTable();
             JOptionPane.showMessageDialog(deletePerson,"Person deleted");
        }
       else
            JOptionPane.showMessageDialog(updatePerson,"Please select a row first");
    }//GEN-LAST:event_deletePersonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
//        Component[] componentArray=userProcessContainer.getComponents();
//        pjp =(PersonJPanelForm)userProcessContainer.getComponent(componentArray.length -1);
//        pjp.populatePersonTable();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPersonButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deletePerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personTable;
    private javax.swing.JButton updatePerson;
    // End of variables declaration//GEN-END:variables
}
