abstract class Animal{
	Animal(){
		System.out.println("You are creating an Animal");
	}
	public void walk(){

	}
	public void eat(){
		System.out.println("Animal eats");
	}
}

 class Horse extends Animal
{
    public void walk(){
        System.out.println("He has 4 legs");
    }
}
class Chicken extends Animal{
	public void walk() {
	System.out.println("He has 2 legs");
	}
}
public class OOPS{
    
	public static void main (String args[])
	{
		Horse horse = new Horse();
		horse.walk();
		horse.eat();
	}
}
/*
 What's the meaning of static keyword?
 public class Student{
    String name;
    static String school;
 }
 public class OOPS{
    public static void main (String args[]){
     //This is where we can make the static string and give it a real entity   
     Student.school = "ABC";
     Student s1 = new Student();
     s1.name = "GAWD";
    }
 }
 */