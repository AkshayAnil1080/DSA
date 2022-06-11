class Solution {
    public int[] decode(int[] encoded) {
        
        // xor of a0,a1,a2,a3,a4 perm array the outpur array we want
        int n = encoded.length+1;
        int perm_xor=0;
        for(int i=1;i<=n;i++)
        {
            perm_xor^=i;  //1. xor of a0 to a4
        }
        int enc_xor=0;
        for(int i=1;i<encoded.length;i=i+2)
        {
            enc_xor^=encoded[i]; //2. xor of a1 to a4
        }
        
        int a0=perm_xor^enc_xor; 
        
        int ans[] = new int[n];
        ans[0]=a0;
        for( int i=1; i<n;i++)
        {
            ans[i]=ans[i-1]^encoded[i-1];   //3. Logic - if a^b=c => b=a^c and a=b^c
        }
        return ans;
    }
}
// TC:O(n)