package SinglyLinkListInJava;

public class linkListRepresntationInJava {

    private  ListNode head;

    private static class ListNode {
        private int data; // this can be any generic type
        private ListNode next;

        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
}
