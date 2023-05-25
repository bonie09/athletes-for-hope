/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Enterprise.Enterprise;
import business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class InsuranceEnterprise extends Enterprise {
    public InsuranceEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Insurance);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
