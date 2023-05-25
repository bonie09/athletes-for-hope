/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author puranjaimendiratta
 */
public class LabTechnicianWorkRequest extends WorkRequest {
     TrainingCoachWorkRequest TrainingCoachWorkRequest;
    private String testResult;
    private String labsign;
    private ArrayList<LabTest> LabTestList = new ArrayList<LabTest>();

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public TrainingCoachWorkRequest getTrainingCoachWorkRequest() {
        return TrainingCoachWorkRequest;
    }

    public void setTrainingCoachWorkRequest(TrainingCoachWorkRequest TrainingCoachWorkRequest) {
        this.TrainingCoachWorkRequest = TrainingCoachWorkRequest;
    } 

    public String getLabsign() {
        return labsign;
    }

    public void setLabsign(String labsign) {
        this.labsign = labsign;
    }

    public ArrayList<LabTest> getLabTestList() {
        return LabTestList;
    }

    public void setLabTestList(ArrayList<LabTest> LabTestList) {
        this.LabTestList = LabTestList;
    }
}
