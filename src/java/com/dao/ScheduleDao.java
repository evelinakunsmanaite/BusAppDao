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
    int create(Schedule schedule);

    Set<Schedule> read();

    int update(Schedule schedule);

    int delete(Schedule schedule);
}
