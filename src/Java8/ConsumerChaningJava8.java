package Java8;

import java.util.function.Consumer;

public class ConsumerChaningJava8 {

    public static void main(String[] args) {

        // With consumer;
        Consumer<Integer> square = integer -> System.out.println("Square of an integer is : "+ integer*integer);

        Consumer<Integer> checkEven = integer -> System.out.println( integer%2==0 ? "Even" : "Odd");

         square.andThen(checkEven).accept(17);


    }
}
