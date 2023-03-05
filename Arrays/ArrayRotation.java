package Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrayString = scan.nextLine().split(" ");
        int rotations = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= rotations; i++) {
            String num = arrayString[0];

            for (int j = 0; j <= arrayString.length - 2; j++) {
                arrayString[j] = arrayString[j + 1];

            }
            arrayString[arrayString.length - 1] = num;
        }


        for (String element: arrayString) {
            System.out.print(element+" ");
        }
    }
}
