/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.ProductDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author info
 */
public class ManageProdPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountPanel
     */
    private ProductDirectory accDir;
    private JPanel rightPanel;
    private String name;
    //Product prod = new Product();
    private ArrayList<Product> searchDirectory;
    private ViewPanel viewPanel;

    ManageProdPanel(JPanel rightPanel, ProductDirectory accDir) {
        initComponents();
        this.rightPanel = rightPanel;
        this.accDir = accDir;
        //Populate Table
        populate();
    }

    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel) tblDirectory.getModel();
        dtm.setRowCount(0);
        for (Product a : accDir.getProductDirectory()) {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a;
            row[1] = a.getAvailNum();
            row[2] = a.getPrice();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        lblManage = new javax.swing.JLabel();
        lblSearchAccNo = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        viewProductBackBtn = new javax.swing.JButton();
        backButtonManage = new javax.swing.JButton();
        searchProducts = new javax.swing.JButton();

        setBackground(new java.awt.Color(192, 192, 255));

        tblDirectory.setBackground(new java.awt.Color(255, 237, 218));
        tblDirectory.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod Name ", "Availablity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDirectory.setGridColor(new java.awt.Color(255, 237, 218));
        jScrollPane1.setViewportView(tblDirectory);

        lblManage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblManage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManage.setText("Manage Products");

        lblSearchAccNo.setText("Search by Product Name");

        btnDelete.setText("Delete Product");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        viewProductBackBtn.setText("View Product");
        viewProductBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductBackBtnActionPerformed(evt);
            }
        });

        backButtonManage.setBackground(new java.awt.Color(185, 169, 100));
        backButtonManage.setText("<Back");
        backButtonManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonManageActionPerformed(evt);
            }
        });

        searchProducts.setText("Search");
        searchProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButtonManage, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblManage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewProductBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSearchAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButtonManage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblManage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchAccNo)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProducts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewProductBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(298, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                Product prod = (Product) tblDirectory.getValueAt(selectedRow, 0);
                accDir.deleteProduct(prod);
                populate();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void viewProductBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductBackBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row to View Details!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Product product = (Product) tblDirectory.getValueAt(selectedRow, 0);
            ViewPanel viewPanel = new ViewPanel(rightPanel, accDir, product);
            rightPanel.add("ViewPanel", viewPanel);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);

        }


    }//GEN-LAST:event_viewProductBackBtnActionPerformed

    private void backButtonManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonManageActionPerformed
        // TODO add your handling code here:

        rightPanel.remove(this);
        ProdManagementPanel prodManagementPanel = new ProdManagementPanel(rightPanel, accDir);
        rightPanel.add("ProdManagementPanel", prodManagementPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
//        rightPanel.remove(this);
//        CardLayout layout = (CardLayout) rightPanel.getLayout();
//        layout.previous(rightPanel);

    }//GEN-LAST:event_backButtonManageActionPerformed

    private void searchProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductsActionPerformed
        // TODO add your handling code here:

        String searchTxt = txtsearch.getText();
        if (searchTxt.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Search Text  Field Cannot Be Blank", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            searchTxt = txtsearch.getText();
        }

        searchDirectory = accDir.searchAccount(searchTxt);

        populate();
        if (searchDirectory == null) {
            JOptionPane.showMessageDialog(null, "Product Name You Entered Does Not Exist", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            populateSearch();
        }

    }//GEN-LAST:event_searchProductsActionPerformed
    private void populateSearch() {
        DefaultTableModel dtm = (DefaultTableModel) tblDirectory.getModel();
        dtm.setRowCount(0);
        searchDirectory = accDir.searchAccount(txtsearch.getText());
        //Product a;

        for (Product a : searchDirectory) {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a;
            row[1] = a.getAvailNum();
            row[2] = a.getPrice();
            dtm.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtonManage;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManage;
    private javax.swing.JLabel lblSearchAccNo;
    private javax.swing.JButton searchProducts;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JButton viewProductBackBtn;
    // End of variables declaration//GEN-END:variables
}
