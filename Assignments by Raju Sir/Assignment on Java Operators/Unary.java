public class Unary{
    public static void main(String[] args) {
        
        int x = 2;
        int y = ++x;
        System.out.println(y);

        int z = (x++ + ++y);
        System.out.println(z);

        int m = x++ + ++x + y++ - z--;
        System.out.println(m);
    }
}