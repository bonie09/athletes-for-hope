/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import java.util.Date;
/**
 *
 * @author Puranjai
 */
public class TalentScoutWorkRequest extends WorkRequest {

    private String childName;
    private Integer age;
    private String gender;
    private String sportType;
    private String address;
    private Date doe;
    private String parentName;
    private String height;
    private String weight;

    
    private TrainingCoachWorkRequest trainingCoachWorkRequest;
    private FundAllocatorWorkRequest fundAllocatorWorkRequest;
    private InsuranceAgentWorkRequest insuranceAgentWorkRequest;
    private MentalHealthCoachWorkRequest mentalCoachWorkRequest;

    public TrainingCoachWorkRequest getTrainingCoachWorkRequest() {
        return trainingCoachWorkRequest;
    }

    public void setTrainingCoachWorkRequest(TrainingCoachWorkRequest trainingCoachWorkRequest) {
        this.trainingCoachWorkRequest = trainingCoachWorkRequest;
    }

    public FundAllocatorWorkRequest getFundAllocatorWorkRequest() {
        return fundAllocatorWorkRequest;
    }

    public void setFundAllocatorWorkRequest(FundAllocatorWorkRequest fundAllocatorWorkRequest) {
        this.fundAllocatorWorkRequest = fundAllocatorWorkRequest;
    }

    public InsuranceAgentWorkRequest getInsuranceAgentWorkRequest() {
        return insuranceAgentWorkRequest;
    }

    public void setInsuranceAgentWorkRequest(InsuranceAgentWorkRequest insuranceAgentWorkRequest) {
        this.insuranceAgentWorkRequest = insuranceAgentWorkRequest;
    }

    public MentalHealthCoachWorkRequest getMentalHealthCoachWorkRequest() {
        return mentalCoachWorkRequest;
    }

    public void setMentalHealthWorkRequest(MentalHealthCoachWorkRequest mentalCoachWorkRequest) {
        this.mentalCoachWorkRequest = mentalCoachWorkRequest;
    }
    
    public String getGender() {
        return gender;
    }


    public String getChildName() {
        return childName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void setRelation(String gender) {
        this.gender = gender;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDoe() {
        return doe;
    }

    public void setDoe(Date doe) {
        this.doe = doe;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    
     public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
