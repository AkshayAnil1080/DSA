class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int mat[][])
    {
        // code here
        int n = mat.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            for(int j=0; j<n; j++){
                al.add(mat[i][j]);
            }
            else 
             for(int j=n-1; j>=0; j--){
                al.add(mat[i][j]);
            }
        }
        return al;
    }
}
