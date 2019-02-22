package inflow;
import java.util.*;
import java.sql.Date;

public class InFlow {
	
	private Date date;
	private double amount;
	
	public InFlow(Date dateEntry, double amountEntry ) {
		date = dateEntry;
		amount = amountEntry;
	}
	
	public void setDate( Date dateEntry ) {
		date = dateEntry;
	}
	
	public void setAmount( double amountEntry ) {
		amount = amountEntry;
	}
	
	public Date getDate() {
		return date;
	}
	
	public double getAmount() {
		return amount;
	}

}
