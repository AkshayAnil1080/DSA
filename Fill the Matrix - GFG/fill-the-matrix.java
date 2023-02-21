//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java
 class pair
{
    int first, second;
     
    public pair(int first, int second) 
    {
        this.first = first;
        this.second = second;
    }   
}
// 2nd class pair
class Solution
{
	public static int minIteration(int N, int M, int x, int y){
		//code here
		int mat[][] =new int[N][M];
		mat[x-1][y-1]=1;
		Queue<pair> q = new LinkedList<>();
		q.add(new pair(x-1, y-1));
		
		int level=0;
		//BFS
		
	
		//utr in this curr level size - process all 4 neigh
		 while (!q.isEmpty()) //// q not empty
        {
            int qsize = q.size();  //	level size
            while (qsize-- > 0)  //	itr in this curr level size - process all 4 neigh
         {
            pair p  = q.peek();
            q.remove();
             
            int i = p.first;
            int j = p.second;
            
            //
            if ((j+1 < M) && mat[i][j + 1] == 0)//right
            {
                mat[i][j + 1] = 1;
                q.add(new pair(i, j + 1));
            }
             if ((i+1 < N) && mat[i+1][j] == 0)//down
            {
                mat[i+1][j] = 1;
                q.add(new pair(i+1, j));
            }
             if ((j-1 >=0) && mat[i][j-1] == 0)//left
            {
                mat[i][j-1] = 1;
                q.add(new pair(i, j-1));
            }
             if ((i-1>=0 ) && mat[i-1][j] == 0) //top
            {
                mat[i-1][j] = 1;
                q.add(new pair(i-1,j));
            }
            
         }
        level++;
	}
	return level-1;
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String input[]=read.readLine().trim().split(" ");
            int N = Integer.parseInt(input[0]);
            int M=Integer.parseInt(input[1]);
           	input=read.readLine().trim().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            System.out.println(ob.minIteration(N, M, x, y));
        }
        
    }
}
// } Driver Code Ends