    package geekbrains.lessons.Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class Main {

        static final int SIZE_FIELD =5;
        static final int COUNT_SHIPS =3;

        static Scanner scanner = new Scanner(System.in);
        static Random random = new Random();

        public static void main(String[] args) {

            //1.Заполним карту игрока
            //2.Заполним карту компа
            //3. Реализуем игровой цикл

            do {
                System.out.println("+++++++++WAR BATTLESHIPS+++++++");

            int remainingCountUserShips = COUNT_SHIPS;
            int remainingCountComputerShips = COUNT_SHIPS;

            int[] userWarField = getUserWarField();
            int[] computerWarField = getComputerWarField();

            int[] computerDidShoot = new int[userWarField.length];
            boolean isUserStep = random.nextBoolean();

                System.out.println("Игра началась!");

            while(remainingCountUserShips > 0 && remainingCountComputerShips >0) {
                if (isUserStep) {
                    System.out.println("Укажите ячейку для атаки");
                    int indCeil = scanner.nextInt();

                    if (computerWarField[indCeil] != 0) {
                        System.out.println("Убил");

                        computerWarField[indCeil] = 0;
                        remainingCountComputerShips--;
                        isUserStep = true;
                    } else {
                        System.out.println("Промах");
                        isUserStep = false;
                    }

                } else {
                    int indCeil = random.nextInt(userWarField.length);

                    while (computerDidShoot[indCeil] == 1) {
                        indCeil = random.nextInt(userWarField.length);
                    }

                    if (userWarField[indCeil] != 0) {
                        System.out.println("Противник вас убил в ячейке " + indCeil);
                        userWarField[indCeil] = 0;
                        System.out.println(Arrays.toString(userWarField));

                        remainingCountUserShips--;
                        isUserStep = false;
                    } else {
                        System.out.println("Противник стрелял по ячейке " + indCeil);
                        isUserStep = true;
                    }

                    computerDidShoot[indCeil] = 1;
                }
            }
                System.out.println("Хотите поиграть заново? --> ");
            } while (scanner.next().equals("Y"));

            scanner.close();
        }

        private static int[] getComputerWarField() {
            int [] computerField = new int[SIZE_FIELD];

            int availableCountShips = COUNT_SHIPS;
            while (availableCountShips > 0) {
                int indCeil = random.nextInt(computerField.length);

                if(computerField[indCeil] == 0) {
                    computerField[indCeil] = 1;
                    availableCountShips--;
                }

            }

            System.out.println("Соперник завершил расстановку");
            return computerField;

        }

        private static int[] getUserWarField() {
            int [] userField = new int[SIZE_FIELD];

            int availableCountShips = COUNT_SHIPS;

            while (availableCountShips > 0) {
                System.out.print("Укажите ячейку для корабля -> ");
                int indCeil = scanner.nextInt();

                if (indCeil >= userField.length || indCeil <0) {
                    System.out.println("Указана некорректная ячейка. Доступны ячейки от 0 до "
                            + (userField.length - 1));
                }
                    else if(userField[indCeil] != 0) {
                        System.out.println("Ячейка уже занята");
                    } else {
                        userField[indCeil] = 1;
                        availableCountShips --;

                        System.out.println(Arrays.toString(userField));
                    }
                }

            System.out.println("Вы успешно расставили корабли");
            System.out.println(Arrays.toString(userField));

            return userField;
        }

    }
