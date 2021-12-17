package courtNew;

import java.awt.BorderLayout;
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
import javax.swing.border.EmptyBorder;

public class FutsalCourt extends JFrame {

	private JPanel contentPane;
	private Color colour = new Color(62, 180, 137);

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
	 */
	public FutsalCourt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 800);
		setTitle("Futsal Court");
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(80,80,80,80));
		setContentPane(contentPane);
		
		JButton btnF1 = new JButton("F1");
		btnF1.setBounds(80, 80, 212, 603);
		btnF1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnF1.setBackground(colour);
		btnF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnF1.setBackground(Color.RED);
			}
		});
		
		JButton btnF2 = new JButton("F2");
		btnF2.setBounds(337, 80, 212, 603);
		btnF2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnF2.setBackground(colour);
		btnF2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnF2.setBackground(Color.RED);
			}
		});
		
		JButton btnF3 = new JButton("F3");
		btnF3.setBounds(594, 80, 212, 603);
		btnF3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnF3.setBackground(colour);
		btnF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnF3.setBackground(Color.RED);
			}
		});
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
