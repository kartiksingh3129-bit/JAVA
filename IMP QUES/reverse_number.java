/*
public class reverse_number {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER NUMBER : ");
        int num =  sc.nextInt();

        while (num > 0){
           int last_digit = num % 10;
           System.out.print(last_digit  + " ");
           num /= 10;
        }
         System.out.println();
    }
    
}
    */
import java.util.Scanner;




// REVERSE THE GIVEN NUMBER 
public class reverse_number {
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("ENTER NUMBER :");
    int num = sc.nextInt();
    int rev = 0;

    while (num > 0){
        int last_digit = num % 10 ;
        rev = (rev * 10) + last_digit;
        num/=10;
    }
       System.out.println(rev);
    }
}


     