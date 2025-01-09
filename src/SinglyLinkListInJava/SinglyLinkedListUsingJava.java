package SinglyLinkListInJava;

import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedListUsingJava {


    public static void main(String args){
        List<Integer> number = null;
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(5);
        number.add(6);

    }

    public LinkedList getLinkeList(List<Integer> numbers){
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(numbers);
        return linkedList;
    }

//    public static void addAtAnySpecifiedPos(LinkedList l, int pos, int num){
//        int sizeOfLL = l.size();
//        if(pos <= sizeOfLL ){
//            System.out.println("size can not be less than the given pos");
//        }
//        LinkedList head = l;
//        int i = 0;
//        while (i< pos){
//            head = head.get(pos);
//
//        }
//    }

}
