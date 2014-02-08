package com.pet.email.web.util;

import com.pet.email.generic.util.PropertiesUtil;
import com.pet.email.generic.util.WebCommonUtil;
import com.pet.email.service.util.ServiceConstants;

public class WebConstants {
	
	public static final String DEFAULT_LANDING_HASH = PropertiesUtil.getSystemProperties(PropertiesUtil.KEY_DEFAULT_LANDING_HASH, "#home");

	public static final String ACTION_NAME = WebCommonUtil.ACTION_NAME;
	
	public static final String GET_DATABASE_LIST = "getDatabaseList";
	
	public static final String DATABASE_TYPE_SUBSCRIBE = ServiceConstants.DATABASE_TYPE_SUBSCRIBE;
	
	public static final String DATABASE_TYPE_UNSUBSCRIBE = ServiceConstants.DATABASE_TYPE_UNSUBSCRIBE;
	
	public static final String DO_SAVE_DATABASE = "doSaveDatabase";
	
	public String getDO_SAVE_DATABASE() {
		return DO_SAVE_DATABASE;
	}
	
	public String getACTION_NAME() {
		return ACTION_NAME;
	}
	
	public String getDEFAULT_LANDING_HASH() {
		return DEFAULT_LANDING_HASH;
	}
	
	public String getGET_DATABASE_LIST() {
		return GET_DATABASE_LIST;
	}
	
	public String getDATABASE_TYPE_SUBSCRIBE() {
		return DATABASE_TYPE_SUBSCRIBE;
	}
	
	public String getDATABASE_TYPE_UNSUBSCRIBE() {
		return DATABASE_TYPE_UNSUBSCRIBE;
	}
	
}
