package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int beerKegs = Integer.parseInt(scan.nextLine());//n
        double volume2 = 0;
        String newModel ="";
        for (int i = 1; i <=beerKegs ; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double volume = Math.PI*radius*radius*height;
            if(volume2 < volume) {
                volume2 = volume;
                newModel = model;

            }
        }
        System.out.println(newModel);
    }
}
