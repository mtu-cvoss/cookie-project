import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Paycheck {
	
	private double net;
	private double socSecDeduct;
	private double medicareDeduct;
	private double stateInTax;
	private double fedInTax;
	
	public Paycheck( double netEntry, double socSecDeductEntry, double medicareDeductEntry, double stateInTaxEntry, double fedInTaxEntry ) {
		net = netEntry;
		socSecDeduct = socSecDeductEntry;
		medicareDeduct = medicareDeductEntry;
		stateInTax = stateInTaxEntry;
		fedInTax = fedInTaxEntry;
	}
	
	public void setNet( double netEntry ) {
		net = netEntry;
	}
	
	public void setSocialSecurityDeduction( double socSecDeductEntry ) {
		socSecDeduct = socSecDeductEntry;
	}
	
	public void setMedicareDeduction( double medicareDeductEntry ) {
		medicareDeduct = medicareDeductEntry;
	}
	
	public void setStateIncomeTax( double stateInTaxEntry ) {
		stateInTax = stateInTaxEntry;
	}
	
	public void setFederalIncomeTax( double fedInTaxEntry ) {
		fedInTax = fedInTaxEntry;
	}
	
	public double getNet() {
		return net;
	}
	
	public double getSocialSecurityDeduction() {
		return socSecDeduct;
	}
	
	public double getMedicareDeduction() {
		return medicareDeduct;
	}
	
	public double getStateIncomeTax() {
		return stateInTax;
	}
	
	public double getFederalIncomeTax() {
		return fedInTax;
	}
	
	public boolean upload( String user, String password ) {
		dbConnect conn = new dbConnect();
		PreparedStatement smnt = null;
		String test = "INSERT INTO jmperttu.accountNAME (date, amount, type, whom, balance, subtype) VALUES (?,?,?,?,?,?)";
		try {
			Connection c = conn.connect( user, password );
			smnt = c.prepareStatement( test );
			smnt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
