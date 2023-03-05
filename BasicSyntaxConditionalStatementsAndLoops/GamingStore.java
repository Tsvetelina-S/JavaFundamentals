package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class GamingStore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = Double.parseDouble(scan.nextLine());
        String command = scan.nextLine();
        double count = 0;
        while (!command.equals("Game Time")) {
            switch (command) {
                case "OutFall 4":
                    if (balance == 0) {
                        System.out.println("Out of money!");
                    } else if (balance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought OutFall 4");
                        balance -= 39.99;
                        count += 39.99;
                    }
                    break;
                case "CS: OG":
                    if (balance == 0) {
                        System.out.println("Out of money!");
                    } else if (balance < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought CS: OG");
                        balance -= 15.99;
                        count += 15.99;
                    }
                    break;
                case "Zplinter Zell":
                    if (balance == 0) {
                        System.out.println("Out of money!");
                    } else if (balance < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Zplinter Zell");
                        balance -= 19.99;
                        count += 19.99;
                    }
                    break;
                case "Honored 2":
                    if (balance == 0) {
                        System.out.println("Out of money!");
                    } else if (balance < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Honored 2");
                        balance -= 59.99;
                        count += 59.99;
                    }
                    break;
                case "RoverWatch":
                    if (balance == 0) {
                        System.out.println("Out of money!");
                    } else if (balance < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch");
                        balance -= 29.99;
                        count += 29.99;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance == 0) {
                        System.out.println("Out of money!");
                    } else if (balance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch Origins Edition");
                        balance -= 39.99;
                        count += 39.99;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            command = scan.nextLine();
        }
        if (balance == 0) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", count, balance);
        }

    }
}
