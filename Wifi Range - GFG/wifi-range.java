//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            String S = read.readLine().trim();
            Solution ob = new Solution();
            boolean ans = ob.wifiRange(N, S, X); 
            if(ans)
            System.out.println(1);
            else
            System.out.println(0);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
       
class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        int A[] = new int[N]; Arrays.fill(A,100009);
       
        int B[] = new int[N]; Arrays.fill(B,100009);
        
        int cur = 100009;
        for(int i = 0; i < N; i++)
        {
            if(S.charAt(i) == '1')
                cur = i;
            A[i] = cur;
        }
        cur = 100009;
        for(int i = N - 1; i >= 0; i--)
        {
            if(S.charAt(i) == '1')
                cur = i;
            B[i] = cur;
        }
        //condition to check if any room is not reachable
        for(int i = 0; i < N; i++){
            if(Math.abs(i - A[i]) > X && Math.abs(i - B[i]) > X){
                return false;
            }
        }
        return true;
    }
} 