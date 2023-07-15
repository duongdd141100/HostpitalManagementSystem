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

    public Report(Long id, String doctorNotes, String nurseNotes, Long medicalRecordId, Long reviewer) {
        this.id = id;
        this.doctorNotes = doctorNotes;
        this.nurseNotes = nurseNotes;
        this.medicalRecordId = medicalRecordId;
        this.reviewer = reviewer;
    }

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
