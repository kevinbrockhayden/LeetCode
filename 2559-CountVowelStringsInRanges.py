class Solution:
    def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
        vowels = set('aeiou')
        prefix = [0]  # Prefix sum array
        
        for word in words:
            
            # Check if the word starts and ends with a vowel
            if word[0] in vowels and word[-1] in vowels:
                prefix.append(prefix[-1] + 1)  # Add 1 if valid
            
            else:
                prefix.append(prefix[-1])  # Otherwise, carry forward the same value
        
        # Calculate results for each query
        return [prefix[j + 1] - prefix[i] for i, j in queries]

    
# time complexity: O(n + m), where n is the length of words and m is the length of queries
