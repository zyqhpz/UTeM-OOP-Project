package controller;
import model.User;
import database.MyDatabase;

import java.sql.*;

public class UserController {

	private User user;
	public UserController() {}
	
	public int doLogin(User user) throws ClassNotFoundException, SQLException
	{
		int success = -1;
				
		String sql = "SELECT * FROM admin WHERE username = ? and password = ?";
		//1. Connection 
		Connection conn = MyDatabase.doConnection();
		//2. PreparedStatement
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, user.getUsername());
		preparedStatement.setString(2, user.getPassword());
		
		//3. View or insert/update
		ResultSet result = preparedStatement.executeQuery();
		if(result.next())
		{
			user.setUsername(user.getUsername());
			user.setPassword(user.getPassword());
			user.setId(Integer.parseInt(result.getString(1)));
			user.setName(result.getString(2));
		}
		
		this.user = user;
		//int id = user.getId();
		
		//Compulsory
		//4. Must close the connection
		conn.close();
		
		return 1;
	}
	
	public static void main(String[] args) {
		UserController userControl = new UserController();
		
		User user = new User();
		user.setUsername("ellycain");
		user.setPassword("elly.cain00");
		
		try {
			int success = userControl.doLogin(user);
			System.out.println("success "+ success);
		} catch (Exception e) {
			System.out.println("failed");
		}
	}
}
