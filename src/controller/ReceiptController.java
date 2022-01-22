package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.MyDatabase;
import model.Receipt;

public class ReceiptController 
{
	public ArrayList<Receipt> getReceipt() throws SQLException, ClassNotFoundException
	{
		ArrayList<Receipt> receiptDetails = new ArrayList<Receipt>();
		
		String sql = "SELECT `customer_name`,`court_id`,`hour`,`amount`,`date` FROM booking WHERE `id`=(SELECT max(`id`) FROM booking);";
		
		String name = "SELECT admin.name FROM admin INNER JOIN booking ON booking.admin_id=admin.id WHERE booking.id=(SELECT max(id) FROM booking);";
		
		Connection conn = MyDatabase.doConnection();
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		PreparedStatement preparedStatementName = conn.prepareStatement(name);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		ResultSet resultSetName = preparedStatementName.executeQuery();
		
		while(resultSet.next() && resultSetName.next())
		{
			Receipt receipt = new Receipt();
			
			receipt.setName(resultSet.getString(1));
			receipt.setCourtID(resultSet.getString(2));
			receipt.setDuration(resultSet.getInt(3));
			receipt.setTotalPayment(resultSet.getBigDecimal(4));
			receipt.setDate(resultSet.getDate(5));
			receipt.setConfirmedBy(resultSetName.getString(1));
			
			receiptDetails.add(receipt);
 
			
		}
		
		conn.close();
		
		return receiptDetails;
	}
	
	
}
