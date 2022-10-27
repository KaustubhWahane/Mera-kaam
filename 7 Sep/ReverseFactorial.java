/*
Program - To print the star in a reverse right angled triangle
author - Kaustubh Wahane
Date - 7 Sep 2022
*/

//Creating a class
import java.util.*;
class ReverseFactorial
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt(); 
        for(int i=n;i>0;i--)
        {
           for(int j=0;j<i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
        }
     }
}