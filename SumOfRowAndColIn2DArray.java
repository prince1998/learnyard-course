import java.util.Scanner;

public class SumOfRowAndColIn2DArray {

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

        for (int i = 0; i < rowSize; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < colSize; j++) {
                sumOfRow += arr[i][j];

            }
            System.out.print("Sum of row " + i + " = " + sumOfRow);
        }

        for (int j = 0; j < colSize; j++) {
            int sumOfColumn = 0;
            for (int i = 0; i < rowSize; i++) {
                sumOfColumn += arr[i][j];
            }
            System.out.print("Sum of column " + j + " = " + sumOfColumn);
        }

    }
}