package view.court;
import view.Courts;
import view.GuiRentDetail;

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

import controller.CourtController;
import model.Court;

public class BadmintonCourt extends JFrame {

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
					BadmintonCourt frame = new BadmintonCourt();
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
	public BadmintonCourt() throws ClassNotFoundException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 800);
		setTitle("Badminton Court");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
		setContentPane(contentPane);
		
		
		JButton btnA1 = new JButton("A1");
		btnA1.setBounds(40, 41, 190, 116);
		btnA1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca1 = new CourtController();
		Court courta1 = new Court();
		courta1.setId("A1");
		int status = -1;
		status = cca1.checkStatus(courta1);
		if(status == 1) {
			btnA1.setBackground(Color.RED);
		}
		else if(status == 0){
			btnA1.setBackground(colour);
			btnA1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA1.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta1);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA2 = new JButton("A2");
		btnA2.setBounds(245, 41, 190, 116);
		btnA2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca2 = new CourtController();
		Court courta2 = new Court();
		courta2.setId("A2");
		int status2 = -1;
		status2 = cca2.checkStatus(courta2);
		if(status2 == 1) {
			btnA2.setBackground(Color.RED);
		}
		else if(status2 == 0){
			btnA2.setBackground(colour);
			btnA2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA2.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta2);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA3 = new JButton("A3");
		btnA3.setBounds(450, 41, 190, 116);
		btnA3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca3 = new CourtController();
		Court courta3 = new Court();
		courta3.setId("A3");
		int status3 = -1;
		status3 = cca3.checkStatus(courta3);
		if(status3 == 1) {
			btnA3.setBackground(Color.RED);
		}
		else if(status3 == 0){
			btnA3.setBackground(colour);
			btnA3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA3.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta3);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA4 = new JButton("A4");
		btnA4.setBounds(655, 41, 190, 116);
		btnA4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca4 = new CourtController();
		Court courta4 = new Court();
		courta4.setId("A4");
		int status4 = -1;
		status4 = cca4.checkStatus(courta4);
		if(status4 == 1) {
			btnA4.setBackground(Color.RED);
		}
		else if(status4 == 0){
			btnA4.setBackground(colour);
			btnA4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA4.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta4);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA5 = new JButton("A5");
		btnA5.setBounds(40, 182, 190, 116);
		btnA5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca5 = new CourtController();
		Court courta5 = new Court();
		courta5.setId("A5");
		int status5 = -1;
		status5 = cca5.checkStatus(courta5);
		if(status5 == 1) {
			btnA5.setBackground(Color.RED);
		}
		else if(status5 == 0){
			btnA5.setBackground(colour);
			btnA5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA5.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta5);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA6 = new JButton("A6");
		btnA6.setBounds(245, 182, 190, 116);
		btnA6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca6 = new CourtController();
		Court courta6 = new Court();
		courta6.setId("A6");
		int status6 = -1;
		status6 = cca6.checkStatus(courta6);
		if(status6 == 1) {
			btnA6.setBackground(Color.RED);
		}
		else if(status6 == 0){
			btnA6.setBackground(colour);
			btnA6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA6.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta6);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA7 = new JButton("A7");
		btnA7.setBounds(450, 182, 190, 116);
		btnA7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca7 = new CourtController();
		Court courta7 = new Court();
		courta7.setId("A7");
		int status7 = -1;
		status7 = cca7.checkStatus(courta7);
		if(status7 == 1) {
			btnA7.setBackground(Color.RED);
		}
		else if(status7 == 0){
			btnA7.setBackground(colour);
			btnA7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA7.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta7);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA8 = new JButton("A8");
		btnA8.setBounds(655, 182, 190, 116);
		btnA8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca8 = new CourtController();
		Court courta8 = new Court();
		courta8.setId("A8");
		int status8 = -1;
		status8 = cca8.checkStatus(courta8);
		if(status8 == 1) {
			btnA8.setBackground(Color.RED);
		}
		else if(status8 == 0){
			btnA8.setBackground(colour);
			btnA8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA8.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta8);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA9 = new JButton("A9");
		btnA9.setBounds(40, 323, 190, 116);
		btnA9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca9 = new CourtController();
		Court courta9 = new Court();
		courta9.setId("A9");
		int status9 = -1;
		status9 = cca9.checkStatus(courta9);
		if(status9 == 1) {
			btnA9.setBackground(Color.RED);
		}
		else if(status9 == 0){
			btnA9.setBackground(colour);
			btnA9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA9.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta9);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA10 = new JButton("A10");
		btnA10.setBounds(245, 323, 190, 116);
		btnA10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca10 = new CourtController();
		Court courta10 = new Court();
		courta10.setId("A10");
		int status10 = -1;
		status10 = cca10.checkStatus(courta10);
		if(status10 == 1) {
			btnA10.setBackground(Color.RED);
		}
		else if(status10 == 0){
			btnA10.setBackground(colour);
			btnA10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA10.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta10);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA11 = new JButton("A11");
		btnA11.setBounds(450, 323, 190, 116);
		btnA11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca11 = new CourtController();
		Court courta11 = new Court();
		courta11.setId("A11");
		int status11 = -1;
		status11 = cca11.checkStatus(courta11);
		if(status11 == 1) {
			btnA11.setBackground(Color.RED);
		}
		else if(status11 == 0){
			btnA11.setBackground(colour);
			btnA11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA11.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta11);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA12 = new JButton("A12");
		btnA12.setBounds(655, 323, 190, 116);
		btnA12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca12 = new CourtController();
		Court courta12 = new Court();
		courta12.setId("A12");
		int status12 = -1;
		status12 = cca12.checkStatus(courta12);
		if(status12 == 1) {
			btnA12.setBackground(Color.RED);
		}
		else if(status12 == 0){
			btnA12.setBackground(colour);
			btnA12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA12.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta12);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA13 = new JButton("A13");
		btnA13.setBounds(40, 464, 190, 116);
		btnA13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca13 = new CourtController();
		Court courta13 = new Court();
		courta13.setId("A13");
		int status13 = -1;
		status13 = cca13.checkStatus(courta13);
		if(status13 == 1) {
			btnA13.setBackground(Color.RED);
		}
		else if(status13 == 0){
			btnA13.setBackground(colour);
			btnA13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA13.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta13);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA14 = new JButton("A14");
		btnA14.setBounds(245, 464, 190, 116);
		btnA14.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca14 = new CourtController();
		Court courta14 = new Court();
		courta14.setId("A14");
		int status14 = -1;
		status14 = cca14.checkStatus(courta14);
		if(status14 == 1) {
			btnA14.setBackground(Color.RED);
		}
		else if(status14 == 0){
			btnA14.setBackground(colour);
			btnA14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA14.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta14);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA15 = new JButton("A15");
		btnA15.setBounds(450, 464, 190, 116);
		btnA15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca15 = new CourtController();
		Court courta15 = new Court();
		courta15.setId("A15");
		int status15 = -1;
		status15 = cca15.checkStatus(courta15);
		if(status15 == 1) {
			btnA15.setBackground(Color.RED);
		}
		else if(status15 == 0){
			btnA15.setBackground(colour);
			btnA15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA15.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta15);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA16 = new JButton("A16");
		btnA16.setBounds(655, 464, 190, 116);
		btnA16.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca16 = new CourtController();
		Court courta16 = new Court();
		courta16.setId("A16");
		int status16 = -1;
		status16 = cca16.checkStatus(courta16);
		if(status16 == 1) {
			btnA16.setBackground(Color.RED);
		}
		else if(status16 == 0){
			btnA16.setBackground(colour);
			btnA16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA16.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta16);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA17 = new JButton("A17");
		btnA17.setBounds(40, 605, 190, 116);
		btnA17.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca17 = new CourtController();
		Court courta17 = new Court();
		courta17.setId("A17");
		int status17 = -1;
		status17 = cca17.checkStatus(courta17);
		if(status17 == 1) {
			btnA17.setBackground(Color.RED);
		}
		else if(status17 == 0){
			btnA17.setBackground(colour);
			btnA17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA17.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta17);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA18 = new JButton("A18");
		btnA18.setBounds(245, 605, 190, 116);
		btnA18.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca18 = new CourtController();
		Court courta18 = new Court();
		courta18.setId("A18");
		int status18 = -1;
		status18 = cca18.checkStatus(courta18);
		if(status18 == 1) {
			btnA18.setBackground(Color.RED);
		}
		else if(status18 == 0){
			btnA18.setBackground(colour);
			btnA18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA18.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta18);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA19 = new JButton("A19");
		btnA19.setBounds(450, 605, 190, 116);
		btnA19.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca19 = new CourtController();
		Court courta19 = new Court();
		courta19.setId("A19");
		int status19 = -1;
		status19 = cca19.checkStatus(courta19);
		if(status19 == 1) {
			btnA19.setBackground(Color.RED);
		}
		else if(status19 == 0){
			btnA19.setBackground(colour);
			btnA19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA19.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta19);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnA20 = new JButton("A20");
		btnA20.setBounds(655, 605, 190, 116);
		btnA20.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca20 = new CourtController();
		Court courta20 = new Court();
		courta20.setId("A20");
		int status20 = -1;
		status20 = cca20.checkStatus(courta20);
		if(status20 == 1) {
			btnA20.setBackground(Color.RED);
		}
		else if(status20 == 0){
			btnA20.setBackground(colour);
			btnA20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA20.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courta20);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		contentPane.setLayout(null);
		contentPane.add(btnA1);
		contentPane.add(btnA2);
		contentPane.add(btnA3);
		contentPane.add(btnA4);
		contentPane.add(btnA5);
		contentPane.add(btnA6);
		contentPane.add(btnA7);
		contentPane.add(btnA8);
		contentPane.add(btnA9);
		contentPane.add(btnA10);
		contentPane.add(btnA11);
		contentPane.add(btnA12);
		contentPane.add(btnA13);
		contentPane.add(btnA14);
		contentPane.add(btnA15);
		contentPane.add(btnA16);
		contentPane.add(btnA17);
		contentPane.add(btnA18);
		contentPane.add(btnA19);
		contentPane.add(btnA20);
		
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
		btnBack.setBounds(20, 10, 85, 21);
		contentPane.add(btnBack);
	}

}
