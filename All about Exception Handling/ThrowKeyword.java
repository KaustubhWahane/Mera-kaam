import java.util.Scanner;

class VotingAge extends RuntimeException{
    VotingAge(String message){
        System.out.println(message);
    }
}

public class ThrowKeyword{
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if(age < 18){
            throw new VotingAge("Sorry bhai bada hoja thoda");
        }
        else{
            System.out.println("Yee baaaaat bro");
        }
    }
}