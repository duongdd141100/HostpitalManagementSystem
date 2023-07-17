<%-- 
    Document   : AddRoomView
    Created on : 17-07-2023, 18:03:49
    Author     : DUCLONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="css/Common.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            * {
                box-sizing: border-box;
            }

            input[type=text], select, textarea {
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                resize: vertical;
            }

            label {
                padding: 12px 12px 12px 0;
                display: inline-block;
            }

            input[type=submit] {
                background-color: #04AA6D;
                color: white;
                padding: 12px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                float: right;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }

            .container {
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 20px;
            }

            .col-25 {
                float: left;
                width: 25%;
                margin-top: 6px;
            }

            .col-75 {
                float: left;
                width: 75%;
                margin-top: 6px;
            }

            /* Clear floats after the columns */
            .row:after {
                content: "";
                display: table;
                clear: both;
            }

            /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
            @media screen and (max-width: 600px) {
                .col-25, .col-75, input[type=submit] {
                    width: 100%;
                    margin-top: 0;
                }
            }
        </style>
    </head>
    <body>
        <font style="color:red" >${message} </font>
        
        <div class="container">
            <form action="/add-room" method="post">
                <div class="row">
                    <div class="col-25">
                        <label for="fname">Room Name</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="fname" name="room_name" placeholder="Room Name">
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="lname">Room Floor</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="lname" name="room_floor" placeholder="Room Floor">
                    </div>
                </div>


                <div class="row">
                    <a href="../room">Back To List</a>
                    <input type="submit" value="Add New Room">
                </div>
            </form>
        </div>
    </body>
</html>
