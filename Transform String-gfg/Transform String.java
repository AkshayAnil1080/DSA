**Problem Link:**
https://www.geeksforgeeks.org/problems/transform-string5648/1

utube link - https://youtu.be/QIZxNF9vMg4


class Solution {
    int transform(String s1, String s2) {
        // code here
        // 
        int n = s1.length(), m = s2.length();
        if(n!=m) return -1;
        
        int freq[]= new int[256];
        for(int i=0; i<n ;i++){
            freq[s1.charAt(i)-'0']++;
            freq[s2.charAt(i)-'0']--;
        }
        for(int x : freq){
            if(x!=0)
            return -1;
        }
        
        // greedy
        int ans=0;
        int i=n-1, j=n-1;
        while(i>=0 && j>=0){
            // ch mismatch
            while(i>=0 && s1.charAt(i)!=s2.charAt(j)){
                ans++; i--;
            }
            if(i>=0){
                i--; j--;
            }
        }
        return ans;
        
    }
}
