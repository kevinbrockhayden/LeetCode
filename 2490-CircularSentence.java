import java.util.*;

class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");

        // Iterate through words and check adjacent characters
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }

        // Check the last word with the first word
        return words[words.length - 1].charAt(words[words.length - 1].length() - 1) == words[0].charAt(0);
    }
}
