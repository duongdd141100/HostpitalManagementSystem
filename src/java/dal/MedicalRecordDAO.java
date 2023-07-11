package dal;

import java.util.ArrayList;
import java.util.List;
import model.MedicalRecord;

/**
 *
 */
public class MedicalRecordDAO extends DBContext{

    public List<MedicalRecord> findBySearchValue(String searchValue) {
        String sql = "SELECT mr.id," +
                " p.name AS patient_name," +
                " mr.diagnosis," +
                " mr.medical_plan," +
                " mr.fee," +
                " e1.name AS doctor_name," +
                " e2.name AS nurse_name" +
                " FROM tbl_medical_record mr" +
                " INNER JOIN tbl_patient p" +
                " ON mr.patient_id = p.id" +
                " INNER JOIN tbl_employee e1" +
                " ON mr.doctor_id = e1.id" +
                " INNER JOIN tbl_employee e2" +
                " ON mr.nurse_id = e2.id" +
                (searchValue.length() == 0 ? ""
                : " WHERE mr.id LIKE ?" +
                " OR p.name LIKE ?" +
                " OR mr.diagnosis LIKE ?" +
                " OR mr.fee LIKE ?" +
                " OR e1.name LIKE ?" +
                " OR e2.name LIKE ?");
        try {
            ps = conn.prepareStatement(sql);
            if (searchValue.length() > 0) {
                String searchValueLike = "%" + searchValue + "%";
                ps.setString(6, searchValueLike);
                ps.setString(1, searchValueLike);
                ps.setString(2, searchValueLike);
                ps.setString(3, searchValueLike);
                ps.setString(4, searchValueLike);
                ps.setString(5, searchValueLike);
            }
            rs = ps.executeQuery();
            List<MedicalRecord> medicalRecords = new ArrayList<>();
            while(rs.next()) {
                medicalRecords.add(new MedicalRecord(rs.getLong("id"),
                        rs.getString("diagnosis"),
                        rs.getString("medical_plan"),
                        rs.getDouble("fee"),
                        rs.getString("patient_name"),
                        rs.getString("doctor_name"),
                        rs.getString("nurse_name")));
            }
            return medicalRecords;
        } catch (Exception e) {
            System.out.println("ERROR MedicalRecordDAO.findAll()" + e.getMessage());
            return null;
        }
    }
    
}
