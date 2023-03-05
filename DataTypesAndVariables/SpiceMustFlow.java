package DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalAmountPerDay = Integer.parseInt(scan.nextLine());
        int consumed = 26;
        int currentYield = 0;
        int finalAmount = 0;
        int days  = 0;

        while(totalAmountPerDay >= 100){
            currentYield = totalAmountPerDay - consumed; // 85//75
            totalAmountPerDay -=  10; //101//91
            finalAmount += currentYield;
            days ++;

        }
        if (finalAmount > 0) {
            finalAmount -= consumed;
        }
        System.out.println(days);
        System.out.println(finalAmount);

    }
}
