package ecommerce;

public class Testshopping {
	public static void main(String[] args) {
		
		Customer customerpriya = new Customer();
		customerpriya.walking();
		Security maxsecurity = new Security();
		boolean isCustomer = maxsecurity.scan(customerpriya);
		if(isCustomer) {
			customerpriya.shop();
		}
				
		else {
			customerpriya.goesout();
			
		}
		customerpriya.checkout();
		
	}

}
