package Java8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierJava8 {

    public static void main(String[] args) {


        Supplier<String> supplier = () -> {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/DD/YYYY");
            return simpleDateFormat.format(new Date());
        };

        System.out.println("Todays Date is :" +supplier.get());

    }
}
