/*Program - To print total amount of customer
Name - Kaustubh Wahane
Date - 6 Sept 2022
*/
import java.util.*;
class Restaurant
{
		static void coursePrices()
		{
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter your meal ");	
		String course = sc.nextLine();
		String course_lower = course.toLowerCase();
		int Starter = 200;
		int Main = 700;
		int Desert = 100;
		int Total = (Starter + Main + Desert);
			switch (course_lower)
			{
				case "starter" -> System.out.println("Your amount for starter course is " + (Starter));
				
				case "main" -> System.out.println("Your amount for Main course is " + (Main));
				
				case "desert" ->  System.out.println("Your desert meal is " + (Desert));
				
				case "total" -> System.out.println ("Your total bill is " + (Total));
				default ->System.out.println ("Sorry wrong input");
			}
		}
		
		public static void main(String args[])
		{
			coursePrices();	
			
		
		}
}

