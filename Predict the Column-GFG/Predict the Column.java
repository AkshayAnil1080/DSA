

class Solution
{
    int columnWithMaxZeros(int mat[][], int n)
    {
        // code here 
        int ans=0;
        int idx=-1;
        for(int i=0; i<n; i++)
        {
            int cnt=0;
            for(int j=0; j<n; j++)
            {
                if(mat[j][i]==0)
                cnt++;
            }
            if(cnt > ans)
            {
                ans=cnt;
                idx=i;
            }
        }
        return idx;
        
    }
}
