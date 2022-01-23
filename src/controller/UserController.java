package controller;
import model.User;
import database.MyDatabase;

import java.sql.*;

public class UserController {

	private User user;
	public UserController() {}
	
	public String doLogin(User user) throws ClassNotFoundException, SQLException
	{
		String level = "";
		String sql = "SELECT * FROM admin WHERE Id = ? and password = ?";
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
			level = result.getString(1);
		}
		
		//Compulsory
		//4. Must close the connection
		conn.close();
		
		return level;
	}

	
	public static void main(String[] args) {
		UserController userController = new UserController();
		
		User user = new User();
		user.setId(1);
		user.setUsername("ellycain");
		user.setPassword("elly.cain00");
		user.setName("Elly Cain");
		user.setLevel("1");
		
		
		try {
			String level = userController.doLogin(user);
			System.out.println("success with level "+ level);
		} catch (Exception e) {
			System.out.println("failed");
		}
	}
}
