/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FundAllocator;

import business.EcoSystem;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.FundAllocatorWorkRequest;
import business.WorkQueue.TalentScoutWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nishank
 */
public class FundAllocatorRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FundAllocatorRequestJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    FundAllocatorWorkRequest request;
    Network network;
    public FundAllocatorRequestJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount,Organization organization,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization=organization;
        this.userAccount = userAccount;
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

        jPanel1 = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageCounsellorRequestDetails = new javax.swing.JTable();
        btnAssignRequest = new javax.swing.JButton();
        btnViewReport = new javax.swing.JButton();
        btnEncounters = new javax.swing.JButton();
        btnCaseComplete = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setBackground(new java.awt.Color(255, 146, 1));
        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 146, 1));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Requests");

        tblManageCounsellorRequestDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Enrollment Time", "Status", "Assigned to"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageCounsellorRequestDetails);

        btnAssignRequest.setBackground(new java.awt.Color(255, 146, 1));
        btnAssignRequest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAssignRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignRequest.setText("Assign Request");
        btnAssignRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseExited(evt);
            }
        });
        btnAssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRequestActionPerformed(evt);
            }
        });

        btnViewReport.setBackground(new java.awt.Color(255, 146, 1));
        btnViewReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewReport.setForeground(new java.awt.Color(255, 255, 255));
        btnViewReport.setText("View Report");
        btnViewReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewReportMouseExited(evt);
            }
        });
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        btnEncounters.setBackground(new java.awt.Color(255, 146, 1));
        btnEncounters.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEncounters.setForeground(new java.awt.Color(255, 255, 255));
        btnEncounters.setText("Consultation");
        btnEncounters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEncountersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncountersMouseExited(evt);
            }
        });
        btnEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncountersActionPerformed(evt);
            }
        });

        btnCaseComplete.setBackground(new java.awt.Color(255, 146, 1));
        btnCaseComplete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCaseComplete.setForeground(new java.awt.Color(255, 255, 255));
        btnCaseComplete.setText(" Case Complete");
        btnCaseComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCaseCompleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCaseCompleteMouseExited(evt);
            }
        });
        btnCaseComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaseCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCaseComplete)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAssignRequest)))
                    .addComponent(btnEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAssignRequest)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewReport)
                        .addGap(18, 18, 18)
                        .addComponent(btnEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCaseComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(302, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseEntered
        btnAssignRequest.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseEntered

    private void btnAssignRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseExited
        btnAssignRequest.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseExited

    private void btnAssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRequestActionPerformed
        try{
            int selectedRow = tblManageCounsellorRequestDetails.getSelectedRow();
            FundAllocatorWorkRequest request = (FundAllocatorWorkRequest)tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2);
            if (CheckOpenCases(userAccount) == 0){
                request.setReceiver(userAccount);
                request.setStatus("Accepted");
                populateTable();
            }else
            {
                JOptionPane.showMessageDialog(null, "Only one case can be accepted at a time");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please select any one row from a table");
        }
    }//GEN-LAST:event_btnAssignRequestActionPerformed

    private void btnViewReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewReportMouseEntered
        btnViewReport.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewReportMouseEntered

    private void btnViewReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewReportMouseExited
        btnViewReport.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewReportMouseExited

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        try {
        int selectedRow = tblManageCounsellorRequestDetails.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) tblManageCounsellorRequestDetails.getModel();
        String sta="Waiting";
        String stat=tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2).toString();

        if(sta.equalsIgnoreCase(stat))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else
        {

            if (selectedRow < 0){
                return;
            }

            FundAllocatorWorkRequest request = (FundAllocatorWorkRequest)tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2);

            if (request.getReceiver()!=userAccount){
                JOptionPane.showMessageDialog(this, "You cannot view the report of this case. Access Denied.");
            }else{

                TalentScoutFA TalentScout = new TalentScoutFA(userProcessContainer,system,request.getHswr(),userAccount,network);
                userProcessContainer.add("TalentScout", TalentScout);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                /*CaseReportJPanel casereportJPanel=new CaseReportJPanel(userProcessContainer,system,request);
                casereportJPanel.setVisible(true);*/
            }

        }   
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please select any one row from a table");
        }
    }//GEN-LAST:event_btnViewReportActionPerformed

    private void btnEncountersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncountersMouseEntered
        btnEncounters.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncountersMouseEntered

    private void btnEncountersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncountersMouseExited
        btnEncounters.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncountersMouseExited

    private void btnEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncountersActionPerformed
        try{
            int selectedRow = tblManageCounsellorRequestDetails.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) tblManageCounsellorRequestDetails.getModel();
        String stat="Waiting";
        String statu=tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2).toString();

        if(stat.equalsIgnoreCase(statu))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else
        {
            if (selectedRow < 0){
                return;
            }
            FundAllocatorWorkRequest request = (FundAllocatorWorkRequest)tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2);

            if (request.getReceiver()!=userAccount){
                JOptionPane.showMessageDialog(this, "You cannot view the report of this case. Access Denied.");
            }else{
                FundAllocatorConsultation cencounterJPanel = new FundAllocatorConsultation(userProcessContainer,system,userAccount,network,organization,request);
                userProcessContainer.add("caseReportJPanel", cencounterJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

            }
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please select any one row from a table");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncountersActionPerformed

    private void btnCaseCompleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaseCompleteMouseEntered
        btnCaseComplete.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaseCompleteMouseEntered

    private void btnCaseCompleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaseCompleteMouseExited
        btnCaseComplete.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaseCompleteMouseExited

    private void btnCaseCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaseCompleteActionPerformed
        try{
            int selectedRow = tblManageCounsellorRequestDetails.getSelectedRow();

        String s="Waiting";
        String status=tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2).toString();
        if(s.equalsIgnoreCase(status))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else
        {

            if (selectedRow < 0){
                return;
            }

            WorkRequest request = (FundAllocatorWorkRequest)tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2);
            //request.setReceiver(userAccount);
            request.setStatus("Case Completed");
            populateTable();
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select any one row from a table");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaseCompleteActionPerformed
private void populateTable() {
        DefaultTableModel model= (DefaultTableModel) tblManageCounsellorRequestDetails.getModel();
        Object[] row=new Object[4];
        model.setRowCount(0);
        
         for(FundAllocatorWorkRequest request : organization.getWorkQueue().getFundAllocatorWorkRequestList())
         {
         
             //request.getHelpSeekerWorkRequest().getSender().getEmployee().getEmail();
            
             row[0]=request.getHswr().getChildName();
            row[1] = request.getHswr().getDoe();
            row[2] = request;
            if (request.getReceiver()==null){
              row[3] = "Not Assigned";
            }else{
              row[3] = request.getReceiver();
            }
            model.addRow(row);
        }
    }
    
    private int CheckOpenCases(UserAccount userAccount) {
        int a = 0;
        for(FundAllocatorWorkRequest request : organization.getWorkQueue().getFundAllocatorWorkRequestList())
        {
        
          if (request.getReceiver()==userAccount){
              if (request.getStatus().equalsIgnoreCase("Accepted")){
                  a = a + 1;
              }
          } 
        }
        return a; 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRequest;
    private javax.swing.JButton btnCaseComplete;
    private javax.swing.JButton btnEncounters;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblManageCounsellorRequestDetails;
    // End of variables declaration//GEN-END:variables
}
