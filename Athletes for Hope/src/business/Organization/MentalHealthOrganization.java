/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.MentalHealthCoachRole;
import business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class MentalHealthOrganization extends Organization{
     public MentalHealthOrganization() {
        super(Organization.Type.MentalHealth.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MentalHealthCoachRole());
        return roles;
    }
    
}
