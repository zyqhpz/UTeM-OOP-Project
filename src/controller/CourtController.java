package controller;

import database.MyDatabase;
import model.Court;

import java.sql.*;

public class CourtController {
	public int checkStatus(Court court) throws ClassNotFoundException, SQLException
	{
		int current_status = -1;
		String sql = "select status from court where id = ?";
		
		//1. Connection 
		Connection conn = MyDatabase.doConnection();
		
		//2. PreparedStatement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, court.getId());
		
		//3. View or insert/update
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			current_status = resultSet.getInt(1);
		}

		//4. Must close the connection
		conn.close();
				
		return current_status;
	}
	
	public void setStatus(String status, Court court) throws ClassNotFoundException, SQLException
	{
		String sql = "update court set status = ? where id = ?";
		
		//1. Connection 
		Connection conn = MyDatabase.doConnection();
		
		//2. PreparedStatement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, status);
		preparedStatement.setString(2, court.getId());
		
		//3. View or insert/update
		preparedStatement.executeUpdate();
		
		//4. Must close the connection
		conn.close();
	}
	
	public static void main(String[] args) {
		/*
		CourtController cc = new CourtController();
		int status;
		try {
			status = cc.checkStatus("F1");
			System.out.println(status);
			if(status == 0) {
				cc.setStatus(1, "F1");		
			}
			else if(status == 1) {
				cc.setStatus(0, "F1");
			}
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	*/
	}
}

