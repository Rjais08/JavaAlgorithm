
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test2 {

    public static void main(String[] args) {
    printPattern6(3);


    }

    public static void printPattern6(int n){
        for(int i = 0; i< n; i++){
            for(int j =0; j< n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j< 2*i+1; j++){
                System.out.print("*");
            }
            for(int j =0; j< n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
