package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamInJava8 {
    // use of map
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(15);
        arrList.add(25);
        arrList.add(45);
        arrList.add(34);
        arrList.add(20);

        StreamInJava8 streamInJava8 = new StreamInJava8();
//        streamInJava8.useFilter(arrList);
//        streamInJava8.useMap(arrList);
//        streamInJava8.useCount(arrList);
//        streamInJava8.useSorted(arrList);
//        streamInJava8.printUniqueNumbersInList();
//        streamInJava8.printLargestNumbersInList();
//        streamInJava8.printFrequency();
//        streamInJava8.identifyDuplicateInList();
//        streamInJava8.findUniqueDescendingSquareFromListOfList();
        streamInJava8.printStringWithLength();
    }

    public void useFilter(List<Integer> arrList){
        // we can use filter to filter only element which are odd;

        List<Integer> evenList = arrList.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println("even List");
        System.out.println(evenList);
    }

    public void useMap(List<Integer> arrList){
        //we can use map where we do not want to filter our list ,as we want output for whole number in list;
        //provide list which contain square of the numbers in the list;

        List<Integer> squareList = arrList.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println("Squared List");
        System.out.println(squareList);
    }

    public void useCount(List<Integer> arrList){
        long count = arrList.stream().filter(i-> i%2==0).count();
        System.out.println("Count of even numbers");
        System.out.println(count);
    }

    public void useSorted(List<Integer> arrList){
        List<Integer> sortedInNatural = arrList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List");
        System.out.println(sortedInNatural);

        List<Integer> sortedDescending = arrList.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("Descending order Sorted List");
        System.out.println(sortedDescending);
    }

//    https://freedium.cfd/https://rathod-ajay.medium.com/top-10-java-stream-api-coding-questions-for-your-next-interview-5b96c22da6f7

//    Questions Practice in StreamAPi
//    1. Given an ArrayList of integers, find all unique numbers (numbers that appear only once).
    public void printUniqueNumbersInList(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list.stream().filter(a -> Collections.frequency(list, a) == 1).collect(Collectors.toList()));
    }

//    2. Find the largest number in a given ArrayList of integers
    // here we are using max and in that we will provide comparator
    public void printLargestNumbersInList(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list.stream().max(Integer::compareTo).orElseThrow(()->new NoSuchElementException("No Element found")));
    }

    //3. Print each number in the list along with its frequency.

    public void printFrequency(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting())));
        System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        Map<Integer, Long> frequencyMap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequencyMap.forEach((key, value)-> System.out.println(key + "->" + value));
    }

//    4. Identify all duplicate numbers in the list.
    // we can use distinct() here or we can collect in set
    public void identifyDuplicateInList(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list.stream().distinct().filter(a -> Collections.frequency(list, a) > 1).collect(Collectors.toList()));
        Set<Integer> resultList = list.stream().filter(a -> Collections.frequency(list, a) > 1).collect(Collectors.toSet());
        System.out.println(resultList);
    }

//    5. Problem Statement: Given a list of lists of integers, flatten the lists, remove duplicates, sort in descending order, and find the square of each distinct value.

    public void findUniqueDescendingSquareFromListOfList(){
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(5, 6, 7)
        );

        List<Integer> result = nestedLists.stream().flatMap(List::stream).distinct().sorted(Comparator.reverseOrder()).map(a -> a*a).collect(Collectors.toList());
        System.out.println(result);
    }

//     Print each string in the list along with its length.
public void printStringWithLength(){
    List<String> strings = Arrays.asList("apple", "banana", "cherry");
    strings.forEach((s) -> {
        System.out.println(s + "->" + s.length());
    });

}



}
