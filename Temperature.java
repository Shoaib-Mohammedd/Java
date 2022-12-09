import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a temperature in C: ");
        float tempC = input.nextFloat();
        float temptF = (tempC * 9/5) +32;
        System.out.println( temptF );
    }
}
