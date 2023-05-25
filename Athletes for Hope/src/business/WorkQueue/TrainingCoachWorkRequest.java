/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

/**
 *
 * @author Puranjai
 */
public class TrainingCoachWorkRequest extends WorkRequest {
    TalentScoutWorkRequest TalentScoutWorkRequest;
    LabTechnicianWorkRequest LabTechnicianWorkRequest;
    SupplementSalesRepWorkRequest  SupplementSalesRepWorkRequest;
    

    
    private String trainingCoachSign;

    public TalentScoutWorkRequest getTalentScoutWorkRequest() {
        return TalentScoutWorkRequest;
    }

    public void setTalentScoutWorkRequest(TalentScoutWorkRequest TalentScoutWorkRequest) {
        this.TalentScoutWorkRequest = TalentScoutWorkRequest;
    }

    public String getTrainingCoachSign() {
        return trainingCoachSign;
    }

    public void setTrainingCoachSign(String trainingCoachSign) {
        this.trainingCoachSign = trainingCoachSign;
    }

    public LabTechnicianWorkRequest getLabTechnicianWorkRequest() {
        return LabTechnicianWorkRequest;
    }

    public void setLabTechnicianWorkRequest(LabTechnicianWorkRequest LabTechnicianWorkRequest) {
        this.LabTechnicianWorkRequest = LabTechnicianWorkRequest;
    }

    public SupplementSalesRepWorkRequest getSupplementSalesRepWorkRequest() {
        return SupplementSalesRepWorkRequest;
    }

    public void setSupplementSalesRepWorkRequest(SupplementSalesRepWorkRequest SupplementSalesRepWorkRequest) {
        this.SupplementSalesRepWorkRequest = SupplementSalesRepWorkRequest;
    }
    
}
