/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LoginController;
import controller.UserTableController;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import models.LoginModel;
import models.ProjectModel;
import models.UserListTableModel;
import services.LoginService;

/**
 *
 * @author niki
 */
public class UsersPanel extends javax.swing.JPanel {
    /**
     * Creates new form UsersPanel
     */
    private JTable usersTable; 
    private UserTableController userTableController; 
    private LoginController loginController;

    public UsersPanel() {
        initComponents();
        userTableController = new UserTableController(this);
        loginController=new LoginController();
        addJTable();  
    }
    public void addJTable() {  
        usersTable = new JTable(userTableController.getTableModel());
	usersTable.getSelectionModel().addListSelectionListener(userTableController);
	JScrollPane scrollpane = new JScrollPane(usersTable);
	tablePanel.setLayout(new BorderLayout());
	tablePanel.add(scrollpane,BorderLayout.SOUTH);		

    }
    public void updateTable() {
   	usersTable.setModel(userTableController.getTableModel());
    }
    public void setUserId(String id){
        userId.setText(id);
    }
    public void setUserName(String name){
        userName.setText(name);
    }
    public void setUserRole(String role){
       userRoleCombo.setSelectedItem(role);
    }
    public void setUserEmail(String email){
        userEmail.setText(email);
    }
    public void setUserPhone(String ph){
        userPhone.setText(ph);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roleCombo = new javax.swing.ButtonGroup();
        name_label = new javax.swing.JLabel();
        user_email_label = new javax.swing.JLabel();
        user_role_label = new javax.swing.JLabel();
        user_phone_label = new javax.swing.JLabel();
        user_id_label = new javax.swing.JLabel();
        userId = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        userEmail = new javax.swing.JTextField();
        userPhone = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        userRoleCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        name_label.setText("USER NAME");

        user_email_label.setText("EMAIL");

        user_role_label.setText("ROLE");

        user_phone_label.setText("PHONE ");

        user_id_label.setText("USER ID");

        userId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIdActionPerformed(evt);
            }
        });

        userPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPhoneActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(255, 255, 255));
        createButton.setForeground(new java.awt.Color(255, 0, 0));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setForeground(new java.awt.Color(255, 0, 0));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setForeground(new java.awt.Color(255, 0, 51));
        deleteButton.setText("Remove");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        userRoleCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Faculty Advisor", "Manager", "Student","Client" }));

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("ADD --> EDIT--> REMOVE USERS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_id_label)
                            .addComponent(name_label)
                            .addComponent(user_phone_label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(user_role_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(user_email_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(createButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(updateButton))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addComponent(deleteButton))
                                    .addComponent(userEmail)
                                    .addComponent(userRoleCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 269, Short.MAX_VALUE)
                                    .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(userId, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(userPhone)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_role_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_phone_label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(createButton))
                .addGap(41, 41, 41)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdActionPerformed

    private void userPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPhoneActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String[] array = new String[usersTable.getColumnCount()];
    	array[0] = userId.getText();
    	array[1] = userName.getText();
    	array[2] = userRoleCombo.getSelectedItem().toString();
    	array[3] = userEmail.getText();
    	array[4] = userPhone.getText();
   	userTableController.updateRow( array);
        ( (UserListTableModel) usersTable.getModel()).fireTableDataChanged();

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String id=userId.getText();
        userTableController.deleteRow(id);
        ( (UserListTableModel) usersTable.getModel()).fireTableDataChanged();           
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
        String[] array = new String[usersTable.getColumnCount()];
    	array[0] = userId.getText();
    	array[1] = userName.getText();
    	array[2] = userRoleCombo.getSelectedItem().toString();
    	array[3] = userEmail.getText();
    	array[4] = userPhone.getText();
   	userTableController.addRow( array);
                
    }//GEN-LAST:event_createButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name_label;
    private javax.swing.ButtonGroup roleCombo;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userEmail;
    private javax.swing.JTextField userId;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField userPhone;
    private javax.swing.JComboBox userRoleCombo;
    private javax.swing.JLabel user_email_label;
    private javax.swing.JLabel user_id_label;
    private javax.swing.JLabel user_phone_label;
    private javax.swing.JLabel user_role_label;
    // End of variables declaration//GEN-END:variables
}
