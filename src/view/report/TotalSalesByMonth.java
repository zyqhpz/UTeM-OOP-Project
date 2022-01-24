package view.report;

import model.Report;
import view.ReportType;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset;

import controller.ReportController;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
//import org.jfree.ui.ApplicationFrame; 
//import org.jfree.ui.RefineryUtilities; 


public class TotalSalesByMonth extends org.jfree.chart.ui.ApplicationFrame {

	private JPanel contentPane;
	private Report report;

		public List<Double> getDataSet() {
			ReportController report = new ReportController();
			try {
				return report.retrieveData(this.report);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
	   public TotalSalesByMonth( String applicationTitle , String chartTitle, Report rep ) {
		      super( applicationTitle );        
		      report = rep;
		      JFreeChart barChart = ChartFactory.createBarChart(
		         chartTitle,           
		         "Sport",            
		         "Total Sales (RM)",            
		         createDataset(),          
		         PlotOrientation.VERTICAL,           
		         true, true, false);
		      
		         
		      ChartPanel chartPanel = new ChartPanel( barChart );        
		      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
		      setContentPane( chartPanel );
		      
		      JButton btnBackButton = new JButton("Back");
		      btnBackButton.setBounds(-100, 0, 10, 10);
		      btnBackButton.addActionListener(new ActionListener() {
		      	public void actionPerformed(ActionEvent e) {
		      		ReportType rep = new ReportType();
		      		rep.setVisible(true);
		      		dispose();
		      	}
		      });
		      chartPanel.add(btnBackButton);
//		      setState(JFrame.MAXIMIZED_BOTH);
		      setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		      setVisible(true);
//		      getDataSet().forEach(System.out::println);

		   }
		   
		   private CategoryDataset createDataset( ) {
		      final String futsal = "FUTSAL";        
		      final String basketball = "BASKETBALL";        
		      final String badminton = "BADMINTON";        
		      final String sales = "Total Sales";        
		      final String reserve = "Total Reservation";        
//		      final String userrating = "User Rating";        
//		      final String safety = "safety";        
		      final DefaultCategoryDataset dataset = 
		      new DefaultCategoryDataset( );
		      
//		      List this.getDataSet();
				List<Double> dt = new ArrayList<Double>();
				dt = this.getDataSet();
//				dt.forEach(System.out::println);
				
//				List<Double> data = new ArrayList<Double>();
//				List<Double> data = dt;

		      dataset.addValue( dt.get(0) , futsal , sales );        
//		      dataset.addValue( 3.0 , futsal , userrating );        
//		      dataset.addValue( dt.get(1), futsal , reserve ); 
//		      dataset.addValue( 5.0 , futsal , safety );           

		      dataset.addValue( dt.get(2) , basketball , sales );        
//		      dataset.addValue( 6.0 , basketball , userrating );       
//		      dataset.addValue( dt.get(3) , basketball , reserve );        
//		      dataset.addValue( 4.0 , basketball , safety );

		      dataset.addValue( dt.get(4), badminton , sales );        
//		      dataset.addValue( 2.0 , badminton , userrating );        
//		      dataset.addValue( dt.get(5) , badminton , reserve );        
//		      dataset.addValue( 6.0 , badminton , safety );               

		      return dataset; 
		   }

}
