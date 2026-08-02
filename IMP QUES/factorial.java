 import java.util.Scanner;

public class factorial {
    public factorial() {
    }

    public static void main(String[] args) {
        int factorial = 1;
        new Scanner(System.in);
        int number = 5;

        for(int i = 1; i <= number; ++i) {
            factorial *= i;
        }

        System.out.println(" FACTORIAL OF GIVEN NO. IS :" + factorial);
    }
}

