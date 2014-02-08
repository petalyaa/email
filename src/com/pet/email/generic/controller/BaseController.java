package com.pet.email.generic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.pet.email.generic.dao.DaoFactory;
import com.pet.email.generic.util.ServletContextUtil;
import com.pet.email.generic.util.WebCommonUtil;
import com.pet.email.web.util.WebConstants;

public abstract class BaseController extends HttpServlet {

	private static final long serialVersionUID = -3211833570777423897L;

	@Override
	protected abstract void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;

	@Override
	protected abstract void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;

	@Override
	public abstract void init() throws ServletException;
	
	public String getStringParameter(HttpServletRequest request, String paramName) {
		return request.getParameter(paramName);
	}
	
	public String getActionParameter(HttpServletRequest request) {
		return getStringParameter(request, WebConstants.ACTION_NAME);
	}
	
	public void printJSONResponse(HttpServletResponse response, Object obj) throws IOException {
		Gson gson = new Gson();
		String jsonStr = gson.toJson(obj);
		
		response.setContentType(WebCommonUtil.JSON_RESPONSE_TYPE);
		PrintWriter writer = response.getWriter();
		writer.write(jsonStr);
	}
	
	protected DaoFactory getDaoFactory() {
		ServletContext context = getServletContext();
		return ServletContextUtil.getDaoFactory(context);
	}
}
