import java.io.*;  
class Yum{  
 void method()throws IOException{  
  throw new IOException("device error"); 
 }  
}  
public class ThrowsDemo{  
   public static void main(String args[]){  
    try{  
     Yum m=new Yum();  
     m.method();  
    }catch(Exception e){System.out.println("exception handled");}     
  
    System.out.println("normal flow...");  
  }  
}