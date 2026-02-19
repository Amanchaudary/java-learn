class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolyExample {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));        // 2 parameters
        System.out.println(c.add(10, 20, 30));    // 3 parameters
        System.out.println(c.add(5.5, 4.5));      // double parameters
    }
}
