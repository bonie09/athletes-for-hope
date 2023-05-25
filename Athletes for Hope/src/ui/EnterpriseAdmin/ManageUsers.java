/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EnterpriseAdmin;

import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Role.Role;
import business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishank
 */
public class ManageUsers extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsers
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    public ManageUsers(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        
        popOrganizationComboBox();
        //employeeJComboBox.removeAllItems();
        popData();
        this.setSize(1080, 680);
    }
 public void popOrganizationComboBox() {
        comboOrgSel.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            comboOrgSel.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        comboEmployeeSel.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            comboEmployeeSel.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        comboRoleSel.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            comboRoleSel.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) tableUsers.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccntList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tableUsers.getModel()).addRow(row);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        comboOrgSel = new javax.swing.JComboBox();
        comboEmployeeSel = new javax.swing.JComboBox();
        comboRoleSel = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JPasswordField();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1300, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 126, 34));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage User");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 650, 39));

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Select Organization:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Select Employee:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 160, -1));

        jLabel4.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Select Role:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 160, -1));

        jLabel5.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Set Username:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 160, -1));
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 140, -1));

        jLabel6.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Set Password:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, -1));

        btnCreate.setBackground(new java.awt.Color(255, 146, 1));
        btnCreate.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.setBorderPainted(false);
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateMouseExited(evt);
            }
        });
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        comboOrgSel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboOrgSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrgSelActionPerformed(evt);
            }
        });
        jPanel2.add(comboOrgSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 140, 26));

        comboEmployeeSel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboEmployeeSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 140, 26));

        comboRoleSel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboRoleSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 140, -1));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 140, -1));

        btnDelete.setBackground(new java.awt.Color(255, 146, 1));
        btnDelete.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 100, -1));

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableUsers);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 240, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 14, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 238, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseExited
        //  jButton1.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateMouseExited

    private void btnCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseEntered
        //  jButton1.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateMouseEntered

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        if( txtUserName.getText().isEmpty()|| String.valueOf(txtPassword.getPassword()).isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        String userName = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());
        Organization organization = (Organization) comboOrgSel.getSelectedItem();
        Employee employee = (Employee) comboEmployeeSel.getSelectedItem();
        Role role = (Role) comboRoleSel.getSelectedItem();
        if(organization.getUserAccountDirectory().CheckIsValidInput(password)){
            UserAccount userAccount=organization.getUserAccountDirectory().createUserAccnt(userName, password, employee, role);
        }
        else{
            JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
            txtPassword.setText("");
            return;
        }
        //organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

        popData();
        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void comboOrgSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrgSelActionPerformed
        Organization organization = (Organization) comboOrgSel.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_comboOrgSelActionPerformed

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableUsers.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            UserAccount u = (UserAccount) tableUsers.getValueAt(selectedRow, 0);

            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : organization.getUserAccountDirectory().getUserAccntList()) {
                    if (u==ua){
                        organization.getUserAccountDirectory().getUserAccntList().remove(u);
                        break;
                    }

                }
                JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
                popData();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboEmployeeSel;
    private javax.swing.JComboBox comboOrgSel;
    private javax.swing.JComboBox comboRoleSel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsers;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}