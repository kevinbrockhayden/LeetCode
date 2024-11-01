class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder(); // Store characters of the final fancy string
        int ctr = 0; // Counter for consecutive characters
        char prv = '\0'; // Previous character tracker (initialize to null character)
        
        for (char c : s.toCharArray()) {
            if (c == prv) { // Check if the current character is the same as the previous one
                ctr++;
            } else {
                ctr = 1; // Reset counter if the character changes
                prv = c; // Update the previous character
            }
            
            // Add character to result if the count is less than 3
            if (ctr < 3) {
                result.append(c);
            }
        }
        
        return result.toString(); // Convert StringBuilder to string for the final output
    }
}
