/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.HealthInsuranceAgentRole;
import business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class HealthOrganization extends Organization{

    public HealthOrganization() {
        super(Organization.Type.Health.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthInsuranceAgentRole());
        return roles;
    }
    
}
