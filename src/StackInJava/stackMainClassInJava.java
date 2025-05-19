package StackInJava;

public class stackMainClassInJava {


    public static void main(String[] args) {
     implementStackUsingLinkedList();
    }

    public static void implementStackUsingLinkedList(){
        StackUsingLinkedListJava stackUsingLinkedListJava = new StackUsingLinkedListJava();
        stackUsingLinkedListJava.push(5);
        stackUsingLinkedListJava.push(4);
        stackUsingLinkedListJava.push(3);
        stackUsingLinkedListJava.push(2);
        stackUsingLinkedListJava.push(1);

        System.out.println(stackUsingLinkedListJava.peek());
        stackUsingLinkedListJava.pop();
        System.out.println(stackUsingLinkedListJava.peek());
        stackUsingLinkedListJava.pop();
        System.out.println(stackUsingLinkedListJava.peek());
        stackUsingLinkedListJava.pop();
        System.out.println(stackUsingLinkedListJava.peek());
        stackUsingLinkedListJava.pop();
        System.out.println(stackUsingLinkedListJava.peek());
        stackUsingLinkedListJava.pop();
        System.out.println(stackUsingLinkedListJava.peek());
        stackUsingLinkedListJava.pop();
    }

    public void implementStackUsingArray(){

    }
}
