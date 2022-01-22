package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import database.MyDatabase;
import model.Court;
import model.RentDetail;

public class RentDetailController {
	public String viewNameQuery() throws ClassNotFoundException, SQLException 
	{
		String name = "";
		
		// Connection
		Connection conn = MyDatabase.doConnection();
		
		// Select Statement
		String sql = "select name from admin where id = '1'";
		
		// Prepared Statement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		// Result 
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
			name = resultSet.getString(1);
		
		conn.close();
		
		return name;
	}
	
	public double viewRateQuery(Court court) throws ClassNotFoundException, SQLException 
	{
		double rate = 0;
		
		// Connection
		Connection conn = MyDatabase.doConnection();
		
		// Get sport_id
		int sport_id = court.getSport_id();
			
		// Select Statement 
		String sql = "";
		
		if(sport_id == 1) // Futsal
		{
			sql = "select ratePerHour from sport where id = '1'";
		}
		else if(sport_id == 2) // Basketball
		{
			sql = "select ratePerHour from sport where id = '2'";
		}
		else if(sport_id == 3) // Badminton
		{
			sql = "select ratePerHour from sport where id = '3'";
		}
		
		// Prepared Statement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		// Result 
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			rate = resultSet.getDouble(1);
		}
		conn.close();
		
		return rate;
	}
	
	public int insertQuery(RentDetail rentDetail, Court court) throws ClassNotFoundException, SQLException 
	{
		int success = -1;
		
		// Connection
		Connection conn = MyDatabase.doConnection();
		
		// Insert Statement
		String sql = "insert booking (customer_name, hour, amount, date, court_id, admin_id) values (?,?,?,?,?,?)";
		
		// Timestamp
		//final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		
		// Get total amount of payment by calculation
		double ratePerHour = 0;
		
		if(court.getSport_id() == 1)
		{
			ratePerHour = 100.00;  // Futsal
		}
		else if(court.getSport_id() == 2)
		{
			ratePerHour = 75.00;  // Basketball
		}
		else if(court.getSport_id() == 3)
		{
			ratePerHour = 60.00;  // Badminton
		}
		
		double amount = rentDetail.getHour() * ratePerHour;
		
		// Prepared Statement
		PreparedStatement preparedStatement = conn.prepareStatement(sql); 
		preparedStatement.setString(1, rentDetail.getCustomerName()); 
		preparedStatement.setInt(2, rentDetail.getHour()); 
		preparedStatement.setDouble(3, amount); 
		preparedStatement.setTimestamp(4, timestamp); 
		preparedStatement.setString(5, court.getId()); 
		preparedStatement.setInt(6, 1); 
		
		success = preparedStatement.executeUpdate();
		conn.close();
		
		return success;
	}
	
	
}
