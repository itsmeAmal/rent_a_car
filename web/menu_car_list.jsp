<%@page import="com.rac.daoimpl.VehicleDaoImpl"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Rent-A-Car</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>-->
    </head>
    <body>
        <div class="container" style="position: absolute; left: 28%; top: 5%; width: 70%;">
            <h2>Available Vehicles</h2>
            <div class="list-group">
                <%
                    ResultSet rset = new VehicleDaoImpl().GetAllVehicles();
                    int i = 0;
                %>
                <table class="table table-bordered table-striped mb-0">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col"><i class="fas fa-image mr-2 grey-text" aria-hidden="true"></i>Vehicle Model</th>
                            <th scope="col"><i class="fas fa-book mr-2 grey-text" aria-hidden="true"></i>Reg No</th>
                            <th scope="col"><i class="fas fa-book mr-2 grey-text" aria-hidden="true"></i>Order Now</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%                            
                            while (rset.next()) {
                        %>
                        <tr>
                            <th scope="row"><%= ++i%></th>
                            <td><%=rset.getString("vehicle_model_name")%></td>
                            <td><%=rset.getString("vehicle_reg_no")%></td>
                            <td>Button</td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>               
            </div>
        </div>

    </body>
</html>
