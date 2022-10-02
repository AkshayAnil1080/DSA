// https://practice.geeksforgeeks.org/problems/minimum-characters-to-be-added-at-front-to-make-string-palindrome/1

//User function Template for Java
// idea ; if first and last ch same - keep dec from both side.
// else assume added all ch from (h to last ch) - but in case 2 - need to check - using while loop -
// run the loop while our character at h is equal to front characters. And if they are equal then we will also reduce the count of ans.




// Tc: O(n) - wrost 2n
// Sc:O(1)

class Solution {
    public static int minChar(String s) {
       //Write your code here
       
       int i =0; int h=s.length()-1;
       int ans=0;
       
       while(i<h)
       {
           if(s.charAt(i)==s.charAt(h))
           {
               i++; h--;
           }
           else
           {
               ans = s.length()-h;
               i=0;
               while(s.charAt(i)==s.charAt(h))
               {
                   ans--;
                   i++;
               }
               h--;
           }
       }
       return ans;
       
    }
}
