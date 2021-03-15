package geekbrains.lessons.taskLesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        changeArrayValues(new int[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 1});
        fillArrayThreeStep();
        increaseArrayElementsLessSix(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        fillDiagonalElementsOfMatrix();

    }

    public static void changeArrayValues(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArrayThreeStep() {
        int[] array2 = new int[8];
        for (int i = 0, j = 0; i < array2.length; i++, j += 3) {
            array2[i] = j;
        }
        System.out.println(Arrays.toString(array2));
    }

    public static void increaseArrayElementsLessSix(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array3));
    }

    public static void fillDiagonalElementsOfMatrix() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
        for (int[] s : matrix) {
            for (int a : s) {
                System.out.print(a + " , ");
            }
            System.out.println();
        }
    }
}

