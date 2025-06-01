package CommonQuestions;

import java.util.Arrays;

public class RotateArrayToLeft {


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};

        rotateLeft(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr, int k){
        int n = arr.length;

        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);

    }

    public static void reverse(int [] arr, int start, int end){

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
