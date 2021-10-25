package threads;

public class TestjoinMethod1 extends Thread {
	public void run(){ 
		//System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++){  
			try{  
				Thread.sleep(500);  
			}catch(Exception e){System.out.println(e);}  
			System.out.println(i+"--"+Thread.currentThread().getName());  
		}  
	}  
	public static void main(String args[]){  
		TestjoinMethod1 t1=new TestjoinMethod1();  
		t1.setName("first thread");
		TestjoinMethod1 t2=new TestjoinMethod1();  
		t2.setName("second thread");

		TestjoinMethod1 t3=new TestjoinMethod1();  
		t3.setName("third thread");

		t1.start();  
		try{  
			t1.join();  
		}catch(Exception e){System.out.println(e);}  

		t2.start();  
		t3.start();  
	}  

}
