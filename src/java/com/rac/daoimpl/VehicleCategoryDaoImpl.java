/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rac.daoimpl;

import com.rac.dao.VehicleCategoryDao;
import com.rac.model.VehicleCategory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author personal
 */
public class VehicleCategoryDaoImpl implements VehicleCategoryDao {

    @Override
    public boolean AddVehicleCategory(VehicleCategory VehicleCategory) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean UpdateVehicleCategory(VehicleCategory VehicleCategory) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteVehicleCategory(int VhicleCategoryId) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet GetVehicleCategoryByOneAttribute(String Attribute, String Condition, String Value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet GetVehicleCategoryByMoreAttributes(ArrayList<String[]> AttributeValueList, String Operator) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet GetAllVehicleCategories() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
