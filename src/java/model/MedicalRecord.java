package model;

/**
 *
 */
public class MedicalRecord {
    
    private Long id;
    
    private String diagnosis;
    
    private String medicalPlan;
    
    private Double fee;
    
    private Long patientId;
    
    private Long doctorId;
    
    private Long Nurse;

    public Long getId() {
        return id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getMedicalPlan() {
        return medicalPlan;
    }

    public Double getFee() {
        return fee;
    }

    public Long getPatientId() {
        return patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public Long getNurse() {
        return Nurse;
    }

}
