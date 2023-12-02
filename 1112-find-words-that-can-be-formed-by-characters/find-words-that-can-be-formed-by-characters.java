import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (char ch : chars.toCharArray()) {
            charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0) + 1);
        }
        for (String word : words) {
            if (canFormWord(word, charFreqMap)) {
                result += word.length();
            }
        }
        return result;
    }

    private boolean canFormWord(String word, Map<Character, Integer> charFreqMap) {
        Map<Character, Integer> tempMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            tempMap.put(ch, tempMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();

            if (!charFreqMap.containsKey(ch) || charFreqMap.get(ch) < count) {
                return false;
            }
        }
        return true;
    }
}