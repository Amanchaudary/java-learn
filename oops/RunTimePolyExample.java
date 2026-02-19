// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class RunTimePolyExample {
    public static void main(String[] args) {

        Animal a;   // Reference of parent class

        a = new Dog();   // Object of Dog
        a.sound();       // Dog method will run

        a = new Cat();   // Object of Cat
        a.sound();       // Cat method will run
    }
}
