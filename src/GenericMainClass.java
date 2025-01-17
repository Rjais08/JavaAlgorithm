import GenericClass.GenericClass;
import GenericClass.Pair;
import GenericClass.PrintGeneric;

public class GenericMainClass {

   public Pair<Integer, String> classPair = new Pair<Integer, String>();

    public static void main(String[] args) {

//        genericClassForOneVariable();
        System.out.println();
        mainMethodCallGenericClassForTwoVariable();


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

    // Bounded Generics.
    //It can be used at generic class and methods.
    //Upper Bound (<T extends Number>) means T can be of type Number or its Subclass only.
    // Here superclass (in this example Number) we can have interface too.
    //Multi Bound
    //Upper Bound
    //(Here the extends indicated the type of the class/Interface T can be not the actual inheritance)


}
