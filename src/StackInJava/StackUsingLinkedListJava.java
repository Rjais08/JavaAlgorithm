package StackInJava;

import SinglyLinkListInJava.linkListRepresntationInJava;

import java.util.EmptyStackException;

public class StackJava {

    private ListNode top;
    private int length;

    private class ListNode {
        private int data; // this can be any generic type
        private ListNode next;

        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public StackJava(){
        top = null;
        length =0;
    }

    public int getLength(){
     return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }


    public int pop() {
        if(isEmpty()){
            throw  new EmptyStackException();
        }
            int res = top.data;
            top = top.next;
            length--;
            return res;
    }

    public int peek(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        StackJava stackJava = new StackJava();
        stackJava.push(5);
        stackJava.push(4);
        stackJava.push(3);
        stackJava.push(2);
        stackJava.push(1);

        System.out.println(stackJava.peek());
        stackJava.pop();
        System.out.println(stackJava.peek());
        stackJava.pop();
        System.out.println(stackJava.peek());
        stackJava.pop();
        System.out.println(stackJava.peek());
        stackJava.pop();
        System.out.println(stackJava.peek());
        stackJava.pop();
        System.out.println(stackJava.peek());
        stackJava.pop();
    }


}
