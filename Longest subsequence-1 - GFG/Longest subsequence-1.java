class Solution {
    public static int longestSubseq(int n, int[] a) {
        // code here
        int lis[] =new int[n];  lis[0]=1;
        int res=lis[0];
        for(int i=1; i<n ;i++)
        {
            lis[i]=1;
            for(int j=0; j<i; j++)
            {
                // if(a[j]<a[i])
                if(Math.abs(a[j]-a[i])==1)
                lis[i] = Math.max(lis[i], lis[j]+1);
            }
             res= Math.max(res, lis[i]);
        }
        return res;
    }
}
