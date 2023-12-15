/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service.impl;

import com.dao.BusDao;
import com.model.Bus;
import com.service.BusService;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Administrators
 */
public class BusServiceImpl implements BusService {

    BusDao dao;

    public BusServiceImpl(BusDao dao) {
        this.dao = dao;
    }

    @Override
    public Set<Bus> read() {
        return dao.read();
    }

    @Override
    public List<Bus> explore(int exp) {
        return dao.read().stream()
                .filter(bus -> (2023 - bus.getYearOfService() >= exp && exp != 0)
                || (2023 - bus.getYearOfService() == exp && exp == 0))
                .collect(Collectors.toList());
    }

    @Override
    public List<Bus> mileage(int mlg) {
        return dao.read().stream()
                .filter(bus -> (bus.getMileage() >= mlg && mlg != 0)
                || (2023 - bus.getMileage() == mlg && mlg == 0))
                .collect(Collectors.toList());
    }

    @Override
    public List<Bus> route(String routeNumber) {
        return dao.read().stream()
                .filter(bus -> bus.getRouteNumber().equals(routeNumber))
                .collect(Collectors.toList());
    }

}
