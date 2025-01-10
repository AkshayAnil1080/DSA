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