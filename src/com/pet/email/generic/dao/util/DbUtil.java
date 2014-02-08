package com.pet.email.generic.dao.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {
	
	public static final void close(ResultSet rs) {
		try {
			if(rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static final void close(PreparedStatement ps) {
		try {
			if(ps != null)
				ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static final void close(Connection conn) {
		try {
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static final void close(PreparedStatement ps, Connection conn) {
		close(ps);
		close(conn);
	}
	
	public static final void close(ResultSet rs, PreparedStatement ps, Connection conn) {
		close(rs);
		close(ps);
		close(conn);
	}

}
