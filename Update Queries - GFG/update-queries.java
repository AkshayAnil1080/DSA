//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int N = Integer.parseInt(str[0]);
			int Q = Integer.parseInt(str[1]);
			int [][] U = new int[Q][3];
			int i = 0;
			while(i < Q) {
				str = br.readLine().trim().split(" ");
				U[i][0] = Integer.parseInt(str[0]);
				U[i][1] = Integer.parseInt(str[1]);
				U[i][2] = Integer.parseInt(str[2]);
				i++;
			}
			Solution obj = new Solution();
			int [] arr = obj.updateQuery(N, Q, U);
			for(int j: arr) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
	int [] updateQuery(int N, int Q, int [][]U){
        //Write your code here
        int prefix[][]=new int[N+1][32];
        int ans[]=new int[N];
        
        for(int i=0; i<Q; i++)
        {
            int l = U[i][0];
            int r = U[i][1];
            int x =U[i][2];
            int pos=0; // starting from last bit - and then going left
            while(x>0){
                if((x&1)!=0){ // checking if set
                    prefix[l-1][pos]++;
                    prefix[r][pos]--;
                }
                pos++;
                x = x/2; //x>>=1;
            }
        }
        //3 add with prev num
        for(int i=0; i<32; i++)
        {
            for(int j=1; j<N; j++)
            {
               prefix[j][i]+=prefix[j-1][i];
            }
        }
        //print
        for(int i=0;i<N;i++){
            int res=0;
            for(int j=0;j<32;j++)
        	{
                if(prefix[i][j]>0){
                    res+=(1<<j);  // n<<1 => n * 2^1
                }
            }
            ans[i]=res;
        }
        return ans;
    }
}