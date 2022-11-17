package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String text = scan.nextLine();
        boolean isTrue = false;
        int count = 0;
        String password = "";
        for (int i = text.length() -1; i >= 0 ; i--) {
            char symbol = text.charAt(i);
            password += symbol;
        }
        String word = scan.nextLine();
        while (!word.equals (password)){
            count++;
            if (count == 4) {
                isTrue = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            word = scan.nextLine();

        }
        if(isTrue){
            System.out.println("User " + text + " blocked!");
        }else {
            System.out.println("User " + text + " logged in.");
        }
    }
}
