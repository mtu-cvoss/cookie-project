
public class Bills {

	private double housing;
	private double electrical;
	private double water;
	private double internet;
	private double car;
	
	public Bills ( double housingEntry, double electricEntry, double waterEntry, double internetEntry, double carPaymentEntry ) {
		housing = housingEntry;
		electrical = electricEntry;
		water = waterEntry;
		internet = internetEntry;
		car = carPaymentEntry;
	}
	
	public void setHousing( double housingEntry ) {
		housing = housingEntry;
	}
	
	public void setElectric( double electricEntry ) {
		electrical = electricEntry;
	}
	
	public void setWater( double waterEntry ) {
		water = waterEntry;
	}
	
	public void setInternet( double internetEntry ) {
		internet = internetEntry;
	}
	
	public void setCarPayment( double carEntry ) {
		car = carEntry;
	}
	
	public double getHousing() {
		return housing;
	}
	
	public double getElectric() {
		return electrical;
	}
	
	public double getWater() {
		return water;
	}
	
	public double getInternet() {
		return internet;
	}
	
	public double getCarPayment() {
		return car;
	}
	
}
