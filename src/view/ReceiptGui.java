package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.sql.*;

import controller.ReceiptController;
import model.Receipt;

import javax.swing.JTextArea;

public class ReceiptGui extends JFrame {

	private JPanel contentPane;
	//private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceiptGui frame = new ReceiptGui();
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
	public ReceiptGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		setSize(900,800);
		setTitle("Receipt");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 10, 866, 743);
		contentPane.add(textArea, BorderLayout.CENTER);
		
		ReceiptController receiptController = new ReceiptController();
		try 
		{
			for(Receipt receipt: receiptController.getReceipt())
			{
				textArea.append("\n***********************************\n\tReceipt\n***********************************"
								+ "\nCustomer Name\t: " + receipt.getName()
								+ "\nCourt ID\t\t: " +receipt.getCourtID()
								+ "\nDuration\t\t: " + receipt.getDuration() + " hour"
								
								+ "\nTotal Payment\t\t: RM " + receipt.getTotalPayment()
								+ "\nDate\t\t: " + receipt.getDate()
								+"\nConfirmed By\t\t: " + receipt.getConfirmedBy());
			
				Font f = new Font("Tahoma",Font.PLAIN, 25);
				textArea.setFont(f);
				contentPane.add(textArea,BorderLayout.CENTER);
				textArea.setEditable(false);
			}
		}catch(ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
