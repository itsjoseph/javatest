import src.*;

public class Main {
    public static void main(String[] args) {
        Person[] p = new Person[4];

        p[0] = new Person("Joe", 20, "Street 1", "77551");
        p[1] = new Person("Jill", 21, "Street 2", "78649");
        p[2] = new Person("Biden", 22, "Street 3", "684984");

        System.out.println(p[2].getName());    
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
