import java.util.Scanner;

public class SumOfDiagonalElements2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rowSize = in.nextInt();
        int colSize = in.nextInt();
        int arr[][] = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int leftDiagonalSum = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (i == j) {
                    leftDiagonalSum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal elements = " + leftDiagonalSum);

        int rightDiagonalSum = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (i + j == rowSize - 1) {
                    rightDiagonalSum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of right diagonal elements = " + rightDiagonalSum);

    }
}