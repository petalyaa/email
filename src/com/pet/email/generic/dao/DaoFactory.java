package com.pet.email.generic.dao;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.pet.email.generic.util.CommonUtil;
import com.pet.email.generic.util.PropertiesUtil;

public class DaoFactory {
	
	private static DaoFactory INSTANCE;
	
	private static ComboPooledDataSource dataSource;
	
    private static final String DRIVER_NAME;
    
    private static final String JDBC_URL;
    
    private static final String USERNAME;
    
    private static final String PASSWORD;
    
    private static final int MIN_POOL_SIZE;
    
    private static final int ACQUIRE_INCREMENT;
    
    private static final int MAX_POOL_SIZE;
    
    static {
    	Properties properties = PropertiesUtil.loadFromClassPath("/email.properties", DaoFactory.class);
    	DRIVER_NAME = properties.getProperty("db.class");
    	JDBC_URL = properties.getProperty("db.jdbc");
    	USERNAME = properties.getProperty("db.username");
    	PASSWORD = properties.getProperty("db.password");
    	MIN_POOL_SIZE = CommonUtil.getInt(properties.getProperty("db.minPoolSize"), 5);
    	ACQUIRE_INCREMENT = CommonUtil.getInt(properties.getProperty("db.acquireIncrement"), 5);
    	MAX_POOL_SIZE = CommonUtil.getInt(properties.getProperty("db.maxPoolSize"), 20);
    }
    
    private DaoFactory() {
    	initConnection();
    }
    
    public static final DaoFactory getInstance() {
    	if(INSTANCE == null) 
    		INSTANCE = new DaoFactory();
    	return INSTANCE;
    }
    
    private void initConnection() {
    	dataSource = new ComboPooledDataSource();
    	try {
    		dataSource.setDriverClass(DRIVER_NAME);
    	} catch (PropertyVetoException e) {
    		e.printStackTrace();
    	}
    	dataSource.setJdbcUrl(JDBC_URL);
    	dataSource.setUser(USERNAME);
    	dataSource.setPassword(PASSWORD);
    	dataSource.setMinPoolSize(MIN_POOL_SIZE);
    	dataSource.setAcquireIncrement(ACQUIRE_INCREMENT);
    	dataSource.setMaxPoolSize(MAX_POOL_SIZE);
    }
    
    public Connection getConnection() throws SQLException {
    	return dataSource.getConnection();
    }

}
