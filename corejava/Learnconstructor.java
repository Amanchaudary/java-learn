public class Learnconstructor {
        public static void main(String[] args) {
            complex num1=new complex();
            // complex fuction run nagrda oani run vako xa
            num1.print();
        }
}
class complex{
    int a,b;
    public complex(){
        a=0;
        b=0;
        System.out.println("constuctor will automatic one time run ");
    }
    void print(){
        System.out.println(a+"+"+b);
    }
}