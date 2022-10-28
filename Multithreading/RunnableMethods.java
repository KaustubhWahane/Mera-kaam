class Runnable1 implements Runnable{
    public  Runnable1(String name) {
        super();
        System.out.println(name);
    }
    @Override
    public void run() {
        
    }
}

public class RunnableMethods{
    public static void main(String[] args) {
        Runnable1 r1 = new Runnable1("yokoso");
        Thread t1 = new Thread(r1);
        
        System.out.println("The thread Id is " + t1.getId());
        System.out.println("The thread Id is " + t1.getName());
    }
}