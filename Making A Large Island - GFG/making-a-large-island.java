//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];

        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[][] grid = IntMatrix.input(br, n, n);
            
            Solution obj = new Solution();
            int res = obj.largestIsland(n, grid);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution{
    public int largestIsland(int N,int[][] grid) 
    {
        // code here/
        //make a map
        //itr in all cell, if found 1 , call dfs, store in map
         Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0); // for nei cells marked as 0
        
        int n = grid.length;
        int region = -1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    int area = dfs(grid, i, j, region);
                    map.put(region, area);
                    region--;
                }
            }
        }
        
        
        
        // itr in all cell, if found 0, push its 4 neighbors in set,
        // itr in set , get the islands value from map and track the max area
         int max = map.getOrDefault(-1,0);
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(grid[r][c]==0)
                {//set to not take duplicate islands surround by 0
                    Set<Integer> set = new HashSet<>();
                    set.add(r>0?grid[r-1][c]:0);
                    set.add(c>0?grid[r][c-1]:0);
                    set.add(r<n-1?grid[r+1][c]:0);
                    set.add(c<n-1?grid[r][c+1]:0);
                    int area = 1;
                    for(int nei: set){
                        area+=map.get(nei);
                    }
                    if(area>max){
                        max = area;
                    }
                }
            }
        }
        
        return max;
    }
    //implement dfs fun
     public int dfs(int[][] grid, int i, int j, int region) {      
         int n = grid.length;
        if(i<0||i>=n||j<0||j>=n||grid[i][j]!=1){
            return 0;
        }
        
        grid[i][j] = region;
        
        int cnt = 1;
        cnt+=dfs(grid, i, j+1, region);
        cnt+=dfs(grid, i+1, j, region);
        cnt+=dfs(grid, i, j-1, region);
        cnt+=dfs(grid, i-1, j, region);
        
        return cnt;
    }
    
}
