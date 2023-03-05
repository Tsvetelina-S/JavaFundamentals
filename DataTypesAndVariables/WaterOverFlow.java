package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int waterTank = 255;
        int sum = 0;
        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=lines ; i++) {
            int liters = Integer.parseInt(scan.nextLine());
            sum += liters;
            if (sum > waterTank){
                System.out.println("Insufficient capacity!");
                sum -=liters;
            }
        }
        System.out.printf("%d",sum);
    }
}
