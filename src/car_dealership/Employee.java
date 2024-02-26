package car_dealership;

public class Employee {
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
	
	if(finance==true) {
		double loanAmount=vehicle.getPrice()-cust.getCash();
		runCreditHistory(cust,loanAmount);
	} else if(vehicle.getPrice()<=cust.getCash()) {
		
		//cust pays in cash
		
		
		processTranscation(cust, vehicle);
	}else {
		System.out.println("customer will need more money to purchase vehicle:" +vehicle);
	}
}
	
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		
		System.out.println("ran credit history for customer...");
		
		System.out.println("customer has been approved to purchase vehicle");
}
public void processTranscation(Customer cust, Vehicle vehicle) {
		
		
		
		System.out.println("customer has purchased the vehicle:"+vehicle+" for the price"+vehicle.getPrice());
}
	
}