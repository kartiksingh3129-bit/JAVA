import java.util.Scanner;

public class SwapNumbers {
    public SwapNumbers() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        int a = 5;
        int b = 10;
        System.out.println("BEFORE SWAPPING : a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("AFTER SWAPPING : a = " + a + " b = " + b);
    }
}
