/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author shivibhatt
 */
import Business.Person;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     *
     * @param person
     */
    public ViewJPanel(Person person) {
        initComponents();
        dispalyPerson(person);
    }

    private void dispalyPerson(Person person) {

        //Demographic
        viewFirstName.setText(person.getDemographic().getFirstName());
        viewLastName.setText(person.getDemographic().getLastName());
        viewAge.setText(person.getDemographic().getAge());
        viewDateOfBirth.setText(person.getDemographic().getDateOfBirth());
        viewPhoneNumber.setText(person.getDemographic().getPhoneNumber());
        viewSSN.setText(person.getDemographic().getSSN());
        viewWeight.setText(person.getDemographic().getWeight());
        viewHeight.setText(person.getDemographic().getHeight());

        //Address
        viewStreetLine1.setText(person.getAddress().getStreetLine1());
        viewStreetLine2.setText(person.getAddress().getStreetLine2());
        viewCity.setText(person.getAddress().getCity());
        viewState.setText(person.getAddress().getState());
        viewCountry.setText(person.getAddress().getCountry());
        viewZipCode.setText(person.getAddress().getZipcode());

        //Savings Bank Account
        viewSBankName.setText(person.getSavingBank().getBankName());
        viewSAccount.setText(person.getSavingBank().getAccountNumber());
        viewSRouting.setText(person.getSavingBank().getRouting());
        viewSType.setText(person.getSavingBank().getType());
        viewSBalance.setText(person.getSavingBank().getBalance());

        //Checking Bank Account
        viewCBankName.setText(person.getCheckingBank().getBankName());
        viewCAccount.setText(person.getCheckingBank().getAccountNumber());
        viewCRouting.setText(person.getCheckingBank().getRouting());
        viewCType.setText(person.getCheckingBank().getType());
        viewCBalance.setText(person.getCheckingBank().getBalance());

        //Driver License Info
        viewDrLicNo.setText(person.getDriverLicense().getLicenseNumber());
        viewIssueDate.setText(person.getDriverLicense().getIssueDate());
        viewExpiryDate.setText(person.getDriverLicense().getExpiryDate());
        viewBloodType.setText(person.getDriverLicense().getBloodType());
        //Add picture logic

        JLabel label = new JLabel(ResizeImage(person.getDriverLicense().getImagePath()));
        imageJPanel.add(label);

        //Medical Information
        viewMedicalRecord.setText(person.getMedical().getMedicalRecordNumber());
        viewAllergy1.setText(person.getMedical().getAllergy1());
        viewAllergy2.setText(person.getMedical().getAllergy2());
        viewAllergy3.setText(person.getMedical().getAllergy3());
    }

    public ImageIcon ResizeImage(String ImagePath) {

        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(460, 280, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewMedicalRecord = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        viewAllergy2 = new javax.swing.JTextField();
        viewAllergy1 = new javax.swing.JTextField();
        viewAllergy3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        viewWeight = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        viewHeight = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        viewFirstName = new javax.swing.JLabel();
        viewLastName = new javax.swing.JLabel();
        viewPhoneNumber = new javax.swing.JLabel();
        viewDateOfBirth = new javax.swing.JLabel();
        viewAge = new javax.swing.JLabel();
        viewSSN = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        viewStreetLine1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        viewStreetLine2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        viewCity = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        viewState = new javax.swing.JTextField();
        viewCountry = new javax.swing.JTextField();
        viewZipCode = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        viewSBankName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        viewSType = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        viewSRouting = new javax.swing.JTextField();
        viewSBalance = new javax.swing.JTextField();
        viewSAccount = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        viewCBankName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        viewCType = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        viewCRouting = new javax.swing.JTextField();
        viewCBalance = new javax.swing.JTextField();
        viewCAccount = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        viewDrLicNo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        viewIssueDate = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        viewExpiryDate = new javax.swing.JTextField();
        viewBloodType = new javax.swing.JTextField();
        imageJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(233, 224, 219));

        jPanel1.setBackground(new java.awt.Color(233, 224, 219));
        jPanel1.setSize(new java.awt.Dimension(80, 26));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("VIEW PERSON PROFILE");

        jPanel3.setBackground(new java.awt.Color(233, 224, 219));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Medical Record Information"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Medical Record#");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setText("Allergy 1");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 30));

        jLabel4.setText("Allergy 2");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, -1));

        viewMedicalRecord.setEditable(false);
        jPanel3.add(viewMedicalRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 30));

        jLabel25.setText("Allergy 3");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 80, -1));

        viewAllergy2.setEditable(false);
        jPanel3.add(viewAllergy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 190, 30));

        viewAllergy1.setEditable(false);
        jPanel3.add(viewAllergy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 180, 30));

        viewAllergy3.setEditable(false);
        jPanel3.add(viewAllergy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 180, 30));

        jPanel2.setBackground(new java.awt.Color(233, 224, 219));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Demographic Information"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("First Name");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        viewWeight.setEditable(false);
        jPanel2.add(viewWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 190, 30));

        jLabel30.setText("Date Of Birth");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 56, -1, 20));

        viewHeight.setEditable(false);
        jPanel2.add(viewHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 180, 30));

        jLabel31.setText("Phone#");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, -1));

        jLabel32.setText("Last Name");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel33.setText("Age");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 30, -1));

        jLabel34.setText("SSN");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 86, 80, 20));

        jLabel35.setText("Weight(Lbs)");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel36.setText("Height(cm)");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, 30));

        viewFirstName.setText("Jlabel");
        jPanel2.add(viewFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 180, -1));

        viewLastName.setText("jLabel5");
        jPanel2.add(viewLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 170, -1));

        viewPhoneNumber.setText("jLabel22");
        jPanel2.add(viewPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        viewDateOfBirth.setText("jLabel23");
        jPanel2.add(viewDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 160, -1));

        viewAge.setText("Jlabel2");
        jPanel2.add(viewAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        viewSSN.setText("jLabel39");
        jPanel2.add(viewSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 170, 20));

        jPanel7.setBackground(new java.awt.Color(233, 224, 219));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Address Information"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Street Line 1");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel7.setText("State");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 56, -1, 20));

        jLabel8.setText("City");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));

        viewStreetLine1.setEditable(false);
        jPanel7.add(viewStreetLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 30));

        jLabel9.setText("Street Line 2");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        viewStreetLine2.setEditable(false);
        jPanel7.add(viewStreetLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 180, 30));

        jLabel27.setText("Country");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        viewCity.setEditable(false);
        jPanel7.add(viewCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 190, 30));

        jLabel28.setText("Zip Code");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 86, 80, 20));

        viewState.setEditable(false);
        jPanel7.add(viewState, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 180, 30));

        viewCountry.setEditable(false);
        jPanel7.add(viewCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 190, 30));

        viewZipCode.setEditable(false);
        jPanel7.add(viewZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 180, 30));

        jPanel4.setBackground(new java.awt.Color(233, 224, 219));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Savings Account Information"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Bank Name");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel11.setText("Balance");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 56, -1, 20));

        jLabel12.setText("Routing#");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));

        viewSBankName.setEditable(false);
        jPanel4.add(viewSBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 30));

        jLabel13.setText(" Type");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        viewSType.setEditable(false);
        viewSType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSTypeActionPerformed(evt);
            }
        });
        jPanel4.add(viewSType, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 180, 30));

        jLabel26.setText("Account#");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        viewSRouting.setEditable(false);
        jPanel4.add(viewSRouting, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 190, 30));

        viewSBalance.setEditable(false);
        jPanel4.add(viewSBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 180, 30));

        viewSAccount.setEditable(false);
        jPanel4.add(viewSAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 190, 30));

        jPanel5.setBackground(new java.awt.Color(233, 224, 219));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Checking Account Information"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Bank Name");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel15.setText("Balance");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 56, -1, 20));

        jLabel16.setText("Routing#");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));

        viewCBankName.setEditable(false);
        jPanel5.add(viewCBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 30));

        jLabel17.setText(" Type");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        viewCType.setEditable(false);
        viewCType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCTypeActionPerformed(evt);
            }
        });
        jPanel5.add(viewCType, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 180, 30));

        jLabel37.setText("Account#");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        viewCRouting.setEditable(false);
        jPanel5.add(viewCRouting, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 190, 30));

        viewCBalance.setEditable(false);
        jPanel5.add(viewCBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 180, 30));

        viewCAccount.setEditable(false);
        jPanel5.add(viewCAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 190, 30));

        jPanel6.setBackground(new java.awt.Color(233, 224, 219));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Driver's License Information"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("License Number");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel19.setText("Blood Type");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 56, -1, 20));

        jLabel20.setText("Expiry Date");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));

        viewDrLicNo.setEditable(false);
        jPanel6.add(viewDrLicNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 30));

        jLabel21.setText("Issue Date");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        viewIssueDate.setEditable(false);
        jPanel6.add(viewIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 180, 30));

        jLabel38.setText("Picture");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, -1));

        viewExpiryDate.setEditable(false);
        jPanel6.add(viewExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 190, 30));

        viewBloodType.setEditable(false);
        jPanel6.add(viewBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 180, 30));

        imageJPanel.setLayout(new java.awt.BorderLayout());
        jPanel6.add(imageJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 460, 280));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewSTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewSTypeActionPerformed

    private void viewCTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel imageJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel viewAge;
    private javax.swing.JTextField viewAllergy1;
    private javax.swing.JTextField viewAllergy2;
    private javax.swing.JTextField viewAllergy3;
    private javax.swing.JTextField viewBloodType;
    private javax.swing.JTextField viewCAccount;
    private javax.swing.JTextField viewCBalance;
    private javax.swing.JTextField viewCBankName;
    private javax.swing.JTextField viewCRouting;
    private javax.swing.JTextField viewCType;
    private javax.swing.JTextField viewCity;
    private javax.swing.JTextField viewCountry;
    private javax.swing.JLabel viewDateOfBirth;
    private javax.swing.JTextField viewDrLicNo;
    private javax.swing.JTextField viewExpiryDate;
    private javax.swing.JLabel viewFirstName;
    private javax.swing.JTextField viewHeight;
    private javax.swing.JTextField viewIssueDate;
    private javax.swing.JLabel viewLastName;
    private javax.swing.JTextField viewMedicalRecord;
    private javax.swing.JLabel viewPhoneNumber;
    private javax.swing.JTextField viewSAccount;
    private javax.swing.JTextField viewSBalance;
    private javax.swing.JTextField viewSBankName;
    private javax.swing.JTextField viewSRouting;
    private javax.swing.JLabel viewSSN;
    private javax.swing.JTextField viewSType;
    private javax.swing.JTextField viewState;
    private javax.swing.JTextField viewStreetLine1;
    private javax.swing.JTextField viewStreetLine2;
    private javax.swing.JTextField viewWeight;
    private javax.swing.JTextField viewZipCode;
    // End of variables declaration//GEN-END:variables
}
