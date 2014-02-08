package com.pet.email.web.database.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pet.email.generic.controller.BaseController;
import com.pet.email.service.database.manager.DatabaseManager;
import com.pet.email.service.database.manager.DatabaseManagerImpl;
import com.pet.email.service.database.model.Database;
import com.pet.email.service.database.model.DatabaseVO;
import com.pet.email.web.util.WebConstants;

public class DatabaseController extends BaseController {

	private static final long serialVersionUID = 1948499539381539469L;
	
	private DatabaseManager databaseManager;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = getActionParameter(request);
		if(WebConstants.GET_DATABASE_LIST.equals(action)) {
			getDatabaseList(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = getActionParameter(request);
		if(WebConstants.DO_SAVE_DATABASE.equals(action)) {
			doSaveDatabase(request, response);
		}
	}

	@Override
	public void init() throws ServletException {
		databaseManager = new DatabaseManagerImpl(getDaoFactory());
	}
	
	private void getDatabaseList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		DatabaseVO databaseVO = new DatabaseVO();
		databaseVO = databaseManager.getDatabaseList(databaseVO);
		printJSONResponse(response, databaseVO);
	}
	
	private void doSaveDatabase(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = getStringParameter(request, "name");
		String desc = getStringParameter(request, "desc");
		String type = getStringParameter(request, "type");
		Database database = new Database();
		database.setName(name);
		database.setDescription(desc);
		database.setType(type);
		DatabaseVO databaseVO = new DatabaseVO();
		databaseVO.setDatabase(database);
		databaseVO = databaseManager.saveDatabase(databaseVO);
		printJSONResponse(response, databaseVO);
	}

}
