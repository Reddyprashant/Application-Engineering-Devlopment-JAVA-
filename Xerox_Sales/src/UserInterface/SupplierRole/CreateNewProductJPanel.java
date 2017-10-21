/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */
package UserInterface.SupplierRole;

//import Business.Product;
//import Business.Supplier;
//import UserInterface.AdminstrativeRole.ManageSuppliers;
import Business.Product.Product;
import Business.Supplier.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Rushabh
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    Supplier supplier;
    JPanel userProcessContainer;
    
    /** Creates new form CreateProductJPanel */
    public CreateNewProductJPanel(JPanel userProcessContainer, Supplier supplier){
        initComponents();
        this.supplier = supplier;
        this.userProcessContainer = userProcessContainer;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availTxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Product Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 180, 110, 30));

        priceField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceFieldKeyPressed(evt);
            }
        });
        add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 160, 30));

        createButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createButton.setText("Add Product");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 30));

        nameField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 210, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Availablity :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        availTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                availTxtKeyPressed(evt);
            }
        });
        add(availTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 160, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
    // TODO add your handling code here:
            Product product = supplier.getProductCatalog().addProduct();
            product.setProductName(nameField1.getText());
            String stringPrice = priceField.getText();
            
            if(stringPrice.isEmpty()==false) {
                int price = Integer.parseInt(stringPrice);
                product.setPrice(price);
            }
            product.setAvailability(Integer.parseInt(availTxt.getText()));
            JOptionPane.showMessageDialog(null, "Product successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_createButtonActionPerformed
  private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void priceFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldKeyPressed

    private void availTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_availTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_availTxtKeyPressed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availTxt;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
}
