package ArrayInJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        arrayDemo();

    }


   public static void arrayDemo(){
        int[] arrayDemo = new int[7];
        arrayDemo[0]= 9;
        arrayDemo[1]=8;
       arrayDemo[2]= 9;
       arrayDemo[5]=8;
       arrayDemo[6]= 9;
       for(int num: arrayDemo){
           System.out.println(num);
       }
   }
}
