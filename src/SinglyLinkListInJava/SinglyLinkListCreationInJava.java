package SinglyLinkListInJava;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SinglyLinkListCreationInJava{

private static  ListNode head;
    public static void main(String[] args){
        SinglyLinkListCreationInJava sll = new SinglyLinkListCreationInJava();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(15);
//        ListNode third = new ListNode(20);
//        ListNode fourth = new ListNode(25);
//
//        sll.head.next = second;
//        second.next = third;
//        third.next = fourth;
//        printSinglyLinkeList(sll.head);
//        sll.insertEnd(1);
//        sll.insertEnd(3);
//        sll.insertEnd(4);
//        sll.insertEnd(5);
//        sll.insertEnd(4);
//        insertBegining(50);

//        printSinglyLinkeList(head);
//        System.out.println();
//        insertAtSpecifiedPos(2,2);
//        printSinglyLinkeList(head);
//        deleteNodeAtGivenPos(10);
//        int index = findKey(4, head);
//        System.out.println(index);
//        reverseSinglyLinkedList(head);

//        System.out.println(findMiddleOfList(head));
//        sll.createLoopInLinkedList();
//        System.out.println(sll.detectLoopforCycle());
//        System.out.println(sll.detectLoopAndStartNodeCycle().data);
//        sll.detectLoopforCycleAndRemove();
//        printSinglyLinkeList(head);

        printSinglyLinkeList(merge(createSortedList(), createSortedList2()));

    }

    public static void reverseSinglyLinkedList(ListNode listNode){
        ListNode temp = listNode;
        ListNode next = null;
        ListNode previous = null;
                if(temp == null){
                    return;
                }
                while(temp != null){
                    next = temp.next;
                    temp.next = previous;
                    previous = temp;
                    temp = next;
                }
                head = previous;
    }

    public static ListNode merge(ListNode a, ListNode b){
        ListNode tempa = a;
        ListNode tempb = b;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(tempa != null && tempb != null){

            if(tempa.data <= tempb.data ){
                if(tail.data < tempa.data) {
                    tail.next = tempa;
                    tempa = tempa.next;
                }else{
                    tempa = tempa.next;
                }
            }else{
                if(tail.data < tempb.data) {
                    tail.next = tempb;
                    tempb = tempb.next;
                }else{
                    tempb = tempb.next;
                }
            }
            tail = tail.next;
        }
        if(tempa==null){
            tail.next = tempb;
        }else{
            tail.next = tempa;
        }

        return dummy.next;
    }


    public static int findMiddleOfList(ListNode listNode){
        ListNode slow = listNode;
        ListNode fast = listNode;
        if(listNode == null){
            return 0;
        }
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void printSinglyLinkeList(ListNode head){
        while (head != null){
            System.out.print(head.data  + "-->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static int length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public void insertBegining(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
        }else {
            ListNode curr = head;
            //head and curr is pointing to same node
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            head = curr;
        }
        // here head is also modified thats why node is inserted in end of curr and head is at first

    }

    public static void insertAtSpecifiedPos(int data, int pos){

        ListNode newNode = new ListNode(data);
        if(head == null){
            return;
        }
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }else{
            int i = 1;
            ListNode temp = head;
            while (i<pos-1){
                temp = temp.next;
                i++;
            }
            ListNode current = temp.next;
            temp.next = newNode;
            newNode.next = current;
        }

    }

    public static void deleteNodeAtGivenPos(int pos){
        if(pos == 1){
            head = head.next;
        }
        else if(length(head)<pos){
            System.out.println("Length of List is smaller than the pos given");
        }
        else{
            int i = 1;
            ListNode temp = head;
            while(i< pos-1){
                temp = temp.next;
                i++;
            }
            ListNode nextNode = temp.next;
            temp.next = nextNode.next;
        }


    }

    public static int findKey(int key, ListNode l){
        if(l == null){
            return -1 ;
        }
        ListNode temp = l;
        int i = 1;
        while( temp!= null){
            if(key == temp.data){
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }


    public static boolean detectLoop(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    public static ListNode createSortedList(){
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(15);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(25);
        ListNode fifth = new ListNode(30);
        ListNode sixth = new ListNode(35);
        ListNode seventh = new ListNode(40);
        ListNode eight = new ListNode(45);

        first.next= second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = null;

        return first;
    }

    public static ListNode createSortedList2(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(15);
        ListNode fifth = new ListNode(50);

        first.next= second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        return first;
    }

    public static void createLoopInLinkedList(){
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(15);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(25);
        ListNode fifth = new ListNode(30);
        ListNode sixth = new ListNode(35);
        ListNode seventh = new ListNode(40);
        ListNode eight = new ListNode(45);

        head = first;
        first.next= second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = sixth;

    }

    public  boolean detectLoopforCycle(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
             return true;
            }
        }
        return false;
    }

    public  ListNode detectLoopAndStartNodeCycle(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return getCycleStartNode(slowPtr);
            }
        }
        return null;
    }

    public  ListNode getCycleStartNode(ListNode slowPtr){
        ListNode temp = head;
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }

    public void detectLoopforCycleAndRemove(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                removeCycle(slowPtr);
            }
        }
    }

    private void removeCycle(ListNode slowPtr){
        ListNode temp = head;
        while(temp.next != slowPtr.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }



//    public static ListNode linkedListExample() {
//        ListNode head = new ListNode(10);
//        ListNode second = new ListNode(15);
//        ListNode third = new ListNode(20);
//        ListNode fourth = new ListNode(25);
//
//        head.next = second;
//        second.next = third;
//        third.next = fourth;
//
//        return head;
//    }



    private static class ListNode {
        private int data; // this can be any generic type
        private ListNode next;

        private ListNode(int data){
            this.data = data;
            this.next = null;
        }


    }


}
