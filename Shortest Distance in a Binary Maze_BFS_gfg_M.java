//BFS- TC: visiting all nodes - N*M
// SC:  storing node in Queue - N*M
// https://practice.geeksforgeeks.org/problems/shortest-path-in-a-binary-maze-1655453161/1
class Pair
{
    int x; int y;
    Pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {

    int shortestPath(int[][] grid, int[] src, int[] des) {

        // Your code here
        Queue<Pair> q  = new LinkedList<>();
        
        q.add(new Pair(src[0], src[1]));
        grid[src[0]][src[1]]=0; // mark that node unvis
        
        int ans=0;
        // bfs -leverl order
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-->0)
            {
                Pair curr = q.remove();
                int i =curr.x; int j=curr.y;
                if(i==des[0] &&j==des[1]) return ans; /// src reached dest
                
                // else traveserse in 4 dir -
                if(i>0 && grid[i-1][j]==1)
                {
                    grid[i-1][j]=0;
                    q.add(new Pair(i-1,j));
                }
                if(j>0 && grid[i][j-1]==1)
                {
                    grid[i][j-1]=0;
                    q.add(new Pair(i,j-1));
                }
                if(i<grid.length-1 && grid[i+1][j]==1)
                {
                    grid[i+1][j]=0;
                    q.add(new Pair(i+1,j));
                }if(j<grid[0].length-1 && grid[i][j+1]==1)
                {
                    grid[i][j+1]=0;
                    q.add(new Pair(i,j+1));
                }
            }
            ans++;
        }
        return -1;
    }
}
