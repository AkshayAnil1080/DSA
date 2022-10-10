//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Uf{
    int[]parent;
    int size;
    Uf(int row,int col){
        size=row*col;
        parent=new int[size];
        for(int i=0;i<size;i++){
            parent[i]=i;
        }
    }
    void union(int x,int y){
        int px=findParent(x);
        int py=findParent(y);
        parent[py]=px;
    }
    int findParent(int x){
        if(parent[x]==x)return x;
        return parent[x]=findParent(parent[x]);
    }
    int count(int [][]mat){
        int col=mat[0].length;
        int cnt=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(parent[i*col+j]==i*col+j){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}

class Solution {

    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        //Your code here
        int[][] mat=new int[rows][cols];
        List<Integer> ans=new ArrayList<>();
        Uf uf=new Uf(rows,cols);
        int[] dx=new int[]{1,0,-1,0};
        int[] dy=new int[]{0,1,0,-1};

        for(int[]operator:operators){
            int x=operator[0];
            int y=operator[1];
            mat[x][y]=1;
            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx>=0 && ny>=0 && nx<rows && ny<cols && mat[nx][ny]==1){
                    uf.union(x*cols+y,nx*cols+ny);
                }
            }
            ans.add(uf.count(mat));
        }
        return ans;
    }
// Expected Time Complexity: O(m * n)
// Expected Auxiliary Space: O(m * n)
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int  k= sc.nextInt();
            int[][] a = new int[k][2];
            for(int i=0;i<k;i++){
            
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            List<Integer> ans = obj.numOfIslands(n,m,a);
           
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends