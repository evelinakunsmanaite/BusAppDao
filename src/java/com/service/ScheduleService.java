/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.model.Schedule;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public interface ScheduleService {
    boolean create(Schedule schedule);

    Set<Schedule> read();

    boolean update(int id, String routeNumber, String schedule);

    boolean delete(int id);
    
    List<Schedule> route(String routeNumber);
}
