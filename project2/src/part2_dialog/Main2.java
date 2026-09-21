package part2_dialog;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // --- БЛОК 1: Збір 10 відповідей ---

        System.out.println("1. What is your name?");
        String name = in.nextLine();

        System.out.println("2. How old are you?");
        int age = in.nextInt();
        in.nextLine(); // очищення буфера

        System.out.println("3. What city are you from?");
        String city = in.nextLine();

        System.out.println("4. What is your GPA?");
        double gpa = in.nextDouble();
        in.nextLine(); // очищення буфера

        System.out.println("5. What is your target grade (A/B/C)?");
        char grade = in.next().charAt(0);
        in.nextLine(); // очищення буфера

        System.out.println("6. Do you like programming (true/false)?");
        boolean likesCoding = in.nextBoolean();
        in.nextLine(); // очищення буфера

        System.out.println("7. What is your favorite programming language?");
        String language = in.nextLine();

        System.out.println("8. How many hours do you study per day?");
        double studyHours = in.nextDouble();
        in.nextLine(); // очищення буфера

        System.out.println("9. What is your hobby?");
        String hobby = in.nextLine();

        System.out.println("10. Write a short goal for this course:");
        String goal = in.nextLine();

        // --- БЛОК 2: Логіка Чатбота (String operations) ---

        System.out.println("\n--- Chatbot Response ---");

        // Перевірка 1: contains
        if (language.toLowerCase().contains("java")) {
            System.out.println("Java is a cool choice!");
        }

        // Перевірка 2: startsWith
        if (goal.toLowerCase().startsWith("i want")) {
            System.out.println("Your goal starts with 'I want'. Good motivation!");
        }

        // Перевірка 3: indexOf
        int position = goal.toLowerCase().indexOf("code");
        if (position != -1) {
            System.out.println("The word 'code' is at position: " + position);
        }

        // --- БЛОК 3: Підсумок (Summary) ---

        System.out.println("\n--- User Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("GPA: " + gpa);
        System.out.println("Target Grade: " + grade);
        System.out.println("Likes Coding: " + likesCoding);
        System.out.println("Language: " + language);
        System.out.println("Study Hours: " + studyHours);
        System.out.println("Hobby: " + hobby);
        System.out.println("Goal: " + goal);

        in.close();
    }
}