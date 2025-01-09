import GenericClass.GenericClass;

public class MainClass {

    public static void main(String[] args) {

        GenericClass<Integer> print3 = new GenericClass<Integer>();

        print3.setValue(2);

        Integer pringValue = print3.getValue();

        System.out.println(pringValue);

        GenericClass<String> print4  = new GenericClass<String>();

        print4.setValue("this is String");

        System.out.println(print4.getValue());


    }
}
