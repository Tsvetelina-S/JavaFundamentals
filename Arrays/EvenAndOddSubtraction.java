package Arrays;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;
        String [] array = scan.nextLine().split(" ");
        int [] num = new int[array.length  ];
        for (int i = 0; i < array.length ; i++) {
            num[i] = Integer.parseInt(array[i]);
            if (num[i] % 2 == 0) {
                sumEven += num[i];
            } else {
                sumOdd += num[i];
            }
        }
        System.out.print(sumEven - sumOdd);
    }
}
