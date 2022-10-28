class MeraThread implements Runnable{
    public void run() {
        System.out.println("Ichigoooooo");
    }
}
class TeraThread implements Runnable{
    public void run() {
        System.out.println("Luffyyyyyy");
    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) throws InterruptedException {
    MeraThread i1 = new MeraThread(); 
    //Dhyan se dekh thread shuru karne ke liye alag se reference variable hona  
    Thread ichi = new Thread(i1);
    ichi.start();
    Thread.sleep(3000);

    TeraThread l1 = new TeraThread();                   
    Thread luff = new Thread(l1);
    luff.start();
    }
}