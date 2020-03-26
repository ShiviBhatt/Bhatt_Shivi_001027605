/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivibhatt
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
   
    public ManageCustomerJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
         populateTable();
     
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
        tblCustomer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        createPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        createName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        createAddress = new javax.swing.JTextField();
        btnCreateCustomer = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        createPhone = new javax.swing.JTextField();

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "address", "phone", "username", "password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customer");

        jLabel2.setText("username");

        createUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserNameActionPerformed(evt);
            }
        });

        jLabel3.setText("password");

        jLabel4.setText("name");

        jLabel5.setText("address");

        btnCreateCustomer.setText("Create");
        btnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCustomerActionPerformed(evt);
            }
        });

        btnModify.setText("modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createUserName)
                            .addComponent(createPassword)
                            .addComponent(createName)
                            .addComponent(createAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(createPhone)))
                    .addComponent(btnBack))
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 254, Short.MAX_VALUE)
                .addComponent(btnCreateCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(384, 384, 384))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(createUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(createPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(createName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(createAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(createPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCustomer)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createUserNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCustomerActionPerformed
        // TODO add your handling code here:
        
          if( createUserName.getText().isEmpty()||createPassword.getText().isEmpty()|| createName.getText().isEmpty() || createAddress.getText().isEmpty() || createPhone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        
         if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(createUserName.getText())){
            Customer customer = new Customer(createUserName.getText(), createPassword.getText(), createName.getText(), createAddress.getText(), createPhone.getText());
            ecosystem.getUserAccountDirectory().addUserAccount(customer);
            ecosystem.getCustomerDirectory().addCustomer(customer);
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createAddress.setText("");
            createPhone.setText("");
         }else{
            JOptionPane.showMessageDialog(null, "Username " + createUserName.getText() + " already exists !!!, Please try a new one");
         }
    }//GEN-LAST:event_btnCreateCustomerActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
              System.out.println("Shivi Update");

        int selectedRow = tblCustomer.getSelectedRow();
        if (selectedRow >= 0) {
            System.out.println("xyz" + selectedRow);
            System.out.println("Shivi 2");
            Customer customer = (Customer) tblCustomer.getValueAt(selectedRow, 0);
            System.out.println("item : " + customer);
            customer.setUsername(createUserName.getText());
            customer.setPassword(createPassword.getText());
            customer.setName(createName.getText());
            customer.setPhone(createPhone.getText());
            customer.setAddress(createAddress.getText());
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");
            createAddress.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         int selectedRow = tblCustomer.getSelectedRow();

        if (selectedRow >= 0) {
            Customer customer = (Customer) tblCustomer.getValueAt(selectedRow, 0);
           CustomerDirectory customerDirectory = ecosystem.getCustomerDirectory();
            customerDirectory.removeCustomer(customer);
            JOptionPane.showMessageDialog(null, "Customer   "  + createUserName.getText() + " deleted");
            populateTable();
            createName.setText("");
            createPhone.setText("");
            createUserName.setText("");
            createPassword.setText("");
            createAddress.setText("");
           
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
     private void populateTable() {
        CustomerDirectory customerDirectory = ecosystem.getCustomerDirectory();
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();

        model.setRowCount(0);
        for (Customer customer : customerDirectory.getCustomerList()) {
                    Object[] row = new Object[5];
                    row[0] = customer;
                    row[1] = customer.getAddress();
                    row[2] = customer.getPhone();
                    row[3] = customer.getUsername();
                    row[4] = customer.getPassword();

                    model.addRow(row);
                
            }
        
    }
       private void initListners() {
       tblCustomer.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblCustomer.getSelectedRow();
             if (selectedRow >= 0) {
                  Customer  customer  = (Customer) tblCustomer.getValueAt(selectedRow, 0);
                 if(customer!=null){
                     display(customer);
                 }
             }
        }
    });
    }
     

    private void display(Customer customer) {
        System.out.println("Shivi display");
        createUserName.setText(customer.getUsername());
        createPassword.setText(customer.getPassword());
        createName.setText(customer.getName());
        createPhone.setText(customer.getPhone());
        createAddress.setText(customer.getAddress());
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCustomer;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField createAddress;
    private javax.swing.JTextField createName;
    private javax.swing.JTextField createPassword;
    private javax.swing.JTextField createPhone;
    private javax.swing.JTextField createUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables
}
