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
public class NutritionEnterprise extends Enterprise{
    public NutritionEnterprise(String name){
        super(name,EnterpriseType.Nutrition);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
