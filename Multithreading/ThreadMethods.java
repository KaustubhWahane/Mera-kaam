class Thread1 extends Thread{
    public  Thread1(String name) {
        super(name);
        System.out.println(name);
    }
}

public class ThreadMethods{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("kaustubh");
        t1.start();
        System.out.println("The thread Id is " + t1.getId());
        System.out.println("The thread Id is " + t1.getName());
    }
}