package src;

public class Employee extends Person {

    private double salary;

    public Employee(String name, int age, String address, String phone, double salary){
        super(name, age, address, phone);
        salary = this.salary;
    }

    @Override
    public String toString() {
        return super.toString() +  " " + getSalary();
    }

    public double getSalary() {
        return this.salary;
    }

    public void raise(double percentage){
        salary += (1 + percentage);
    }

    
    
}
