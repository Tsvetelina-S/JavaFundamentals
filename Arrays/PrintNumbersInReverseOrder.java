package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int [] num = new int [n]; // 3

        for (int i = 0; i <= num.length - 1 ; i++) {
            num[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = num.length -1; i >= 0 ; i--) {
            System.out.print(num[i] + " ");

        }

    }
}
