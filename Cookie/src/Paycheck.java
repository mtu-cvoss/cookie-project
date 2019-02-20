
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
}
