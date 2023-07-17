<%-- 
    Document   : PatientView
    Created on : 17-07-2023, 16:08:43
    Author     : DUCLONG
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link href="css/Common.css" rel="stylesheet" type="text/css"/>
<link href="css/MedicalRecordView.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <jsp:include page="Header.jsp" />
         <div class="title">
            <h1> Patients </h1>
        </div>
         <div class="content">
             <div class="table">            
                <table>
                    <tr>
                        <th>Patient Name</th>
                        <th>Patient Phone</th>
                        <th>Patient Address</th>
                        <th>Bed Name</th>
                        <th>Bed Price</th>
                        <th>Room Name</th>
                        <th></th>
                    </tr>
                    <c:if test="${list_patient.size() == 0}">
                        <tr><td class="no-record" colspan="7">There is no record.</td></tr>
                    </c:if>
                    <c:forEach items="${list_patient}" var="lp">
                        <tr>
                            
                            <td class="patient-name">${lp.getName()}</td>
                            <td class="diagnosis">${lp.getPhoneNumber()}</td>
                            <td class="medical-plan">${lp.getAddress()}</td>
                            
<!--                            <td class="medical-plan"><a href="medical-plan/${mr.id}">View</a></td>-->
                            <td class="fee">${lp.getBed().getName()}</td>
                            <td class="doctor-name">${lp.getBed().getPrice()}</td>
                            <td class="nurse-name">${lp.getBed().getRoom().getName()}</td>
                            <td class="report"><a href="patient-detail?patient-name=${lp.getName()}">View</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
             
         </div>
    </body>
</html>
