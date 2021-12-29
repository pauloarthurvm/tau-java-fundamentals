package chapter9;

public class PersonInheritance {

    private String name;
    private int age;
    private String gender;

    public PersonInheritance(String name) {
        System.out.println("In Person 2nd - name - default constructor");
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
