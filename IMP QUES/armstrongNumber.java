import java.util.Scanner;

public class armstrongNumber {
    public armstrongNumber() {
    }

    public static void main(String[] args) {
        int arm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER : ");
        int num = sc.nextInt();

        int a;
        int d;
        for(d = num; num > 0; arm += a * a * a) {
            a = num % 10;
            num /= 10;
        }

        if (arm == d) {
            System.out.println("ARMSTRONG NUMBER ");
        } else {
            System.out.println("NOT A ARMSTRONG NUMBER ");
        }

    }
}
