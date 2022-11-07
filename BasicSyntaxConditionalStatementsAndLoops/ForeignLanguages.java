package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String country = scan.nextLine();
        switch (country) {
            case "USA", "England" -> System.out.println("English");
            case "Spain", "Argentina", "Mexico" -> System.out.println("Spanish");
            default -> System.out.println("unknown");
        }
    }
}
