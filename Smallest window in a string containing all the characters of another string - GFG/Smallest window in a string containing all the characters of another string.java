https://www.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
Given two strings s and p. Find the smallest window in the string s consisting of all the characters(including duplicates) of the string p.  Return "-1" in case there is no such window present. In case there are multiple such windows of same length, return the one with the least starting index.
Note : All characters are in Lowercase alphabets. 

Examples:

Input: s = "timetopractice", p = "toc"
Output: toprac
Explanation: "toprac" is the smallest
substring in which "toc" can be found.
  
**************************************************************************************************************************************
m2 -  Optimized  - Sliding Window
  TC : O(n)
  SC: O(1)

class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        int n = s.length(); int m = p.length();
        int cnt2[] = new int[26];
        int cnt1[] = new int[26];
        
        for(int i=0; i<m; i++){
            cnt2[p.charAt(i)-'a']++;
        }
        int st=-1, end=-1;
        int i=0;
        for(int j=0; j<n;j++){
            cnt1[s.charAt(j)-'a']++;
            while(isSame(cnt1, cnt2)) {//found poss ans first time
                 if(st==-1){
                       st=i; end=j;
                   }
                   else if(end-st+1 > j-i+1) { // min tracking
                        st=i; end=j;
                    }
                    
                    cnt1[s.charAt(i)-'a']--;
                    i++;
            }
            
        }
        if(st==-1){ // no poss ans
            return "-1";
        }
        else
        return s.substring(st, end+1);
    }
    static boolean isSame(int s[], int p[]){
        for(int i=0; i<26; i++){
            if(p[i] > s[i]){
                return false;
            }
        }
        return true;
    }
}
**************************************************************************************************************************************

m1 - Brute Force
  TC : O(n)
  SC: O(1)

  
class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
         int n = s.length(), m = p.length();
       
      
         int cnt2[] = new int[26];
         
         
        int st=-1,  end=-1;
         for(int i=0; i<m;i++)
         cnt2[p.charAt(i)-'a']++;
         
        for(int i=0; i<n ;i++){
           
            int cnt1[] = new int[26];
              
            for(int j =i; j<n; j++){
               cnt1[s.charAt(j)-'a']++;
             
             if(isSame(cnt1, cnt2)){ // substring includes character of p.
                if(st==-1){
                    st=i; end=j;
                }
                else if(end-st+1 > j-i+1){
                st=i; end=j;
                }
            }
        }
    }
    
    if(st==-1) // no answer
     return "-1";
     else{
         return s.substring(st, end+1);
     }
    }
    static boolean isSame(int a[], int b[]){
        for(int i=0; i<26; i++){
            if(a[i] < b[i])
            return false;
        }
        return true;
    }
}
