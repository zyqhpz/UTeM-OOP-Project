package view.report;

import model.Report;

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
//import org.jfree.ui.ApplicationFrame; 
//import org.jfree.ui.RefineryUtilities; 


public class ReportBarChart extends org.jfree.chart.ui.ApplicationFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 ReportBarChart chart = new ReportBarChart("Car Usage Statistics", "Which car do you like?");
					      chart.pack( );        
//					      RefineryUtilities.centerFrameOnScreen( chart );        
					      chart.setVisible( true );
//					ReportBarChart frame = new ReportBarChart();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
//	public ReportBarChart() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
//	}
	
		public List<Double> getDataSet() {
			ReportController report = new ReportController();
//			Report report = new Report();
			try {
				return report.retrieveData();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
	   public ReportBarChart( String applicationTitle , String chartTitle ) {
		      super( applicationTitle );        
		      JFreeChart barChart = ChartFactory.createBarChart(
		         chartTitle,           
		         "Category",            
		         "Score",            
		         createDataset(),          
		         PlotOrientation.VERTICAL,           
		         true, true, false);
		         
		      ChartPanel chartPanel = new ChartPanel( barChart );        
		      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
		      setContentPane( chartPanel );
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
//				List<Double> data = new ArrayList<Double>();
//				List<Double> data = dt;

		      dataset.addValue( dt.get(0) , futsal , sales );        
//		      dataset.addValue( 3.0 , futsal , userrating );        
		      dataset.addValue( dt.get(1), futsal , reserve ); 
//		      dataset.addValue( 5.0 , futsal , safety );           

		      dataset.addValue( dt.get(2) , basketball , sales );        
//		      dataset.addValue( 6.0 , basketball , userrating );       
		      dataset.addValue( dt.get(3) , basketball , reserve );        
//		      dataset.addValue( 4.0 , basketball , safety );

		      dataset.addValue( dt.get(4), badminton , sales );        
//		      dataset.addValue( 2.0 , badminton , userrating );        
		      dataset.addValue( dt.get(5) , badminton , reserve );        
//		      dataset.addValue( 6.0 , badminton , safety );               

		      return dataset; 
		   }

}
