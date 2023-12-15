/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.model.Bus;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public interface BusService {

    Set<Bus> read();
    
    List<Bus> explore(int exp);
    
    List<Bus> mileage(int mlg);
    
    List<Bus> route(String routeNumber);

}
