//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            int[] ptr = ob.satisfyEqn(A,N);
            
            System.out.println(ptr[0] + " " + ptr[1] + " " + ptr[2] + " " + ptr[3]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Pair
{
    int a,b;
    Pair(int a, int b)
    {
        this.a=a; this.b=b;
    }
}
class Solution {
    static int[] satisfyEqn(int[] A, int N) {
        // code here
        Map<Integer, Pair> map  =new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<N-1; i++)
        {
            for(int j=i+1; j<N; j++)
            {
                int sum=A[i] +A[j];
                
                if(!map.containsKey(sum))
                {
                    map.put(sum, new Pair(i,j));
                    continue;
                }
                // when sum is already there
                Pair comb = map.get(sum);
                if(comb.a !=i && comb.a!=j && comb.b!=i && comb.b!=j )
                {
                    int curr[] =new int[4];
                    curr[0] = comb.a;
                    curr[1] = comb.b;
                    curr[2]= i;
                    curr[3]= j;
                    
                    if(ans.size()==0)
                    {
                        for( int k =0; k<4; k++)
                        {
                            ans.add(curr[k]);
                        }
                    }
                    
                    // else we have to compare the curr comb with so far
                    // prev samllest comb(ans)
                    else
                    {
                        boolean toReplace = false;
                        for(int m=0; m<4; m++)
                        {
                            if(ans.get(m) < curr[m]) break;
                            
                            if(ans.get(m) > curr[m])
                            {
                                toReplace = true;
                                break;
                            }
                        }
                        
                        if(toReplace)
                        {
                            for(int m= 0; m<4; m++)
                            {
                                ans.set(m,curr[m]); // updating the ans array
                            }
                        }
                    }
                    
                }
            }
        }
       
            int res[] = new int[4]; Arrays.fill(res,-1);
            
             if(ans.size()==0){
            return res;
             }
        
        for(int m=0; m<4; m++)
        {
            res[m] = ans.get(m);
        }
        return res;
     }
};