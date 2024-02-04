class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start=0; int end=0;
        boolean dp[][]=  new boolean[n][n];
        for(int i=n-1; i>=0 ;i--){
            for(int j=i+1; j<n; j++){
                dp[i][j] = s.charAt(i)==s.charAt(j) && (j-i<=2 || dp[i+1][j-1]);
                if(dp[i][j] && j-i > end-start){
                    start=i; end=j;
                }
            }
        }
        return s.substring(start, end+1);|
        
class Solution {
    int low;
    int maxLength;
    public String longestPalindrome(String s) {
      low=0; maxLength=0;
        int n = s.length();
        int st=0, end=0;
        for(int i=0; i<n; i++)
        {
            //1 odd
            st=i; end=i;
            helper(s, st, end);
            //even
            st = i; end=i+1;
            helper(s, st, end);
            
            
        }
         return s.substring(low, low + maxLength);
         
    }
     void helper(String str, int i, int j){
        while(i>=0 && j<str.length()){
            if(str.charAt(i)!=str.charAt(j))
            return;
            
            else{
                 int length = j-i+1;
                if(length > maxLength){
                    low=i;
                    maxLength=length;
                }
                i--; j++;
            }
        } 
    }
}
