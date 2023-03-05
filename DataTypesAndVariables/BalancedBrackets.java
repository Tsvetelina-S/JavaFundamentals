package DataTypesAndVariables;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        List<String> listOfSymbols = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            String symbol = scan.nextLine();
            if (symbol.equals(")") && !listOfSymbols.contains("(")) {
                listOfSymbols.add(symbol);
            } else if (symbol.equals(")") && listOfSymbols.contains("(")) {
                listOfSymbols.remove("(");
                count++;
            } else if (symbol.equals("(")) {
                listOfSymbols.add(symbol);
            }
        }
        if(count >= 0 && !listOfSymbols.contains(")") && !listOfSymbols.contains("(")){
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }
    }
}
