package model;

/**
 *
 */
public class Report {
    
    private Long id;
    
    private String doctorNotes;
    
    private String nurseNotes;
    
    private Long medicalRecordId;
    
    private Long reviewer;

    public Long getId() {
        return id;
    }

    public String getDoctorNotes() {
        return doctorNotes;
    }

    public String getNurseNotes() {
        return nurseNotes;
    }

    public Long getMedicalRecordId() {
        return medicalRecordId;
    }

    public Long getReviewer() {
        return reviewer;
    }
}
