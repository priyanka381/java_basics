package ecommerce;

public class Customer {

	public void walking() {
		System.out.println("priya is going inside big bazzar");
	}

	public void shop() {
		System.out.println("priya is shopping");
		
	}

	public void goesout() {
		System.out.println("priya goesout");
		
	}

	public void checkout() {
		Cashier anithacashier = new Cashier();
		anithacashier.estimate();
		
	}

}
