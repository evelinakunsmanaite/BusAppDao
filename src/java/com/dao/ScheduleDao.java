/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.model.Schedule;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public interface ScheduleDao {
    boolean create(Schedule schedule);

    Set<Schedule> read();

    boolean update();

    boolean delete(int id);
}
