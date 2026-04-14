import src.*;

public class Main {
    public static void main(String[] args) {
        Person[] p = new Person[4];
        Student[] s = new Student[4];

        p[0] = new Person("Joe", 20, "Street 1", "77551");
        p[1] = new Person("Jill", 21, "Street 2", "78649");
        p[2] = new Person("Biden", 22, "Street 3", "684984");

        s[0] = new Student("John", 19, "Street 4", "12345", 3.5);
        s[1] = new Student("Jane", 20, "Street 5", "67890", 3.8);
        s[2] = new Student("Bob", 21, "Street 6", "54321", 3.2);
        s[3] = new Student("Alice", 22, "Street 7", "98765", 3.9);
        
        printAll(p);
        if (p[2] instanceof Employee) {
            ((Employee) p[3]).raise(0.04);
        }


        printAll(p);
    }

    public static void printAll(Person[] arr) {
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] != null){
                System.out.println("[" + i + "]");
                System.out.println(arr[i].toString());
            }
        }
    }
}
