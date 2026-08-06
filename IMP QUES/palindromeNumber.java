
import java.util.Scanner;

public class palindromeNumber {
    public palindromeNumber() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER A NUMBER :");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println("" + number + " is a palindrome ");
        } else {
            System.out.println("" + number + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;

        int reversedNumber;
        for(reversedNumber = 0; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        return originalNumber == reversedNumber;
    }
}
