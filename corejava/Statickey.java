public class Statickey {

    public void print1() {
        System.out.println("hello with non static key");
    }

    // use with static keyword
    public static void print2() {
        System.out.println("HEllo with  staic keyword");
    }

    public static void main(String[] args) {

        // not static lai access garna pard aobejct banauna paryo

        
        //  object bauna paren direct access garna milyo
        print2();
    }
}
