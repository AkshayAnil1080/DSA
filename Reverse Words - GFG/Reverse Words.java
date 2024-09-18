https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
// Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

// Note: The last character has not been '.'. 

// Examples :

// Input: str = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i
//n,n

class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String S) {
        
        String[] words = S.split("\\.");
        
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) 
        {
            result.append(words[i]);
            if (i != 0) {
                result.append(".");
            }
        }
        
        return result.toString();
    }
}



// n,n
class Solution {
  String reverseWords(String S)
    {
    char[] str = S.toCharArray();
        int n = str.length;
        
      //reverse each word in string
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (str[end] == '.') {
                reverse(str, start, end - 1);
                start = end + 1; 
            }
        }
      //rev last word
        reverse(str, start, n - 1);
        
        //Reverse the entire string
        reverse(str, 0, n - 1);
        
        return new String(str);
    }
    
    void reverse(char[] str, int low, int high)
    {
        while (low < high) {
            char temp = str[low]; str[low] = str[high]; str[high] = temp;
            low++; high--;
        }
    }
}
