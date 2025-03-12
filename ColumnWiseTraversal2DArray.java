import java.util.Scanner;

public class ColumnWiseTraversal2DArray {
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

        for (int j = 0; j < colSize; j++) {
            for (int i = 0; i < rowSize; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
