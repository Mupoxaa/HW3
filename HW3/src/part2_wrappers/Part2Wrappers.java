package part2_wrappers;

import java.util.Scanner;

public class Part2Wrappers {
    public static void main(String[] args) {
        // Part 2. Plain conversation + Daily Activity
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   Part 2: Daily Activity Supposer       ");
        System.out.println("==========================================");

        System.out.print("Hello! Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Based on your age (" + age + "), your supposed daily activity is: ");
        if (age < 6) {
            System.out.println("Home, walk and kindergarten.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("School.");
        } else if (age >= 18 && age <= 22) {
            System.out.println("University.");
        } else if (age >= 23 && age <= 60) {
            System.out.println("Work.");
        } else {
            System.out.println("Retired.");
        }

        scanner.close();
    }
}