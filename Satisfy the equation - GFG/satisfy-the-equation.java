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
class Pair{
    int a,b;
    Pair(int a, int b)
    {
        this.a = a; this.b=b;
    }
}
class Solution {
    static int[] satisfyEqn(int[] A, int N) {
        // code here
        // put all poss sum in hash
        Map<Integer, Pair> map = new HashMap<>();
        
        ArrayList<Integer> ans  = new ArrayList<>();
        
        for(int i=0; i<N-1; i++)
        {
            for(int j=i+1 ; j<N; j++)
            {
                int sum =  A[i]+A[j];
                
                //if(already contains
                if(!map.containsKey(sum))
                {
                    map.put(A[i] +A[j] , new Pair(i,j));
                    continue;
                }

                
                //if not need to check within the and ans and with prev min answer
                //need  to arr- final and prev
                Pair comb = map.get(sum);
                
                if(comb.a != i && comb.a!=j && comb.b!=i && comb.b!=j)
                {
                    //storting the curr  comb pts
                    int curr[]  = new int[4];
                    curr[0] = comb.a;
                    curr[1] = comb.b;
                    curr[2] = i;
                    curr[3] = j;
                    
                    if(ans.size()==0) // run only for first comb occurence
                    {
                        for(int k =0; k<4; k++)
                        {
                            ans.add(curr[k]);
                        }
                    }
                
                
                //else need to compare within and from prev ans;
                    else
                    {
                        boolean toReplace = false;
                        for(int m=0; m<4; m++)
                        {
                            if(ans.get(m) < curr[m]) // eg 0 1 2 3 with 1 2 5 3
                            break;
                            
                            if(ans.get(m) > curr[m]) // 0 1 3 4 with 0 1 2 4
                            {
                                toReplace =true; // copy final to ans array
                                 break;
                            }
                        }
                        
                        if(toReplace == true)
                        {
                            for(int m =0; m<4; m++)
                            {
                                ans.set(m,curr[m]);
                            }
                        }
                    }
                }
                
            }
        }
        // after everything if still fiinal.size()==0 -> no comb occiured
        if(ans.size()==0)
        {
            int res[] = new int[4]; Arrays.fill(res,-1);
            return res;
        }
        int res[] = new int[4];
        for(int i =0; i<4; i++)
        {
            res[i] = ans.get(i);
        }
        return res;
        
    }
};