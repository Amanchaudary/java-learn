public class AraayQuestion {
    public static void main(String[] args) {
        int number[] = { 10, 5, 30, 40, 15, 20, 31 };
        // 1 find maximun and minimum element i this array
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println("max element=" + max);
    }
}
