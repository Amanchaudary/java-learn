class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;  // current object variable
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Thiskey {
    public static void main(String[] args) {
         Student s1 = new Student("Aman", 24);
        s1.display();
    }
}
