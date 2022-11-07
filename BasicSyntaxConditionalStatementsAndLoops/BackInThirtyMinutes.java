package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackInThirtyMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        minutes = minutes + 30;
        if(minutes > 59) {
            hours += 1;
            minutes -= 60;
            if (hours > 23) {
                hours = 0;
            }
        }
        System.out.printf("%d:%02d",hours,minutes);
    }
}
