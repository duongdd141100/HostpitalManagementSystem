/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Assignment;

/**
 *
 * @author ngolu
 */
public class AssignmentDAO extends DBContext{

    public List<Assignment> getAssignment() {
        List<Assignment> list = new ArrayList<>();
        String sql = "SELECT tbl_patient.name as PatientName ,tbl_bed.name as BedName, tbl_room.name as RoomName, e1.name as doctorName , e2.name as nurseName\n"
                + "FROM tbl_medical_record INNER JOIN \n"
                + "	 tbl_patient ON tbl_medical_record.id = tbl_patient.id \n"
                + "	 INNER JOIN tbl_employee e1 ON e1.id = tbl_medical_record.doctor_id\n"
                + "	 INNER JOIN tbl_employee e2 ON e2.id = tbl_medical_record.nurse_id\n"
                + "	 INNER JOIN tbl_bed ON tbl_patient.bed_id = tbl_bed.id\n"
                + "	 INNER JOIN tbl_room ON tbl_bed.room_id = tbl_room.id";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new Assignment(rs.getString("patientName"),
                        rs.getString("roomName"),
                        rs.getString("bedName"), 
                        rs.getString("doctorName"),
                        rs.getString("nurseName")));
            }
            return list;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }

    }
}
