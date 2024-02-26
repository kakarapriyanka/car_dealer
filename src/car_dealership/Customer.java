package car_dealership;

public class Customer {
	
	String name;
	String address;
	double cash;
	
	
public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	
	public void setAddress(String address) {
		address+="Dealership city";
		this.address = address;
	}


	public double getCash() {
		return cash;
	}


	public void setCash(double cash) {
		cash+=500;
		this.cash = cash;
	}


public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
emp.handleCustomer(this, finance, vehicle);	
}
}
