package geekbrains.lessons.taskLesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int RANGE = 10;
    static final int NUMBER_OF_TRIES = 3;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        String repeatAnswer;

        do {
            int guessNumber = random.nextInt(RANGE);

            for(int i=1; i <= NUMBER_OF_TRIES; i++) {
                System.out.println("Введите число");
                int enterNumber = scanner.nextInt();

                if (enterNumber > guessNumber) {
                    System.out.println("Загаданное число меньше");
                    System.out.println("Количество оставшихся попыток - " + (NUMBER_OF_TRIES - i));

                } else if (enterNumber < guessNumber) {
                    System.out.println("Загаданное число больше");
                    System.out.println("Количество оставшихся попыток - " + (NUMBER_OF_TRIES - i));

                } else {
                    System.out.println("Вы угадали");
                    break;
                }
                if (i == NUMBER_OF_TRIES) {
                    System.out.println("Вы проиграли");
                }
            }

            System.out.println("Хотит сыграть снова? 1 -да, 2 - нет");
            System.out.print("---->");
            repeatAnswer = scanner.next();

        } while ( repeatAnswer.equals("1") );

        scanner.close();

    }
}