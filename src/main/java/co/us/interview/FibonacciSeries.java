package co.us.interview;

public class FibonacciSeries {
    // 0 1 1 2 3 5 8 ...
    public static void main(String[] args) {
        calculateAndPrintFibonacci(150);
        calculateAndPrintFibonacci(450);
    }

    private static void calculateAndPrintFibonacci(int x) {
        int a, b = 0, c = 1;
        while (b <= x) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(" " + a);
        }
        System.out.println();
    }

}
