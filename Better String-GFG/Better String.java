// Better String

// User function Template for Java
// class Solution {
//     public static String betterString(String str1, String str2) {
//         // Code here
//         int a = getAllSubsequences(str1);
//         int b = getAllSubsequences(str2);
        
//         if(b>a) return str2;
//         return str1;
//     }
    
//      static int getAllSubsequences(String str) {
//         Set<String> result = new HashSet<>();
//         generateSubsequences(str, 0, "", result);
//         return result.size();
//     }

//      static void generateSubsequences(String input, int index, String current, Set<String> result) {
//         if (index == input.length()) {
//             result.add(current);
//             return;
//         }

//         // take the current character
//         generateSubsequences(input, index + 1, current + input.charAt(index), result);

//         // not take the current character
//         generateSubsequences(input, index + 1, current, result);
//     }

// }

class Solution {

    // Function to find the better string among the two input strings
    public static String betterString(String str1, String str2) {
        // Count the number of substrings of each string
        int a = countSub(str1);
        int b = countSub(str2);
        
        // Return the string with more substrings
        if (a < b) {
            return str2;
        }
        return str1;
    }
    
    
    static int countSub(String str) {
        // map to store the last occurrence of characters
      Map<Character, Integer> map = new HashMap<>();
       
        int n = str.length();
        int[] dp = new int[n + 1];

        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            
            dp[i] = 2 * dp[i - 1];

            if (map.containsKey(str.charAt(i - 1))) {
                dp[i] = dp[i] - dp[map.get(str.charAt(i - 1))];
            }
            map.put(str.charAt(i - 1), (i - 1));
        }
        return dp[n];
    }
}
