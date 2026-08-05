import java.util.Scanner;

public class odd_or_even {
    public odd_or_even() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a no. :");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("" + number + "is a even no. ");
        } else {
            System.out.println("" + number + " is a odd no.  ");
        }

    }
}
