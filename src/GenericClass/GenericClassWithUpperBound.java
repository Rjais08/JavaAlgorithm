package GenericClass;

// Bounded Generics.
//It can be used at generic class and methods.
//Upper Bound (<T extends Number>) means T can be of type Number or its Subclass only.
// Here superclass (in this example Number) we can have interface too.
//Multi Bound
//Upper Bound
//(Here the extends indicated the type of the class/Interface T can be not the actual inheritance)

public class GenericClassWithUpperBound<T extends Number> {

    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public void printValue(T value){
        System.out.println("This is value from GenericClassWithUpperBound :" + value);
    }
}
