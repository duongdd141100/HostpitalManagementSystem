<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link href="css/Common.css" rel="stylesheet" type="text/css"/>
<link href="css/MedicalRecordView.css" rel="stylesheet" type="text/css"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Medical Record</title>
    </head>
    <body>
        <jsp:include page="Header.jsp" />
        <div class="title">
            <h1>Medical Records</h1>
        </div>
        
        
        
        <div class="content">
            <div class="search">
                <label class="text">Search:</label>
                <input type="text" placeholder="Search hear..." onkeydown="search(this)" value="${searchValue}">
            </div>
            <div class="table">            
                <table>
                    <tr>
                        <th>Patient Name</th>
                        <th>Diagnosis</th>
                        <th>Medical Plan</th>
                        <th>Fee</th>
                        <th>Doctor</th>
                        <th>Nurse</th>
                        <th>Report</th>
                    </tr>
                    <c:if test="${medicalRecords.size() == 0}">
                        <tr><td class="no-record" colspan="7">There is no record.</td></tr>
                    </c:if>
                    <c:forEach items="${medicalRecords}" var="mr">
                        <tr>
                            <td class="patient-name">${mr.patientName}</td>
                            <td class="diagnosis">${mr.diagnosis}</td>
                            <td class="medical-plan"><a href="medical-plan/${mr.id}">View</a></td>
                            <td class="fee">$ ${mr.fee}</td>
                            <td class="doctor-name">${mr.doctorName}</td>
                            <td class="nurse-name">${mr.nurseName}</td>
                            <td class="report"><a href="report/${mr.id}">View</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>

<script>
    function search(input) {
        if (event.key === 'Enter') {
            location.href='http://localhost:8080/HostpitalManagementSystem/medical-records?searchValue=' + input.value;
        }
    }
</script>
