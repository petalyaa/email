package com.pet.email.generic.util;

import javax.servlet.ServletContext;

import com.pet.email.generic.dao.DaoFactory;

public class ServletContextUtil {
	
	private static final String DAO_FACTORY = "daoFactory";
	
	public static final DaoFactory getDaoFactory(ServletContext context) {
		Object obj = context.getAttribute(DAO_FACTORY);
		DaoFactory daoFactory = null;
		if(obj != null && obj instanceof DaoFactory) {
			daoFactory = (DaoFactory) obj;
		} else {
			daoFactory = DaoFactory.getInstance();
			context.setAttribute(DAO_FACTORY, daoFactory);
		}
		return daoFactory;
	}

}
