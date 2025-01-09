package ArrayInJava;

public class MinValueInArray {
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,-2,6,7,8,7,10};
        printArray(arr);
        int res = findMin(null);
        System.out.println(res);

    }

    public static int findMin(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("You can not pass null or empty element to check minimum of an array");
        }
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(min >= arr[i]){
                min = arr[i];
            }
        }
        return min;
    }


    public static void printArray(int[] number){
        for(int i = 0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
