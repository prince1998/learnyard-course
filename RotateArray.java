import java.util.Scanner;

class RotateArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
             arr[i] = in.nextInt();
        }

        if(k >= n){
            k = k%n;
        }

        int reversedArray[] = new int[n];

        for(int i = 0;i<n;i++){
            int newIndex = i-k;
            if(newIndex < 0){
                newIndex = newIndex+n;
            }
            reversedArray[newIndex] = arr[i];

        }

        for(int i = 0;i<n;i++){
            System.out.print(reversedArray[i] + " ");
        }

    }
}