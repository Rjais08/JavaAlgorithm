package CommonQuestions;

import java.util.*;

public class MatchingSumBit {

    public static void main(String[] args) {

        int[] res =matchingSumBit(2, new int[]{89,100});
        for(int r : res){
            System.out.println(r);
        }

    }

    public static int[] matchingSumBit(int input1, int[] input2){
        int[] res = new int[input2.length];
        for(int i=0; i< input2.length; i++){
            int n = input2[i];
            int sum = 0;
            for(int j=0; j<n;j++){
                sum+=Integer.numberOfLeadingZeros(j ^ j+1);
            }
            res[i] = sum;
        }
        return res;
    }
}
