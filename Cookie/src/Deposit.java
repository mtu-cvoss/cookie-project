
public class Deposit {

	private double amount;
	private boolean cash;
	
	public Deposit( double amountEntry, boolean cashEntry ) {
		amount = amountEntry;
		cash = cashEntry;
	}
	
	public void setAmount( double amountEntry ) {
		amount = amountEntry;
	}
	
	public void isCash( boolean cashEntry ) {
		cash = cashEntry;
	}
	
	public void isCheck( boolean checkEntry ) {
		cash = !checkEntry;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public boolean isCash() {
		return cash;
	}
	
	public boolean isCheck() {
		return !cash;
	}
	
	
}
