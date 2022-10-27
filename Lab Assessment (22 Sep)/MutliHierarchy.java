/*
Program - Program 2
author - Kaustubh Wahane
Date - 22 Sept 2022
*/

//Creating a base class called Game 
class Game {
    void funcA() {
       System.out.println("This is the Base of the Game");
    }
 }

 //Creating a specific game by inhereting the properties of Game
 class Sekiro_Shadows_Die_Twice extends Game {
    void funcB() {
       System.out.println("It's a Martial Arts Game");
    }
 }
 //Same as above
 class Warframe extends Sekiro_Shadows_Die_Twice {
    void funcC() {
       System.out.println("It's a open world friendly player game");
    }
 }
 public class MutliHierarchy {
    public static void main(String args[]) {
        //Notice i am creating the object for the 3rd class so it gets inherited by all the classes
       Warframe obj = new Warframe();
       obj.funcA();
       obj.funcB();
       obj.funcC();
    }
 }