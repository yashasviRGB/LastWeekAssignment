package Day4;

import java.util.Set;

import java.util.*;

class Question_11 {

    static void generate(String str, int index, StringBuilder current, Set<String> result) {
        if (index == str.length()) {
            result.add(current.toString());
            return;
        }

        // Include
        current.append(str.charAt(index));
        generate(str, index + 1, current, result);

        // Backtrack
        current.deleteCharAt(current.length() - 1);

        // Exclude
        generate(str, index + 1, current, result);
    }

    public static void main(String[] args) {
        String str = "abc";
        Set<String> result = new HashSet<>();

        generate(str, 0, new StringBuilder(), result);

        System.out.println(result);
    }
}