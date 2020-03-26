/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivibhatt
 */
public class ManageDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryManJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    public ManageDeliveryManJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
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
        tblDeliveryMan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDeliveryMan = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        createName = new javax.swing.JTextField();
        createPassword = new javax.swing.JTextField();
        createUserName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        createPhone = new javax.swing.JTextField();

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "phone", "username", "password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDeliveryMan);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Delivery Man");

        jLabel2.setText("username");

        jLabel3.setText("password");

        jLabel4.setText("name");

        btnDeliveryMan.setText("Create");
        btnDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryManActionPerformed(evt);
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

        createUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserNameActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("phone");

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
                            .addComponent(jLabel5))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createUserName)
                            .addComponent(createPassword)
                            .addComponent(createName)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDeliveryMan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(createPhone)))
                    .addComponent(btnBack))
                .addContainerGap(204, Short.MAX_VALUE))
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
                    .addComponent(createPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeliveryMan)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(66, Short.MAX_VALUE))
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

    private void btnDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryManActionPerformed
        // TODO add your handling code here:
          
          if( createUserName.getText().isEmpty()||createPassword.getText().isEmpty()|| createName.getText().isEmpty() ||  createPhone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        
         if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(createUserName.getText())){
            DeliveryMan deliveryMan = new DeliveryMan(createUserName.getText(), createPassword.getText(), createName.getText(),  createPhone.getText());
            ecosystem.getUserAccountDirectory().addUserAccount(deliveryMan);
            ecosystem.getDeliveryManDirectory().addDeliveryMan(deliveryMan);
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");
         }else{
            JOptionPane.showMessageDialog(null, "Username " + createUserName.getText() + " already exists !!!, Please try a new one");
         }
    }//GEN-LAST:event_btnDeliveryManActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
          System.out.println("Shivi Update");

        int selectedRow = tblDeliveryMan.getSelectedRow();
        if (selectedRow >= 0) {
            System.out.println("xyz" + selectedRow);
            System.out.println("Shivi 2");
            DeliveryMan deliveryMan = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
            System.out.println("item : " + deliveryMan);
            deliveryMan.setUsername(createUserName.getText());
            deliveryMan.setPassword(createPassword.getText());
            deliveryMan.setName(createName.getText());
            deliveryMan.setPhone(createPhone.getText());
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                  
        int selectedRow = tblDeliveryMan.getSelectedRow();

        if (selectedRow >= 0) {
            DeliveryMan deliveryMan = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
           DeliveryManDirectory deliveryManDirectory = ecosystem.getDeliveryManDirectory();
            deliveryManDirectory.removeDeliveryMan(deliveryMan);
            JOptionPane.showMessageDialog(null, "Delivert Man  "  + createUserName.getText() + " deleted");
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    private void populateTable() {
        DeliveryManDirectory deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();

        model.setRowCount(0);
        for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManList()) {
                    Object[] row = new Object[4];
                    row[0] = deliveryMan;
                    row[1] = deliveryMan.getPhone();       
                    row[2] = deliveryMan.getUsername();
                    row[3] = deliveryMan.getPassword();
                    model.addRow(row);
                
            }
        
    }
    
      private void initListners() {
       tblDeliveryMan.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblDeliveryMan.getSelectedRow();
             if (selectedRow >= 0) {
                  DeliveryMan  deliveryMan  = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
                 if(deliveryMan!=null){
                     display(deliveryMan);
                 }
             }
        }
    });
    }

    private void display(DeliveryMan deliveryMan) {
        System.out.println("Shivi display");
        createUserName.setText(deliveryMan.getUsername());
        createPassword.setText(deliveryMan.getPassword());
        createName.setText(deliveryMan.getName());
        createPhone.setText(deliveryMan.getPhone());
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeliveryMan;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField createName;
    private javax.swing.JTextField createPassword;
    private javax.swing.JTextField createPhone;
    private javax.swing.JTextField createUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryMan;
    // End of variables declaration//GEN-END:variables
}
