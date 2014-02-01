/*
 * Dao - Data access object design pattern is being used 
 * 
 * dtu design pattern: data transfer 
 * 
 * 
 */

package com.cloudwick.jdbc;

import java.sql.SQLException;

public interface JdbcDao {
	
	public void insertUser(String uName, String pwd) throws SQLException;
	public void selectUser(int id) throws SQLException;
	public void insertBatchUser() throws SQLException;

}
