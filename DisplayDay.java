import java.util.Scanner;

public class DisplayDay {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println(" Enter number of the day to see it's name !");
        int day = input.nextInt();
        switch (day){
            case 1 -> System.out.println(" Saturday :");
            case 2 -> System.out.println(" Sunday :");
            case 3 -> System.out.println(" Monday :");
            case 4 -> System.out.println(" Tuesday :");
            case 5 -> System.out.println(" wednesday :");
            case 6 -> System.out.println(" Thursday :");
            case 7 -> System.out.println(" Friday :");
        }
    }
}
