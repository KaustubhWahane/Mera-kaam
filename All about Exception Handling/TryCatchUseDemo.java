public class TryCatchUseDemo {
    public static void main(String[] args) {
        TryCatchUseDemo t1 = new TryCatchUseDemo();
      t1.divide();
      System.out.println("Yokoso");
    // Now you can use Try catch method in main method also to prevent the exception
    }
    void divide(){
        try{
            int a= 1;
            int b = 0;
            int c = a /b;
            System.out.println(c);
        }
        catch(ArithmeticException e1){
            e1.printStackTrace();
        }
    }
}
