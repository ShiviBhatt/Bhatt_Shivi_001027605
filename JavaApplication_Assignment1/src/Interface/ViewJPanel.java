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
        jPanel2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
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
        viewWeight = new javax.swing.JLabel();
        viewHeight = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        viewStreetLine1 = new javax.swing.JLabel();
        viewStreetLine2 = new javax.swing.JLabel();
        viewCity = new javax.swing.JLabel();
        viewState = new javax.swing.JLabel();
        viewCountry = new javax.swing.JLabel();
        viewZipCode = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        viewCBankName = new javax.swing.JLabel();
        viewCType = new javax.swing.JLabel();
        viewCRouting = new javax.swing.JLabel();
        viewCBalance = new javax.swing.JLabel();
        viewCAccount = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        viewSBankName = new javax.swing.JLabel();
        viewSType = new javax.swing.JLabel();
        viewSRouting = new javax.swing.JLabel();
        viewSBalance = new javax.swing.JLabel();
        viewSAccount = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        imageJPanel = new javax.swing.JPanel();
        viewDrLicNo = new javax.swing.JLabel();
        viewIssueDate = new javax.swing.JLabel();
        viewBloodType = new javax.swing.JLabel();
        viewExpiryDate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        viewMedicalRecord = new javax.swing.JLabel();
        viewAllergy1 = new javax.swing.JLabel();
        viewAllergy3 = new javax.swing.JLabel();
        viewAllergy2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 224, 219));

        jPanel1.setBackground(new java.awt.Color(233, 224, 219));
        jPanel1.setSize(new java.awt.Dimension(80, 26));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("VIEW PERSON PROFILE");

        jPanel2.setBackground(new java.awt.Color(233, 224, 219));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Demographic Information"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("First Name");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 25));

        jLabel30.setText("Date Of Birth");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 25));

        jLabel31.setText("Phone#");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 25));

        jLabel32.setText("Last Name");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, 25));

        jLabel33.setText("Age");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 25));

        jLabel34.setText("SSN");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 25));

        jLabel35.setText("Weight(Lbs)");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 25));

        jLabel36.setText("Height(cm)");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 25));
        jPanel2.add(viewFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 830, 25));
        jPanel2.add(viewLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 830, 25));
        jPanel2.add(viewPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 830, 25));
        jPanel2.add(viewDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 830, 25));
        jPanel2.add(viewAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 830, 25));
        jPanel2.add(viewSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 830, 25));
        jPanel2.add(viewWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 830, 25));
        viewWeight.getAccessibleContext().setAccessibleDescription("");

        jPanel2.add(viewHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 830, 25));

        jPanel7.setBackground(new java.awt.Color(233, 224, 219));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Address Information"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Street Line 1");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 25));

        jLabel7.setText("State");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 25));

        jLabel8.setText("City");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 25));

        jLabel9.setText("Street Line 2");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, 25));

        jLabel27.setText("Country");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 25));

        jLabel28.setText("Zip Code");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 25));
        jPanel7.add(viewStreetLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 830, 25));
        jPanel7.add(viewStreetLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 830, 25));
        jPanel7.add(viewCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 830, 25));
        jPanel7.add(viewState, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 830, 25));
        jPanel7.add(viewCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 830, 25));
        jPanel7.add(viewZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 830, 25));

        jPanel8.setBackground(new java.awt.Color(233, 224, 219));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Bank Information"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(233, 224, 219));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Bank Name");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 25));

        jLabel15.setText("Balance");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 25));

        jLabel16.setText("Routing#");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 25));

        jLabel17.setText(" Type");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 25));

        jLabel37.setText("Account#");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 25));
        jPanel5.add(viewCBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 830, 25));
        jPanel5.add(viewCType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 830, 25));
        jPanel5.add(viewCRouting, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 830, 25));
        jPanel5.add(viewCBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 830, 25));
        jPanel5.add(viewCAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 830, 25));

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1010, 220));

        jPanel4.setBackground(new java.awt.Color(233, 224, 219));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Bank Name");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 25));

        jLabel11.setText("Balance");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 25));

        jLabel12.setText("Routing#");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 25));

        jLabel13.setText(" Type");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 25));

        jLabel26.setText("Account#");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 25));
        jPanel4.add(viewSBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 830, 25));
        jPanel4.add(viewSType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 830, 25));
        jPanel4.add(viewSRouting, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 830, 25));
        jPanel4.add(viewSBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 830, 25));
        jPanel4.add(viewSAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 830, 25));

        jPanel8.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1010, 220));

        jPanel6.setBackground(new java.awt.Color(233, 224, 219));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Driver's License Information"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("License Number");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 25));

        jLabel19.setText("Blood Type");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 25));

        jLabel20.setText("Expiry Date");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, 25));

        jLabel21.setText("Issue Date");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 25));

        jLabel38.setText("Picture");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 25));

        imageJPanel.setBackground(new java.awt.Color(233, 224, 219));
        imageJPanel.setLayout(new java.awt.BorderLayout());
        jPanel6.add(imageJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 460, 280));
        jPanel6.add(viewDrLicNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 830, 25));
        jPanel6.add(viewIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 80, 25));
        jPanel6.add(viewBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 830, 25));
        jPanel6.add(viewExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 830, 25));

        jPanel3.setBackground(new java.awt.Color(233, 224, 219));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Medical Record Information"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Medical Record#");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 25));

        jLabel3.setText("Allergy 1");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, 25));

        jLabel4.setText("Allergy 2");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 25));

        jLabel25.setText("Allergy 3");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 25));
        jPanel3.add(viewMedicalRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 830, 25));
        jPanel3.add(viewAllergy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 830, 25));

        viewAllergy3.setText("jLabel22");
        jPanel3.add(viewAllergy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 830, 25));
        jPanel3.add(viewAllergy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 830, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel viewAge;
    private javax.swing.JLabel viewAllergy1;
    private javax.swing.JLabel viewAllergy2;
    private javax.swing.JLabel viewAllergy3;
    private javax.swing.JLabel viewBloodType;
    private javax.swing.JLabel viewCAccount;
    private javax.swing.JLabel viewCBalance;
    private javax.swing.JLabel viewCBankName;
    private javax.swing.JLabel viewCRouting;
    private javax.swing.JLabel viewCType;
    private javax.swing.JLabel viewCity;
    private javax.swing.JLabel viewCountry;
    private javax.swing.JLabel viewDateOfBirth;
    private javax.swing.JLabel viewDrLicNo;
    private javax.swing.JLabel viewExpiryDate;
    private javax.swing.JLabel viewFirstName;
    private javax.swing.JLabel viewHeight;
    private javax.swing.JLabel viewIssueDate;
    private javax.swing.JLabel viewLastName;
    private javax.swing.JLabel viewMedicalRecord;
    private javax.swing.JLabel viewPhoneNumber;
    private javax.swing.JLabel viewSAccount;
    private javax.swing.JLabel viewSBalance;
    private javax.swing.JLabel viewSBankName;
    private javax.swing.JLabel viewSRouting;
    private javax.swing.JLabel viewSSN;
    private javax.swing.JLabel viewSType;
    private javax.swing.JLabel viewState;
    private javax.swing.JLabel viewStreetLine1;
    private javax.swing.JLabel viewStreetLine2;
    private javax.swing.JLabel viewWeight;
    private javax.swing.JLabel viewZipCode;
    // End of variables declaration//GEN-END:variables
}
