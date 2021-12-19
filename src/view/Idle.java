package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Idle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Idle frame = new Idle();
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
	public Idle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText(" Sport Centre \r\n");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Consolas", Font.ITALIC, 40));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(255, 235, 205));
		textField.setBounds(221, 162, 459, 64);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText(" Management System\r\n");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Consolas", Font.ITALIC, 40));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 235, 205));
		textField_1.setBounds(221, 225, 459, 64);
		contentPane.add(textField_1);
		
		JButton btnClickToEnter = new JButton("Click To Enter");
		btnClickToEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login loginFrame = new Login();
        		loginFrame.setVisible(true);
        		dispose();
			}
		});
		btnClickToEnter.setForeground(Color.BLACK);
		btnClickToEnter.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnClickToEnter.setBackground(new Color(255, 250, 205));
		btnClickToEnter.setBounds(361, 471, 204, 45);
		contentPane.add(btnClickToEnter);
	}

}
