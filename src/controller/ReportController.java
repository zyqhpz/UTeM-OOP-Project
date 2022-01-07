package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.MyDatabase;
import model.Report;

public class ReportController {
	private ReportController report;
	public ReportController() {}
	
	public ArrayList<Double> retrieveData() throws ClassNotFoundException, SQLException
	{
//		int current_status = -1;
		
//		ArrayList<Double> data = null;
		ArrayList<Double> data = new ArrayList<>();
		String sql = "SELECT SUM(booking.amount), SUM(booking.hour) FROM booking JOIN court ON court.id = booking.court_id JOIN sport ON sport.id = court.sport_id GROUP BY sport.id";
		
		//1. Connection 
		Connection conn = MyDatabase.doConnection();
		
		//2. PreparedStatement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
//		preparedStatement.setString(1, court);
		
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
	
	
	
	public static void main(String[] args) {
		
//		CourtController cc = new CourtController();
		ReportController cc = new ReportController();
//		int status;
		try {
//			status = cc.checkStatus("F1");
			ArrayList<Double> dt = cc.retrieveData();
//			List<Double> data = new ArrayList<Double>();
			List<Double> data = dt;
//			System.out.println(status);
//			if(status == 0) {
//				cc.setStatus(1, "F1");		
//			}
//			else if(status == 1) {
//				cc.setStatus(0, "F1");
//			}
			
			Report modelR = new Report();
			modelR.setData(dt);
			
//			data.forEach(System.out::println);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	
}
