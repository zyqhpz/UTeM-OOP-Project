package controller;

import database.MyDatabase;
import model.Court;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
	
	public void updateStatus() throws ClassNotFoundException, SQLException {
		String sql = "SELECT booking.hour, booking.date, booking.court_id FROM booking JOIN court ON booking.court_id = court.id";
		ArrayList<String> data = new ArrayList<String>();
		
		Connection conn = MyDatabase.doConnection();
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ResultSet resultSet = ps.executeQuery();
		while (resultSet.next())
		{
		    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			int duration = resultSet.getInt(1);
			Timestamp cl = resultSet.getTimestamp(2);
			Date bookDate = new Date(cl.getTime());
			String court_id = resultSet.getString(3);

			int bookHour = cl.getHours();
			int hours = bookHour + duration;
			bookDate.setHours(hours);
			
			String bookTime = formatter.format(bookDate);
			String currentTime = formatter.format(date);
			
			boolean compareDate = date.after(bookDate);
			if (compareDate) {
				String updateSql = "UPDATE court SET status = 0 WHERE id = ?";
				PreparedStatement psUpdate = conn.prepareStatement(updateSql);
				psUpdate.setString(1, court_id);
				psUpdate.executeUpdate();
			}
		}
	
		conn.close();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		CourtController cc = new CourtController();
//		cc.updateStatus();
		/*
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

