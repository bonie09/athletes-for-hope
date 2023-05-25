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
public class SupplementSalesRepWorkRequest extends WorkRequest {
    
    TrainingCoachWorkRequest TrainingCoachWorkRequest;
    private ArrayList<Supplements> supplements = new ArrayList<Supplements>();

    public TrainingCoachWorkRequest getTrainingCoachWorkRequest() {
        return TrainingCoachWorkRequest;
    }

    public void setTrainingCoachWorkRequest(TrainingCoachWorkRequest TrainingCoachWorkRequest) {
        this.TrainingCoachWorkRequest = TrainingCoachWorkRequest;
    }

    public ArrayList<Supplements> getSupplements() {
        return supplements;
    }

    public void setSupplements(ArrayList <Supplements> supplements) {
        this.supplements = supplements;
    }
}
