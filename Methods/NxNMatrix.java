package Methods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        nxnMatrix(num);
    }
    public static void nxnMatrix (int number){
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= number ; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
