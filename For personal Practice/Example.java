class Example{
   //Default constructor
   Example(){
      System.out.println("Default constructor");
   }
   /* Parameterized constructor with 
    * two integer arguments
    */
   Example(int i, int j){
      System.out.println("constructor with Two parameters");
   }
   /* Parameterized constructor with 
    * three integer arguments
    */
   Example(int i, int j, int k, int l){
      System.out.println("constructor with Three parameters");	      
   }
	   
   /* Parameterized constructor with 
    * two arguments, int and String
    */
   Example(int i, String name){
      System.out.println("constructor with int and String parameters");
   }
   Example(int i, String name, boolean flag){
      System.out.println("constructor with int ,String, boolean parameters");
   }
   public static void main(String args[]){
      //This will invoke default constructor
      Example obj = new Example();

      /* This will invoke the constructor 
       * with two int parameters
       */
      Example obj2 = new Example(12, 12);

      /* This will invoke the constructor 
       * with three int parameters
       */
      Example obj3 = new Example(1, 2, 13);
	
      /* This will invoke the constructor 
       * with int and String parameters
       */
      Example obj4 = new Example(1,"BeginnersBook", true);
   }
}