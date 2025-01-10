leetcode  - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
  gfg - https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1
Solution Video link with SDE @MasterCard -  https://youtu.be/EHO05lGXmiY
        
time : n
  space : n
class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int n = s.length();
        int ans = 0;

        // Map to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            // If the character is already in the map, update the left pointer
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            // Update the character's last seen index
            map.put(ch, right);

            // Calculate the size of the current valid substring
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
        
time : 2n
  space : n  
class Solution {
    public int lengthOfLongestSubstring(String s) {

       int n = s.length();
        int ans = 0;

        
        Set<Character> set = new HashSet<>();
        int left = 0;

       //expanding window
        for (int right = 0; right < n; right++) {
          
          //if ch is duplicate, shring window from left.
             while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the set and calculate the window size
            set.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}


    
time : n^2 *256
  space : 256
class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++){
             StringBuilder str = new StringBuilder();
           
            for(int j=i; j<n; j++){
                str.append(s.charAt(j));
                if(helper(str.toString()))
                    ans = Math.max(ans, j-i+1);
            }
        }
         return ans;
    }
       static boolean helper(String str){
              Set<Character> set = new HashSet<>();
              for(char ch : str.toCharArray()){
                   if(set.contains(ch))
                  return false;
                  set.add(ch);
                 
              }
              return true;
        }
    }
