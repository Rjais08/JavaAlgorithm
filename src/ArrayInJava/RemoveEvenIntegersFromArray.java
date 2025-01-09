package ArrayInJava;

import java.util.Scanner;

public class RemoveEvenIntegersFromArray {


    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3,4,5,6,7,8,7,6};
        removeEven(arr);

    }

    public static int[] removeEven(int[] arr){
        int oddCnt = 0;
        for(int i= 0; i< arr.length; i++){
            if(arr[i]%2 != 0){
                oddCnt++;
            }
        }
        int[] oddCntArray = new int[oddCnt];
        int index = 0;
        for(int i= 0; i< arr.length; i++){
            if(arr[i]%2 != 0){
                oddCntArray[index]= arr[i];
                index++;
            }
        }
        return oddCntArray;
    }

}
