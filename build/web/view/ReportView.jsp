<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link href="css/Common.css" rel="stylesheet" type="text/css"/>
<link href="css/ReportView.css" rel="stylesheet" type="text/css"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report</title>
    </head>
    <body>
        <jsp:include page="Header.jsp" />
        <div class="title">
            <h1>Report</h1>
        </div>
        <div class="content">
            <div class="report">
                <div>
                    <label>1. Doctor Notes</label>
                    <c:if test="${report == null || report.getDoctorNotes().length() == 0}">
                        <p>Nothing</p>
                    </c:if>
                    <c:if test="${report != null && report.getDoctorNotes().length() >= 0}">
                        <p>${report.getDoctorNotes()}</p>
                    </c:if>
                </div>
                <div>
                    <label>2. Nurse Notes</label>
                    <c:if test="${report == null || report.getNurseNotes().length() == 0}">
                        <p>Nothing</p>
                    </c:if>
                    <c:if test="${report != null && report.getNurseNotes().length() >= 0}">
                        <p>${report.getNurseNotes()}</p>
                    </c:if>        
                </div>
            </div>
        </div>
    </body>
</html>
