package search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfaPhoneNumber {
    Map<String, String> map = new HashMap<>(){{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        dfs(result, "", digits);
        return result;
    }

    public void dfs(List<String> res, String curr, String nextDigits) {
        if (nextDigits.length() == 0) {
            res.add(curr);
            return;
        }
        String digit = nextDigits.substring(0, 1);
        String numbers = map.get(digit);
        for (int i = 0; i < numbers.length(); i++) {
            String letter = numbers.substring(i, i + 1);
            dfs(res, curr + letter, nextDigits.substring(1));
        }
    }
}
