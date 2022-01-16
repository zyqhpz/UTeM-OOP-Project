package view;
import view.court.*;
import controller.CourtController;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Courts extends JFrame {

	private JPanel contentPane;
	private Color colour = new Color(248, 152, 128);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courts frame = new Courts();
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
	public Courts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 800);
		setTitle("Sport Selection");
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(325, 80, 325, 80));
		setContentPane(contentPane);
		
		CourtController cc = new CourtController();
		try {
			cc.updateStatus();
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		JButton btnBasketball = new JButton("Basketball");
		btnBasketball.setBounds(80, 325, 211, 111);
		btnBasketball.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnBasketball.setBackground(colour);
		btnBasketball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasketballCourt frame;
				try {
					frame = new BasketballCourt();
					frame.setVisible(true);
					dispose();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnFutsal = new JButton("Futsal");
		btnFutsal.setBounds(336, 325, 211, 111);
		btnFutsal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnFutsal.setBackground(colour);
		btnFutsal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FutsalCourt frame;
				try {
					frame = new FutsalCourt();
					frame.setVisible(true);
					dispose();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnBadminton = new JButton("Badminton");
		btnBadminton.setBounds(592, 325, 211, 111);
		btnBadminton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnBadminton.setBackground(colour);
		btnBadminton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BadmintonCourt frame;
				try {
					frame = new BadmintonCourt();
					frame.setVisible(true);
					dispose();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu frame = new MainMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(Color.GRAY);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(23, 23, 85, 21);
		contentPane.add(btnBack);
		
		
		contentPane.setLayout(null);
		contentPane.add(btnBasketball);
		contentPane.add(btnFutsal);
		contentPane.add(btnBadminton);
	}
}
