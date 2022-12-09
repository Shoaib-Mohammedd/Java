import java.util.Scanner;

public class PrimeExample {
    public static void main(String[] args) {
        Scanner E_num = new Scanner(System.in);
    System.out.println( " Enter a number to Check If it's Prime or Not ! ");
        int num = E_num.nextInt();
        boolean flag = false;
        for ( int i = 2; i <= num / 2; ++i ) {
            // condition for none-prime number
            if ( num % i == 0 ) {
                flag = true;
                break;
            }
        }

        if ( !flag )
            System.out.println( num + " is a prime number ! ");
        else
            System.out.println( num + " is not a prime number !");
    }
}
