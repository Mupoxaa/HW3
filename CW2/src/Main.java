//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {
    Scanner in = new Scanner(System.in);

    System.out.println("Hey! What is your name?");
    String name = in.nextLine();

    System.out.println("How many hours did you work on the SDT100 home task?");
    double hours = in.nextDouble();
    in.nextLine();

    System.out.println("Did you find the assignment difficult? (yes/no)");
    String feedback = in.nextLine();

    System.out.println("What was the hardest part of the task?");
    String hardestPart = in.nextLine();

    long seconds = (long) (hours * 3600);

    System.out.println("Dear " + name + ", you spent " + seconds + " seconds on your home task.");
    System.out.println("Difficult: " + feedback);
    System.out.println("Hardest part: " + hardestPart);

    in.close();
}
