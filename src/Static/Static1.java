package Static;

/*public class Static1 {
    int rollNo;
    String name;
    static String college="PSIT";

    public Static1(int rollNo, String name, String college) {
        this.rollNo = rollNo;
        this.name = name;
        this.college = college;
    }

}*/


class Student{
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to show the values of objects
    class TestStaticVariable1{
    public static void main(String args[]){
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(112,"Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
        Student.college="PSIT";
        Student s3 = new Student(113,"Mohit");
        Student s4 = new Student(114,"Dheeraj");
        s3.display();
        s4.display();
    }
}