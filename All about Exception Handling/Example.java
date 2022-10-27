class Example{
    public static void main(String[] args) {
        
        try{
            int x = 100;
            int y = 100/x;
            System.out.println(y);
        }
        catch(ArithmeticException a){
            a.printStackTrace();
        }
    }
}