package GenericClass;

public class PrintGeneric<T> {

    private T value;

    public void setT(T value) {
        this.value = value;
    }

    public <T> void printT(T value){
        System.out.println("This is value of T: " + value);
        System.out.println("This is type of T: " + value.getClass().getName());
    }

}
