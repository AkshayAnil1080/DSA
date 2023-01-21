//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int K;
            K = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.solve(N, K, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int solve(int N, int K, int[] arr) {
        // code here
        
        int sum=0;
        for(int i=0; i<N; i++)  //N
        {
            sum += arr[i];
        }
        //s2 find factors of sum - AL
        ArrayList<Integer> factors =new ArrayList<>();  // sqrt(sum)  sqrt(0^4 * 10^5) = 10^4
        for(int i =1; i*i<=sum; i++)
        {
            if(sum%i==0)
            {
                factors.add(i);
                if(i != sum/i)  //  36 i=6
                factors.add(sum/i);
            }
        }
        // al - 1,10,2,5
        //s3
        Collections.sort(factors);
        
        //s4 - presum - poss of sA i can take in my ans
        for(int i=1; i<N; i++)
        arr[i] = arr[i]+arr[i-1];
        
        //s5
        int ans=1;
        for(int i=factors.size()-1 ;i>=0; i--)  //x
        {
            int count_of_SA=0;
           for(int j=0; j<N; j++) // in pre sum arr  //n
           {
               if(arr[j] % factors.get(i)==0)
               count_of_SA++;
           }
           if(count_of_SA >=K)   //getting the maximum poss G(factors of sum)
           {
               ans = factors.get(i);
               break;
           }
        }
        return ans;
    }
}
        
