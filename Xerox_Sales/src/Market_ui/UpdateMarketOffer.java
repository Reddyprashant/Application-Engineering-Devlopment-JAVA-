/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Market_ui;

import Business.Business;
import Business.Market.Market;
import Business.Market.MarketOffer;
import Business.Product.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prashantreddy
 */
public class UpdateMarketOffer extends javax.swing.JPanel {

    /**
     * Creates new form UpdateMarketOffer
     */
    private JPanel userProcessContainer;
    private Business business;
   private MarketOffer marketOffer;
    public UpdateMarketOffer(JPanel userProcessContainer,Business business, MarketOffer marketOffer) {
        initComponents();
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        this.marketOffer= marketOffer;
        
        marketComboBox.addItem(marketOffer.getMarket().getMarketName());
        productComboBox.addItem(marketOffer.getProduct().getProductName());
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
        jLabel2 = new javax.swing.JLabel();
        marketComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        productComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        flrTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tarTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ceilTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Offer");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Market Name");

        marketComboBox.setEnabled(false);
        marketComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product:");

        productComboBox.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Floor Price:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Target Price:");

        tarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarTxtActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ceil Price:");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1)
                .addGap(240, 240, 240)
                .addComponent(backBtn))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel2)
                .addGap(111, 111, 111)
                .addComponent(marketComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel4)
                .addGap(138, 138, 138)
                .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel5)
                .addGap(130, 130, 130)
                .addComponent(flrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel6)
                .addGap(120, 120, 120)
                .addComponent(tarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel7)
                .addGap(136, 136, 136)
                .addComponent(ceilTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(updateBtn))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addComponent(backBtn))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(marketComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(flrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(tarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(ceilTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(updateBtn))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void marketComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marketComboBoxActionPerformed

    private void tarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
       // MarketOffer marketOffer = business.getMarketOfferCatalog().addMarketOffer();
       try{
        double floorRatio=Double.parseDouble(flrTxt.getText());
        double targetRatio=Double.parseDouble(tarTxt.getText());
        double ceilRatio=Double.parseDouble(ceilTxt.getText());
        if(ceilRatio >= targetRatio && targetRatio>= floorRatio){
                 marketOffer.setFloorRatio(floorRatio);
        marketOffer.setTargetRatio(targetRatio);
        marketOffer.setCeilRatio(targetRatio);
        JOptionPane.showMessageDialog(null,"Updated succesfully");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"enter Ceil Ratio>=Target Ratio>=Floor Ratio");
        }

       }
       catch(NumberFormatException n)
       {
           JOptionPane.showMessageDialog(null,"Fields cannotbe empty and enter ratio only  in double");
       }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
                        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
        
        Component[] componentArray=userProcessContainer.getComponents();
        ManageMarketOffer manageOffer = (ManageMarketOffer)userProcessContainer.getComponent(componentArray.length -1);
        manageOffer.populateTable();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField ceilTxt;
    private javax.swing.JTextField flrTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox marketComboBox;
    private javax.swing.JComboBox productComboBox;
    private javax.swing.JTextField tarTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
