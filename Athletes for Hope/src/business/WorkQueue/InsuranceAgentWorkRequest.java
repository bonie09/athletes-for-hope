/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Consultation.ConsultationHealthInsuranceAgent;
import java.util.ArrayList;


/**
 *
 * @author Puranjai
 */
public class InsuranceAgentWorkRequest extends WorkRequest {
    
    TalentScoutWorkRequest TalentScoutWorkRequest;
    ArrayList<ConsultationHealthInsuranceAgent> HealthInsuranceAgentConsultation = new ArrayList<ConsultationHealthInsuranceAgent>();

    public TalentScoutWorkRequest getTalentScoutWorkRequest() {
        return TalentScoutWorkRequest;
    }

    public void setTalentScoutWorkRequest(TalentScoutWorkRequest TalentScoutWorkRequest) {
        this.TalentScoutWorkRequest = TalentScoutWorkRequest;
    }

    public ArrayList<ConsultationHealthInsuranceAgent> getHealthInsuranceAgentConsultation() {
        return HealthInsuranceAgentConsultation;
    }

    public void setHealthInsuranceAgentConsultation(ArrayList<ConsultationHealthInsuranceAgent> HealthInsuranceAgentConsultation) {
        this.HealthInsuranceAgentConsultation = HealthInsuranceAgentConsultation;
    }
}
