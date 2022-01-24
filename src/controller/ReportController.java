package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.*;
//import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

import org.jfree.data.time.Month;

import database.MyDatabase;
import model.Report;

public class ReportController {
//	private ReportController report;
	public ReportController() {}
	
	public ArrayList<Double> retrieveData(Report report) throws ClassNotFoundException, SQLException
	{
		String date = (String) report.getMonth();

		ArrayList<Double> data = new ArrayList<>();
		String sql = "SELECT SUM(booking.amount), SUM(booking.hour) FROM booking JOIN court ON court.id = booking.court_id JOIN sport ON sport.id = court.sport_id WHERE booking.date LIKE '%" + date + "%' GROUP BY sport.id";
		
		//1. Connection 
		Connection conn = MyDatabase.doConnection();
		
		//2. PreparedStatement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		//3. View or insert/update
		ResultSet result = preparedStatement.executeQuery();
		while(result.next())
		{
//			current_status = resultSet.getInt(1);
			data.add(result.getDouble(1));
			data.add(Double.valueOf(result.getInt(2)));
		}

		//4. Must close the connection
		conn.close();
				
		return data;
	}
	
	public ArrayList<Double> retrieveTotalResevation(Report report) throws ClassNotFoundException, SQLException
	{
		String date = (String) report.getMonth();

		ArrayList<Double> data = new ArrayList<>();
		String sql = "SELECT COUNT(booking.id) FROM booking JOIN court ON court.id = booking.court_id JOIN sport ON sport.id = court.sport_id WHERE booking.date LIKE '%" + date + "%' GROUP BY sport.id";
		
		//1. Connection 
		Connection conn = MyDatabase.doConnection();
		
		//2. PreparedStatement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
//		preparedStatement.setString(1, court);
		
		//3. View or insert/update
		ResultSet result = preparedStatement.executeQuery();
		while(result.next())
		{
			data.add(Double.valueOf(result.getInt(1)));
		}

		//4. Must close the connection
		conn.close();
				
		return data;
	}
	
	public ArrayList<Double> retrieveTotalReservationBySport(Report report) throws ClassNotFoundException, SQLException
	{
		String date = (String) report.getMonth();
		
		ArrayList<Double> data = new ArrayList<>();
		String sql = "SELECT COUNT(booking.id) FROM booking JOIN court ON court.id = booking.court_id JOIN sport ON sport.id = court.sport_id WHERE booking.date LIKE '%" + date + "%' GROUP BY sport.id";
		
		//1. Connection 
		Connection conn = MyDatabase.doConnection();
		
		//2. PreparedStatement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		//3. View or insert/update
		ResultSet result = preparedStatement.executeQuery();
		while(result.next())
		{
			data.add(Double.valueOf(result.getInt(1)));
		}

		//4. Must close the connection
		conn.close();
				
		return data;
	}
	
	public ArrayList<String> getDateList() throws ClassNotFoundException, SQLException {
		ArrayList<String> data = new ArrayList<>();

		String sql = "SELECT MONTH(date) AS month, YEAR(date) AS year FROM `booking` GROUP by month ORDER BY year";
		
		Connection conn = MyDatabase.doConnection();

		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		ResultSet result = preparedStatement.executeQuery();
		
		while(result.next())
		{
			Integer month = new Integer(result.getInt("month"));
			Integer year = new Integer(result.getInt("year"));
			String mon = month.toString();
			if (month < 10)
				mon = "0" + month.toString(); 
			data.add(year.toString() + "-" + mon);

		}

		//4. Must close the connection
		conn.close();
		
		return data;
	}
	
	public static void main(String[] args) {
		ReportController cc = new ReportController();
		try {
			ArrayList<String> dt = cc.getDateList();
			List<String> data = dt;
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
	}
}
