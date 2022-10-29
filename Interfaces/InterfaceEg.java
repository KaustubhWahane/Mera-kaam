interface Yokoso{
    String value = "hutnabe";

    void thenigga();
}


public class InterfaceEg implements Yokoso{
public static void main(String[] args) {
    
    InterfaceEg i1 = new InterfaceEg();
    i1.thenigga();
 }
 
 @Override
 public void thenigga(){
    System.out.println("Yo what's cracking");
 }
}