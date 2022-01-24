package view.court;
import view.Courts;
import view.GuiRentDetail;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import controller.CourtController;
import model.Court;

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
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(BorderFactory.createEmptyBorder(80,80,80,80));
		setContentPane(contentPane);
		
		JButton btnF1 = new JButton("F1");
		btnF1.setBounds(80, 80, 212, 603);
		btnF1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController ccf1 = new CourtController();
		Court courtf1 = new Court();
		courtf1.setId("F1");
		courtf1.setSport_id(1);
		int status = -1;
		status = ccf1.checkStatus(courtf1);
		if(status == 1) {
			btnF1.setBackground(Color.RED);
		}
		else if(status == 0){
			btnF1.setBackground(colour);
			btnF1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnF1.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courtf1);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnF2 = new JButton("F2");
		btnF2.setBounds(337, 80, 212, 603);
		btnF2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController ccf2 = new CourtController();
		Court courtf2 = new Court();
		courtf2.setId("F2");
		courtf2.setSport_id(1);
		int status2 = -1;
		status2 = ccf2.checkStatus(courtf2);
		if(status2 == 1) {
			btnF2.setBackground(Color.RED);
		}
		else if(status2 == 0){
			btnF2.setBackground(colour);
			btnF2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnF2.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courtf2);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
		JButton btnF3 = new JButton("F3");
		btnF3.setBounds(594, 80, 212, 603);
		btnF3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		CourtController ccf3 = new CourtController();
		Court courtf3 = new Court();
		courtf3.setId("F3");
		courtf3.setSport_id(1);
		int status3 = -1;
		status3 = ccf3.checkStatus(courtf3);
		if(status3 == 1) {
			btnF3.setBackground(Color.RED);
		}
		else if(status3 == 0){
			btnF3.setBackground(colour);
			btnF3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						btnF3.setBackground(highlight);
						GuiRentDetail frame = new GuiRentDetail(courtf3);
						frame.setVisible(true);
						dispose();
					}
				});
		}
		
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
		
		contentPane.setLayout(null);
		contentPane.add(btnF1);
		contentPane.add(btnF2);
		contentPane.add(btnF3);
		contentPane.add(btnBack);
	}
}
