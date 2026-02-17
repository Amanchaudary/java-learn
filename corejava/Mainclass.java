public class Mainclass {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="tummy";
        d.walk();
        Dog d2=new Dog();
        d2.name="pyppy";
        d2.bark();
    }

}

class Dog {
    String name;
    int age;
    String color;
    void walk(){
        System.out.println(name+" is wolking");
    }
    void bark(){
        System.out.println(name+" is barking");
    }

}

class Cat {

}