import java.util.Scanner;

public class Checking_Salary {
    public static void main(String[] args) {
        Scanner Check_Salary = new Scanner(System.in);
        System.out.println( " Enter You're Salary ! " );
        int View = Check_Salary.nextInt();
        //int bonus = 200;
        if ( View >= 10000 ) System.out.println( " You're Salary is! " + View + 2000 );
        //int sub = View - bonus;

        if ( View <= 2000) System.out.println( " You're Salary is! " + View );

    }
}
