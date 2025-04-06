package Java8;

import java.util.function.Function;
import java.util.function.Predicate;

// Testing Predicate, Function, Consumer, Supplier,Bixxx, Streams, Parallel Stream.
public class PredicateJava8 {

    public static void main(String[] args) {

        // with Predicate Test with Lamda
        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println("Length of String is greater than 5 : " + checkLength.test("Hello World"));

        //With Predicate Without Lambda
        //In Future convert it to lambda;
        Predicate<String> checkLengthWithouLambda = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length() >= 5){
                    return true;
                }else{
                    return false;
                }
            }
        };
        System.out.println("Length of String is greater than 5 : "+ checkLengthWithouLambda.test("Hellow World"));

        //Predicate Joining
        Predicate<String> checkIfEvenLength = s-> s.length() % 2 ==0;

        System.out.println("After merging with and" +checkLength.and(checkIfEvenLength).test("hello world"));
        System.out.println("After merging with or" +checkLength.or(checkIfEvenLength).test("hello hello"));
        System.out.println("After Negate" +checkLength.negate().test("Hello World"));
        //Without Predicate;
        PredicateJava8 predicateJava8 = new PredicateJava8();
        System.out.println("Length of String is greater than 5 : " + predicateJava8.checkLength("Hello World"));


    }

    public boolean checkLength(String s){
        if(s.length() >=5){
            return true;
        }else{
            return false;
        }

    }



}
