class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
       HashMap<Integer, Integer> map = new HashMap<>();
       int p_sum=0, ps_rem; int ans=0;
       for(int i=0; i<n; i++){
           p_sum+=a[i];
           ps_rem = p_sum%k;
           
           if(ps_rem==0)
           ans= Math.max(ans,i+1);
           
           if(ps_rem<0) // for negative integers
              ps_rem+=k;
               
            if(map.containsKey(ps_rem))
            ans= Math.max(ans, i - map.get(ps_rem));
            
            else
            map.put(ps_rem, i);
           
       }
        return ans;
    }
}
