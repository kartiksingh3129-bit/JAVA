public class sumOFdigits {
    public sumOFdigits() {
    }

    public static void main(String[] args) {
        int number = 12345;
        int sumOfDigits = calculateSumOfDigits(number);
        System.out.println(" sum of digits of " + number + " is " + sumOfDigits);
    }

    public static int calculateSumOfDigits(int number) {
        int sum;
        for(sum = 0; number > 0; number /= 10) {
            int digit = number % 10;
            sum += digit;
        }

        return sum;
    }
}
