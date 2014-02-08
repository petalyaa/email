package com.pet.email.service.database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pet.email.generic.dao.BaseDao;
import com.pet.email.generic.dao.DaoFactory;
import com.pet.email.generic.dao.util.DbUtil;
import com.pet.email.generic.exception.MainAppException;
import com.pet.email.generic.util.CommonUtil;
import com.pet.email.service.database.model.Database;

public class DatabaseDaoImpl extends BaseDao implements DatabaseDao {

	public DatabaseDaoImpl(DaoFactory daoFactory) {
		super(daoFactory);
	}

	@Override
	public List<Database> getDatabaseList() throws MainAppException {
		List<Database> databaseList = new ArrayList<Database>();
		String sqlStr = "select a.id, a.name, a.description, a.date_created, a.status, a.subscription_type, a.database_size from contact_databases a";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sqlStr);
			rs = ps.executeQuery();
			while(rs.next()) {
				Database database = new Database();
				database.setActive(CommonUtil.toBoolean(rs.getInt("status")));
				database.setDataCreated(rs.getTimestamp("date_created"));
				database.setDescription(rs.getString("description"));
				database.setId(rs.getLong("id"));
				database.setName(rs.getString("name"));
				database.setSize(rs.getLong("database_size"));
				database.setType(rs.getString("subscription_type"));
				databaseList.add(database);
			}
		} catch (SQLException e) {
			throw new MainAppException("SqlError", e);
		} finally {
			DbUtil.close(rs, ps, conn);
		}
		return databaseList;
	}

	@Override
	public boolean saveDatabase(Database database) throws MainAppException {
		String sqlStr = "insert into contact_databases(name, description, date_created, status, subscription_type, database_size, userid) values (?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		boolean isSuccess = false;
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sqlStr);
			ps.setString(1, database.getName());
			ps.setString(2, database.getDescription());
			ps.setTimestamp(3, database.getDataCreated());
			ps.setInt(4, CommonUtil.toInt(database.isActive()));
			ps.setString(5, database.getType());
			ps.setLong(6, database.getSize());
			ps.setLong(7, database.getUserId());
			ps.execute();
			isSuccess = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.close(ps, conn);
		}
		return isSuccess;
	}

	@Override
	public boolean deleteDatabase(long[] ids) throws MainAppException {
		StringBuilder sb = new StringBuilder();
		sb.append("delete from contact_databases a where a.id in(");
		for(int i = 0; i < ids.length; i++) {
			if(i > 0) 
				sb.append(", ");
			sb.append(ids[i]);
		}
		sb.append(")");
		
		String sqlStr = sb.toString();
		boolean isSuccess = true;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sqlStr);
			ps.execute();
			isSuccess = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.close(ps, conn);
		}
		return isSuccess;
	}

}
