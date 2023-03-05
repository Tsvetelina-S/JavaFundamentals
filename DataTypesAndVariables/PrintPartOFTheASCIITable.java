package DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOFTheASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int firstChar = Integer.parseInt(scan.nextLine());
        int lastChar = Integer.parseInt(scan.nextLine());
        for (char i = (char) firstChar; i <= (char)lastChar; i++) {

            System.out.printf("%c ",i);
        }
    }
}
