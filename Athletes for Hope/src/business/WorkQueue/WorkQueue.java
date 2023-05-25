/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;
import java.util.ArrayList;
/**
 *
 * @author Puranjai
 */
public class WorkQueue {
     private ArrayList<TalentScoutWorkRequest> talentScoutWorkRequestList;
    private ArrayList<InsuranceAgentWorkRequest> insuranceAgentWorkRequestList;
    private ArrayList<MentalHealthCoachWorkRequest> mentalCoachWorkRequestList;
    private ArrayList<FundAllocatorWorkRequest> fundAllocatorWorkRequestList;
    private ArrayList<TrainingCoachWorkRequest> trainingCoachWorkRequestList;
    private ArrayList<LabTechnicianWorkRequest> labTechnicianWorkRequest;
    private ArrayList<SupplementSalesRepWorkRequest> supplementSalesRepWorkRequest;


    public WorkQueue() {
        talentScoutWorkRequestList = new ArrayList<TalentScoutWorkRequest>();
        insuranceAgentWorkRequestList=new ArrayList<InsuranceAgentWorkRequest>();
        mentalCoachWorkRequestList=new ArrayList<MentalHealthCoachWorkRequest>();
        fundAllocatorWorkRequestList = new ArrayList<FundAllocatorWorkRequest>();
        trainingCoachWorkRequestList = new ArrayList<TrainingCoachWorkRequest>();
        labTechnicianWorkRequest = new ArrayList<LabTechnicianWorkRequest>();
       supplementSalesRepWorkRequest = new ArrayList<SupplementSalesRepWorkRequest>();
    }

    public ArrayList<TalentScoutWorkRequest> getTalentScoutWorkRequestList() {
        return talentScoutWorkRequestList;
    }

    public ArrayList<InsuranceAgentWorkRequest> getInsuranceAgentWorkRequestList() {
        return insuranceAgentWorkRequestList;
    }

    public ArrayList<MentalHealthCoachWorkRequest> getMentalHealthCoachWorkRequestList() {
        return  mentalCoachWorkRequestList;
    }

    public ArrayList<FundAllocatorWorkRequest> getFundAllocatorWorkRequestList() {
        return fundAllocatorWorkRequestList;
    }

    public ArrayList<TrainingCoachWorkRequest> getTrainingCoachWorkRequestList() {
        return trainingCoachWorkRequestList;
    }

    public ArrayList<LabTechnicianWorkRequest> getLabTechnicianWorkRequest() {
        return labTechnicianWorkRequest;
    }

    public ArrayList<SupplementSalesRepWorkRequest> getSupplementSalesRepWorkRequest() {
        return  supplementSalesRepWorkRequest;
    }

    public void setTalentScoutWorkRequestList(ArrayList<TalentScoutWorkRequest> talentScoutWorkRequestList) {
        this.talentScoutWorkRequestList = talentScoutWorkRequestList;
    }

    public void setInsuranceAgentWorkRequestList(ArrayList<InsuranceAgentWorkRequest> insuranceAgentWorkRequestList) {
        this.insuranceAgentWorkRequestList = insuranceAgentWorkRequestList;
    }

    public void setMentalHealthCoachWorkRequestList(ArrayList<MentalHealthCoachWorkRequest> mentalCoachWorkRequestList) {
        this.mentalCoachWorkRequestList = mentalCoachWorkRequestList;
    }

    public void setFundAllocatorWorkRequestList(ArrayList<FundAllocatorWorkRequest> fundAllocatorWorkRequestList) {
        this.fundAllocatorWorkRequestList = fundAllocatorWorkRequestList;
    }

    public void setTrainingCoachWorkRequest(ArrayList<TrainingCoachWorkRequest> trainingCoachWorkRequestList) {
        this.trainingCoachWorkRequestList = trainingCoachWorkRequestList;
    }

    public void setLabTechnicianWorkRequest(ArrayList<LabTechnicianWorkRequest> labTechnicianWorkRequest) {
        this.labTechnicianWorkRequest = labTechnicianWorkRequest;
    }

    public void setSupplementSalesRepWorkRequest(ArrayList<SupplementSalesRepWorkRequest> supplementSalesRepWorkRequest) {
        this.supplementSalesRepWorkRequest = supplementSalesRepWorkRequest;
    }

    public int getcountbytypesa(String type)
    {
        int count=0;
        
        for(TalentScoutWorkRequest hp: talentScoutWorkRequestList)
        {
            
            if(hp.getSportType().equalsIgnoreCase(type))
            {
                count++;
            }
        }
        return count;
    }
}
