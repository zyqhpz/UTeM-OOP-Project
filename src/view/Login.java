package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtSportCentreManagement;
	private JTextField txtManagementSystem;
	private JTextField txtId;
	private JTextField txtPassword;
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
		contentPane.setForeground(new Color(255, 239, 213));
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSportCentreManagement = new JTextField();
		txtSportCentreManagement.setHorizontalAlignment(SwingConstants.CENTER);
		txtSportCentreManagement.setEditable(false);
		txtSportCentreManagement.setBackground(new Color(255, 235, 205));
		txtSportCentreManagement.setFont(new Font("Consolas", Font.ITALIC, 40));
		txtSportCentreManagement.setText(" Sport Centre \r\n");
		txtSportCentreManagement.setBounds(238, 100, 459, 64);
		contentPane.add(txtSportCentreManagement);
		txtSportCentreManagement.setColumns(10);
		
		txtManagementSystem = new JTextField();
		txtManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		txtManagementSystem.setEditable(false);
		txtManagementSystem.setBackground(new Color(255, 235, 205));
		txtManagementSystem.setText(" Management System\r\n");
		txtManagementSystem.setFont(new Font("Consolas", Font.ITALIC, 40));
		txtManagementSystem.setColumns(10);
		txtManagementSystem.setBounds(238, 163, 459, 64);
		contentPane.add(txtManagementSystem);
		
		txtId = new JTextField();
		txtId.setHorizontalAlignment(SwingConstants.CENTER);
		txtId.setEditable(false);
		txtId.setBackground(new Color(255, 235, 205));
		txtId.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		txtId.setText("ID :");
		txtId.setBounds(178, 393, 130, 45);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setEditable(false);
		txtPassword.setBackground(new Color(255, 235, 205));
		txtPassword.setText("Password :");
		txtPassword.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		txtPassword.setColumns(10);
		txtPassword.setBounds(178, 487, 130, 45);
		contentPane.add(txtPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu menuFrame = new MainMenu();
        		menuFrame.setVisible(true);
        		dispose();
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(255, 250, 205));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(346, 593, 179, 45);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(346, 393, 317, 45);
		contentPane.add(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(346, 487, 317, 45);
		contentPane.add(passwordField);
	}
}
