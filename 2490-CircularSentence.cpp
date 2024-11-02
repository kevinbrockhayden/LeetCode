#include <string>
#include <vector>
#include <sstream>

class Solution {
public:
    bool isCircularSentence(std::string sentence) {
        std::vector<std::string> words;
        std::stringstream ss(sentence);
        std::string word;
        
        // Split the sentence into words
        while (ss >> word) {
            words.push_back(word);
        }

        // Iterate through words and check adjacent characters
        for (int i = 0; i < words.size() - 1; ++i) {
            if (words[i].back() != words[i + 1][0]) {
                return false;
            }
        }

        // Check the last word with the first word
        return words.back().back() == words[0][0];
    }
};
