package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringChecker {

    public static boolean isRightString(String str) {
        if (str.isBlank())
            return true;

        List<Character> openBrackets = new ArrayList<Character>();
        char currentChar;

        Map<Character, Character> brackets = new HashMap<>() {{
            put('}', '{');
            put(')', '(');
            put(']', '[');
        }};

        for (int i = 0; i < str.length(); i++) {
            currentChar = str.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                openBrackets.add(currentChar);
            } else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if (openBrackets.size() != 0 && openBrackets.get(openBrackets.size() - 1) == brackets.get(currentChar)) {
                    openBrackets.remove(openBrackets.size() - 1);
                } else
                    return false;
            }
        }

        return openBrackets.size() == 0;
    }

}
