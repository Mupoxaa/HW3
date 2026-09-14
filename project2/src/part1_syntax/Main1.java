package part1_syntax;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // 1. Variables
        int age = 17;
        double score = 95.5;
        char grade = 'A';
        boolean isStudent = true;
        String city = "Tallinn";

        // Виводимо змінні, щоб прибрати попередження (Variable is never used)
        System.out.println("User: " + age + " y.o., grade: " + grade + ", student: " + isStudent + ", city: " + city);

        // 2. Operations & Type Casting
        int a = 15;
        int b = 4;

        System.out.println("Addition (+): " + (a + b));
        System.out.println("Subtraction (-): " + (a - b));
        System.out.println("Multiplication (*): " + (a * b));
        System.out.println("Division (/): " + (a / b));
        System.out.println("Modulus (%): " + (a % b));

        a++;
        System.out.println("Increment (++): " + a);
        b--;
        System.out.println("Decrement (--): " + b);

        double castedDouble = a;
        int castedInt = (int) score;
        System.out.println("Casted double: " + castedDouble);
        System.out.println("Casted int: " + castedInt);

        // 3. String Operations
        String greeting = "Hello, Java World!";
        System.out.println("Length: " + greeting.length());
        System.out.println("To Uppercase: " + greeting.toUpperCase());

        // 4. Input / Output
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your favorite subject:");
        String subject = in.nextLine();
        System.out.println("Your favorite subject is " + subject);

        in.close();
    }
}