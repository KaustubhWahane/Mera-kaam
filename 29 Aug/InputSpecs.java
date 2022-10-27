/*
Name - Kaustubh Wahane
Date - 29 Aug 2022
Program - Pc specs description
*/

//declaring a class
import java.util.Scanner;
import static java.lang.System.*;
class InputUser
{
	
	 static void Input_User()  
	{
		//Input String 
		Scanner sc1 = new Scanner(System.in);   
		out.println("Enter your processor name : ");  
		String processor = sc1.nextLine();  
		
		//Input String  
		out.println("\nEnter your motherboard name : ");  
		String motherboard = sc1.nextLine();                
		
		//Input String 
		out.println("\n Enter a GPU name : ");  
		String GPU = sc1.nextLine(); 

		String TotalOutput = ((processor) +" "+ (motherboard)+" "+" "+(GPU));
		System.out.println("Your pc specs are " + TotalOutput);
		
	} 
		public static void main (String ...args)
		{
				 
				Input_User();
			 
		}
		
		
	
}  
	 	
