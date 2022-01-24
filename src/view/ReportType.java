package view;

import view.report.*;
import model.Report;
import controller.ReportController;

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
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ReportType extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Color colour = new Color(248, 152, 128);
	JComboBox date;

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

	public ArrayList<String> retrieveDateList() throws ClassNotFoundException, SQLException {
		ArrayList<String> data = new ArrayList<>();

		ReportController cc;
		cc = new ReportController();

		data = cc.getDateList();

		return data;
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

		ArrayList<String> dateList = new ArrayList<>();
		try {
			dateList = retrieveDateList();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JLabel labelDateList = new JLabel("Select Month");
		labelDateList.setBounds(225, 150, 350, 115);
		labelDateList.setFont(new Font("Serif", Font.BOLD, 20));

		date = new JComboBox(dateList.toArray());
		date.setBounds(360, 195, 100, 30);
		date.addActionListener(this);

		Report rep = new Report();

		JButton btnTotalSale = new JButton("Monthly Total Sales");
		btnTotalSale.setBackground(Color.ORANGE);
		btnTotalSale.setBounds(225, 250, 450, 115);
		btnTotalSale.setFont(new Font("Verdana", Font.PLAIN, 22));
		btnTotalSale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rep.setMonth(date.getSelectedItem());
				TotalSalesByMonth frame = new TotalSalesByMonth("Monthly Total Sales", "", rep);
				frame.isVisible();
				dispose();
			}
		});

		JButton btnReservePercentage = new JButton("Monthly Reservation Percentage");
		btnReservePercentage.setBackground(Color.ORANGE);
		btnReservePercentage.setBounds(225, 400, 450, 115);
		btnReservePercentage.setFont(new Font("Verdana", Font.PLAIN, 22));
		btnReservePercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rep.setMonth(date.getSelectedItem());
				PieChartBySport frame = new PieChartBySport("Monthly Reservation Percentage", rep);
				frame.isVisible();
				dispose();
			}
		});

		JButton btnMonthlyReserve = new JButton("Monthly Total Reservation");
		btnMonthlyReserve.setBackground(Color.ORANGE);
		btnMonthlyReserve.setBounds(225, 550, 450, 115);
		btnMonthlyReserve.setFont(new Font("Verdana", Font.PLAIN, 22));
		btnMonthlyReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rep.setMonth(date.getSelectedItem());
				TotalReservationByMonth frame = new TotalReservationByMonth("Monthly Total Reservation", "", rep);
				frame.isVisible();
				dispose();
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

		contentPane.add(date);

		contentPane.add(labelTitle);
		contentPane.add(labelDateList);

		contentPane.setLayout(null);
		contentPane.add(btnTotalSale);
		contentPane.add(btnReservePercentage);
		contentPane.add(btnMonthlyReserve);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
