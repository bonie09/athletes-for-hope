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
public class ConsultationFundAllocatorDir {
    private ArrayList<ConsultationFundAllocator> Consultations;
    private HashMap<String,ArrayList<ConsultationFundAllocator>> ConsultationDirectory;

    public ConsultationFundAllocatorDir() {
       ConsultationDirectory=new HashMap<String,ArrayList<ConsultationFundAllocator>>();
       Consultations=new ArrayList<ConsultationFundAllocator>();
    }

    public ArrayList<ConsultationFundAllocator> getConsultations() {
        return Consultations;
    }

    public HashMap<String, ArrayList<ConsultationFundAllocator>> getConsultationDirectory() {
        return ConsultationDirectory;
    }
}
