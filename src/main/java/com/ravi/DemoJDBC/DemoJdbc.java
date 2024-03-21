package com.ravi.DemoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoJdbc {
	public static void main(String[] args) throws Exception {
		int id = 104;
		String name = "Sumit";
		int age = 29;
		String url = "jdbc:mysql://localhost:3306/DemoJdbc";
		String names = "root";
		String password = "SYSTEM";
		String sql = "insert into student values(?,?,?)";
		System.out.println("Connection Established");

		try {
			Connection con = DriverManager.getConnection(url, names, password);

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.execute();
			con.close();
			System.out.println("Connection Closed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
