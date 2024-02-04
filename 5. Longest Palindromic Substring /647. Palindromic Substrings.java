class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), ans = 0;

        for(int i=0; i<n ; i++){
            StringBuilder str = new StringBuilder();
            for(int j =i; j<n; j++){
                str.append(s.charAt(j));
                if(isPalin(str.toString()))
                ans++;
            }
        }
        return ans;
    }
    boolean isPalin(String str){
        int st=0; int end = str.length()-1;
        while(st<=end){
            if(str.charAt(st)!=str.charAt(end))
            return false;
            st++; end--;
        }
        return true;
    }

}

class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), ans = 0;

        if (n <= 0) 
            return 0;

        boolean[][] dp = new boolean[n][n];

        // Base case: single letter substrings
        for (int i = 0; i < n; i++){
            dp[i][i] = true;
            ans++;
        } 
            
    
        // Base case: double letter substrings
        for (int i = 0; i < n - 1; ++i) {
            dp[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
            ans += (dp[i][i + 1] ? 1 : 0);
        }

        // All other cases: substrings of length 3 to n
        for (int len = 3; len <= n; ++len)
            for (int i = 0, j = i + len - 1; j < n; ++i, ++j) {
                dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                ans += (dp[i][j] ? 1 : 0);
            }

        return ans;
    }
}

class Solution {
     int ans;
    public int countSubstrings(String s) {
          ans=s.length();
        int n = s.length();
        int st=0, end=0;
        for(int i=1; i<n; i++)
        {
            //1 even  
            st=i-1; end=i;
            helper(s, st, end);
            //odd
            st = i-1; end=i+1;
            helper(s, st, end);
            
            
        }
        return ans;
    }
     int helper(String str, int i, int j){
        while(i>=0 && j<str.length()){
            if(str.charAt(i)!=str.charAt(j))
            return ans;
            
            else{
                ans++;
                i--; j++;
            }
        }
        return ans;
    }
    
}
