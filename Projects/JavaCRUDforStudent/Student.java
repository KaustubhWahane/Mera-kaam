import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Student{
    private String studentName;
    private int  studentRollno;
    private char division;

    public Student(String studentName, int studentRollno, char division) {
        this.studentName = studentName;
        this.studentRollno = studentRollno;
   
        this.division = division;
    }

    public String getStudentName() {
        return studentName;
    }
 
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getStudentRollno() {
        return studentRollno;
    }
    public void setStudentRollno(int studentRollno) {
        this.studentRollno = studentRollno;
    }

    public char getDivision() {
        return division;
    }
    @Override
    public String toString() {
        return "Student Details [Your name=" + studentName + ", RollNo=" + studentRollno + "Division=" + division + "]";
    }

    public void setDivision(char division) {
        this.division = division;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> lc = new LinkedList<Student>();
      int x;
      do {
        System.out.println("For Create Press 1");
        System.out.println("For Read/Display Press 2");
        System.out.println("For Search Press 3");
        System.out.println("For Delete Press 4");
        x= sc.nextInt();
        switch(x){
            case 1 -> {   
            System.out.println("--------------------------------------");
            System.out.println("Please fill your details");
            System.out.println("Name");
            String sname = sc.next();
            System.out.println("Roll Number");
            int rollno = sc.nextInt();
            System.out.println("Division of your course");
            char div = sc.next().charAt(0);
            lc.add(new Student(sname, rollno, div));
        }
        case 2->{
            System.out.println("--------------------------------------");
            System.out.println("The details you have entered"+ lc);
            Iterator<Student> s = lc.iterator();
            while(s.hasNext()){
                Student s1 = s.next();
                System.out.println(s1);
            }
        }
        case 3->{
            boolean value = false;
            System.out.println("Enter the studentId number");
            int sid = sc.nextInt();
            System.out.println("--------------------------------------");
            Iterator<Student> s = lc.iterator();
            s = lc.iterator();                        
            while(s.hasNext()){
                Student s1 = s.next();
               if(((Student) s).getStudentRollno()==sid){
                value = true;
               }
            }
        }
     }
      } while (x!=0);
       
        sc.close();

    }
}