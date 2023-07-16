<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link href="css/Common.css" rel="stylesheet" type="text/css"/>
<link href="css/MedicalRecordView.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assignment</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div>
            <h1>Assignment</h1>
        </div>
        
        <div class="table">
            <table>
                <tr>
                    <th>Patient</th>
                    <th>Bed</th>
                    <th>Room</th>
                    <th>Doctor</th>
                    <th>Nurse</th>
                </tr>
                <c:forEach items="${listA}" var="o">
                    <tr>
                        <td class="Patient Name">${o.patientName}</td>
                        <td class="Room Name">${o.roomName}</td>
                        <td class="Bed Name">${o.bedName}</td>
                        <td class="Doctor Name">${o.doctorName}</td>
                        <td class="Nurse Name">${o.nurseName}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
