import java.util.Scanner;

public class Arithematic {
    public static void main(String[] args) {
        System.out.println("Enter the three numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        sc.close();
        int z = a + b * c;
        System.out.println(z);
       
        
    }
}
