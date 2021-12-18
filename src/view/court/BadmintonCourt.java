package view.court;
import view.Courts;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BadmintonCourt extends JFrame {

	private JPanel contentPane;
	private Color colour = new Color(62, 180, 137);

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
	 */
	public BadmintonCourt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 800);
		setTitle("Badminton Court");
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
		setContentPane(contentPane);
		
		JButton btnA1 = new JButton("A1");
		btnA1.setBounds(40, 41, 190, 116);
		btnA1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA1.setBackground(colour);
		btnA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA1.setBackground(Color.RED);
			}
		});
		
		JButton btnA2 = new JButton("A2");
		btnA2.setBounds(245, 41, 190, 116);
		btnA2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA2.setBackground(colour);
		btnA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA2.setBackground(Color.RED);
			}
		});
		
		JButton btnA3 = new JButton("A3");
		btnA3.setBounds(450, 41, 190, 116);
		btnA3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA3.setBackground(colour);
		btnA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA3.setBackground(Color.RED);
			}
		});
		
		JButton btnA4 = new JButton("A4");
		btnA4.setBounds(655, 41, 190, 116);
		btnA4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA4.setBackground(colour);
		btnA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA4.setBackground(Color.RED);
			}
		});
		
		JButton btnA5 = new JButton("A5");
		btnA5.setBounds(40, 182, 190, 116);
		btnA5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA5.setBackground(colour);
		btnA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA5.setBackground(Color.RED);
			}
		});
		
		JButton btnA6 = new JButton("A6");
		btnA6.setBounds(245, 182, 190, 116);
		btnA6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA6.setBackground(colour);
		btnA6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA6.setBackground(Color.RED);
			}
		});
		
		JButton btnA7 = new JButton("A7");
		btnA7.setBounds(450, 182, 190, 116);
		btnA7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA7.setBackground(colour);
		btnA7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA7.setBackground(Color.RED);
			}
		});
		
		JButton btnA8 = new JButton("A8");
		btnA8.setBounds(655, 182, 190, 116);
		btnA8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA8.setBackground(colour);
		btnA8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA8.setBackground(Color.RED);
			}
		});
		
		JButton btnA9 = new JButton("A9");
		btnA9.setBounds(40, 323, 190, 116);
		btnA9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA9.setBackground(colour);
		btnA9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA9.setBackground(Color.RED);
			}
		});
		
		JButton btnA10 = new JButton("A10");
		btnA10.setBounds(245, 323, 190, 116);
		btnA10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA10.setBackground(colour);
		btnA10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA10.setBackground(Color.RED);
			}
		});
		
		JButton btnA11 = new JButton("A11");
		btnA11.setBounds(450, 323, 190, 116);
		btnA11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA11.setBackground(colour);
		btnA11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA11.setBackground(Color.RED);
			}
		});
		
		JButton btnA12 = new JButton("A12");
		btnA12.setBounds(655, 323, 190, 116);
		btnA12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA12.setBackground(colour);
		btnA12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA12.setBackground(Color.RED);
			}
		});
		
		JButton btnA13 = new JButton("A13");
		btnA13.setBounds(40, 464, 190, 116);
		btnA13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA13.setBackground(colour);
		btnA13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA13.setBackground(Color.RED);
			}
		});
		
		JButton btnA14 = new JButton("A14");
		btnA14.setBounds(245, 464, 190, 116);
		btnA14.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA14.setBackground(colour);
		btnA14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA14.setBackground(Color.RED);
			}
		});
		
		JButton btnA15 = new JButton("A15");
		btnA15.setBounds(450, 464, 190, 116);
		btnA15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA15.setBackground(colour);
		btnA15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA15.setBackground(Color.RED);
			}
		});
		
		JButton btnA16 = new JButton("A16");
		btnA16.setBounds(655, 464, 190, 116);
		btnA16.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA16.setBackground(colour);
		btnA16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA16.setBackground(Color.RED);
			}
		});
		
		JButton btnA17 = new JButton("A17");
		btnA17.setBounds(40, 605, 190, 116);
		btnA17.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA17.setBackground(colour);
		btnA17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA17.setBackground(Color.RED);
			}
		});
		
		JButton btnA18 = new JButton("A18");
		btnA18.setBounds(245, 605, 190, 116);
		btnA18.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA18.setBackground(colour);
		btnA18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA18.setBackground(Color.RED);
			}
		});
		
		JButton btnA19 = new JButton("A19");
		btnA19.setBounds(450, 605, 190, 116);
		btnA19.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA19.setBackground(colour);
		btnA19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA19.setBackground(Color.RED);
			}
		});
		
		JButton btnA20 = new JButton("A20");
		btnA20.setBounds(655, 605, 190, 116);
		btnA20.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnA20.setBackground(colour);
		btnA20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnA20.setBackground(Color.RED);
			}
		});
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
