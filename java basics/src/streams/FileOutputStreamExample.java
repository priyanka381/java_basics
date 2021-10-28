package streams;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
		    public static void main(String args[]){    
	           try{    
	             FileOutputStream foutpipe=new FileOutputStream("D:\\ \\testout.txt");    
	             foutpipe.write(68);    
	             foutpipe.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    

}
