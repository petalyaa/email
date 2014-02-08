package com.pet.email.generic.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class BaseDao {
	
	protected DaoFactory daoFactory;
	
	public BaseDao(DaoFactory daoFactory){
		this.daoFactory = daoFactory;
	}
	
	protected Connection getConnection() throws SQLException {
		return daoFactory.getConnection();
	}

}
