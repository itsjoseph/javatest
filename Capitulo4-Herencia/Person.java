public class Person {
    private String name;
    private int age;
    private String address;
    private String phone;

    public Person(String n, int ag, String add, String p){
        n = this.name;
        ag = this.age;
        add = this.address;
        p = this.phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getPhone();
    }
}