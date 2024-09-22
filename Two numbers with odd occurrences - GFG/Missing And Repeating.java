https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
Given an unsorted array arr of of positive integers. One number 'A' from set {1, 2,....,n} is missing and one number 'B' occurs twice in array. Find numbers A and B.

Examples

Input: arr[] = [2, 2]
Output: 2 1
Explanation: Repeating number is 2 and smallest positive missing number is 1.
Input: arr[] = [1, 3, 3] 
Output: 3 2
Explanation: Repeating number is 3 and smallest positive missing number is 2.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)


  m2 - optimized
TC: n, Sc: 1
// User function Template for Java
//Non Repeating Numbers
//every number  exist in pairs, and number occur exactly once and are distinct

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int all=0;
        
        for(int i =0; i<n; i++)
        all = all^arr[i]^(i+1);
        
        
        //s2  rightmost set bit 
        int m = all & -all;
        
        // s3 - forming two sets
        int g1=0; int g2=0;
        for(int i =0; i<n; i++)
        {
            if((m&arr[i])==0)
            {
                g1 ^= arr[i];
            }
            else
            g2 ^= arr[i];
            
            if((m&(i+1))==0)
            {
                g1 ^= (i+1);
            }
            else
            g2 ^= (i+1);
        }
        
        //return the ans in order of ele
        int ans[] = new int[2];
         for(int i = 0; i<n; i++){
         if(g1==arr[i]){
             ans[0] = g1;
             ans[1] = g2;
             return ans;
             }
         }
     
     
       ans[0] = g1;
        ans[1] = g2;
        
        return ans;
    }
        
}


m1 - optimal
  TC: n, SC:n
class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int ans[] = new int[2];
        boolean ismiss[] = new boolean[n+1];
        
        
        for( int i =0; i<n; i++)
        {
            if(ismiss[arr[i]]==false)
            {
                ismiss[arr[i]] = true;
                // continue;
            }
            else
            {
                ans[0]=arr[i];
            }
        }
        for(int i =1;i<n+1;i++)
        
        {
            if(ismiss[i]==false)
            ans[1]=i;
        }
        return ans;
        
        
    }
}
