package Java8;

import PoJos.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
//        streamInJava8.printStringWithLength();
//        streamInJava8.printSingleDigit(new int[]{1,1,2,3,3,4,4});
//        streamInJava8.genericMethodForValuesOccurringNTimes2(new int[]{1,1,2,3,3,4,4,4}, 2);
//        streamInJava8.printTop3HighestPaidEmployeePerDepartment(streamInJava8.getListOfEmployee());
        streamInJava8.printAverageSalaryOfEmployeeInEachDepartment(streamInJava8.getListOfEmployee());
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

public void printSingleDigit(int [] nums){

        Integer a = IntStream.of(nums).boxed().collect(Collectors.groupingBy(i-> i, Collectors.counting())).entrySet().stream().peek(System.out::println).filter(entry -> entry.getValue() ==1)
                .map(Map.Entry::getKey).findFirst().orElse(null);

    System.out.println(a);

}

public void genericMethodForValuesOccurringNTimes(int[] nums, int n){

     List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().peek(System.out::println).filter(a-> a.getValue() == n)
                .map(Map.Entry::getKey).collect(Collectors.toList());

    System.out.println(list);

}

    public void genericMethodForValuesOccurringNTimes2(int[] nums, int n){

        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toMap(Function.identity(), val-> 1L, Long::sum)).entrySet().stream().peek(System.out::println).filter(a-> a.getValue() == n)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(list);

    }

    public List<Employee> getListOfEmployee(){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 95000),
                new Employee("Bob", "Engineering", 90000),
                new Employee("Charlie", "Engineering", 120000),
                new Employee("David", "Engineering", 110000),
                new Employee("Eve", "HR", 70000),
                new Employee("Frank", "HR", 72000),
                new Employee("Grace", "HR", 68000),
                new Employee("Hank", "HR", 71000),
                new Employee("Ivy", "Sales", 80000),
                new Employee("Jack", "Sales", 82000),
                new Employee("Kathy", "Sales", 83000),
                new Employee("Leo", "Sales", 75000)
        );
        return employees;
    }

    public void printTop3HighestPaidEmployeePerDepartment(List <Employee> employees){

                employees.stream()
                        .collect(Collectors.groupingBy(e -> e.getDepartment()))
                        .entrySet().stream()
                        .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().
                                stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                                        .reversed()).limit(3)
                                .collect(Collectors.toList())))
                        .forEach((dept, empList) -> {
                    System.out.println("Department:" + dept);
                    empList.forEach(employee -> {
                        System.out.println(employee);
                    });
                });
    }

// Calculate average salary of Employees in Each Department.
    public void printAverageSalaryOfEmployeeInEachDepartment(List<Employee> employees){
        employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.averagingDouble(Employee::getSalary)))
                .forEach((dept, avg) -> System.out.println(dept + "has average salary of ->" + avg));
    }



}

//🔹 1. Top N by Group
//Given a list of Employees with their department and Salary, find the top 2 Employees from each department based on Salary.
//
//Object: Employee { String name, String department, double salary }
//
//🔹 2. Average Calculation by Group
//Calculate the average salary of employees in each department.
//
//Output: Map<String, Double>, where key = department, value = average salary.
//
//🔹 3. Highest Paid Employee Overall
//Find the employee with the highest salary across all departments.
//
//🔹 4. Department with the Highest Average Salary
//Which department has the highest average salary? Return the department name.
//
//🔹 5. Count by Attribute
//Given a list of employees, return a count of employees in each department.
//
//Output: Map<String, Long>
//
//🔹 6. Filter & Collect Names
//Get a list of names of employees in the "Engineering" department earning more than 1L.
//
//🔹 7. Salary Histogram
//Create a map where keys are salary ranges (e.g., "<50K", "50K-100K", "100K+") and values are lists of employee names in that range.
//
//🔹 8. Group by First Letter
//Group employee names by their starting letter.
//
//Output: Map<Character, List<String>>
//
//🔹 9. Join Names
//Create a comma-separated string of all employee names in a given department.
//
//Example: "Alice, Bob, Charlie"
//
//🔹 10. Flatten Nested List
//You have a List<List<String>> of skills per employee. Flatten it into a single list of unique skills.
//
//🔹 11. Find Duplicate Names
//Find duplicate employee names from the list. Return a list of names that occur more than once.
//
//🔹 12. Find Departments Where Everyone Earns More Than X
//Return a list of departments where all employees earn more than ₹50,000.
//
//🔹 13. Group and Sort
//Group employees by department and sort the employees within each department by salary descending.
//
//🔹 14. Multi-level Grouping
//Group employees by department and then by designation.
//
//Output: Map<String, Map<String, List<Employee>>>
//
//🔹 15. Maximum Salary by Department
//Return a map of each department to the maximum salary in that department.
