package view;
import view.court.*;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		
		JButton btnBasketball = new JButton("Basketball");
		btnBasketball.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnBasketball.setBackground(colour);
		btnBasketball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasketballCourt frame = new BasketballCourt();
				frame.setVisible(true);
				dispose();
			}
		});
		
		JButton btnFutsal = new JButton("Futsal");
		btnFutsal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnFutsal.setBackground(colour);
		btnFutsal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FutsalCourt frame = new FutsalCourt();
				frame.setVisible(true);
				dispose();
			}
		});
		
		JButton btnBadminton = new JButton("Badminton");
		btnBadminton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnBadminton.setBackground(colour);
		btnBadminton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BadmintonCourt frame = new BadmintonCourt();
				frame.setVisible(true);
				dispose();
			}
		});
		
		contentPane.setLayout(new GridLayout(1, 3, 45, 45));
		contentPane.add(btnBasketball);
		contentPane.add(btnFutsal);
		contentPane.add(btnBadminton);
	}
}
