/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Business;
import Business.Market.Market;
import Business.Market.MarketOffer;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Person.Person;
import Business.Product.Product;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prashantreddy
 */
public class TopProducts extends javax.swing.JPanel {

    /**
     * Creates new form TopProducts
     */
        private JPanel userProcessContainer;
    private Business business;
    private Person person;
    public TopProducts(JPanel userProcessContainer,Business business, Person person) {
        initComponents();
                this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.person = person;
        marketCombo.removeAllItems();
        for (Market market : business.getMarketList().getMarketList()) {
            marketCombo.addItem(market);
           
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

        jLabel1 = new javax.swing.JLabel();
        marketCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Top 3 Products Above Target Price");

        marketCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketComboActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Id", "Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Market Type");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marketCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(699, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marketCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(ArrayList<Product> products)
    {
         DefaultTableModel dtm = (DefaultTableModel)productTable.getModel();
        dtm.setRowCount(0);
        for (Product product : products) {
            Object row[] = new Object[4];
//                            row[0]= orderItem.getMarketOffer().getProduct();
                            row[0]=product;
                            row[1]= product.getProductId();
                            row[2]=product.getPrice();
                            row[3]=product.getAvailability();                         
                             dtm.addRow(row);
        
    }
        
    }
    private void marketComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketComboActionPerformed
        // TODO add your handling code here:
        populateTopProducts();
    }//GEN-LAST:event_marketComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void populateTopProducts(){
         Market market = (Market)marketCombo.getSelectedItem();
        HashSet<Product> set= new HashSet<>();
        
               for (Order order : business.getOrderList().getOrderList()) {
                    if (order.getCustomer().getMarketName().equalsIgnoreCase(market.getMarketName())) {
                        for (OrderItem orderItem : order.getOrderItemList()) {
                            set.add(orderItem.getMarketOffer().getProduct());
                    }
                        }
                     
        }
               System.out.println("top"+set.size()+set+ market.getMarketName());
        ArrayList<Product> productList= new ArrayList<>();
        for (Product product : set) {
            productList.add(product);
        }
     
         Collections.sort(productList, new Comparator<Product>(){
   public int compare(Product p1, Product p2){
     double fRevenue=0;
     double fTargetRevenue=0;
     int fTotalProfit=0;
for (Order order : business.getOrderList().getOrderList()) {
           if(order.getCustomer().getMarketName().equals(market.getMarketName())){
               for (OrderItem orderItem : order.getOrderItemList()) {
                   if(orderItem.getMarketOffer().getProduct().getProductId().equals(p1.getProductId()))
                      fRevenue = fRevenue + order.orderTotal();
           fTargetRevenue = fTargetRevenue +order.orderTotalTargetPrice();
               }
       
       }    
      }
      fTotalProfit= (int)(fTargetRevenue-fRevenue);
       //System.out.println(o1.getName()+ototal+"array"+otarget);
    double sRevenue=0;
     double sTargetRevenue=0;
     int sTotalProfit=0;
       for (Order order : business.getOrderList().getOrderList()) {
           if(order.getCustomer().getMarketName().equals(market.getMarketName())){
               for (OrderItem orderItem : order.getOrderItemList()) {
                   if(orderItem.getMarketOffer().getProduct().getProductId().equals(p2.getProductId()))
                      sRevenue =  sRevenue + order.orderTotal();
           sTargetRevenue = sTargetRevenue +order.orderTotalTargetPrice();
               }
       
       }    
      }
      sTotalProfit= (int)(sTargetRevenue-sRevenue);  //System.out.println(o2.getName()+stotal+"array"+starget);
 
      return (fTotalProfit-sTotalProfit);
   }  
});
         ArrayList<Product> products= new ArrayList<>();
 System.out.println("list sorted"+productList.size()+productList);
   int count=0;
        for (Product product : productList) {
            products.add(product);
            count++;
            if(count==3){
                break;
            }
        }
        System.out.println("last 3"+products.size()+products);
         populateTable(products);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox marketCombo;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
