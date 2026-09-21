import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Is it Saturday? (true/false): ");
        boolean isSaturday = scanner.nextBoolean();

        System.out.print("Is it raining? (true/false): ");
        boolean isRaining = scanner.nextBoolean();

        System.out.print("Is Britain? (true/false): ");
        boolean isBritain = scanner.nextBoolean();


        boolean toGo = false;


        if (isSaturday) {
            if (isBritain) {
                toGo = true;
            } else if (!isRaining) {
                toGo = true;
            }
        }


        if (toGo) {
            System.out.println("YES");
        } else {
            System.out.println("NO :(");
        }

        scanner.close();
    }
}
