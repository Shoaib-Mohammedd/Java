import java.util.Scanner;

public class If_Else_Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a salary ");
        int salary = input.nextInt();
        if ( salary > 10000 ) {
            salary = salary + 2000;

        } else salary = salary + 100;
        System.out.println( salary );
    }

}
