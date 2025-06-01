package StackInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {

    public List<Integer> findNextGreater(List<Integer> arrList){

        List<Integer> resList = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        Stack<Integer> integerStack = new Stack<>();
        for(int num : arrList){
            integerStack.push(num);
        }

        resList.add(-1);
        int k = -1;
        while(!integerStack.isEmpty()){
            int top = integerStack.peek();
            integerStack.pop();
            if(top <= k){
                resList.add(k);
                for(int temp2: helper) {
                    if (temp2 > top) {
                        resList.add(temp2);
                        break;
                    }
                    helper.add(top);
                }


            }
            else{
                k = top;
                resList.add(-1);
                helper.add(k);
            }
        }
        return resList;
    }
}
