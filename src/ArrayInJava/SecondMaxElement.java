package ArrayInJava;

public class SecondMaxElement {

    public static void main(String[] args)
    {
        int[] arr = new int[]{12,34,2,34,33,1};
        int res = secondMax(arr);
        System.out.println(res);

    }
    public static int secondMax(int[] number){

        int max1= Integer.MIN_VALUE; int max2 = Integer.MIN_VALUE;
        for(int i=1;i<number.length; i++){
            if(max1 < number[i]){
                max2 = max1;
                max1 = number[i];
            }else if(max2 < number[i] && max1 != number[i]){
                max2 = number[i];
            }
        }
        return max2;

    }
}
