// Name - Kaustubh Wahane
// Date - 31 Aug 2022
// Program - Youtube video constructors


//The reason being i used main first because its a superclass and it must contain at first following the other classes
//Class example
// class PenInput
// {
// 	public static void main (String []args)
// 	{
// 		Pen p1 = new Pen("Trimax" , "Black");
// 		p1.penInfo(); //calling the method of class Pen
// 	}
// }


// class Pen
// {
// 	String color;
// 	String penName;
// 	void penInfo()
// 	{
// 		System.out.println("Your pen color is " + this.color);
// 		System.out.println("Your pen name is " + this.penName);
// 	}
	
// 	Pen(String penName , String color) //This is parameterized constructor
// 	{
// 		System.out.println("constructor bulaya  hai");
// 		this.penName = penName; //Yaha par this pen name hai object and penName hai String ka parameter
// 		this.color = color; //Same as above
// 	}
// }


/* 
class PenInput
{
	public static void main (String ... args)
	{
		Pen p1 = new Pen();
		p1.color = "Black";
		p1.penName = "Trimax";
		p1.penInfo(); //calling the method of class Pen
	}
}
class Pen
{
	String color;
	String penName;
	void penInfo()
	{
		System.out.println("Your pen color is " + this.color);
		System.out.println("Your pen name is " + this.penName);
	}
	
	Pen() //This is non parameterized constructor
	{
		System.out.println("constructor bulavwa hai");
		
	}
}
*/
//Dhyanwaad Java for doing Destructor work :prayge:

//Polymorphism
//1 Compile time Polymorphism
// import java.lang.System;

// class OOPS
// {
// 	public static void main (String args[])
// 	{
// 		Student s1 = new Student();
// 		s1.name = aman;
// 		s1.age = 69;
		
// 		s1.printInfo(name);
// 		s1.printInfo(age);
// 	}
// }
// class Student
// {
// 	//Now you notice i have called the same method but for different purposes

// 	String name;
// 	int age;
// 	void printInfo(String name)
// 	{
// 		System.out.println(name);
// 	}
// 	void printInfo(int age)
// 	{
// 		System.out.println(age);
// 	}
// 	void printInfo(String name, int age )
// 	{
// 		System.out.println(name + "" + age);
// 	}
// }


//Inheritance

public class Shape ()
{
	String color;
	int size;
}
	class Triangle extends Shape  
	{

	}
		public class OOPS
		{
			public static void main (String args[])
			{
				Triangle T1 = Triangle();
				T1.color ="Black";
				T1.size = "A1";

			}
		}



