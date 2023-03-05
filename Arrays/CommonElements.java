package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] elements = scan.nextLine().split(" ");
        String [] elements2 = scan.nextLine().split(" ");
        //int maxArray = Math.max(elements.length,elements2.length);
        for (int i = 0; i < elements.length; i++) {

            for (int j = 0; j < elements2.length; j++) {

                if (elements[i].equals(elements2[j])) {
                    System.out.print(elements[i] + " ");
                }
            }
        }
    }
}
