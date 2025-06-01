package StackInJava;

public class StackMainClassInJava {


    public static void main(String[] args) {
//     implementStackUsingLinkedList();
//     implementStackUsingArray();

       reverseStringUsingStack("rahul");


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

    public static void implementStackUsingArray(){

        StackUsingArrayInJava stackUsingLinkedArray = new StackUsingArrayInJava();
        stackUsingLinkedArray.push(5);
        stackUsingLinkedArray.push(4);
        stackUsingLinkedArray.push(3);
        stackUsingLinkedArray.push(2);
        stackUsingLinkedArray.push(1);

        System.out.println(stackUsingLinkedArray.peek());
        stackUsingLinkedArray.pop();
        System.out.println(stackUsingLinkedArray.peek());
        stackUsingLinkedArray.pop();
        System.out.println(stackUsingLinkedArray.peek());
        stackUsingLinkedArray.pop();
        System.out.println(stackUsingLinkedArray.peek());
        stackUsingLinkedArray.pop();
        System.out.println(stackUsingLinkedArray.peek());
        stackUsingLinkedArray.pop();
        System.out.println(stackUsingLinkedArray.peek());
        stackUsingLinkedArray.pop();

    }

    public static void reverseStringUsingStack(String input){
        ReverseStringUsingStack reverseStringUsingStack = new ReverseStringUsingStack();
        System.out.println(reverseStringUsingStack.reverseStringUsingStack(input));
        System.out.println(input);
    }


}
