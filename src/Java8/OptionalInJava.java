package Java8;

import PoJos.Car;
import PoJos.Employee;
import PoJos.Insurence;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalInJava {

    public static void main(String[] args) {
        OptionalInJava optionalInJava = new OptionalInJava();
        System.out.println(optionalInJava.getInsurenceWithOptional(new Employee("Rahul", "Technology", 2000000)));
    }

    // Without Optional;
    public String getInsurenceName(Employee employee){
        if(employee != null){
            Car car = employee.getCar();
            if(car != null){
                Insurence insurence = car.getInsurence();
                if(insurence != null){
                    return insurence.getTypeOfInsurence();
                }
            }
        }
        return "Not Known";
    }

    //With Optional
    public String getInsurenceWithOptional(Employee employee){
        return Optional.ofNullable(employee)
                .map(Employee::getCar)
                .map(Car::getInsurence)
                .map(Insurence::getTypeOfInsurence).orElse("Not Known");
    }


}
