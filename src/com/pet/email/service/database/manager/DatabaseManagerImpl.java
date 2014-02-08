package com.pet.email.service.database.manager;

import java.sql.Timestamp;
import java.util.List;

import com.pet.email.generic.dao.DaoFactory;
import com.pet.email.generic.exception.MainAppException;
import com.pet.email.generic.manager.BaseManager;
import com.pet.email.service.database.dao.DatabaseDao;
import com.pet.email.service.database.dao.DatabaseDaoImpl;
import com.pet.email.service.database.model.Database;
import com.pet.email.service.database.model.DatabaseVO;

public class DatabaseManagerImpl extends BaseManager implements DatabaseManager {
	
	private DatabaseDao databaseDao;

	public DatabaseManagerImpl(DaoFactory daoFactory) {
		super(daoFactory);
		databaseDao = new DatabaseDaoImpl(daoFactory);
	}

	@Override
	public DatabaseVO getDatabaseList(DatabaseVO databaseVO) {
		try {
			List<Database> databaseList = databaseDao.getDatabaseList();
			databaseVO.setDatabaseList(databaseList);
			databaseVO.setSuccess(true);
		} catch (MainAppException e) {
			logError("Failed to get database list", e);
			databaseVO.setSuccess(false);
			databaseVO.setFailedMsg(e.getMessage());
		}
		return databaseVO;
	}

	@Override
	public DatabaseVO saveDatabase(DatabaseVO databaseVO) {
		Database database = databaseVO.getDatabase();
		try {
			database.setDataCreated(new Timestamp(System.currentTimeMillis()));
			boolean isSuccess = databaseDao.saveDatabase(database);
			databaseVO.setSuccess(isSuccess);
		} catch (MainAppException e) {
			databaseVO.setSuccess(false);
			databaseVO.setFailedMsg(e.getMessage());
		}
		return databaseVO;
	}

	@Override
	public DatabaseVO deleteDatabase(DatabaseVO databaseVO) {
		long[] ids = databaseVO.getIds();
		if(ids != null && ids.length > 0) {
			try {
				boolean isSuccess = databaseDao.deleteDatabase(ids);
				databaseVO.setSuccess(isSuccess);
			} catch (MainAppException e) {
				databaseVO.setSuccess(false);
				databaseVO.setFailedMsg(e.getMessage());
			}
		}
		return databaseVO;
	}

}
