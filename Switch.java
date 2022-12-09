import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruits = input.next();
        switch ( fruits){
            case " Apple" :
                System.out.println(" King of fruits");
                break;
            case "  Mango":
                System.out.println(" My favor Fruit");
                break;
            case " Orange":
                System.out.println(" Round Fruit");
                break;
            case " Grapes":
                System.out.println(" Small Fruit");
                break;
            default:
                System.out.println(" Not matched please enter a valid fruit!");
        }
    }
}
