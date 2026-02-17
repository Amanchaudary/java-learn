public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj=new Greet();
        obj.greeting();
        obj.greeting("aman");
        obj.greeting("aman",5);
    }
}
class Greet{
    void greeting(){
        System.out.println("Hello,good morning");
    }
    void greeting(String name){
        System.out.println(name+" Hello,good morning");
    }
    void greeting(String name, int count){
    
        for(int i = 0; i<count; i++){
            System.out.println("Hello "+name+" good morning");
        }
    }
}
