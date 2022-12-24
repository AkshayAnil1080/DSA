//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            
            Solution g = new Solution();
            long ans = g.wineSelling(arr,N);
            
            System.out.println(ans);
            T--;
        }
    }
}


// } Driver Code Ends
//User function Template for Java


class Pair
{
    int f; int s;
    Pair(int f, int s)
    {
        this.f =f; this.s =s;
    }
}
class Solution {
    long wineSelling(int Arr[],int N){
        // code here
        //1 make but and sell list.
        
        ArrayList<Pair> buy = new ArrayList<>();
         ArrayList<Pair> sell = new ArrayList<>();
         
         for(int i=0; i<N ; i++)
         {
             if(Arr[i]>0)
             buy.add(new Pair(Arr[i],i));
             else
             sell.add(new Pair(Arr[i],i));
         }
        
        
        //whilelloopfor itr in both list
        int i=0; int j=0;
        long ans=0;
        while(i<buy.size() && j<sell.size())
        {
            //1 find min
            long x = Math.min(buy.get(i).f , -sell.get(j).f);
            buy.get(i).f -= x;
            sell.get(j).f +=x;
            
            long dif = Math.abs(buy.get(i).s - sell.get(j).s);
            
            ans += (x*dif);
            
            //move to next buyer and seller resp
            if(buy.get(i).f==0)
            i++;
            if(sell.get(j).f==0) 
            j++;
        }
        return ans;
        
    }
    
}

//{ Driver Code Starts.
// } Driver Code Ends