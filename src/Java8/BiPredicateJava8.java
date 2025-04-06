package Java8;

import java.util.function.BiPredicate;

public class BiPredicateJava8 {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> equalCheck = (a, b) -> (a == b) ? true : false;

        BiPredicate<Integer, Integer> greaterCheck = (a, b) -> (a > b) ? true : false;

        equalCheck.and(greaterCheck).test(10, 20);
    }
}
