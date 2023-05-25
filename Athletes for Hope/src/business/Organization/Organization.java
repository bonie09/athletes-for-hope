/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Employee.EmployeeDirectory;
import business.Consultation.ConsultationFundAllocator;
import business.Consultation.ConsultationFundAllocatorDir;
import business.Consultation.ConsultationHealthInsuranceAgent;
import business.Consultation.ConsultationHealthInsuranceAgentDir;
import business.Consultation.ConsultationMentalHealthCoach;
import business.Consultation.ConsultationMentalHealthCoachDir;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private ConsultationFundAllocatorDir fundallocatordir;
    private ConsultationHealthInsuranceAgentDir healthinsurancedir;
    private ConsultationMentalHealthCoachDir mentalhealthcoachdir;
    public enum Type{
        TalentScout("TalentScoutOrganization"),PhysicalTraining("PhysicalTrainingOrganization"),Diagnostic("DiagnosticOrganization"),
        SportsFund("SportsFundOrganization"), Health("HealthOrganization"), TalentRecruitment("TalentRecruitmentOrganization"),
        MentalHealth("MentalHealthOrganization"),Nutrabay("NutrabayOrganization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        fundallocatordir=new ConsultationFundAllocatorDir();
        healthinsurancedir = new ConsultationHealthInsuranceAgentDir();
        mentalhealthcoachdir=new ConsultationMentalHealthCoachDir();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public ConsultationFundAllocatorDir getFundallocatordir() {
        return fundallocatordir;
    }

    public ConsultationHealthInsuranceAgentDir getHealthinsurancedir() {
        return healthinsurancedir;
    }

    public ConsultationMentalHealthCoachDir getMentalhealthcoachdir() {
        return mentalhealthcoachdir;
    }
    
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
