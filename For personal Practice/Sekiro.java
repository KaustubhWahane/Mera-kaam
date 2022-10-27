public class Sekiro {
    String sekiro;
   Sekiro(String sekiro){
    this.sekiro = sekiro;
    System.out.println(sekiro);
   }
   //In order to not get this hashcode we have to use the toString method
   @Override
   public String toString(){
    return " "+ "The problem will be solved now " + sekiro;
   }
}
