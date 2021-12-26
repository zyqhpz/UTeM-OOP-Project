package view.report;
import view.ReportType;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

//import java.org.jfree.chart.ChartFactory;
import org.jfree.chart.*;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.ui.ApplicationFrame;
// import org.jfree.ui.RefineryUtilities;

public class Report extends org.jfree.chart.ui.ApplicationFrame {
	private JPanel contentPane, topPanel, centerPanel;
	private JFrame frame;

    public Report(String title) {
        super(title);
        contentPane = new JPanel();
//		contentPane.setBorder(BorderFactory.createEmptyBorder(325, 80, 325, 80));
//		setContentPane(contentPane);
		setSize(900, 800);
        setContentPane(createDemoPanel());
		
//		
//        centerPanel = new JPanel();
//        centerPanel.add(createDemoPanel());
//        frame.add(centerPanel, BorderLayout.CENTER);
//        
//        topPanel = new JPanel();
//        topPanel.add(backButton());
//        frame.add(topPanel, BorderLayout.NORTH);
//        
        
//		contentPane.add(createDemoPanel());
//		contentPane.add(backButton());
        //frame.setVisible(true);
//        setContentPane(backButton());
    }

    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("IPhone 5s", new Double(20));
        dataset.setValue("SamSung Grand", new Double(20));
        dataset.setValue("MotoG", new Double(40));
        dataset.setValue("Nokia Lumia", new Double(10));
        return dataset;
    }

    private static JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Mobile Sales", // chart title
                dataset, // data
                true, // include legend
                true,
                false);

        return chart;
    }

    public static JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        ChartPanel panel = new ChartPanel(chart);
        panel.add(backButton());
        return panel;
    }
    
    private static JButton backButton() {
    	JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReportType frameR = new ReportType();
				frameR.setVisible(true);
//				frame.
//				frame.dispose();
			}
		});
		btnBack.setBackground(Color.GRAY);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(23, 23, 85, 21);
		
		return btnBack;
    }

    public static void main(String[] args) {
//        Report demo = new Report("Mobile Sales");
//        demo.setSize(560, 500);
//        demo.setVisible(true);
//        demo.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report("Mobile Sales");
			        frame.setVisible(true);
//			        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        // RefineryUtilities.centerFrameOnScreen(demo);
        //JFrame frame = new JFrame("Mobile Sales");
        // frame.setSize(500, 500);
        //demo.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // frame.add(demo);
        // frame.setState(NORMAL);
//        demo.setVisible(true);
        // frame.setVisible(true);
        // frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}