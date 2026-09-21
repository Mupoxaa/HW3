package part1_arrays;

import java.util.Scanner;

public class Part1Arrays {
    public static void main(String[] args) {
        // Part 1. Syntax & Relational / Logical Operators
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Part 1: Syntax & Control Statements ===");

        // Input Demonstration
        System.out.print("Enter your role (student/teacher/guest): ");
        String role = scanner.nextLine();

        System.out.print("Enter your experience (in years): ");
        int experience = scanner.nextInt();

        // Relational operators (==, !=, >, <, <=, >=) & String.equals()
        if (role.equalsIgnoreCase("student")) {
            // Logical operators (&&, ||, !) & Nested if/else
            if (experience >= 0 && experience <= 4) {
                System.out.println("Status: Junior Student");
            } else if (experience > 4) {
                System.out.println("Status: Senior Student");
            } else {
                System.out.println("Status: Invalid experience input!");
            }
        } else if (role.equalsIgnoreCase("teacher")) {
            if (experience != 0 && !(experience < 2)) {
                System.out.println("Status: Experienced Instructor");
            } else {
                System.out.println("Status: Novice Instructor");
            }
        } else {
            System.out.println("Status: Guest User");
        }

        // Switch Statement Demonstration
        System.out.print("Enter a day number (1-3): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Day 1: Monday - Start of the week");
                break;
            case 2:
                System.out.println("Day 2: Tuesday - Coding day");
                break;
            case 3:
                System.out.println("Day 3: Wednesday - Review day");
                break;
            default:
                System.out.println("Other day selected.");
                break;
        }

        scanner.close();
    }
}
