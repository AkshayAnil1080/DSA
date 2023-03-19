//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            ArrayList<ArrayList<Character>> grid = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                ArrayList<Character> col = new ArrayList<>();
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    col.add(S1[j].charAt(0));
                }
                grid.add(col);
            }

            Solution ob = new Solution();
            System.out.println(ob.shortestXYDist(grid, N, M));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Pair{
    int a; int b;
    Pair(int a, int b)
    {
        this.a=a; this.b=b;
    }
}

class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N, int M) {
        // code here
         ArrayList<Pair> x = new ArrayList<>();
         ArrayList<Pair> y = new ArrayList<>();
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(grid.get(i).get(j)=='X')
                x.add(new Pair(i,j));
                
                if(grid.get(i).get(j)=='Y')
                y.add(new Pair(i,j));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<x.size(); i++)
        {
            for(int j=0; j<y.size();j++)
            {
                ans = Math.min(ans , Math.abs(x.get(i).a - y.get(j).a) + Math.abs(x.get(i).b - y.get(j).b)); ;
            }
        }
        return ans;
        
        
    }
};