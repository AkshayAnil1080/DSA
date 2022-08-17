// https://practice.geeksforgeeks.org/problems/knight-walk4521/1
// Submission: https://practice.geeksforgeeks.org/viewSol.php?subId=2325643a31e52b0dc63947a6bd071757&pid=704853&user=akshayanil

//y not dfs ? it will work still

// TC:O(n^2)
// SC: O(n^2)
class Pair
{
    int i; int j; int dist;
    Pair(int i , int j, int dist){
        this.i = i ;
        this.j =j ;
        this.dist=dist;
    }
}
class Solution
{
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        
        int  x[] = {1,1,2,2,-1,-1,-2,-2};  /// 8 moves possible
        int y[] = {2,-2,-1,1,-2,2,-1,1};
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair (KnightPos[0], KnightPos[1],0));  // push curr pos with distance 0
        
        boolean[][] vis = new boolean[N+1][N+1];  // so that we do no visit the same pt again
        
        vis[KnightPos[0]][KnightPos[1]] =true; // mark the curr pt true
        
        while(!q.isEmpty())  /// simple bfs
        {
            int size = q.size();
            while(size-->0)
            {
                Pair curr = q.poll();
                int i =  curr.i;
                int j = curr.j;
                int dist = curr.dist;
                if(i==TargetPos[0] && j==TargetPos[1]) return dist;
                
               //for the given pos, check for all poss 8 moves then again all poss 8 moves ie 64 and keep in going until out of bounds or reached the target 
                  for( int m =0;m<8; m++)
                {
                    if(isSafe(i+x[m], j+y[m],  vis, N))
                    {
                        q.add(new Pair(i+x[m], j+y[m], dist+1));
                        vis[i+x[m]][j+y[m]] = true;
                    }
                }
            }
        }
        return -1;
    } 
    
    boolean isSafe(int i, int j, boolean[][] vis, int N)
    {
        if(i<1 || j<1 || i>N || j>N || vis[i][j])
        return false;
        
        return true;
    }
}
