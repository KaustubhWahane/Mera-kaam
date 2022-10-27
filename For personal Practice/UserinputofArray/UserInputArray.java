import java.util.Scanner;
public class UserInputArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the desired value of numbers you want to fill in your array");
        int n = sc.nextInt();
        int[] array1 = new int[10];
        System.out.println("Enter the elements in the array");
        	for(int i = 0; i < n; i++) {
        		array1 [i]= sc.nextInt();
        		System.out.println("The Elements are"+ array1 );
        	
        }
        sc.close();
        
    }
}