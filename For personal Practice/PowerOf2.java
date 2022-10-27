import java.util.Scanner;
class PowerOf2
{
    public static void  checkPower()
    {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter the number" );
		double a = sc.nextDouble();
		if ( a == 1)
		{
			System.out.println("Sorry the number 1 is already the power of 2 ");
			break;
		}
		else if (a >= 4)
		{
			System.out.println("This number can be the power of two " + a);
			break;
		}
		sc.close();
			
	}
	public static void main (String args[])
		{
			checkPower();
		}
}