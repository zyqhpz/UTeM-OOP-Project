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

public class TotalReservationByMonth extends org.jfree.chart.ui.ApplicationFrame {
	private JPanel contentPane;
	Report rep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					 TotalSalesByMonth chart = new TotalSalesByMonth("Car Usage Statistics", "Which car do you like?");
//					      chart.pack( );        
//					      RefineryUtilities.centerFrameOnScreen( chart );        
//					      chart.setVisible( true );
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
				return report.retrieveTotalResevation(rep);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
	   public TotalReservationByMonth ( String applicationTitle , String chartTitle, Report rep ) {
		      super( applicationTitle );
		      this.rep = rep;
		      JFreeChart barChart = ChartFactory.createBarChart(
		         chartTitle,           
		         "Sport",            
		         "Total",            
		         createDataset(),          
		         PlotOrientation.VERTICAL,           
		         true, true, false);
		         
		      ChartPanel chartPanel = new ChartPanel( barChart );        
		      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
		      setContentPane( chartPanel );
		      
		      JButton btnBackButton = new JButton("Back");
		      btnBackButton.setBounds(-100, 0, 100, 150);
		      btnBackButton.addActionListener(new ActionListener() {
		      	public void actionPerformed(ActionEvent e) {
		      		ReportType rep = new ReportType();
		      		rep.setVisible(true);
		      		dispose();
		      	}
		      });
		      chartPanel.add(btnBackButton);
		      setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		      setVisible(true);
		   }
		   
		   private CategoryDataset createDataset( ) {
		      final String futsal = "FUTSAL";        
		      final String basketball = "BASKETBALL";        
		      final String badminton = "BADMINTON";              
		      final String reserve = "Total Reservation";        
    
		      final DefaultCategoryDataset dataset = 
		      new DefaultCategoryDataset( );
		      
				List<Double> dt = new ArrayList<Double>();
				dt = this.getDataSet();
     
		      dataset.addValue( dt.get(0), futsal , reserve );               
		      dataset.addValue( dt.get(1) , basketball , reserve );        
		      dataset.addValue( dt.get(2) , badminton , reserve );                   

		      return dataset; 
		   }

}
