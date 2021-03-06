/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Shivi
 */
public class RestaurantAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    public RestaurantAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        //this.set
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.userAccount = userAccount;
        manageOrders();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        manageOrdersButtonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        manageOrdersButtonLabel = new javax.swing.JLabel();
        manageMenuButtonPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageMenuButtonLabel = new javax.swing.JLabel();
        manageInfoButtonPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        manageInfoButtonLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(31, 50, 97));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(240, 178, 62));

        jPanel1.setBackground(new java.awt.Color(31, 50, 97));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrdersButtonPanel.setBackground(new java.awt.Color(31, 50, 97));
        manageOrdersButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrdersButtonPanelMousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N

        manageOrdersButtonLabel.setForeground(new java.awt.Color(240, 178, 62));
        manageOrdersButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageOrdersButtonLabel.setText("Manage Orders");
        manageOrdersButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrdersButtonLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrdersButtonPanelLayout = new javax.swing.GroupLayout(manageOrdersButtonPanel);
        manageOrdersButtonPanel.setLayout(manageOrdersButtonPanelLayout);
        manageOrdersButtonPanelLayout.setHorizontalGroup(
            manageOrdersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageOrdersButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manageOrdersButtonPanelLayout.setVerticalGroup(
            manageOrdersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageOrdersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageOrdersButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(manageOrdersButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        manageMenuButtonPanel.setBackground(new java.awt.Color(31, 50, 97));
        manageMenuButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        manageMenuButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageMenuButtonPanelMousePressed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cooking.png"))); // NOI18N

        manageMenuButtonLabel.setForeground(new java.awt.Color(240, 178, 62));
        manageMenuButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageMenuButtonLabel.setText("Manage Menu");
        manageMenuButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageMenuButtonLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageMenuButtonPanelLayout = new javax.swing.GroupLayout(manageMenuButtonPanel);
        manageMenuButtonPanel.setLayout(manageMenuButtonPanelLayout);
        manageMenuButtonPanelLayout.setHorizontalGroup(
            manageMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMenuButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageMenuButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageMenuButtonPanelLayout.setVerticalGroup(
            manageMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMenuButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(manageMenuButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(manageMenuButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 280, 50));

        manageInfoButtonPanel.setBackground(new java.awt.Color(31, 50, 97));
        manageInfoButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageInfoButtonPanelMousePressed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delivery (3).png"))); // NOI18N

        manageInfoButtonLabel.setForeground(new java.awt.Color(240, 178, 62));
        manageInfoButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageInfoButtonLabel.setText("Manage Info");

        javax.swing.GroupLayout manageInfoButtonPanelLayout = new javax.swing.GroupLayout(manageInfoButtonPanel);
        manageInfoButtonPanel.setLayout(manageInfoButtonPanelLayout);
        manageInfoButtonPanelLayout.setHorizontalGroup(
            manageInfoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageInfoButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageInfoButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        manageInfoButtonPanelLayout.setVerticalGroup(
            manageInfoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageInfoButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageInfoButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(manageInfoButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 280, 50));

        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(940, 808));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrdersButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrdersButtonLabelMousePressed
        manageOrders();
    }//GEN-LAST:event_manageOrdersButtonLabelMousePressed

    private void manageOrders() {
        // TODO add your handling code here:
        manageOrdersButtonPanel.setBackground(new Color(56,90,174));
        manageMenuButtonPanel.setBackground(new Color(31,50,97));
        manageInfoButtonPanel.setBackground(new Color(31,50,97));
        ManageOrderJPanel manageOrderJPanel = new ManageOrderJPanel(rightSystemAdminPanel,ecosystem,userAccount);
        rightSystemAdminPanel.add("ManageOrderJPanel",manageOrderJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageOrdersButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrdersButtonPanelMousePressed
        // TODO add your handling code here:
        manageOrders();
    }//GEN-LAST:event_manageOrdersButtonPanelMousePressed

    private void manageMenuButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMenuButtonLabelMousePressed
        manageMenu();
    }//GEN-LAST:event_manageMenuButtonLabelMousePressed

    private void manageMenu() {
        // TODO add your handling code here:
        manageMenuButtonPanel.setBackground(new Color(56,90,174));
        manageOrdersButtonPanel.setBackground(new Color(31,50,97));
        manageInfoButtonPanel.setBackground(new Color(31,50,97));
        ManageMenuJPanel manageMenuJPanel = new ManageMenuJPanel(rightSystemAdminPanel,userAccount,ecosystem);
        rightSystemAdminPanel.add("ManageMenuJPanel",manageMenuJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageMenuButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMenuButtonPanelMousePressed
        // TODO add your handling code here:
        manageMenu();
    }//GEN-LAST:event_manageMenuButtonPanelMousePressed

    private void manageInfoButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageInfoButtonPanelMousePressed
        manageInfo();
    }//GEN-LAST:event_manageInfoButtonPanelMousePressed

    private void manageInfo() {
        // TODO add your handling code here:
        manageInfoButtonPanel.setBackground(new Color(56,90,174));
        manageOrdersButtonPanel.setBackground(new Color(31,50,97));
        manageMenuButtonPanel.setBackground(new Color(31,50,97));
        ManageRestaurantInformationJPanel manageRestaurantInformationJPanel = new ManageRestaurantInformationJPanel(rightSystemAdminPanel,ecosystem, userAccount);
        rightSystemAdminPanel.add("ManageRestaurantInformationJPanel",manageRestaurantInformationJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel manageInfoButtonLabel;
    private javax.swing.JPanel manageInfoButtonPanel;
    private javax.swing.JLabel manageMenuButtonLabel;
    private javax.swing.JPanel manageMenuButtonPanel;
    private javax.swing.JLabel manageOrdersButtonLabel;
    private javax.swing.JPanel manageOrdersButtonPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
