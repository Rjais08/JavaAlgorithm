package ArrayInJava;

public class ReverseArray {
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,7,10};
        printArray(arr);
        reverseArray(arr, 0, arr.length-1);
        printArray(arr);

    }

    public static void reverseArray(int[] number, int start, int end){
        while(start<end){
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
//        printArray(number);
    }

    public static void printArray(int[] number){
        for(int i = 0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
