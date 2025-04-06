package Java8;

import java.util.function.Consumer;

public class ConsumerJava8 {
    public static void main(String[] args) {

        // With consumer;
        Consumer<Integer> square = integer -> System.out.println("Square of an integer is : "+ integer*integer);
        square.accept(5);

        //with Consumer without lambda

        Consumer<Integer> squareWithoutLambda = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Square of an integer is :" + integer*integer);
            }
        };

        squareWithoutLambda.accept(7);

        //Without Consumer;
        ConsumerJava8 consumerJava8 = new ConsumerJava8();
        consumerJava8.squareNumber(8);


    }

    public void squareNumber(int num){
        System.out.println("Square of number is :" + num*num);
    }
}
