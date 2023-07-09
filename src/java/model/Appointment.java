package model;

import java.util.Date;

/**
 *
 */
public class Appointment {
    
    private Long id;
    
    private String patientName;
    
    private Date time;
    
    private Long doctorId;

    public Long getId() {
        return id;
    }

    public String getPatientName() {
        return patientName;
    }

    public Date getTime() {
        return time;
    }

    public Long getDoctorId() {
        return doctorId;
    }

}
