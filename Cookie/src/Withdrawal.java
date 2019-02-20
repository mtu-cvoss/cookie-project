public class Withdrawal {

	private double amount;
	private boolean cash;
	private boolean check;
	private boolean card;
	
	public Withdrawal( double amountEntry, boolean isCash, boolean isCheck, boolean isCard ) {
		amount = amountEntry;
		cash = isCash;
		check = isCheck;
		card = isCard;
		this.validate();
	}
	
	public void setAmount( double amountEntry ) {
		amount = amountEntry;
	}
	
	public void isCash( boolean cashEntry ) {
		cash = cashEntry;
		this.validate();
	}
	
	public void isCheck( boolean checkEntry ) {
		check = checkEntry;
		this.validate();
	}
	
	public void isCard( boolean cardEntry ) {
		card = cardEntry;
		this.validate();
	}
	
	public double setAmount() {
		return amount;
	}
	
	public boolean isCash() {
		return cash;
	}
	
	public boolean isCheck() {
		return check;
	}
	
	public boolean isCard() {
		return card;
	}
	
	private void validate() {
		if( 
				( cash == true && check == true ) ||
				( cash == true && card == true ) ||
				( check == true && card == true )
				) {
			throw new IllegalArgumentException( "cash, check, and/or card have conflicting values" );
		}
	}
	
}
