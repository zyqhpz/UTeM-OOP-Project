package model;

import java.sql.Timestamp;

public class RentDetail {
	private String customerName;
	private int hour;
	private double amount;
	private Timestamp date;
	private String courtID;
	private int adminID;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getCourtID() {
		return courtID;
	}
	public void setCourtID(String courtID) {
		this.courtID = courtID;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
}
