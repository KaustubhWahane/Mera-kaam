class Bird{
    void tosing(){
        System.out.println("You are a bird");
    }
}
class Kingfisher extends Bird{
   
}
public class Instance {
    public static void main(String[] args) {
   Kingfisher k1 = new Kingfisher();
   if (k1 instanceof Bird){
    System.out.println("Tum toh heavy driver nikle");
   }
   else {
    System.out.println("areererere");
   }
  
    }
}
