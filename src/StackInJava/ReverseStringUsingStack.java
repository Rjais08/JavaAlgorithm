package StackInJava;

import java.util.Stack;

public class ReverseStringUsingStack {


    public String reverseStringUsingStack(String str){
        Stack<Character> characterStack = new Stack<>();
        String res = null;
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length; i++){
            characterStack.push(chars[i]);
        }

        if(characterStack.size() >=1){
            res = characterStack.peek().toString();
            characterStack.pop();
        }

        while(!characterStack.isEmpty()){
            res+=characterStack.peek();
            characterStack.pop();
        }

       return  res;
    }
}
