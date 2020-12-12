package MaxElementArray2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        System.out.print("Enter column: ");
        int col = sc.nextInt();

        matrix = new int[row][col];
        createElementArray(matrix, row, col);
        printMatrix(matrix);

        findMaxElementArray2(matrix);
    }

    public static void findMaxElementArray2(int[][] array) {
        int max = array[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.printf("Max is %d in row %d and column %d", max, row + 1, col + 1);
    }

    public static void createElementArray(int[][] array, int row, int col) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter col element %d %d: ", i, j);
                array[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
