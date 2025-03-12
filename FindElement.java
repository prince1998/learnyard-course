// Linear Search to find an element inside an array
import java.util.Scanner;

public class FindElement {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int elementToFind = in.nextInt();
        int answer = -1;
        int arr[] = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < sizeOfArray; i++){
            if (arr[i] == elementToFind){
                answer = i;
                break;
            }
        }

        System.out.println("element found at index = "+answer);

    }
}