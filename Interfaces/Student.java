public class Student {
    void todisplay(){
        System.out.println("Kuch toh print karu");
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.todisplay();
    }
}

class Child extends Student{

    @Override
    void todisplay(){
        System.out.println("Kuch bhi likh");
    }
}
