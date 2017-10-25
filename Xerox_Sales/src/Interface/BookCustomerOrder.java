/*
 * BookCustomerOrder.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package Interface;

import Business.Business;
import Business.Customer;
import Business.Market.MarketOffer;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Order.OrderList;
import Business.Person.Person;
import Business.Product.Product;
import Business.Supplier.Supplier;
import Market_ui.UpdateMarketOffer;
//import Business.Product;
//import Business.Supplier;
//import Business.SupplierDirectory;
import UserInterface.SupplierRole.ViewProductDetailJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Rushabh
 */

public class BookCustomerOrder extends javax.swing.JPanel {

    private Business business;
    private JPanel userProcessContainer;
    private Customer customer;
    private Person person;
    private Order order;
    private boolean isCheckedOut = false;
    private double commission=0;
    /** Creates new form BrowseProducts */
    public BookCustomerOrder(JPanel userProcessContainer,Business business, Customer customer, Person person) {
        initComponents();
        this.business= business;
        this.userProcessContainer= userProcessContainer;
        this.customer= customer;
        this.person= person;
        order = new Order();
        if(!isCheckedOut)
        for (Supplier supplier : business.getSupplierDirectory().getSupplierList()) {
            suppComboBox1.addItem(supplier);
        }
    }

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        suppComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewProdjButton2 = new javax.swing.JButton();
        addtoCartButton6 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        btnSearchProduct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        txtSearchKeyWord = new javax.swing.JTextField();
        txtNewQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        amountTxt = new javax.swing.JTextField();
        comTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 511));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Floor Price", "Target Price", "ceil Price", "Avail", "Market Offer Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 750, 100));

        suppComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBox1ActionPerformed(evt);
            }
        });
        add(suppComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Supplier");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Product Catalog");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, -1));

        viewProdjButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewProdjButton2.setText("View Product Detail");
        viewProdjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdjButton2ActionPerformed(evt);
            }
        });
        add(viewProdjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 160, -1));

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });
        add(addtoCartButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 40, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });
        add(btnSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jLabel6.setText("Sales Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));
        add(txtSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 40, -1));

        jLabel7.setText("Item in cart");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 580, 110));

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });
        add(btnModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, -1, -1));

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });
        add(btnRemoveOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));
        add(txtSearchKeyWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 140, 110, -1));
        add(txtNewQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 70, -1));

        jLabel3.setText("Welcome To Please Buy !");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 210, 30));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));
        add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 80, -1));
        add(comTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 90, -1));

        jLabel4.setText("Commission");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, -1));

        jLabel8.setText("Payable Amount");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable()
    {
        Supplier supplier = (Supplier)suppComboBox1.getSelectedItem();
         DefaultTableModel dtm = (DefaultTableModel)productTable.getModel();
        dtm.setRowCount(0);
        Object row[] = new Object[7];
//        for (Supplier supplier1 : business.getSupplierDirectory().getSupplierList()) {
//            if(supplier.equals(supplier1))
//            {
                for (Product product : supplier.getProductCatalog().getProductList()) {
                    for (MarketOffer marketOffer : business.getMarketOfferCatalog().getMarketOfferList()) {
                    if((customer.getMarketName().equalsIgnoreCase(marketOffer.getMarket().getMarketName()))&&(marketOffer.getProduct().getProductId().equals(product.getProductId())) )
                        {  
                     
                    row[0] = product;
                    row[1] = marketOffer.getProduct().getProductId();
                    
                                                  
                    row[2]= marketOffer.getFloorRatio()*marketOffer.getProduct().getPrice();
                    row[3]= marketOffer.getTargetRatio()*marketOffer.getProduct().getPrice();
                    row[4]= marketOffer.getCeilRatio()*marketOffer.getProduct().getPrice();
                     row[5]= marketOffer.getProduct().getAvailability();
                     row[6]= marketOffer;
                    dtm.addRow(row); 
                        

                    }
                    }
                //}
                 
           // }
        }
         
    }
    public void refreshTable(String prodName)
    {
        boolean a=false; 
                DefaultTableModel dtm = (DefaultTableModel)productTable.getModel();
        dtm.setRowCount(0);
        Object row[] = new Object[7];
        for (MarketOffer marketOffer : business.getMarketOfferCatalog().getMarketOfferList()) {
            
            if((marketOffer.getMarket().getMarketName().equals(customer.getMarketName()) && (marketOffer.getProduct().getProductName().equalsIgnoreCase(txtSearchKeyWord.getText()))))
            {
                a=true;
                                     
                    row[0] = marketOffer.getProduct();
                    row[1] = marketOffer.getProduct().getProductId();                     
                    row[2]= marketOffer.getFloorRatio()*marketOffer.getProduct().getPrice();
                    row[3]= marketOffer.getTargetRatio()*marketOffer.getProduct().getPrice();
                    row[4]= marketOffer.getCeilRatio()*marketOffer.getProduct().getPrice();
                     row[5]= marketOffer.getProduct().getAvailability();
                     row[6]= marketOffer;
 
                    dtm.addRow(row); 
            }
        }
        if(!a){
             
                
                    JOptionPane.showMessageDialog(null, "please enter valid product name");
                 return;
        }
        
    }
    private void suppComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBox1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_suppComboBox1ActionPerformed

    private void viewProdjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdjButton2ActionPerformed
        // TODO add your handling code here:
        int selectedrow=productTable.getSelectedRow();
        if(selectedrow>=0)
        {
            
         Product product=(Product)productTable.getValueAt(selectedrow,0);
         
         
        ViewDetailsJPanel  viewDetails= new ViewDetailsJPanel(userProcessContainer, business, product);
        userProcessContainer.add("ViewDetailsJPanel", viewDetails);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
          else
        {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }
    }//GEN-LAST:event_viewProdjButton2ActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:
        try{
         int row = productTable.getSelectedRow();
    
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       Product p = (Product)productTable.getValueAt(row, 0);
        MarketOffer mo = (MarketOffer) productTable.getValueAt(row, 6);

       int fetchQty = (Integer)quantitySpinner.getValue();
        if(fetchQty<=0){
            JOptionPane.showMessageDialog(null, "Quantity cannot be 0");
            return;
            
       }
        
       double salesPrice = Integer.parseInt(txtSalesPrice.getText());
       if((mo.getFloorRatio()*mo.getProduct().getPrice()>salesPrice))
       {
           JOptionPane.showMessageDialog(null, "Price should be more than floor price");
            return;
       }
       if(mo.getCeilRatio()*mo.getProduct().getPrice()<salesPrice)
       {
           JOptionPane.showMessageDialog(null, "Price should be less than ceiling price");
            return; 
       }
        if(fetchQty <= p.getAvailability()){
            
           boolean alreadyPresent = false;
            for(OrderItem oi : order.getOrderItemList()){
                
               if(oi.getMarketOffer().getProduct() == p){
                    
                   int oldAvail = p.getAvailability();
                    int newAvail = oldAvail - fetchQty;
                    p.setAvailability(newAvail);
                    oi.setQuantity(fetchQty+oi.getQuantity());
                    alreadyPresent=true;
                    populateTable();
                    refreshOrderTable();
                    
                    break;
                    
               }
            }
            
            if(!alreadyPresent){
                
             int oldAvail = p.getAvailability();
              int newAvail = oldAvail - fetchQty;
              p.setAvailability(newAvail);
               OrderItem orderItem = order.addOrderItem();
               orderItem.setMarketOffer(mo);
               orderItem.setQuantity(fetchQty);
               orderItem.setPaidPrice(salesPrice);
               populateTable();
               refreshOrderTable();
               
            }
            
           
       }
     else{
                
        JOptionPane.showMessageDialog(null, "Quantity is greater than availability","Warning", JOptionPane.WARNING_MESSAGE);
         return;
         }        
    }catch(NumberFormatException ex){
        
         JOptionPane.showMessageDialog(null, "Invalid Sales Price");
         return;
     }
    }//GEN-LAST:event_addtoCartButton6ActionPerformed
