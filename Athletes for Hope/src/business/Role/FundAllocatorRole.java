/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;
import javax.swing.JPanel;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.SportsFundOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.TalentScoutWorkRequest; 
import javax.swing.JPanel;
import ui.FundAllocator.FundAllocatorJPanel;
/**
 *
 * @author nishank
 */
public class FundAllocatorRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business,Network network) {
        return new FundAllocatorJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }
}
