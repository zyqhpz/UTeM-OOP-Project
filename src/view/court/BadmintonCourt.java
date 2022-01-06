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

import controller.CourtController;

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
		contentPane.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
		setContentPane(contentPane);
		
		JButton btnA1 = new JButton("A1");
		btnA1.setBounds(40, 41, 190, 116);
		btnA1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca1 = new CourtController();
		int status = -1;
		status = cca1.checkStatus("A1");
		if(status == 1) {
			btnA1.setBackground(Color.RED);
			btnA1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA1.setBackground(colour);
						try {
							cca1.setStatus("0", "A1");
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
			btnA1.setBackground(colour);
			btnA1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA1.setBackground(highlight);
						try {
							cca1.setStatus("1", "A1");
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
		
		JButton btnA2 = new JButton("A2");
		btnA2.setBounds(245, 41, 190, 116);
		btnA2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca2 = new CourtController();
		int status2 = -1;
		status2 = cca2.checkStatus("A2");
		if(status2 == 1) {
			btnA2.setBackground(Color.RED);
			btnA2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA2.setBackground(colour);
						try {
							cca2.setStatus("0", "A2");
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
			btnA2.setBackground(colour);
			btnA2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA2.setBackground(highlight);
						try {
							cca2.setStatus("1", "A2");
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
		
		JButton btnA3 = new JButton("A3");
		btnA3.setBounds(450, 41, 190, 116);
		btnA3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca3 = new CourtController();
		int status3 = -1;
		status3 = cca3.checkStatus("A3");
		if(status3 == 1) {
			btnA3.setBackground(Color.RED);
			btnA3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA3.setBackground(colour);
						try {
							cca3.setStatus("0", "A3");
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
		else if(status3 == 0){
			btnA3.setBackground(colour);
			btnA3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA3.setBackground(highlight);
						try {
							cca3.setStatus("1", "A3");
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
		
		JButton btnA4 = new JButton("A4");
		btnA4.setBounds(655, 41, 190, 116);
		btnA4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca4 = new CourtController();
		int status4 = -1;
		status4 = cca4.checkStatus("A4");
		if(status4 == 1) {
			btnA4.setBackground(Color.RED);
			btnA4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA4.setBackground(colour);
						try {
							cca4.setStatus("0", "A4");
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
		else if(status4 == 0){
			btnA4.setBackground(colour);
			btnA4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA4.setBackground(highlight);
						try {
							cca4.setStatus("1", "A4");
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
		
		JButton btnA5 = new JButton("A5");
		btnA5.setBounds(40, 182, 190, 116);
		btnA5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca5 = new CourtController();
		int status5 = -1;
		status5 = cca5.checkStatus("A5");
		if(status5 == 1) {
			btnA5.setBackground(Color.RED);
			btnA5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA5.setBackground(colour);
						try {
							cca5.setStatus("0", "A5");
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
		else if(status5 == 0){
			btnA5.setBackground(colour);
			btnA5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA5.setBackground(highlight);
						try {
							cca5.setStatus("1", "A5");
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
		
		JButton btnA6 = new JButton("A6");
		btnA6.setBounds(245, 182, 190, 116);
		btnA6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca6 = new CourtController();
		int status6 = -1;
		status6 = cca1.checkStatus("A6");
		if(status6 == 1) {
			btnA6.setBackground(Color.RED);
			btnA6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA6.setBackground(colour);
						try {
							cca6.setStatus("0", "A6");
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
		else if(status6 == 0){
			btnA6.setBackground(colour);
			btnA6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA6.setBackground(highlight);
						try {
							cca6.setStatus("1", "A6");
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
		
		JButton btnA7 = new JButton("A7");
		btnA7.setBounds(450, 182, 190, 116);
		btnA7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca7 = new CourtController();
		int status7 = -1;
		status7 = cca7.checkStatus("A7");
		if(status7 == 1) {
			btnA7.setBackground(Color.RED);
			btnA7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA7.setBackground(colour);
						try {
							cca7.setStatus("0", "A7");
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
		else if(status7 == 0){
			btnA7.setBackground(colour);
			btnA7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA7.setBackground(highlight);
						try {
							cca7.setStatus("1", "A7");
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
		
		JButton btnA8 = new JButton("A8");
		btnA8.setBounds(655, 182, 190, 116);
		btnA8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca8 = new CourtController();
		int status8 = -1;
		status8 = cca8.checkStatus("A8");
		if(status8 == 1) {
			btnA8.setBackground(Color.RED);
			btnA8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA8.setBackground(colour);
						try {
							cca8.setStatus("0", "A8");
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
		else if(status8 == 0){
			btnA8.setBackground(colour);
			btnA8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA8.setBackground(highlight);
						try {
							cca8.setStatus("1", "A8");
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
		
		JButton btnA9 = new JButton("A9");
		btnA9.setBounds(40, 323, 190, 116);
		btnA9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca9 = new CourtController();
		int status9 = -1;
		status9 = cca9.checkStatus("A9");
		if(status9 == 1) {
			btnA9.setBackground(Color.RED);
			btnA9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA9.setBackground(colour);
						try {
							cca9.setStatus("0", "A9");
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
		else if(status9 == 0){
			btnA9.setBackground(colour);
			btnA9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA9.setBackground(highlight);
						try {
							cca9.setStatus("1", "A9");
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
		
		JButton btnA10 = new JButton("A10");
		btnA10.setBounds(245, 323, 190, 116);
		btnA10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca10 = new CourtController();
		int status10 = -1;
		status10 = cca10.checkStatus("A10");
		if(status10 == 1) {
			btnA10.setBackground(Color.RED);
			btnA10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA10.setBackground(colour);
						try {
							cca10.setStatus("0", "A10");
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
		else if(status10 == 0){
			btnA10.setBackground(colour);
			btnA10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA10.setBackground(highlight);
						try {
							cca10.setStatus("1", "A10");
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
		
		JButton btnA11 = new JButton("A11");
		btnA11.setBounds(450, 323, 190, 116);
		btnA11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca11 = new CourtController();
		int status11 = -1;
		status11 = cca11.checkStatus("A11");
		if(status11 == 1) {
			btnA11.setBackground(Color.RED);
			btnA11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA11.setBackground(colour);
						try {
							cca11.setStatus("0", "A11");
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
		else if(status11 == 0){
			btnA11.setBackground(colour);
			btnA11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA11.setBackground(highlight);
						try {
							cca11.setStatus("1", "A11");
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
		
		JButton btnA12 = new JButton("A12");
		btnA12.setBounds(655, 323, 190, 116);
		btnA12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca12 = new CourtController();
		int status12 = -1;
		status12 = cca12.checkStatus("A12");
		if(status12 == 1) {
			btnA12.setBackground(Color.RED);
			btnA12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA12.setBackground(colour);
						try {
							cca12.setStatus("0", "A12");
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
		else if(status12 == 0){
			btnA12.setBackground(colour);
			btnA12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA12.setBackground(highlight);
						try {
							cca12.setStatus("1", "A12");
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
		
		JButton btnA13 = new JButton("A13");
		btnA13.setBounds(40, 464, 190, 116);
		btnA13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca13 = new CourtController();
		int status13 = -1;
		status13 = cca13.checkStatus("A13");
		if(status13 == 1) {
			btnA13.setBackground(Color.RED);
			btnA13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA13.setBackground(colour);
						try {
							cca13.setStatus("0", "A13");
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
		else if(status13 == 0){
			btnA13.setBackground(colour);
			btnA13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA13.setBackground(highlight);
						try {
							cca13.setStatus("1", "A13");
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
		
		JButton btnA14 = new JButton("A14");
		btnA14.setBounds(245, 464, 190, 116);
		btnA14.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca14 = new CourtController();
		int status14 = -1;
		status14 = cca14.checkStatus("A14");
		if(status14 == 1) {
			btnA14.setBackground(Color.RED);
			btnA14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA14.setBackground(colour);
						try {
							cca14.setStatus("0", "A14");
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
		else if(status14 == 0){
			btnA14.setBackground(colour);
			btnA14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA14.setBackground(highlight);
						try {
							cca14.setStatus("1", "A14");
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
		
		JButton btnA15 = new JButton("A15");
		btnA15.setBounds(450, 464, 190, 116);
		btnA15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca15 = new CourtController();
		int status15 = -1;
		status15 = cca15.checkStatus("A15");
		if(status15 == 1) {
			btnA15.setBackground(Color.RED);
			btnA15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA15.setBackground(colour);
						try {
							cca15.setStatus("0", "A15");
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
		else if(status15 == 0){
			btnA15.setBackground(colour);
			btnA15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA15.setBackground(highlight);
						try {
							cca15.setStatus("1", "A15");
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
		
		JButton btnA16 = new JButton("A16");
		btnA16.setBounds(655, 464, 190, 116);
		btnA16.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca16 = new CourtController();
		int status16 = -1;
		status16 = cca16.checkStatus("A16");
		if(status16 == 1) {
			btnA16.setBackground(Color.RED);
			btnA16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA16.setBackground(colour);
						try {
							cca16.setStatus("0", "A16");
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
		else if(status16 == 0){
			btnA16.setBackground(colour);
			btnA16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA16.setBackground(highlight);
						try {
							cca16.setStatus("1", "A16");
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
		
		JButton btnA17 = new JButton("A17");
		btnA17.setBounds(40, 605, 190, 116);
		btnA17.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca17 = new CourtController();
		int status17 = -1;
		status17 = cca17.checkStatus("A17");
		if(status17 == 1) {
			btnA17.setBackground(Color.RED);
			btnA17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA17.setBackground(colour);
						try {
							cca17.setStatus("0", "A17");
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
		else if(status17 == 0){
			btnA17.setBackground(colour);
			btnA17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA17.setBackground(highlight);
						try {
							cca17.setStatus("1", "A17");
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
		
		JButton btnA18 = new JButton("A18");
		btnA18.setBounds(245, 605, 190, 116);
		btnA18.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca18 = new CourtController();
		int status18 = -1;
		status18 = cca18.checkStatus("A18");
		if(status18 == 1) {
			btnA18.setBackground(Color.RED);
			btnA18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA18.setBackground(colour);
						try {
							cca18.setStatus("0", "A18");
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
		else if(status18 == 0){
			btnA18.setBackground(colour);
			btnA18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA18.setBackground(highlight);
						try {
							cca18.setStatus("1", "A18");
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
		JButton btnA19 = new JButton("A19");
		btnA19.setBounds(450, 605, 190, 116);
		btnA19.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca19 = new CourtController();
		int status19 = -1;
		status19 = cca19.checkStatus("A19");
		if(status19 == 1) {
			btnA19.setBackground(Color.RED);
			btnA19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA19.setBackground(colour);
						try {
							cca19.setStatus("0", "A19");
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
		else if(status19 == 0){
			btnA19.setBackground(colour);
			btnA19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA19.setBackground(highlight);
						try {
							cca19.setStatus("1", "A19");
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
		
		JButton btnA20 = new JButton("A20");
		btnA20.setBounds(655, 605, 190, 116);
		btnA20.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController cca20 = new CourtController();
		int status20 = -1;
		status20 = cca20.checkStatus("A20");
		if(status20 == 1) {
			btnA20.setBackground(Color.RED);
			btnA20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA20.setBackground(colour);
						try {
							cca20.setStatus("0", "A20");
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
		else if(status20 == 0){
			btnA20.setBackground(colour);
			btnA20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnA20.setBackground(highlight);
						try {
							cca20.setStatus("1", "A20");
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
