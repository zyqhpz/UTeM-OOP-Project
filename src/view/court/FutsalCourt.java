package view.court;
import view.Courts;

import java.awt.BorderLayout;
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
import javax.swing.border.EmptyBorder;

import controller.CourtController;

public class FutsalCourt extends JFrame {

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
					FutsalCourt frame = new FutsalCourt();
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
	public FutsalCourt() throws ClassNotFoundException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 800);
		setTitle("Futsal Court");
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(80,80,80,80));
		setContentPane(contentPane);
		
		JButton btnF1 = new JButton("F1");
		btnF1.setBounds(80, 80, 212, 603);
		btnF1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController ccf1 = new CourtController();
		int status = -1;
		status = ccf1.checkStatus("F1");
		if(status == 1) {
			btnF1.setBackground(Color.RED);
			btnF1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnF1.setBackground(colour);
						try {
							ccf1.setStatus("0", "F1");
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
			btnF1.setBackground(colour);
			btnF1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnF1.setBackground(highlight);
						try {
							ccf1.setStatus("1", "F1");
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
		
		JButton btnF2 = new JButton("F2");
		btnF2.setBounds(337, 80, 212, 603);
		btnF2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController ccf2 = new CourtController();
		int status2 = -1;
		status2 = ccf2.checkStatus("F2");
		if(status2 == 1) {
			btnF2.setBackground(Color.RED);
			btnF2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnF2.setBackground(colour);
						try {
							ccf2.setStatus("0", "F2");
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
			btnF2.setBackground(colour);
			btnF2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnF2.setBackground(highlight);
						try {
							ccf2.setStatus("1", "F2");
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
		
		JButton btnF3 = new JButton("F3");
		btnF3.setBounds(594, 80, 212, 603);
		btnF3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController ccf3 = new CourtController();
		int status3 = -1;
		status3 = ccf3.checkStatus("F3");
		if(status3 == 1) {
			btnF3.setBackground(Color.RED);
			btnF3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnF3.setBackground(colour);
						try {
							ccf3.setStatus("0", "F3");
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
			btnF3.setBackground(colour);
			btnF3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnF3.setBackground(highlight);
						try {
							ccf3.setStatus("1", "F3");
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
		contentPane.add(btnF1);
		contentPane.add(btnF2);
		contentPane.add(btnF3);
		
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
