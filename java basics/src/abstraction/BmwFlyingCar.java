package abstraction;

	public class BmwFlyingCar extends FlyingCar{

		@Override
		public void stopCar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void flyCar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void landCar() {
			// TODO Auto-generated method stub

		}

		public static	int add(int a, int b) {
			return a+b;
		}

		public static boolean isEligibletoVote(int age) {
			if (age >17) {return true;}
			return false;
		}


}
