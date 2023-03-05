package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine()); //3
        int array[] = new int [n];
        for (int i = n-1; i >= 0; i--) { // 0 до 3
            array [i] = Integer.parseInt(scan.nextLine());
        }
        for (int element:array) {
            System.out.print(element + " ");
        }
    }
}
