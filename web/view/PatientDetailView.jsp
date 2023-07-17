<%-- 
    Document   : PatientDetailView
    Created on : 17-07-2023, 16:47:26
    Author     : DUCLONG
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link href="css/Common.css" rel="stylesheet" type="text/css"/>
<link href="css/ReportView.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Header.jsp" />
        <div class="title">
            <h1>Patient Detail</h1>
        </div>
        <div class="content">
            <div class="report">
                <div>
                    <label>1. Patient Name</label>
                    <c:if test="${patient == null || patient.getName().length() == 0}">
                        <p>Nothing</p>
                    </c:if>
                    <c:if test="${patient != null && patient.getName().length() >= 0}">
                        <p>${patient.getName()}</p>
                    </c:if>
                </div>
                <div>
                    <label>2. Patient Phone</label>
                    <c:if test="${patient == null || patient.getPhoneNumber().length() == 0}">
                        <p>Nothing</p>
                    </c:if>
                    <c:if test="${patient != null && patient.getPhoneNumber().length() >= 0}">
                        <p>${patient.getPhoneNumber()}</p>
                    </c:if>        
                </div>
                <div>
                    <label>2. Patient Address</label>
                    <c:if test="${patient == null || patient.getAddress().length() == 0}">
                        <p>Nothing</p>
                    </c:if>
                    <c:if test="${patient != null && patient.getAddress().length() >= 0}">
                        <p>${patient.getAddress()}</p>
                    </c:if>        
                </div>
                <div>
                    <label>2. Bed Name</label>
                    <c:if test="${patient == null || patient.getBed().getName().length() == 0}">
                        <p>Nothing</p>
                    </c:if>
                    <c:if test="${patient != null && patient.getBed().getName().length() >= 0}">
                        <p>${patient.getBed().getName()}</p>
                    </c:if>        
                </div>
                <div>
                    <label>2. Bed Price</label>


                    <p>${patient.getBed().getPrice()}</p>

                </div>
                <div>
                    <label>2. Room Name</label>
                    <c:if test="${patient == null || patient.getBed().getRoom().getName().length() == 0}">
                        <p>Nothing</p>
                    </c:if>
                    <c:if test="${patient != null && patient.getBed().getRoom().getName().length() >= 0}">
                        <p>${patient.getBed().getRoom().getName()}</p>
                    </c:if>        
                </div>
                <div>
                    <button onclick="history.back()" class="button">Back To List</button>
                </div>        
            </div>

        </div>
    </body>
</html>
