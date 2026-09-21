package part3_anime;

import java.util.Scanner;

public class Part3Anime {
    public static void main(String[] args) {
        // Part 3. Improved conversation (Anime Recommender System)
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   Part 3: Anime Recommender System      ");
        System.out.println("==========================================");

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Nice to meet you, " + name + "! Enter your preferred genre (action / dark fantasy / comedy / slice of life / romance): ");
        String genre = scanner.nextLine().toLowerCase().trim();

        System.out.println("\nFinding the best anime for " + name + "...");

        // Complex Conditionals (Age + Genre)
        if (age >= 16) {
            if (genre.equals("dark fantasy") || genre.equals("action")) {
                System.out.println("Recommendation: 'Attack on Titan' (Shingeki no Kyojin) - A masterpiece with deep lore, political drama, and intense action!");
            } else if (genre.equals("comedy") || genre.equals("slice of life")) {
                System.out.println("Recommendation: 'K-On!' - A wholesome and heartwarming comedy about a high school light music club!");
            } else if (genre.equals("romance")) {
                System.out.println("Recommendation: 'Your Name' (Kimi no Na wa) - A beautiful romantic sci-fi story.");
            } else {
                System.out.println("Recommendation: 'One Punch Man' - Great combination of action and superhero comedy.");
            }
        } else if (age >= 12 && age < 16) {
            if (genre.equals("action") || genre.equals("dark fantasy")) {
                System.out.println("Recommendation: 'Demon Slayer' (Kimetsu no Yaiba) - Epic action and swordsmanship.");
            } else if (genre.equals("comedy") || genre.equals("slice of life")) {
                System.out.println("Recommendation: 'K-On!' - Cute girls doing cute things and playing music!");
            } else {
                System.out.println("Recommendation: 'Spy x Family' - Fun, action-packed family comedy.");
            }
        } else {
            if (genre.equals("comedy") || genre.equals("romance") || genre.equals("slice of life")) {
                System.out.println("Recommendation: 'My Neighbor Totoro' - Wholesome and classic Studio Ghibli film.");
            } else {
                System.out.println("Recommendation: 'Pokémon' - Classic adventure for all ages.");
            }
        }

        System.out.println("\nThank you for using the Anime Recommender System! Enjoy watching!");
        scanner.close();
    }
}
