package com.cloudwick.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDaoImplementation implements JdbcDao {

	private Connection con;

	@Override
	public void insertUser(String uName, String pwd) throws SQLException {
		// TODO Auto-generated method stub

		String sql = "insert into User (username,password) values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uName);
		ps.setString(2, pwd);
		int count = ps.executeUpdate();
		System.out.println("Inserted count" + count);
	}

	@Override
	public void selectUser(int id) throws SQLException {
		// TODO Auto-generated method stub

		String sql = "select * from User where UserId=" + id;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			int id2 = rs.getInt(1);
			String username = rs.getString(2);
			String pwd = rs.getString(3);
			System.out.println(id2);
			System.out.print("\t" + username);
			System.out.print("\t" + pwd);

		}
	}

	@Override
	public void insertBatchUser() throws SQLException {
		// TODO Auto-generated method stub

		Statement st = con.createStatement();
		String sql = "insert into User (username,password) values('abc','def')";
		st.addBatch(sql);
		String sql1 = "insert into User (username,password) values('abc11','def1')";
		st.addBatch(sql1);
		String sql2 = "insert into User (username,password) values('abc12','def2')";
		st.addBatch(sql2);

		int[] data = st.executeBatch();
		for (int count : data) {
			System.out.println(count);
		}
	}

	private void prepareConnection() throws ClassNotFoundException,
			SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://192.168.1.167/test";
		con = DriverManager.getConnection(url, "root", "hadoop123");

	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		JdbcDaoImplementation obj = new JdbcDaoImplementation();

		obj.prepareConnection();

		obj.insertBatchUser();

	}

}
