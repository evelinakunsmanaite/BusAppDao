package com.controller;

import com.dao.ScheduleDao;
import com.dao.impl.ScheduleDaoImpl;
import com.service.ScheduleService;
import com.service.impl.ScheduleServiceImpl;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

import com.dao.BusDao;
import com.dao.impl.BusDaoImpl;
import com.service.BusService;
import com.service.impl.BusServiceImpl;

import javax.sql.DataSource;
import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;

public abstract class InitServlet extends HttpServlet {

    private @Resource(name = "jdbc/GuestsDB")//испальзование листнера
    DataSource dataSource;
    
    protected UserDao userDao;
    protected UserService userService; 
    
    protected BusDao busDao;
    protected BusService busService;
    
    protected ScheduleDao scheduleDao;
    protected ScheduleService scheduleService;

    @Override
    public void init() {//инициализация объектов с которыми работает сервлеты
        userDao = new UserDaoImpl(dataSource);
        userService = new UserServiceImpl(userDao);
        
        busDao = new BusDaoImpl(dataSource);
        busService = new BusServiceImpl(busDao);
        
        scheduleDao = new ScheduleDaoImpl(dataSource);
        scheduleService = new ScheduleServiceImpl(scheduleDao);
    }
}
