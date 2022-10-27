import java.util.Scanner;
class Program1
{
    public static void main (String args[])
    {
        Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first number");
		double n = s1.nextDouble();
        System.out.println("Enter the second number");
        double d = s1.nextDouble();
		double div = (n / d);
		double mod = (n % d);
		System.out.println("The quotient of the above fraction is " + div);
		System.out.println("The remainder of the above fraction is " + mod);
		
		
    }
}
