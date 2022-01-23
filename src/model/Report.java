package model;

import java.util.*;
import controller.ReportController;

public class Report {
	private int reportType;
	private ArrayList<Double> data;
	private String reportName;
	private int date;
	private Object month;
	private String selectedMonth;
	
	public int getReportType() {
		return reportType;
	}
	public void setReportType(int reportType) {
		this.reportType = reportType;
	}
	public ArrayList<Double> getData() {
		return data;
	}
	public void setData(ArrayList<Double> data) {
		this.data = data;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public Object getMonth() {
		return month;
	}
	public void setMonth(Object month) {
		this.month = month;
	}
	public String getSelectedMonth() {
		return selectedMonth;
	}
	public void setSelectedMonth(String selectedMonth) {
		this.selectedMonth = selectedMonth;
	}
}
