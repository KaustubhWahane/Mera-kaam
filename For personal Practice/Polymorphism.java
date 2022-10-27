class Bird{
    void tosing(){
        System.out.println("PEW PEW PEW PEW");
    }
}

class Kingfisher extends Bird{
    void tosing(){
        System.out.println("Hututututu");
    }
}

 //Now let's say if i make another class which has a parameter on it so
 class Pelican extends Bird{
    void tosing(String name){
        System.out.println("Yokoso");
        
    }
 }
 
public class Polymorphism {
    public static void main(String[] args) {
        Kingfisher k1 = new Kingfisher();
        k1.tosing();
        Pelican p1 = new Pelican();
        p1.tosing("Hatbe");

    }
}
//This is called Polymorphism