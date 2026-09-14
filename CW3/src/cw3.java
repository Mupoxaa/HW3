import java.util.Scanner;

public class cw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello");


        System.out.print("Is it raining? (true/false): ");
        boolean isRaining = scanner.nextBoolean();


        if (isRaining) {

            System.out.println("Yes!");
        } else {

            System.out.println("Not Today");
        }


        scanner.close();
    }
}