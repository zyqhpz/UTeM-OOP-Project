package view.report;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import controller.ReportController;
import model.Report;
import view.ReportType;
//import org.jfree.ui.ApplicationFrame;
//import org.jfree.ui.RefineryUtilities;
// 
public class PieChartBySport extends org.jfree.chart.ui.ApplicationFrame {
   
    private static final String KEY1 = "Datum 1";
    public static final String KEY2 = "Datum 2";
    private static Report rep;
	
   public PieChartBySport( String title, Report report ) {
      super( title ); 
      this.rep = report;
      setContentPane(createDemoPanel( ));
      setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
      setVisible(true);
   }
   
   public static Report getReport() {
	   return rep;
   }
   
   public static List<Double> getDataSet() {
		ReportController report = new ReportController();
		try {
			return report.retrieveTotalResevation(getReport());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
   
   private static PieDataset createDataset( ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      
		List<Double> dt = new ArrayList<Double>();
		dt = getDataSet();
      
      dataset.setValue( "Futsal" , new Double(dt.get(0)) );  
      dataset.setValue( "Basketball" , new Double( dt.get(1)) );   
      dataset.setValue( "Badminton" , new Double( dt.get(2)) );
      return dataset;         
   }
   
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "",   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);
      
      PiePlot plot = (PiePlot) chart.getPlot();
      plot.setSectionPaint(KEY1, Color.green);
      plot.setSectionPaint(KEY2, Color.red);
      plot.setExplodePercent(KEY1, 0.10);
      plot.setSimpleLabels(true);

      PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
          "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
      plot.setLabelGenerator(gen);

      return chart;
   }
   
   public JPanel createDemoPanel( ) {
//      JFreeChart chart = createChart(createDataset( ) );  
//      return new ChartPanel( chart ); 
       JFreeChart chart = createChart(createDataset());
       ChartPanel panel = new ChartPanel(chart);
       panel.add(backButton());
       return panel;
   }
   
   private JButton backButton() {
   	JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReportType frameR = new ReportType();
				frameR.setVisible(true);
				dispose();
//				frame.
//				frame.dispose();
			}
		});
		btnBack.setBackground(Color.GRAY);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(23, 23, 85, 21);
		
		return btnBack;
   }

}