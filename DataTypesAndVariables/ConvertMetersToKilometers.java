package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters = Double.parseDouble(scan.nextLine());
        double centimeters = meters/1000.0;
        System.out.printf("%.2f",centimeters);
    }
}
