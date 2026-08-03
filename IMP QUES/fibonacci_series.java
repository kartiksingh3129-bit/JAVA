import java.util.Scanner;

public class fibonacci_series {
    public fibonacci_series() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        int number = 6;
        int first = 0;
        int second = 1;
        System.out.print("FIBONACCI SERIES IS : ");

        for(int i = 0; i <= number; ++i) {
            System.out.println("" + first);
            int next = second + first;
            first = second;
            second = next;
        }

    }
}
