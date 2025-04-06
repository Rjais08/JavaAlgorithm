package Java8;

import java.util.function.Function;

public class FunctionChaining {

    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = i-> i*2;
        Function<Integer, Integer> squareIt = i-> i*i;
        Function<Integer, Integer> cubeIt = i-> i*i*i;

        System.out.println("Double Example: " + doubleIt.apply(2));
        System.out.println("Square Example: " + squareIt.apply(2));
        System.out.println("Cube Example: " + cubeIt.apply(2));

        // chaining

        System.out.println("First double then square: " + doubleIt.andThen(squareIt).apply(2));

        //same
        System.out.println("First Square then double: " + doubleIt.compose(squareIt).apply(2));
        System.out.println("First Square then double: " + squareIt.andThen(doubleIt).apply(2));

        System.out.println("First cube then square then double: " + cubeIt.andThen(squareIt).andThen(doubleIt).apply(2));
    }
}
