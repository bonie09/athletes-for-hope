/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EnterpriseAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import java.awt.Color;
import javax.swing.JPanel;
/**
 *
 * @author nishank
 */
public class EnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseAdminJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    public EnterpriseAdminJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setDividerLocation(120);
        txtFieldEnterpriseName.setText(enterprise.getEnterpriseType().getValue());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnManageOrg = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageEmployeeAccess = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFieldEnterpriseName = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1300, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 969, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 974, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel4);

        jPanel3.setBackground(new java.awt.Color(1, 81, 92));
        jPanel3.setForeground(new java.awt.Color(255, 146, 1));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 146, 1));
        jLabel1.setText("Welcome Enterprise Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 198, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        btnManageOrg.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnManageOrg.setForeground(new java.awt.Color(255, 146, 1));
        btnManageOrg.setText("Manage Organization(s)");
        btnManageOrg.setBorderPainted(false);
        btnManageOrg.setContentAreaFilled(false);
        btnManageOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageOrgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageOrgMouseExited(evt);
            }
        });
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 84, 0, 0);
        jPanel3.add(btnManageOrg, gridBagConstraints);

        btnManageEmployee.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnManageEmployee.setForeground(new java.awt.Color(255, 146, 1));
        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.setBorderPainted(false);
        btnManageEmployee.setContentAreaFilled(false);
        btnManageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageEmployeeMouseExited(evt);
            }
        });
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel3.add(btnManageEmployee, gridBagConstraints);

        btnManageEmployeeAccess.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnManageEmployeeAccess.setForeground(new java.awt.Color(255, 146, 1));
        btnManageEmployeeAccess.setText("Manage User");
        btnManageEmployeeAccess.setBorderPainted(false);
        btnManageEmployeeAccess.setContentAreaFilled(false);
        btnManageEmployeeAccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageEmployeeAccessMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageEmployeeAccessMouseExited(evt);
            }
        });
        btnManageEmployeeAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeAccessActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 110);
        jPanel3.add(btnManageEmployeeAccess, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 146, 1));
        jLabel2.setText("Your Enterprise is : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 218, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        txtFieldEnterpriseName.setEditable(false);
        txtFieldEnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEnterpriseNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        jPanel3.add(txtFieldEnterpriseName, gridBagConstraints);

        jSplitPane1.setLeftComponent(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 57, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldEnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEnterpriseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEnterpriseNameActionPerformed

    private void btnManageEmployeeAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeAccessActionPerformed
        ManageUsers manageuserJPanel=new ManageUsers(userProcessContainer,enterprise, system);
        jSplitPane1.setBottomComponent(manageuserJPanel);
    }//GEN-LAST:event_btnManageEmployeeAccessActionPerformed

    private void btnManageEmployeeAccessMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeAccessMouseEntered
        btnManageEmployeeAccess.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeeAccessMouseEntered

    private void btnManageEmployeeAccessMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeAccessMouseExited
        btnManageEmployeeAccess.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeeAccessMouseExited

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        ManageEmployee manageemployeeJPanel=new ManageEmployee(userProcessContainer,enterprise, system,enterprise.getOrganizationDirectory());
        jSplitPane1.setBottomComponent(manageemployeeJPanel);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeMouseEntered
        btnManageEmployee.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeeMouseEntered

    private void btnManageEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeMouseExited
        btnManageEmployee.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeeMouseExited

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
        ManageOrganizations manageorganizationsJPanel=new ManageOrganizations(userProcessContainer,enterprise, system,enterprise.getOrganizationDirectory());
        jSplitPane1.setBottomComponent(manageorganizationsJPanel);
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnManageOrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageOrgMouseEntered
        btnManageOrg.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageOrgMouseEntered

    private void btnManageOrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageOrgMouseExited
        btnManageOrg.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageOrgMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageEmployeeAccess;
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField txtFieldEnterpriseName;
    // End of variables declaration//GEN-END:variables
}
