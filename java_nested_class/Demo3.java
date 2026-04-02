public class Demo3 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.greet();
    }
}
class Outer{
    void greet(){
        System.out.println("hello");
        class local {
            void sayhello(){
                System.out.println("hello");
            }

        }
        local local=new local();
        local.sayhello();
    }
}
