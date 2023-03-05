package DataTypesAndVariables;

import java.util.Scanner;

public class DecriptingMessages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int keyInt = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n ; i++) {
            char ch = scan.nextLine().charAt(0);

            sb.append((char)(ch + keyInt));
        }
        System.out.println(sb);

    }
}
