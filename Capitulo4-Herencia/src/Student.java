package src;
import 
public class Student extends Person {

    private double gpa;

    public Student(String n, int ag, String add, String p, double gpa){
        super(n,ag,add,p);
        gpa = this.gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return super.toString() + getGpa();
    }
}
