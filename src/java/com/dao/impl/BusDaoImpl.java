/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao.impl;

import com.dao.BusDao;
import com.model.Bus;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import javax.sql.DataSource;

/**
 *
 * @author Administrator
 */
public class BusDaoImpl implements BusDao {

    private final DataSource dataSource;

    public BusDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Set<Bus> read() {
        String req = "Select * from bus";
        Set<Bus> buss;
        try (Connection conn = dataSource.getConnection()) {
            try (Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(req)) {
                buss = new HashSet<>();
                while (resultSet.next()) {//пока есть записи 
                    int id = resultSet.getInt("id");
                    String driverName = resultSet.getString("driver_name");
                    String busNumber = resultSet.getString("bus_number");
                    String routeNumber = resultSet.getString("route_number");
                    String brand = resultSet.getString("brand");
                    int yearOfService = resultSet.getInt("year_of_service");
                    int mileage = resultSet.getInt("mileage");

                    buss.add(new Bus(id, driverName, busNumber, routeNumber, brand, yearOfService, mileage));
                }
            }
            return buss;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
