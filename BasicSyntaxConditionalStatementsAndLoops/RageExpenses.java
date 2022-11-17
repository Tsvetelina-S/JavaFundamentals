package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int headsetLost = lostGamesCount/2;
        //System.out.println("Trashed headset " + headsetLost);
        int mouseLost = lostGamesCount/3;
        //System.out.println("Trashed mouse " + mouseLost);
        int keyboardLost = lostGamesCount/6;
        //System.out.println("Trashed keyboard " + keyboardLost);
        int displayLost = lostGamesCount/12;

        double expenses = ((headsetLost * headsetPrice)+(mouseLost*mousePrice)+(keyboardLost*keyboardPrice)+
                (displayLost*displayPrice));
        System.out.printf("Rage expenses: %.2f lv.",expenses);


    }
}
