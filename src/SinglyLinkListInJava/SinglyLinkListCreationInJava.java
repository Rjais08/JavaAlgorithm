package SinglyLinkListInJava;

import java.util.List;

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
        sll.insertEnd(1);
        sll.insertEnd(3);
        sll.insertEnd(4);
//        sll.insertEnd(5);
//        sll.insertEnd(4);
//        insertBegining(50);

//        printSinglyLinkeList(head);
//        System.out.println();
        insertAtSpecifiedPos(2,2);
        printSinglyLinkeList(head);
//        deleteNodeAtGivenPos(10);
//        int index = findKey(4, head);
//        System.out.println(index);
//        reverseSinglyLinkedList(head);

        System.out.println(findMiddleOfList(head));
        printSinglyLinkeList(head);


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

    public static ListNode detectLoopforCycleStartNode(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next.next;
            if(slowPtr == fastPtr){
             return getCycleStartNode(slowPtr);
            }
        }
        return null;
    }

    public static ListNode getCycleStartNode(ListNode slowPtr){
        ListNode temp = head;
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
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
