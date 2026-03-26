package Day3;

import java.util.regex.*;

class Question_8 {
    static boolean isValidIP(String ip) {
        String pattern =
            "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." +
            "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." +
            "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." +
            "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        return Pattern.matches(pattern, ip);
    }

    public static void main(String[] args) {
        System.out.println(isValidIP("192.168.1.1"));
    }
}