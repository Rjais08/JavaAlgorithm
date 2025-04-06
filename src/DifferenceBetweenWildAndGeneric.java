import java.util.ArrayList;
import java.util.List;

public class DifferenceBetweenWildAndGeneric {

    public static void main(String[] args) {

        DifferenceBetweenWildAndGeneric differenceBetweenWildAndGeneric = new DifferenceBetweenWildAndGeneric();

        List<Integer> source = new ArrayList<>();
        List<Float> destination = new ArrayList<>();

//        differenceBetweenWildAndGeneric.computeList(source, destination);// this is giving error because we have specifically provided type that it if
        // it is taking one time at time
        //means phle wale param ka type le leta hai to baad me aane wale sabhi ka param whi hona chahiye.

        differenceBetweenWildAndGeneric.computeList1(source, destination);// no error with this.
    }

    public <T extends Number> void computeList(List<T> source, List<T> destination){

    }

    public void computeList1(List<? extends Number> source, List<? extends Number> destination){

    }
}
