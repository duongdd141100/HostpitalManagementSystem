package model;

/**
 *
 */
public class MedicalRecord {
    
    private Long id;
    
    private String diagnosis;
    
    private String medicalPlan;
    
    private Double fee;
    
    private String patientName;
    
    private String doctorName;
    
    private String nurseName;

    public MedicalRecord(Long id, String diagnosis, String medicalPlan, Double fee, String patientName, String doctorName, String nurseName) {
        this.id = id;
        this.diagnosis = diagnosis;
        this.medicalPlan = medicalPlan;
        this.fee = fee;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
    }

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

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }
}
