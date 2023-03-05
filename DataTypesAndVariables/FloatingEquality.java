package DataTypesAndVariables;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double eps = 0.000001;
        double a = Double.parseDouble(scan.next());
        double b = Double.parseDouble(scan.next());

        if(Math.abs(a-b) < eps){
            System.out.println("True");
        }else{
            System.out.println("False");
        }





//        BigDecimal a = new BigDecimal(scan.next());
//        BigDecimal b = new BigDecimal(scan.next());
//       if(a.compareTo(b) == 0){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }

    }
}
