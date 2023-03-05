package Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        String numbers = scan.nextLine();
        String [] stringNum = numbers.split(" ");
        int[] intNum = new int[numbers.length()];
        for (int i = 0; i <= stringNum.length - 1; i++) {
            intNum[i] = Integer.parseInt(stringNum[i]);
            if (intNum[i] % 2 == 0) {
                sum += intNum[i];
            }
        }
        System.out.println(sum);

    }
}
