import java.util.Scanner;

public class FindDuplicates {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int arr[] = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = in.nextInt();
        }
        int MAX = arr[0];
        for (int i = 0; i < sizeOfArray; i++) {
            // if (arr[i] > MAX) {
            // MAX = arr[i];
            // }
            MAX = Math.max(MAX, arr[i]);
        }
        int frequencyArray[] = new int[MAX + 1];
        for (int i = 0; i < sizeOfArray; i++) {
            frequencyArray[arr[i]]++;
        }

        int duplicateCount = 0;

        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] >= 2) {
                duplicateCount++;
            }
        }

        System.out.print("Duplicates count = " + duplicateCount);

    }
}