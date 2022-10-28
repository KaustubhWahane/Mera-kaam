class MeraThread extends Thread{
    @Override
    public void run() {
        System.out.println("Ichigoooooo");
    }
}
class TeraThread extends Thread{
    @Override
    public void run() {
        System.out.println("Luffyyyyyy");
    }
}

public class ThreadUsingThread {
    public static void main(String[] args) throws InterruptedException {
    MeraThread i1 = new MeraThread(); 
    i1.start();
    TeraThread l1 = new TeraThread();                   
    l1.start();
    }
}