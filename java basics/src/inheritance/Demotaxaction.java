package inheritance;

public class Demotaxaction {
	public static void main(String[] args) {
		Income income = new Income();
		Gst gst = new Gst();
		int tax = gst.calculateTax(1000);
		System.out.println("tax is  "+tax);
	}
}
