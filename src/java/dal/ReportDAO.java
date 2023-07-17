package dal;

import model.Report;

/**
 *
 */
public class ReportDAO extends DBContext{
    public Report findByMedicalRecordId(String recordId) {
        try {
            String sql = "SELECT * FROM tbl_report WHERE medical_record_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, recordId);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Report(null,
                        rs.getString("doctor_notes"),
                        rs.getString("nurse_notes"),
                        Long.parseLong(recordId),
                        null);
            }
            return null;
        } catch (Exception e) {
            System.out.println("ERROR findByMedicalRecordId: " + e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        ReportDAO report_dao = new ReportDAO();
        
    }
    
}
