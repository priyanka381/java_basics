package streams;

import java.io.FileInputStream;

public class DataStreamExp1 {
	
	public static void main(String args[]){    
        try{    
          FileInputStream fin=new FileInputStream("D:\\\\testout.txt");    
          int i=fin.read();  
          System.out.print((char)i);    

          fin.close();    
        }catch(Exception e){System.out.println(e);}    
       }    
      }  
