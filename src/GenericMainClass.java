import GenericClass.GenericClass;
import GenericClass.Pair;
import GenericClass.PrintGeneric;
import GenericClass.GenericClassWithUpperBound;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenericMainClass {

   public Pair<Integer, String> classPair = new Pair<Integer, String>();

    public static void main(String[] args) {

//        genericClassForOneVariable();
        System.out.println();
//        mainMethodCallGenericClassForTwoVariable();

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");


        // To calculate unique charater in each sentense;

        Map<Integer, List<String>> resultMap =  words.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(resultMap);
//        System.out.println(distinctWords);

        System.out.println();



//        System.out.println(words);





    }

    public static void genericClassForOneVariable(){
        GenericClass<Integer> print1 = new GenericClass<Integer>();
        print1.setValue(2);
        Integer pringValue = print1.getValue();
        System.out.println(pringValue);

        GenericClass<String> print4  = new GenericClass<String>();
        print4.setValue("this is String");
        System.out.println(print4.getValue());

    }

    public static void mainMethodCallGenericClassForTwoVariable(){
        GenericMainClass mc = new GenericMainClass();
//        mc.genericClassForTwoVariable();
//        mc.genericMethod2(mc.classPair);
//        mc.genericMethod(mc.classPair);
        mc.printT();
    }

    public  void genericClassForTwoVariable(){
        Pair<Integer, String> pair = new Pair<Integer, String>();
        pair.put(1, "this is String");
        this.classPair = pair;
        System.out.println(pair.getKey()+ "    "+ pair.getValue());
    }

    // Generic Method Example
    public  Pair<Integer, String> genericMethod(Pair<Integer, String> pair) {
        return pair;
    }
    // method signature will be before return type we have to identify diamond pattern like <T> or <T,V>
    //Type parameter is limited to method only
    public  <K,V> void genericMethod2(Pair<K, V> pair) {
        System.out.println(pair.getKey() + "    " + pair.getValue());
    }

    // as we can see we have created object of Object type But we are passing Integer also And it is accepting, this is called Raw type.
    // It is the name of the generic class or interface without any type argument.
    public <T> void printT(){
        PrintGeneric<Object> printGeneric = new PrintGeneric<>();
        printGeneric.setT("This is value");
        printGeneric.printT("hello");
        printGeneric.printT(123);
    }

    // upper bound example

    public <T> void printTUpperBound(){
        GenericClassWithUpperBound<Integer> printGeneric = new GenericClassWithUpperBound<Integer>();
//        printGeneric.printValue("hello"); // it is throwing error as it will except only till numbers;
        printGeneric.printValue(123);
    }



}
