package com.pet.email.generic.manager;

import org.apache.log4j.Logger;

import com.pet.email.generic.dao.DaoFactory;

public class BaseManager {
	
	private static final Logger logger = Logger.getLogger(BaseManager.class);
	
	protected DaoFactory daoFactory;
	
	public BaseManager(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	
	protected void logError(String msg, Throwable tw) {
		logger.error(msg, tw);
	}

}
