
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Customer</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <head>
        <style>
            .btn {
                border: 2px solid black;
                background-color: white;
                color: black;
                padding: 14px 28px;
                font-size: 16px;
                cursor: pointer;
            }

            /* Green */
            .success {
                border-color: #4CAF50;
                color: green;
            }

            .success:hover {
                background-color: #4CAF50;
                color: white;
            }

            /* Blue */
            .info {
                border-color: #2196F3;
                color: dodgerblue;
            }

            .info:hover {
                background: #2196F3;
                color: white;
            }

            /* Orange */
            .warning {
                border-color: #ff9800;
                color: orange;
            }

            .warning:hover {
                background: #ff9800;
                color: white;
            }

            /* Red */
            .danger {
                border-color: #f44336;
                color: red;
            }

            .danger:hover {
                background: #f44336;
                color: white;
            }

            /* Gray */
            .default {
                border-color: #e7e7e7;
                color: black;
            }

            .default:hover {
                background: #e7e7e7;
            }
        </style>
    </head>
    <body>
         <%@include file="navigationBar.jsp" %>
        <div class="container" style="position: absolute; left: 15%; top: 20%; width: 70%; height: 100%">
            <h2>Manage Customers</h2>
            <table class="table">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Address</th>
                        <th>Detail</th>
                        <th>Update As</th>
                        <th>Delete</th>     
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Default</td>
                        <td>Defaultson</td>
                        <td>def@somemail.com</td>
                        <td>def@somemail.com</td>
                        <td>def@somemail.com</td>
                        <td><button class="btn info">Info</button></td>
                        <td><button class="btn danger">Danger</button>
                        </td>
                    </tr>      
                </tbody>
            </table>
        </div>
    </body>
</html> 
