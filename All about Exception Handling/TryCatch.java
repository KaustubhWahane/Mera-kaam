class TryCatch{
    public static void main(String[] args) {
        try
        {
            System.out.println("1");
            System.out.println("2");
            int a=100, b=2, c;
            /*int a=100, b=0, c;
            If b is 0 then divided by a we get arithmetic exception right but here we will not get it
            because b is 2 and 100 can be divided by 2 so it will not follow the procedure of catch block
            */
            System.out.println("3");
            c=a/b;
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");
        }
            catch (ArithmeticException e)
            {
                System.out.println("6");
                System.out.println(e) ;
                System.out.println("7");
                System.out.println("hello");
            }
    
}
}