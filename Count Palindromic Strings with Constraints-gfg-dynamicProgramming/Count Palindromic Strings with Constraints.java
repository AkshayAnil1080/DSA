Explanation of all approaches by me on Utube - https://youtu.be/w9nOv-gmUzY
try before watching the video  https://www.geeksforgeeks.org/problems/number-of-palindromic-strings2706/1

n*k^n, n
  class Solution {
    int ans;
     int mod = 1000000007;
    public int palindromicStrings(int n, int k) {
        // code here
         ans =0;
        for(int len=1; len<=n; len++){
             StringBuilder s = new StringBuilder();
             helper(s,len,k);
        }
        return ans;
        
    }
    void helper(StringBuilder s, int len, int k){
        if(s.length()==len){
            if(isPalin(s.toString()))
                ans = (ans+1)%mod;
                
            return;
        }
        // try every ch
        for(int i=0; i<k; i++){
            s.append((char)('a'+i));
            helper(s, len, k);
            s.deleteCharAt(s.length()-1);
        }
    }
    
    boolean isPalin(String s){
        int n = s.length();
        
        int l=0; int h=s.length()-1;
          while(l<=h)
            {
                if(s.charAt(l)!=s.charAt(h))
                return false;
    
                l++; h--;
            }
            
            //check freq should not exceed k
            int freq[] = new int[26];
            for(int i=0; i<n; i++){
                char ch = s.charAt(i);
                freq[ch-'a']++;
                
                if( freq[ch-'a'] > 2)
                return false;
            }
            return true;
    }
}



