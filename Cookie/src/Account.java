
public class Account {

	private int id;
	private String name;
	private boolean checking;
	
	public Account(int idEntry, String nameEntry, boolean checkingEntry) {
		id = idEntry;
		name = nameEntry;
		checking = checkingEntry;
	}
	
	public void setID( int idEntry ) {
		id = idEntry;
	}
	
	public void setName( String nameEntry ) {
		name = nameEntry;
	}
	
	public void isChecking( boolean checkingEntry ) {
		checking = checkingEntry;
	}
	
	public void isSavings( boolean savingsEntry ) {
		checking = !savingsEntry;
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isChecking() {
		return checking;
	}
	
	public boolean isSavings() {
		return !checking;
	}
	
	
}
