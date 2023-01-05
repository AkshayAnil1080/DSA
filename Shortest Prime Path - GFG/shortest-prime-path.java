//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution
{
    int[] prime;
    Solution()
    {
        // Every index of prime stores zero or one
        // If prime[i] is zero means i is not a prime
        // If prime[i] is one means i is a prime
        prime = new int[10000];
        Arrays.fill(prime,1); // every num isprime
        prime[1]=0; 
        for(int i=2; i<=9999; i++)
        {
            if(prime[i]==1)// mark its multiple as false
            {
                for(int j=i*i; j<=9999; j+=i)
                prime[j]=0; // mark not prime
            }
        }
        
    }
    
    public int shortestPath(int num1,int num2){
        // Complete this function using prime array
        // bfs for every poss
        
        int ans[] = new int[10000];
        Arrays.fill(ans, -1);
        boolean vis[] = new boolean[10000];
        Queue<Integer> q = new LinkedList<>();
        q.add(num1); vis[num1]=false; ans[num1]=0;
        
        while(!q.isEmpty())
        {
            int curr =  q.poll();
            // if vis , skip
            if(vis[curr]) continue;
            
            String x = Integer.toString(curr);
            for(int i=0; i<4; i++)
            {
                for(char ch='0'; ch<='9'; ch++)
                {
                    // should be a four digit prime number with no leading zeros.
                    if ( (ch=='0'&&i==0) || ch==x.charAt(i))
                    continue;
                    
                    String y = x.substring(0,i) + ch + x.substring(i+1);
                    
                    //conver in int and pushto Q if cond are satisfies
                    int z = Integer.valueOf(y);
                    if(prime[z]==1 && ans[z]==-1)
                    {
                        ans[z] = 1+ans[curr];
                        q.add(z);
                    }
                }
            }
        }
        return ans[num2];
        
    }
}


//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        Solution ob = new Solution();
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int Num1=Integer.parseInt(input_line[0]);
            int Num2=Integer.parseInt(input_line[1]);
            System.out.println(ob.shortestPath(Num1,Num2));
        }
    }
}
// } Driver Code Ends