class Solution
{
    public int min_operations(int []a)
    {
        int n = a.length;
        int lis[] =new int[n];  lis[0]=1;
        int res=lis[0];
        for(int i=1; i<n ;i++)
        {
            lis[i]=1;
            for(int j=0; j<i; j++)
            {
                if(a[j]<a[i]&&  a[i] - a[j] > i - j - 1 )
                lis[i] = Math.max(lis[i], lis[j]+1);
            }
             res= Math.max(res, lis[i]);
        }
        // for(int x : lis){
        //     System.out.print(x+ " "); 
        // }
        return n - res;
    }
}
