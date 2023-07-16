/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ngolu
 */
public class Assignment {
    private String patientName ;
    private String roomName ;
    private String bedName ;
    private String doctorName ;
    private String nurseName ;

    public Assignment() {
    }

    public Assignment(String patientName, String roomName, String bedName, String doctorName, String nurseName) {
        this.patientName = patientName;
        this.roomName = roomName;
        this.bedName = bedName;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getBedName() {
        return bedName;
    }

    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    
    
    
}
