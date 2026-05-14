public class Demo3 {
    public static void main(String[] args) {
        // step1
        System.out.println("step1");
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("can not devided by zero");
        }
        System.out.println("step2");
    }
}
