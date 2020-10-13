/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rac.daoimpl;

import com.rac.dao.VehicleDao;
import com.rac.model.Vehicle;
import com.rac.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author personal
 */
public class VehicleDaoImpl implements VehicleDao {

    private String SelectQuery = "select vehicle_id, vehicle_reg_no, "
            + "vehicle_model_name, vehicle_availability, vehicle_category_id from vehicles";

    @Override
    public boolean AddVehicle(Vehicle Vehicle) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into vehicle (vehicle_id, vehicle_reg_no, "
                + "vehicle_model_name, vehicle_availability, vehicle_category_id) values (?,?,?,?,?)");
        ps.setInt(1, Vehicle.getId());
        ps.setString(2, Vehicle.getRegNo());
        ps.setString(3, Vehicle.getModelName());
        ps.setInt(4, 1);
        ps.setInt(5, Vehicle.getCategoryId());
        ps.executeUpdate();
        return true;
    }

    @Override
    public boolean UpdateVehicle(Vehicle Vehicle) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update vehicle set vehicle_id=?, vehicle_reg_no=?, "
                + "vehicle_model_name=?, vehicle_availability=? where vehicle_category_id=?");
        ps.setString(1, Vehicle.getRegNo());
        ps.setString(2, Vehicle.getModelName());
        ps.setInt(3, 1);
        ps.setInt(4, Vehicle.getCategoryId());
        ps.setInt(5, Vehicle.getId());

        ps.executeUpdate();
        return true;
    }

    @Override
    public boolean DeleteVehicle(int VehicleId) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from vehicle whare vehicle_id=?");
        ps.setInt(1, VehicleId);
        ps.executeUpdate();
        return true;
    }

    @Override
    public ResultSet GetVehicleByOneAttribute(String Attribute, String Condition, String Value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(SelectQuery, Attribute, Condition, Value);
    }

    @Override
    public ResultSet GetVehicleByMoreAttributes(ArrayList<String[]> AttributeValueList, String Operator) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet GetAllVehicles() throws SQLException {
        return new commonDaoImpl().getAllRecords(SelectQuery);
    }

}
