import java.util.Scanner;

public class InterchangeRowColumn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rowSize = in.nextInt();
        int arr[][] = new int[rowSize][rowSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int j = 0;
        for (int i = 0; i < rowSize; i++) {
            int temp = arr[i][j];
            arr[i][j] = arr[i][rowSize - 1 - j];
            arr[i][rowSize - 1 - j] = temp;
            j++;
        }
        for (int i = 0; i < rowSize; i++) {
            for (j = 0; j < rowSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}