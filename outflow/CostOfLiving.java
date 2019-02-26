package outflow;
import java.sql.Date;

public class CostOfLiving extends Outflow{

	public CostOfLiving( Date dateEntry, double amountEntry){
		super( dateEntry, amountEntry );
	}
	
	public void setAmount( double amountEntry ) {
		super.setAmount(amountEntry);
	}
	
	public void setDate( Date dateEntry ) {
		super.setDate(dateEntry);
	}
	
	public double getAmount() {
		return super.getAmount();
	}
	
	public Date getDate() {
		return super.getDate();
	}
}