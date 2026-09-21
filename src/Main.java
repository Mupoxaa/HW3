import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 1. Генерація випадкового числа від 0 до 10 (включно)
        int targetNumber = random.nextInt(11); // random.nextInt(11) генерує діапазон 0..10
        int userGuess = -1;                    // Змінна для збереження варіанту користувача
        int attemptsCount = 0;                 // Лічильник спроб

        System.out.println("=== Вітаємо у грі 'Угадай число'! ===");
        System.out.println("Я загадав число від 0 до 10. Спробуй його вгадати!");

        // 4. Цикл триває доти, доки користувач не вгадає число (userGuess != targetNumber)
        while (userGuess != targetNumber) {
            System.out.print("Введи свій варіант: ");
            userGuess = scanner.nextInt();
            attemptsCount++; // Збільшуємо кількість спроб на 1

            // 3. Порівняння загаданого числа та відповіді користувача
            if (userGuess == targetNumber) {
                // 5. Умова перемоги
                System.out.println("Вітаємо! Ти вгадав число!");
                System.out.println("Загальна кількість спроб: " + attemptsCount);
            } else if (userGuess > targetNumber) {
                System.out.println("Спробуй менше число (Try a smaller number).");
            } else {
                System.out.println("Спробуй більше число (Try a bigger number).");
            }
        }


        scanner.close();
    }
}
