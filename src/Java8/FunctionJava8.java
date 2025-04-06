package Java8;

import java.util.function.Function;

public class FunctionJava8 {

    public static void main(String[] args) {
        //Function With Lambda
        Function<Integer, Integer> function = i -> i*i;
        Integer s =  function.apply(5);
        System.out.println("Square of number is : " + s.getClass().getName());

        //Function Without Lambda
        Function<Integer, Integer> functionWithoutLambda = new Function<Integer, Integer>(){
            @Override
            public Integer apply(Integer i) {
                return i*i;
            }
        };
        System.out.println("Square of number is : " + functionWithoutLambda.apply(5));
    }

}
