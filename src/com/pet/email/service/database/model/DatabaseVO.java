package com.pet.email.service.database.model;

import java.util.List;

import com.pet.email.generic.model.BaseVO;

public class DatabaseVO extends BaseVO {

	private static final long serialVersionUID = 1237221646271356666L;
	
	private List<Database> databaseList;
	
	private Database database;
	
	private long[] ids;

	public List<Database> getDatabaseList() {
		return databaseList;
	}

	public void setDatabaseList(List<Database> databaseList) {
		this.databaseList = databaseList;
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public long[] getIds() {
		return ids;
	}

	public void setIds(long[] ids) {
		this.ids = ids;
	}

}
