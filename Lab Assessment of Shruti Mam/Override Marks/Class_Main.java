public class Class_Main {
    public static void main(String[] args) {
      Class c1 = new College_Student();

      //Using the instanceof Keyword to call the inherited class College Student
      if(c1 instanceof College_Student){
        c1.englishSubject();
      }
      if(c1 instanceof College_Student){
        c1.mathsSubject();
      }
    
    if(c1 instanceof College_Student){
       c1.geographySubject(); 
      }
      if(c1 instanceof College_Student){
        c1.historySubject();
      }
      //Average marks method call
      if(c1 instanceof College_Student){
        c1.averageMarks(0, 0, 0, 0);
      }
  }
}
