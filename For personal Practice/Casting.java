class Parent{
    void show(){
        System.out.println("I am from parent class");
    }
}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("I am from child class");
    }
    
    void showChild(){
        System.out.println("I am from a unique child class");
    }
}
public class Casting {
    public static void main(String[] args) {
    Parent p1 = new Child();
    p1.show();
    Child p2 = (Child)p1;
    p2.showChild();       
    }
}
