package StackInJava;

import SinglyLinkListInJava.linkListRepresntationInJava;

public class StackJava {

    private ListNode top;
    private int length;

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public void implementStackUsingLinkedList(){

    }

    public void implementStackUsingArray(){

    }



    private static class ListNode {
        private int data; // this can be any generic type
        private StackJava.ListNode next;

        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
}
