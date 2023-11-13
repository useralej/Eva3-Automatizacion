package mauricio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mauricio.bean.*;

public class MauricioDao {
	private String Url = "jdbc:mysql://localhost:3306/mauricio";
	private String Username = "root";
	private String Password = "";
	private String Driver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String Driver)
	{
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(Url, Username, Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public boolean validate(MauricioBean usuario)
	{
		boolean status = false;
		
		loadDriver(Driver);
		Connection con = getConnection();
		
		String sql = "select * from usuario where username = ? and password =?";
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, usuario.getUsername());
		ps.setString(2, usuario.getPassword());
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
