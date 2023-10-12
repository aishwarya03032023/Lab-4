/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.lab4_javaswing;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.*;
import java.awt.Color;

//import com.mycompany.lab4_javaswing.detailsPanel;
/**
 *
 * @author Admin
 */
public class formPanel extends javax.swing.JPanel {
    private javax.swing.JLabel firstNameValidationLabel = new javax.swing.JLabel();

    /**
     * Creates new form formPanel
     */
    final JPanel bottomPanel;
    
    public formPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderOptions = new javax.swing.ButtonGroup();
        firstNameValidationLabel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        UploadPhoto = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageText = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        uploadFile = new javax.swing.JButton();
        maleSelect = new javax.swing.JRadioButton();
        femaleSelect = new javax.swing.JRadioButton();
        otherSelect = new javax.swing.JRadioButton();
        Message1 = new javax.swing.JLabel();
        ageText = new javax.swing.JSpinner();
        howDidYouKnowAboutUs = new javax.swing.JLabel();
        typeSelect = new javax.swing.JComboBox<>();
        previewImage = new javax.swing.JLabel();
        age1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(200, 500));

        firstNameValidationLabel.setBackground(new java.awt.Color(204, 255, 204));
        firstNameValidationLabel.setMinimumSize(new java.awt.Dimension(500, 500));
        firstNameValidationLabel.setPreferredSize(new java.awt.Dimension(100, 629));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Stencil", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("PATIENT Registration Form");

        FirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FirstName.setText("First Name");

        LastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LastName.setText("Last Name");

        Age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Age.setText("Age");

        Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Email.setText("Email");

        Message.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Message.setText("Message");

        UploadPhoto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UploadPhoto.setText("Upload Photo (optional)");

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        messageText.setColumns(20);
        messageText.setLineWrap(true);
        messageText.setRows(5);
        messageText.setCaretColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(messageText);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        uploadFile.setBackground(new java.awt.Color(0, 204, 204));
        uploadFile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uploadFile.setForeground(new java.awt.Color(255, 255, 255));
        uploadFile.setText("Choose a file...");
        uploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadFileActionPerformed(evt);
            }
        });

        genderOptions.add(maleSelect);
        maleSelect.setText("Male");
        maleSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleSelectActionPerformed(evt);
            }
        });

        genderOptions.add(femaleSelect);
        femaleSelect.setText("Female");
        femaleSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleSelectActionPerformed(evt);
            }
        });

        genderOptions.add(otherSelect);
        otherSelect.setSelected(true);
        otherSelect.setText("Other");
        otherSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherSelectActionPerformed(evt);
            }
        });

        Message1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Message1.setText("Gender");

        ageText.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        ageText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextKeyPressed(evt);
            }
        });

        howDidYouKnowAboutUs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        howDidYouKnowAboutUs.setText("Patient Type");

        typeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one...", "Type 1", "Type 2" }));

        previewImage.setBackground(new java.awt.Color(204, 255, 204));
        previewImage.setMaximumSize(new java.awt.Dimension(150, 150));
        previewImage.setMinimumSize(new java.awt.Dimension(150, 150));
        previewImage.setOpaque(true);
        previewImage.setPreferredSize(new java.awt.Dimension(150, 150));

        age1.setText("age1");

        javax.swing.GroupLayout firstNameValidationLabelLayout = new javax.swing.GroupLayout(firstNameValidationLabel);
        firstNameValidationLabel.setLayout(firstNameValidationLabelLayout);
        firstNameValidationLabelLayout.setHorizontalGroup(
            firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18))
                        .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                                    .addComponent(femaleSelect)
                                    .addGap(36, 36, 36)
                                    .addComponent(maleSelect)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(otherSelect))
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstNameValidationLabelLayout.createSequentialGroup()
                                    .addComponent(typeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))))
                        .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                        .addGap(0, 378, Short.MAX_VALUE)
                        .addComponent(previewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                        .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Age)
                            .addComponent(Email)
                            .addComponent(Message)
                            .addComponent(Message1)
                            .addComponent(howDidYouKnowAboutUs)
                            .addComponent(FirstName)
                            .addComponent(UploadPhoto))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                        .addComponent(LastName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstNameValidationLabelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        firstNameValidationLabelLayout.setVerticalGroup(
            firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, firstNameValidationLabelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LastName))
                    .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstNameValidationLabelLayout.createSequentialGroup()
                        .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age)
                            .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Email))
                    .addComponent(emailText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Message1)
                    .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maleSelect)
                        .addComponent(femaleSelect)
                        .addComponent(otherSelect)))
                .addGap(18, 18, 18)
                .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(howDidYouKnowAboutUs)
                    .addComponent(typeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                        .addComponent(Message)
                        .addGap(40, 40, 40))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstNameValidationLabelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(firstNameValidationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uploadFile)
                            .addComponent(UploadPhoto)))
                    .addComponent(previewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(firstNameValidationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(firstNameValidationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 24, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed
    
    private void validateAllField(){
        String firstName = firstNameText.getText();
        String lastName = lastNameText.getText();
        int age = (int)ageText.getValue();
        String email = emailText.getText();
        String message = messageText.getText();
        String gender = genderOptions.getSelection().getActionCommand();
        // String type = typeSelect.getSelectedItem().toString();
        
        
        if(firstName.length()<1 || firstName.length()>26 || !firstName.matches("^[a-zA-Z]+")){
                //JOptionPane.showMessageDialog(null, "Please enter a First Name with: \n1. Length between 1 and 20 characters. \n2. Chararcters from A...Z or a..z.\n3. No special characters. ", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                firstNameValidationLabel.setText("Invalid First Name");
        }
        else{
           
                if(lastName.length()<1 || lastName.length()>26){
                    JOptionPane.showMessageDialog(null, "Please enter a First Name with: \n1. Length between 1 and 20 characters. \n2. Chararcters from A...Z or a..z. \n3. No special characters. ", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(!lastName.matches("^[a-zA-Z]+")){
                            JOptionPane.showMessageDialog(null, "Please enter a Last Name with chararcters from A...Z or a..z.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }else{
                         if(age<12 || age>101){
                                JOptionPane.showMessageDialog(null, "Please enter age between 12 and 100 (both inclusive).", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                           }
                           else{
                                if(!email.matches("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
                                    JOptionPane.showMessageDialog(null, "Please enter valid email address.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                       
                                }
                                else{
                                    if(!maleSelect.isSelected() && !femaleSelect.isSelected() && !otherSelect.isSelected()){
                                        JOptionPane.showMessageDialog(null, "Please select any one of the Gender options!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                                        
                                    }
                                    else{
                                        if(maleSelect.isSelected()){
                                            gender="Male";
                                        }
                                        if(femaleSelect.isSelected()){
                                            gender="Female";
                                        }
                                        if(otherSelect.isSelected()){
                                            gender="Other";
                                        }
                                        if (typeSelect.getSelectedIndex() == -1) {
                                            JOptionPane.showMessageDialog(null, "Please select any one of the Gender options!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                                    
                                        }
                                        else{
                                            if(message.length()<1){
                                                JOptionPane.showMessageDialog(null, "Please enter a message for our team!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                                            }else{
                                                JOptionPane.showMessageDialog(null, "Your information has been successfully recorded. Below are the details that are submitted.\nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age+"\nGender: "+gender+"\nHow did you find out about us?: "+typeSelect.getSelectedItem()+"\nMessage: "+message, "Registration Successful!!!", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                             }
                                        
                                        
                                    }
                                }
                                
                            }
                            
                    }
                }
          
        }     
        
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        validateAllField();
        User newUser = new User();
        detailsPanel newDetailsPanel= new detailsPanel(newUser);
        bottomPanel.add(newDetailsPanel, "details");
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.show(bottomPanel, "details");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadFileActionPerformed
        // TODO add your handling code here:
       /* JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            if (selectedFile.getName().endsWith(".jpg") || selectedFile.getName().endsWith(".png")) {
                ImageIcon imageIcon = new ImageIcon(selectedFile.getPath());
                Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                previewImage.setIcon(new ImageIcon(image));
            } else {
                JOptionPane.showMessageDialog(null, "Please select a image! ", "Invalid Input", JOptionPane.ERROR_MESSAGE);

            }
        }*/

    }//GEN-LAST:event_uploadFileActionPerformed

    private void maleSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleSelectActionPerformed

    private void femaleSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleSelectActionPerformed

    private void otherSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherSelectActionPerformed

    private void ageTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextKeyPressed
        // TODO add your handling code here:
        try{
            //for textfield age
            int ageT = Integer.parseInt(age1.getText());
            age1.setForeground(Color.black);
          // int age1 = (int)ageText.getValue();
        }
        catch(Exception e){
            age1.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_ageTextKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel Message;
    private javax.swing.JLabel Message1;
    private javax.swing.JLabel UploadPhoto;
    private javax.swing.JTextField age1;
    private javax.swing.JSpinner ageText;
    private javax.swing.JTextField emailText;
    private javax.swing.JRadioButton femaleSelect;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JPanel firstNameValidationLabel;
    private javax.swing.ButtonGroup genderOptions;
    private javax.swing.JLabel howDidYouKnowAboutUs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JRadioButton maleSelect;
    private javax.swing.JTextArea messageText;
    private javax.swing.JRadioButton otherSelect;
    private javax.swing.JLabel previewImage;
    private javax.swing.JComboBox<String> typeSelect;
    private javax.swing.JButton uploadFile;
    // End of variables declaration//GEN-END:variables
}