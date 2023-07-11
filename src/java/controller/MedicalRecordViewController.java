package controller;

import dal.MedicalRecordDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MedicalRecord;

/**
 *
 */
public class MedicalRecordViewController extends HttpServlet {
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String searchValue = "";
        if (request.getParameter("searchValue") != null) {
            searchValue = request.getParameter("searchValue");
        }
        
        MedicalRecordDAO medicalRecordDAO = new MedicalRecordDAO();
        List<MedicalRecord> medicalRecords = medicalRecordDAO.findBySearchValue(searchValue);
        
        request.setAttribute("medicalRecords", medicalRecords);
        request.setAttribute("searchValue", searchValue);
        request.getRequestDispatcher("/view/MedicalRecordView.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
