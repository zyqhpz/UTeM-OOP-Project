package model;

import java.math.BigDecimal;
import java.util.Date;

public class Receipt 
{
	private String name;
	private String courtID;
	private int duration;
	private BigDecimal totalPayment;
	private Date date;
	private String confirmedBy;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getCourtID() 
	{
		return courtID;
	}
	
	public void setCourtID(String courtID)
	{
		this.courtID = courtID;
	}
	
	public int getDuration() 
	{
		return duration;
	}
	
	public void setDuration(int duration) 
	{
		this.duration = duration;
	}
	
	public BigDecimal getTotalPayment()
	{
		return totalPayment;
	}
	
	public void setTotalPayment(BigDecimal totalPayment)
	{
		this.totalPayment = totalPayment;
	}
	
	public Date getDate()
	{
		return date;
	}
	
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	public String getConfirmedBy() 
	{
		return confirmedBy;
	}
	
	public void setConfirmedBy(String confirmedBy)
	{
		this.confirmedBy = confirmedBy;
	}
	
 
	
}
