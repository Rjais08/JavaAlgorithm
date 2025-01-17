package SubclassAndSuperClass;

import java.util.List;

public class Print {

    public void printVehicle(List<? extends Vehicle> vehicleList){
        for(Vehicle v : vehicleList){
            System.out.println(v.getClass().getName());
        }
    }
}
