//recursion



class solve
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int n, int arr[])
    {
        // Your code here
        return fun(0,n-1, arr);
    }
    static long fun(int i, int j, int arr[]){
        if(i>j) return 0;
        
        if(i==j)
        return arr[i]; // return arr[j];
        
        //2 calls
        //1st call - I will pick the ith ele
        long x = arr[i] + Math.min(fun(i+2, j, arr) , fun(i+1, j-1, arr));
        
        // 2nd call - I will pick the jth side
        long y = arr[j] + Math.min(fun(i, j-2, arr) , fun(i+1, j-1, arr));
        
        return Math.max(x,y);
        
    }
}
//memo
class solve
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int n, int arr[])
    {
        // Your code here
        long memo[][] = new long[n+1][n+1];
        for(long x[] : memo){
            Arrays.fill(x, -2);
        }
        return fun(0,n-1, arr, memo);
    }
    static long fun(int i, int j, int arr[], long memo[][]){
        if(i>j) return 0;
        
        if(i==j)
        return arr[i]; // return arr[j];
        
        if(memo[i][j]!=-2) return memo[i][j];
        //2 calls
        //1st call - I will pick the ith ele
        long x = arr[i] + Math.min(fun(i+2, j, arr, memo) , fun(i+1, j-1, arr, memo));
        
        // 2nd call - I will pick the jth side
        long y = arr[j] + Math.min(fun(i, j-2, arr, memo) , fun(i+1, j-1, arr, memo));
        
        return memo[i][j] = Math.max(x,y);
        
    }
}
