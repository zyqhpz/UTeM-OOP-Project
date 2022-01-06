package view.court;
import view.Courts;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CourtController;
import model.Court;

import javax.swing.JTextField;

public class BasketballCourt extends JFrame {

	private JPanel contentPane;
	private Color colour = new Color(62, 180, 137);
	private Color highlight = new Color(222, 244, 64);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasketballCourt frame = new BasketballCourt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public BasketballCourt() throws ClassNotFoundException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 800);
		setTitle("Basketball Court");
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(80,80,80,80));
		setContentPane(contentPane);
		
		JButton btnB1 = new JButton("B1");
		btnB1.setBounds(80, 80, 343, 603);
		btnB1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController ccb1 = new CourtController();
		int status = -1;
		status = ccb1.checkStatus("B1");
		if(status == 1) {
			btnB1.setBackground(Color.RED);
			btnB1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnB1.setBackground(colour);
						try {
							ccb1.setStatus("0", "B1");
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
		}
		else if(status == 0){
			btnB1.setBackground(colour);
			btnB1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnB1.setBackground(highlight);
						try {
							ccb1.setStatus("1", "B1");
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
		}
		
		JButton btnB2 = new JButton("B2");
		btnB2.setBounds(463, 80, 343, 603);
		btnB2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController ccb2 = new CourtController();
		int status2 = -1;
		status2 = ccb2.checkStatus("B2");
		if(status2 == 1) {
			btnB2.setBackground(Color.RED);
			btnB2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnB2.setBackground(colour);
						try {
							ccb2.setStatus("0", "B2");
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
		}
		else if(status2 == 0){
			btnB2.setBackground(colour);
			btnB2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnB2.setBackground(highlight);
						try {
							ccb2.setStatus("1", "B2");
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
		}
		
		contentPane.setLayout(null);
		contentPane.add(btnB1);
		contentPane.add(btnB2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courts frame = new Courts();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(Color.GRAY);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(23, 23, 85, 21);
		contentPane.add(btnBack);
			
	}
}
