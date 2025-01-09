package ArrayInJava;

public class MoveZeroToEnd {

    public static void main(String[] args)
    {
        int[] arr = new int[]{8,1,0,2,3,0,3};
        printArray(arr);
        int[] res = moveZeroToEnd(arr);
        printArray(res);

    }

    public static int[] moveZeroToEnd(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("You can not pass null or empty element to check minimum of an array");
        }
        int j = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]!=0 && arr[j] ==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }if(arr[j] != 0){
                j++;
            }
        }
        return arr;
    }


    public static void printArray(int[] number){
        for(int i = 0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

}
