/*
Program - To find the perfect number by user input within range
author - Kaustubh Wahane
Date - 13 Sep 2022
*/

//Creating a class
import java.util.Scanner;
class PerfectNumber
{
		static boolean isPerfectNumber(int num)  
		{  
		//This determines all the divisors of the given number and adds them  
			int sum = 1;  
				for (int i = 2; i * i <= num; i++)  
				{  
					if (num % i==0)  
						{  
							if( i != num) 
							{								
								sum = sum + i + num / i;  
							}
							else
							{								
							//calculates the sum of factors  
								sum = sum + i;  
							}
						}   
				}   
					if (sum == num && num != 1)  
						return true; return false; //Sir ka sikhaya hua method
		  
		}   
									  
					public static void main (String args[])  
					{  
						System.out.println("Perfect Numbers between 2 to 10000 are: ");  
						for (int n = 2; n < 10000; n++)    
						if (isPerfectNumber(n))  
						//prints all perfect number between given range  
						System.out.println(n +" is a perfect number");  
					}  
		
	
}