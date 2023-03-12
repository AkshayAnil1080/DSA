//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine().trim());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            input_line = read.readLine().trim().split("\\s+");
            int B[]= new int[N];
            for(int i = 0; i < N; i++)
                B[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.maxPossibleValue(N, A, B); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
        // code here
        long min_len = Integer.MAX_VALUE; long tot_stick=0; long tot_peri=0;
        for(int i=0; i<N; i++)
        {
            if(B[i]%2==1) B[i]--;
            if(B[i]>=2) min_len = Math.min(min_len, A[i]);
            
            tot_stick += B[i];
            tot_peri += B[i]*A[i];
        }
        if(tot_stick%4!=0) // even number not div by 4 also results rem==2
        tot_peri -= 2*min_len;
        
        return tot_peri;

    }
} 