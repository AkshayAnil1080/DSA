//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int q = sc.nextInt();
            ArrayList<Long> query = new ArrayList<>();
            for(int i=0;i<q;i++){
                query.add(sc.nextLong());
            }
            Solution ob = new Solution();
                
            ArrayList<Integer> ans = ob.threeDivisors(query,q);
            for(int cnt : ans) {
                System.out.println(cnt);
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        // code here
        int n = 1000001;
        boolean isPrime[] = new boolean[n];
        seive(n,isPrime);
        
        ArrayList<Integer> al  = new ArrayList<Integer>();
        for(int j=0; j<q; j++)
        {
            int ans=0; // counter
            for(int i=2; i<=query.get(j); i++)
            {
                if(isPrime[i]==false)
                {
                    long curr_num = i*i;
                    if(curr_num <=query.get(j))
                    ans++;
                    
                    if(curr_num >= query.get(j))
                    break;
                }
                
            }
            al.add(ans);
        }
        return al;
    }
   static void seive(int n, boolean arr[])
    {
        // false = prime
        //true -> not prime
        for(int p=2; p*p<n ;p++)
        {
            if(arr[p]==false)
            for(int i=p*p ; i<n; i=i+p)
            {
                arr[i] = true;
            }
        }
    }
}