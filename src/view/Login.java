package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.UserController;
import model.User;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 0, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(10, 10, 866, 743);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 866, 363);
		panel.add(panel_1);
		panel_1.setBackground(new Color(123, 104, 238));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SPORT CENTRE \r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(288, 82, 326, 81);
		panel_1.add(lblNewLabel);
		
		JLabel lblManagementSystem = new JLabel("MANAGEMENT SYSTEM");
		lblManagementSystem.setForeground(new Color(255, 255, 255));
		lblManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblManagementSystem.setBounds(201, 173, 490, 81);
		panel_1.add(lblManagementSystem);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(162, 461, 50, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel_1_1.setBounds(162, 542, 169, 32);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		textField.setBounds(352, 461, 319, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		passwordField.setBounds(352, 542, 319, 32);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText().trim();
				String password = new String(passwordField.getPassword()).trim();
				
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				
				UserController userController = new UserController();
				try {
					String level = userController.doLogin(user);
					if(level.equals("1"))
					{
						new MainMenu().setVisible(true);
						dispose();
					}
					else
						JOptionPane.showMessageDialog(btnNewButton, "YOU ARE NOT AUTHORIZED !");
				} catch (ClassNotFoundException | SQLException e1){
					//to do auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		btnNewButton.setBounds(352, 634, 142, 41);
		panel.add(btnNewButton);
	}
}
