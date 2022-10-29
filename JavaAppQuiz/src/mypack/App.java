package mypack;

import java.util.Scanner;

class Questions {
	String prompt;
	String answer;
	//Creating a parameterized constructor of the class

	public Questions(String prompt, String answer) {
		this.prompt = prompt;
		this.answer = answer;
	}
}

public class App {
	public static void main(String[] args) {
		String s1 = "What is the most used number\n"+ "a:69\nb:70\nc:619\nd:15";
	     String s2 = "Which is the best game for me?\n"+ "a:Sekiro\nb:Warframe\nc:CallOfDuty\nd:ClashOfClans";
	     String s3 = "What is the biggest thing in the universe\n"+ "a:galaxy\nb:planet\nc:Universe\nd:MilkyWay";
	     String s4 = "What is 1 + 1\n"+ "a:11\nb:2\nc:23\nd:21";
	     
	     Questions [] question= {
	    		 new Questions(s1 , "a"),
	    		 new Questions(s2 , "a"),
	    		 new Questions(s3 , "c"),
	    		 new Questions(s4 , "b")
	     };
	     takingTest(question);
	     
}     
	     public static void takingTest(Questions [] question) {
	    	 int score = 0; //This is for if the answer is right
	    	 Scanner sc = new Scanner(System.in);
	    	 String rightAnswer = sc.nextLine();
	    	 sc.close();
	    	 //To count the number of questions answered
	    	 for(int i = 0 ; i<question.length; i++) {
	    		 //In this situation the user will just select the option note that its not been checked
	    		 System.out.println(question[i].prompt); 
	    		 if(rightAnswer.equals(question[i].answer)) {
	    			 score++;
	    		 }
	    		 else {
	    			 System.out.println("Sorry you have chosed the wrong option");
	    		 }
	    			 
	    		 }
	    	 System.out.println("You got" + score + "/" + question.length);
	    	
	     }
}

