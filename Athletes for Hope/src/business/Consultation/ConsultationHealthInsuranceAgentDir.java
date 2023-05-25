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
public class ConsultationHealthInsuranceAgentDir {
        private ArrayList<ConsultationHealthInsuranceAgent> Consultations;
    private HashMap<String,ArrayList<ConsultationHealthInsuranceAgent>> ConsultationDirectory;

    public ConsultationHealthInsuranceAgentDir() {
       ConsultationDirectory=new HashMap<String,ArrayList<ConsultationHealthInsuranceAgent>>();
       Consultations=new ArrayList<ConsultationHealthInsuranceAgent>();
    }

    public ArrayList<ConsultationHealthInsuranceAgent> getConsultations() {
        return Consultations;
    }

    public HashMap<String, ArrayList<ConsultationHealthInsuranceAgent>> getConsultationDirectory() {
        return ConsultationDirectory;
    }
}