public void refreshOrderTable()
{   DefaultTableModel dtm = (DefaultTableModel)orderTable.getModel();
  dtm.setRowCount(0);
    for (OrderItem orderItem : order.getOrderItemList()) {
                          Object row[] = new Object[4];
//                            row[0]= orderItem.getMarketOffer().getProduct();
                            row[0]=orderItem;
                            row[2]= orderItem.getQuantity();
                            row[1]= orderItem.getPaidPrice();
                            row[3]= orderItem.getQuantity()*orderItem.getPaidPrice();
                             dtm.addRow(row);
                      txtSalesPrice.setText("");
           quantitySpinner.setValue(0);
    }
     amountTxt.setText(String.valueOf(order.orderTotal()));
               commission=((order.orderTotal()-order.orderTotalTargetPrice())*0.03);
          comTxt.setText(Double.toString(commission));
               
}
    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
       if(order.getOrderItemList().size()>0)
       {
           Order orders =business.getOrderList().addOrder();
          //orders=order;
         
            orders.setOrderItemList(order.getOrderItemList());
          orders.setOrderDate(new Date());
          orders.setCustomer(customer);
          orders.setPerson(person);
          orders.setCommission(commission);
          orders.setStatus("Shipping");
          person.getOrderList().add(orders);
          //orders.setOrderId(TOOL_TIP_TEXT_KEY);
          Date dt = new Date();
    Calendar c = Calendar.getInstance(); 
    c.setTime(dt); 
    c.add(Calendar.DATE, 4);
    dt = c.getTime();
    orders.setExpectedDeliveryDate(dt);
          
          //orders.setStatus("In Transit");
          
          JOptionPane.showMessageDialog(null,"order placed successfully");
        
          
          isCheckedOut= true;
          
            order = new Order();
            commission=0;
            refreshOrderTable();
          //populateTable();
       }
       else
       {
           JOptionPane.showMessageDialog(null,"No order placed");
            return;
       }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int selectedrow=orderTable.getSelectedRow();
        if(selectedrow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }
        OrderItem orderItem= (OrderItem)orderTable.getValueAt(selectedrow, 0);
        Product p = orderItem.getMarketOffer().getProduct();
         int fetchQuantity= Integer.parseInt(txtNewQuantity.getText());
         int oldAvail = orderItem.getQuantity();
        
         int currentAvail = p.getAvailability();
         if(fetchQuantity>(currentAvail+oldAvail))
         {
             JOptionPane.showMessageDialog(null,"Quantity is more than availability");
            return;
         }
         else
         {
             if(fetchQuantity<=0)
             {
                 JOptionPane.showMessageDialog(null,"Quantity should be greater than 0");
            return; 
             }
                 //int newAvail= oldAvail-fetchQuantity;
                 orderItem.setQuantity(fetchQuantity);
                 orderItem.getMarketOffer().getProduct().setAvailability(currentAvail+(oldAvail-fetchQuantity));
                 //p.setAvailability(fetchQuantity+orderItem.getQuantity());                
                 refreshOrderTable();
                 populateTable();
         }
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
       String prodName = txtSearchKeyWord.getText();
        refreshTable(prodName);
        
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
       int row = orderTable.getSelectedRow();
    
     if(row<0){
        JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItem oi = (OrderItem)orderTable.getValueAt(row, 0);
        Product p = oi.getMarketOffer().getProduct();
                    int oldQuant = oi.getQuantity();
                    int oldAvail = p.getAvailability();
                    int newAvail = oldAvail + oldQuant;
                    //p.setAvailability(newAvail);
                    oi.getMarketOffer().getProduct().setAvailability(newAvail);
                    order.removeOrderItem(oi);
                    JOptionPane.showMessageDialog(null, "Order Item removed from the cart", "Warning", JOptionPane.WARNING_MESSAGE);
                    refreshOrderTable();
                    populateTable();
                    
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JTextField comTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox suppComboBox1;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearchKeyWord;
    private javax.swing.JButton viewProdjButton2;
    // End of variables declaration//GEN-END:variables
}
