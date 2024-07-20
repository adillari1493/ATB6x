package Encapsulation;

public class Encapsulation1 {

    //Private data variables so that these variables directly can not be access outside the class
    private int ssn;
    private String empName;
    private int empAge;


    public static void main(String[] args) {
        Encapsulation1 emp = new Encapsulation1();
        emp.setEmpName("Mario");
        emp.setEmpAge(32);
        emp.setSsn(112233);
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee SSN: " + emp.getSsn());
        System.out.println("Employee Age: " + emp.getEmpAge());
    }

    //Getter and Setter methods: to set and get the values of fields..
    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


}
