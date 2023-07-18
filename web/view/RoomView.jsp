<%-- 
    Document   : RoomView
    Created on : 17-07-2023, 17:55:43
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
            <h1> Rooms </h1>
        </div>
         <div class="content">
             <div class="">
                
                 <a href="add-room">Add New Room</a>
            </div>
             <div class="table">            
                <table>
                    <tr>
                        <th>Room Name</th>
                        <th>Room Floor</th>
                        
                        
                    </tr>
                    <c:if test="${list_room.size() == 0}">
                        <tr><td class="no-record" colspan="7">There is no record.</td></tr>
                    </c:if>
                    <c:forEach items="${list_room}" var="lr">
                        <tr>
                            
                            <td class="patient-name">${lr.getName()}</td>
                            <td class="diagnosis">${lr.getFloor()}</td>
                            
                            
                       
                        </tr>
                    </c:forEach>
                </table>
            </div>
             
         </div>
    </body>
</html>
