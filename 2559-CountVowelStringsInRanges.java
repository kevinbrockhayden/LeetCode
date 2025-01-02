import java.util.*;

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int[] prefix = new int[words.length + 1]; // Prefix sum array

        for (int k = 0; k < words.length; k++) {
            String word = words[k];
            // Check if the word starts and ends with a vowel
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))) {
                prefix[k + 1] = prefix[k] + 1; // Add 1 if valid
            } else {
                prefix[k + 1] = prefix[k]; // Otherwise, carry forward the same value
            }
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = prefix[end + 1] - prefix[start];
        }

        return result;
    }
}

// time complexity: O(N + M) where N is the number of words and M is the number of queries
