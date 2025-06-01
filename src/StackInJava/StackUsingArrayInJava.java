package StackInJava;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.stream.Collectors;

public class StackUsingArrayInJava {

    private static List<Integer> top  ;
    private static int length;

    public StackUsingArrayInJava(){
        top = new ArrayList<>();
        length =0;
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return length ==0;
    }

    public void push(int data){
        top.add(data);
        length++;
    }

    public int pop(){
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        else{
            int data = top.get(length-1);
            top.remove(--length);
            return data;
        }
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return top.get(length-1);
        }
    }


}
