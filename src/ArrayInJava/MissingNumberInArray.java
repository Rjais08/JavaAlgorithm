package ArrayInJava;

public class MissingNumberInArray {
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,6,8,5,7};
        printArray(arr);
        int res = findMissing2(arr);
        System.out.println(res);

    }

    public static int findMissing1(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("You can not pass null or empty element to check minimum of an array");
        }
       int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        int sumOfNNaturalNumbers = (arr.length+1)*(arr.length+2)/2;
        return sumOfNNaturalNumbers - sum ;
    }

    public static int findMissing2(int[] arr){
        int res = 0;
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("You can not pass null or empty element to check minimum of an array");
        }
        int[] tempArray = new int[arr.length+1];
        for(int i = 0; i< arr.length; i++){
            tempArray[arr[i]-1] = arr[i];
        }
        for(int i = 0; i< arr.length+1; i++){
            if(tempArray[i] != i+1){
                res = i+1;
                return res;
            }
        }
        return  res;
    }

    public static void printArray(int[] number){
        for(int i = 0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
