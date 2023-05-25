/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organization.OrganizationDirectory;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        
        if(type==Enterprise.EnterpriseType.TalentScoutGlobal){
            enterprise=new TalentScoutGlobalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.HealthWellBeing){
            enterprise=new HealthWellBeingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Insurance){
            enterprise=new InsuranceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.NGO){
            enterprise=new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Nutrition){
            enterprise=new NutritionEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public Enterprise searchEnterprisebyname(String Name){
        for(Enterprise etp: enterpriseList){
            if(Name.equalsIgnoreCase(etp.getName())){
                return etp;
            }
        }
        return null; 
    }
    
    public Enterprise searchEnterprisebyType(Enterprise.EnterpriseType type){
        for(Enterprise etp : enterpriseList){
            if(type.equals(etp.getEnterpriseType())){
                return etp;
            }
        }
        return null;
    }
}
