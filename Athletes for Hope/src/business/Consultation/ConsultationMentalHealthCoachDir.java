/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Consultation;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author nishank
 */
public class ConsultationMentalHealthCoachDir {
    private ArrayList<ConsultationMentalHealthCoach> Consultations;
    private HashMap<String,ArrayList<ConsultationMentalHealthCoach>> ConsultationDirectory;

    public ConsultationMentalHealthCoachDir() {
       ConsultationDirectory=new HashMap<String,ArrayList<ConsultationMentalHealthCoach>>();
       Consultations=new ArrayList<ConsultationMentalHealthCoach>();
    }

    public ArrayList<ConsultationMentalHealthCoach> getConsultations() {
        return Consultations;
    }

    public HashMap<String, ArrayList<ConsultationMentalHealthCoach>> getConsultationDirectory() {
        return ConsultationDirectory;
    }
}
