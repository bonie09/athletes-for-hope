/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class HealthWellBeingEnterprise extends Enterprise{
      
    public HealthWellBeingEnterprise(String name){
        super(name,EnterpriseType.HealthWellBeing);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
