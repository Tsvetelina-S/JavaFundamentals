package DataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int another = 97 + number - 1;
        //97-122
        for (char i =97; i <= another ; i++) {
            for (int j = 97; j <= another ; j++) {
                for (int k =97; k <= another ; k++) {
                    System.out.printf("%c%c%c%n",i,j,k);
                }

            }

        }
    }
}
