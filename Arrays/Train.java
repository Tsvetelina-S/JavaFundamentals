package Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  n = Integer.parseInt(scan.nextLine());
        int array [] = new int[n];
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            array[i] = Integer.parseInt(scan.nextLine());
            sum+= array[i];
            System.out.printf("%d ",array[i]);
        }
        System.out.printf("%n");
        System.out.println(sum);
    }
}
