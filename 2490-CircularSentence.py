class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        # Split words into a list of words
        words = sentence.split()

        # Iterate through words and check adjacent characters
        for i in range(len(words) - 1):
            if words[i][-1] != words[i + 1][0]:
                return False
        
        # Check the last word with the first word
        return words[-1][-1] == words[0][0]
    