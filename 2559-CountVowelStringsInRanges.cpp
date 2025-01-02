#include <vector>
#include <string>
#include <unordered_set>
using namespace std;

class Solution {
public:
    vector<int> vowelStrings(vector<string>& words, vector<vector<int>>& queries) {
        unordered_set<char> vowels = {'a', 'e', 'i', 'o', 'u'};
        vector<int> prefix(1, 0); // Prefix sum array initialized with 0

        for (const string& word : words) {
            // Check if the word starts and ends with a vowel
            if (vowels.count(word.front()) && vowels.count(word.back())) {
                prefix.push_back(prefix.back() + 1); // Add 1 if valid
            } else {
                prefix.push_back(prefix.back()); // Otherwise, carry forward the same value
            }
        }

        vector<int> result;
        for (const vector<int>& query : queries) {
            int i = query[0], j = query[1];
            result.push_back(prefix[j + 1] - prefix[i]);
        }

        return result;
    }
};

// time complexity: O(N + M) where N is the number of words and M is the number of queries.
