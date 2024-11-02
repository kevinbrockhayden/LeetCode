class Solution:
    def makeFancyString(self, s: str) -> str:
        result = []  # Initialize a list to store characters of the final fancy string
        ctr = 0      # Counter for consecutive characters
        prv = ""     # Previous character tracker
        
        for c in s:
            if c == prv:  # Check if the current character is the same as the previous one
                ctr += 1
            else:
                ctr = 1  # Reset counter if the character changes
                prv = c  # Update the previous character
            
            # Add character to result if the count is less than 3
            if ctr < 3:
                result.append(c)
        
        return "".join(result)  # Convert list back to string for the final output
