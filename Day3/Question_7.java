package Day3;

import java.util.regex.*;

class Question_7 {
    static boolean isValidPassword(String s) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%&]).{8,}$";
        return Pattern.matches(pattern, s);
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("Abc@1234"));
    }
}