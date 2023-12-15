/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service.impl;

import com.dao.ScheduleDao;
import com.model.Bus;
import com.model.Schedule;
import com.service.ScheduleService;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator
 */
public class ScheduleServiceImpl implements ScheduleService {

    ScheduleDao dao;

    public ScheduleServiceImpl(ScheduleDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean create(Schedule schedule) {
        return dao.create(schedule) > 0;
    }

    @Override
    public Set<Schedule> read() {
        return dao.read();
    }

    @Override
    public boolean update(int id, String routeNumber, String schedule) {
        Schedule schedules = new Schedule(id, routeNumber, schedule);
        return dao.update(schedules) > 0;
    }

    @Override
    public boolean delete(int id) {
        Schedule schedules = new Schedule(id);
        return dao.delete(schedules) > 0;
    }

    @Override
    public List<Schedule> route(String routeNumber) {
        return dao.read().stream()
                .filter(schedule -> schedule.getRouteNumber().equals(routeNumber))
                .collect(Collectors.toList());
    }

}
