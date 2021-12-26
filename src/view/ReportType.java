package view;
import view.report.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class ReportType extends JFrame {

//	private JPanel contentPane;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ReportType frame = new ReportType();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public ReportType() {
//		setTitle("Report Selection");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		setSize(900, 800);
//		setBackground(Color.WHITE);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(20, 80, 80, 80));
//		contentPane.setLayout(new BorderLayout(3, 1));
//		setContentPane(contentPane);
//		
//		JPanel panel = new JPanel();
//		contentPane.add(panel, BorderLayout.NORTH);
//		
//		JLabel labelTitle = new JLabel("Report Selection");
//		labelTitle.setFont(new Font("Serif", Font.BOLD, 35));
//		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
//		panel.add(labelTitle);
//		
//		JPanel panelCenter = new JPanel();
//		contentPane.add(panelCenter, BorderLayout.CENTER);
//
//		
//		JButton btnSalesMonth = new JButton("Monthly Sales");
//		btnSalesMonth.setBackground(Color.ORANGE);
//		btnSalesMonth.setBounds(0, 302, 724, 302);
//		btnSalesMonth.setFont(new Font("Verdana", Font.PLAIN, 25));
//		btnSalesMonth.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		panelCenter.setLayout(null);
//		panelCenter.setLayout(new GridLayout(0, 1, 0, 0));
//		
//		JButton btnWeeklyReserve = new JButton("Weeekly Reserved Court");
//		btnWeeklyReserve.setBackground(Color.ORANGE);
//		btnWeeklyReserve.setBounds(285, 0, 439, 196);
//		btnWeeklyReserve.setFont(new Font("Verdana", Font.PLAIN, 25));
//		btnWeeklyReserve.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		panelCenter.add(btnWeeklyReserve);
//		panelCenter.add(btnSalesMonth);
//		
//		JButton btnBack = new JButton("Back");
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				MainMenu frame = new MainMenu();
//				frame.setVisible(true);
//				dispose();
//			}
//		});
//		btnBack.setBackground(Color.GRAY);
//		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
//		btnBack.setBounds(23, 23, 85, 21);
//		
////		panel.add(btnBack);
//		
//	}
//

	private JPanel contentPane;
	private Color colour = new Color(248, 152, 128);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportType frame = new ReportType();
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
	public ReportType() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 800);
		setTitle("Report Selection");
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(325, 80, 325, 80));
		setContentPane(contentPane);
		
		JLabel labelTitle = new JLabel("Report Selection");
		labelTitle.setBounds(275, 50, 350, 115);
		labelTitle.setFont(new Font("Serif", Font.BOLD, 35));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnSalesMonth = new JButton("Monthly Sales");
		btnSalesMonth.setBackground(Color.ORANGE);
		btnSalesMonth.setBounds(275, 300, 350, 115);
		btnSalesMonth.setFont(new Font("Verdana", Font.PLAIN, 22));
		btnSalesMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Report frame = new Report("Monthly Sales");
				frame.isVisible();
				dispose();
			}
		});
		
		JButton btnWeeklyReserve = new JButton("Weeekly Reservation");
		btnWeeklyReserve.setBackground(Color.ORANGE);
		btnWeeklyReserve.setBounds(275, 485, 350, 115);
		btnWeeklyReserve.setFont(new Font("Verdana", Font.PLAIN, 22));
		btnWeeklyReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		contentPane.add(labelTitle);
		
		contentPane.setLayout(null);
		contentPane.add(btnSalesMonth);
		contentPane.add(btnWeeklyReserve);
	}
}
