package exception;

public class TestExceptionPropagation {
	void p() {
		System.out.println("im in P");
		int data = 50/0;
		System.out.println("im in P after exception");
	}
	void r() {
		System.out.println("im in R");
		p();
		System.out.println("im in R after exception");
	}
	
	void i() {
		System.out.println("im in I");
		try {
			r();
		}catch(Exception e) {System.out.println("exception handeled");}
		System.out.println("im in I after execution");
		
	}
	public static void main(String args[]) {
		System.out.println(" im in MAIN");
		TestExceptionPropagation obj = new TestExceptionPropagation();
		obj.i();
		System.out.println("im in MAIN after exception");
		System.out.println("naomal flow");
		
	}
	

}
