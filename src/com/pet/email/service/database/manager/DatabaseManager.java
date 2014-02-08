package com.pet.email.service.database.manager;

import com.pet.email.service.database.model.DatabaseVO;

public interface DatabaseManager {
	
	public DatabaseVO getDatabaseList(DatabaseVO databaseVO);
	
	public DatabaseVO saveDatabase(DatabaseVO databaseVO);

}
