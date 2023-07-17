/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Assignment;
import model.Bed;
import model.Patient;
import model.Report;
import model.Room;

/**
 *
 * @author DUCLONG
 */
public class PatientDAO extends DBContext {

    public List<Patient> getListPatient() {
        List<Patient> list = new ArrayList<>();
        String sql = "select patient.name,patient.phone_number,patient.address,bed.name,bed.price,room.name from dbo.tbl_patient as patient inner join dbo.tbl_bed as bed\n"
                + "on patient.bed_id = bed.id inner join dbo.tbl_room as room on bed.room_id = room.id";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Patient patient = new Patient();
                patient.setName(rs.getString(1));
                patient.setPhoneNumber(rs.getString(2));
                patient.setAddress(rs.getString(3));
                Bed bed = new Bed();
                bed.setName(rs.getString(4));
                bed.setPrice(Double.parseDouble(rs.getString(5)));
                Room room = new Room();
                room.setName(rs.getString(6));
                bed.setRoom(room);
                patient.setBed(bed);
                list.add(patient);

            }
            return list;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }

    }

    public Patient getPatientById(String name) {
        try {
            String sql = "select patient.name,patient.phone_number,patient.address,bed.name,bed.price,room.name from dbo.tbl_patient as patient inner join dbo.tbl_bed as bed\n" +
"on patient.bed_id = bed.id inner join dbo.tbl_room as room on bed.room_id = room.id where patient.name = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            if (rs.next()) {
                Patient patient = new Patient();
                patient.setName(rs.getString(1));
                patient.setPhoneNumber(rs.getString(2));
                patient.setAddress(rs.getString(3));
                Bed bed = new Bed();
                bed.setName(rs.getString(4));
                bed.setPrice(Double.parseDouble(rs.getString(5)));
                Room room = new Room();
                room.setName(rs.getString(6));
                bed.setRoom(room);
                patient.setBed(bed);
                return patient;
            }
            return null;
        } catch (Exception e) {
            System.out.println("ERROR findByMedicalRecordId: " + e.getMessage());
            return null;
        }

    }

    public static void main(String[] args) {
        PatientDAO patient_dao = new PatientDAO();
        Patient patient = patient_dao.getPatientById("chulong");
        System.out.println(patient.getBed().getName());

    }

}
