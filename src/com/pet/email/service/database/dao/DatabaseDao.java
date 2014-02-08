package com.pet.email.service.database.dao;

import java.util.List;

import com.pet.email.generic.exception.MainAppException;
import com.pet.email.service.database.model.Database;

public interface DatabaseDao {

	public List<Database> getDatabaseList() throws MainAppException;
	
	public boolean saveDatabase(Database database) throws MainAppException;
	
}
