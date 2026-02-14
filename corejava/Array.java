public class Array {
    public static void main(String[] args) {
        // decleration
        // int[] age;
        // decleration and initilation
        // int[] age1=new int[100];

        int age2[] = { 10, 20, 30, 40, 50, 60 };

        System.out.println(age2[0]);
        System.out.println(age2[1]);
        System.out.println(age2[2]);
        System.out.println("using loop");
        age2[2] = 40;
        for (int i = 0; i <= 5; i++) {
            System.out.println(age2[i]);
        }
        // how to insert
        System.out.println("how to insert array");
        int age[] = new int[5];
        age[0] = 1;
        age[2] = 3;
        age[3] = 5;
        System.out.println(age[0]);

    }
}