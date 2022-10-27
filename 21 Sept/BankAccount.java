import java.util.*;
public class BankAccount {

	public static void main(String args[]) {
	//Declaring this variable as an assumption we have 1000 rupees on our bank account		
	int totalAmount = 1000;
	
	//Importing scanner
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter what you want to do with your balance"+ "\nDeposit" +"\nWithdraw" + "\n Display" + " \n");  
	//This will store the case which we will give 
	
	String amount = sc.nextLine();
	
	System.out.println("Enter the amount ");
	int a = sc.nextInt();
	sc.close();
	int Deposit = totalAmount + a;
	int Withdraw = totalAmount - a;
	switch (amount) {
	case "Deposit" -> System.out.println("Total amount deposited is "+ Deposit);

	case "Withdraw" ->System.out.println("Total amount Withdrawn is "+ Withdraw);
	
	case "display" -> System.out.println("Your balance amount is" + totalAmount);
	}

	}

}
