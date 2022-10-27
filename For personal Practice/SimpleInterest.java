import java.util.Scanner;
class SimpleInterest
{
    public static void main (String args[])
    {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter principal amount ");
		double p = sc.nextDouble();
		System.out.println ("Enter rate of interest  ");
		double r = sc.nextDouble();
		System.out.println ("Enter the period of years ");
		double n = sc.nextDouble();
		System.out.println ("Therefore your simple interest from the above credentials will be ");
		double s = (p * r * n);
		System.out.println(s);
		
	}
}