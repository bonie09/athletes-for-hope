/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Consultation.ConsultationFundAllocator;
import java.util.ArrayList;

/**
 *
 * @author Puranjai
 */
public class FundAllocatorWorkRequest extends WorkRequest {
    TalentScoutWorkRequest hswr;
    ArrayList<ConsultationFundAllocator> FAConsult = new ArrayList<ConsultationFundAllocator>();

    public TalentScoutWorkRequest getHswr() {
        return hswr;
    }

    public void setHswr(TalentScoutWorkRequest hswr) {
        this.hswr = hswr;
    }

    public ArrayList<ConsultationFundAllocator> getFAConsult() {
        return FAConsult;
    }

    public void setConslrEncounter(ArrayList<ConsultationFundAllocator> FAConsult) {
        this.FAConsult = FAConsult;
    }

    public Object getConslrConsultation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
