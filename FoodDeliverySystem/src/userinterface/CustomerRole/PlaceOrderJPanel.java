/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Organization;
import Business.Restaurant.Item;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.Utils.ButtonColumn;
import Business.Utils.TableButtonListener;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author raunak
 */
public class PlaceOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Customer customer;
    private DefaultTableModel dtm;
    private int index = -1;
    private int row = 0;
    private int column = 0;

    private EcoSystem ecosystem;
    private RestaurantDirectory resturantDirectory;
 
    /**
     * Creates new form RequestLabTestJPanel
     */
    public PlaceOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        customer = (Customer) account;
        resturantDirectory = ecosystem.getRestaurantDirectory();
        dtm = (DefaultTableModel) tblOrder.getModel();
        populateRestaurantsList(resturantDirectory.getRestaurantList());
        if(resturantDirectory.getRestaurantList().size() > 0){
            index = 0;
            populateMenu();
        }
       
    }

    public boolean isItemSelected(Item item) {
        int nRow = tblOrder.getRowCount();
        int count1 = 0;
        boolean s = true;

        for (int i = 0; i < nRow; i++) {
            if (null != tblOrder.getValueAt(i, 2)) {
                if ((Boolean) tblOrder.getValueAt(i, 2) == false) {
                    count1++;
                }
            }
        }
        if (count1 == nRow) {
            s = false;
            JOptionPane.showMessageDialog(null, "Please select an item");
        }
        return s;
    }

    public void populateRestaurantsList(ArrayList<Restaurant> restaurantList) {
        for (Restaurant restaurant : restaurantList) {
            restaurantComboBox.addItem(restaurant.getName());
        }
    }
    private void populateMenu(){
        dtm.setRowCount(0);
        TableCellRenderer buttonRenderer = new ButtonColumn("Add to Cart");
        tblOrder.getColumn("Item Selection").setCellRenderer(buttonRenderer);
//        ButtonColumn button = new ButtonColumn("Add to Cart");
            TableButtonListener buttonClicked = new ButtonColumn("Add to Cart");
            buttonClicked.tableButtonClicked(row, column); // need to get column n row index
        Restaurant restaurant = resturantDirectory.getRestaurantList().get(index);
        Menu menu = restaurant.getMenu();
        List<Item> items = menu.getItemList();
        for (Item item : items) {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = item;
                row[1] = item.getPrice();
                row[2] = item.isItemSelection();
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

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        restaurantComboBox = new javax.swing.JComboBox<>();
        enterpriseLabel1 = new javax.swing.JLabel();
        tblCart = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, -1));
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 89, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 790, -1));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Item Price", "Item Selection"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 660, 130));

        restaurantComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantComboBoxActionPerformed(evt);
            }
        });
        add(restaurantComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 190, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        enterpriseLabel1.setText("Select Restaurant");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Qty", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart.setViewportView(jTable1);

        add(tblCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 660, 190));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CART");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 650, -1));

        jLabel4.setText("Total");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });
        add(totalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void restaurantComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantComboBoxActionPerformed
       index = restaurantComboBox.getSelectedIndex();
       populateMenu();
       
    }//GEN-LAST:event_restaurantComboBoxActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> restaurantComboBox;
    private javax.swing.JScrollPane tblCart;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField totalPrice;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
