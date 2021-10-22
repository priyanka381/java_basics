package exception;


	import java.io.IOException;
	public class TestExceptionPropagation1 {
		public void p() throws IOException {
			throw new IOException();
		}

		/**
		 * r() is the consumer p()
		 * @throws IOException 
		 */
		public void r() throws IOException {
			p();
		}


		public void i() {

			try {
				r();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



		public static void main(String[] args) {

			TestExceptionPropagation1 tp2 = new TestExceptionPropagation1();
			tp2.i();

		}
	}
	
		