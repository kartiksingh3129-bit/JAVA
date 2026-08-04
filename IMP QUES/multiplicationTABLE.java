public class multiplicationTABLE {
    public multiplicationTABLE() {
    }

    public static void main(String[] args) {
        int num = 7;

        for(int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", Integer.valueOf(num), i, num * i);
        }

    }
}
