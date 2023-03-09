package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        //double output = valueOnGivenPower(number,power);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(valueOnGivenPower(number,power)));
    }
    public static double valueOnGivenPower (double number, int number2){
        double result = 1;
        for (int i = 1; i <= number2 ; i++) {
            result *= number;
        }
        return result;
    }
}
