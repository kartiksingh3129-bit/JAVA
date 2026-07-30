import java.util.Scanner;

public class primeORnot {
     public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.print("ENTER NUMBER:");
     int n = sc.nextInt();
     
     if (n==2){
        System.out.println(n + " is a prime number");
     }
      else {
           boolean isPrime = true; 
           for (int i=2; i<=Math.sqrt(n); i++){ 
                if (n % i == 0){  //  n is a multiple of i ( it means i is not equal to 1 or n)
                   isPrime = false;
         }
     }
       if (isPrime == true){
           System.out.println(n + " is a prime number");
    }
      else {
        System.out.println(n + " is not a prime number");
      }
   }
 } 
}