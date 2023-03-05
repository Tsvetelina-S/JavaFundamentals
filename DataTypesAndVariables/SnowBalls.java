package DataTypesAndVariables;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfSnowballs = Integer.parseInt(scan.nextLine());
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        double snowballValue = 0;
        double newValue = 0;
        int newQuality = 0;
        int newSnow = 0;
        int newTime = 0;


        for (int i = 1; i <= numOfSnowballs ; i++) {
            snowballSnow = Integer.parseInt(scan.nextLine());
            snowballTime = Integer.parseInt(scan.nextLine());
            snowballQuality = Integer.parseInt(scan.nextLine());


            snowballValue =  Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > newValue){
                newValue = snowballValue;
                newQuality = snowballQuality;
                newSnow = snowballSnow;
                newTime = snowballTime;

            }
        }
        System.out.printf("%d : %d = %.0f (%d)",newSnow,newTime,newValue,newQuality);
    }
}
