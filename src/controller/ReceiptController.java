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
		
		//String sql = "SELECT `customer_name`,`court_id`,`hour`,`amount`,`date`,`admin_id` FROM booking WHERE `id`=(SELECT max(`id`) FROM booking);";
		
		String sql = "SELECT MAX(booking.customer_name),booking.court_id,booking.hour,booking.amount,booking.date, admin.name FROM booking LEFT OUTER JOIN admin ON booking.admin_id = admin.id";
		
		Connection conn = MyDatabase.doConnection();
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next())
		{
			Receipt receipt = new Receipt();
			
			receipt.setName(resultSet.getString(1));
			receipt.setCourtID(resultSet.getString(2));
			receipt.setDuration(resultSet.getInt(3));
			receipt.setTotalPayment(resultSet.getBigDecimal(4));
			receipt.setDate(resultSet.getDate(5));
			receipt.setConfirmedBy(resultSet.getString(6));
			
			receiptDetails.add(receipt);
 
			
		}
		
		conn.close();
		
		return receiptDetails;
	}
}
