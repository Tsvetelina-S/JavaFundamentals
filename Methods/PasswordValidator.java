package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        if(!lengthValidation(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!lettersAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!consistsTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if(lettersAndDigits(password) && lengthValidation(password) && (consistsTwoDigits(password))){
            System.out.println("Password is valid");
        }
    }
    public static boolean lengthValidation (String pass){
        if(pass.length() >= 6 && pass.length() <= 10) {
            return true;
        }else{
            return false;
        }
    }
    public static boolean lettersAndDigits (String pass){
        boolean isInRange = false;
        for (int i = 0; i < pass.length() ; i++) {
            char symbols = pass.charAt(i);
            if ((symbols >= 65 && symbols <= 90) || (symbols >= 97 && symbols <= 122) || symbols >= 48 && symbols <= 57) {
                isInRange = true;
            } else {
                isInRange = false;
                break;
            }
        }
        if(isInRange){
            return true;
        }else{
            return false;
        }
    }
    public static boolean consistsTwoDigits(String pass){
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char element = pass.charAt(i);
            if (element >= 48 && element <= 57){
                count++;
            }
        }
        if(count >= 2){
            return true;
        }else{
            return false;
        }
    }
}
