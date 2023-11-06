class Solution
{   
    public:
    //Function to return sum of upper and lower triangles of a matrix.
    vector<int> sumTriangles(const vector<vector<int> >& mat, int n)
    {
          vector<int> al;
        int s1=0, s2=0;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n ;j++)
            {
                if(j>=i)
                s1+=mat[i][j];
                
                 if(j<=i)
                s2+=mat[i][j];
            }
        }
        al.push_back(s1);
        al.push_back(s2);
        return al;
    }
};
