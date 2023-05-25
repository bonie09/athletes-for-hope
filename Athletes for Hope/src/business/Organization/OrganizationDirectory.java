/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
         if (type.getValue().equals(Type.TalentScout.getValue())){
            organization = new TalentScoutOrganization();
            System.out.println(organization);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.PhysicalTraining.getValue())){
            organization = new PhysicalTrainingOrganization();
            System.out.println(organization);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Diagnostic.getValue())){
            organization = new DiagnosticOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SportsFund.getValue())){
            organization = new SportsFundOrganization();
            System.out.println(organization);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Health.getValue())){
            organization = new HealthOrganization();
            System.out.println(organization);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TalentRecruitment.getValue())){
            organization = new TalentRecruitmentOrganization();
            System.out.println(organization);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MentalHealth.getValue())){
            organization = new MentalHealthOrganization();
            System.out.println(organization);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nutrabay.getValue())){
            organization = new NutrabayOrganization();
            System.out.println(organization);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization searchOrganizationbyname(String Name){
        for(Organization org: organizationList){
            if(Name.equalsIgnoreCase(org.getName())){
                return org;
            }
            
        }
        return null; 
    }
}
