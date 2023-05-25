/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;
import business.Consultation.ConsultationMentalHealthCoach;
import java.util.ArrayList;
/**
 *
 * @author Puranjai
 */
public class MentalHealthCoachWorkRequest extends WorkRequest {
    TalentScoutWorkRequest talentScoutWorkRequest;
    ArrayList<ConsultationMentalHealthCoach> MentalHealthCoachConsultation = new ArrayList<ConsultationMentalHealthCoach>();

    public TalentScoutWorkRequest getTalentScoutWorkRequest() {
        return talentScoutWorkRequest;
    }

    public void setTalentScoutWorkRequest(TalentScoutWorkRequest talentScoutWorkRequest) {
        this.talentScoutWorkRequest = talentScoutWorkRequest;
    }

    public ArrayList<ConsultationMentalHealthCoach> getMentalHealthCoachConsultation() {
        return MentalHealthCoachConsultation;
    }

    public void setMentalHealthCoachConsultation(ArrayList<ConsultationMentalHealthCoach> MentalHealthCoachConsultation) {
        this.MentalHealthCoachConsultation = MentalHealthCoachConsultation;
    }
}
