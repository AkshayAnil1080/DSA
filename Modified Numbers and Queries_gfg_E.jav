// https://practice.geeksforgeeks.org/problems/modified-numbers-and-queries0904/1
//User function Template for Java


class Solution
{
    public int sumOfAll(int l, int r)
    {
        // code here
        int ans=0;
        boolean isPrime[] =  new boolean[r+1];
        Arrays.fill(isPrime, true);
        
        // seive (loglogn)
        for(int i =2; i<=r; i++)
        {
            if(isPrime[i])
            {
                for(int j=i*i ; j<=r; j=j+i)
                isPrime[j] = false;
            }
        }
        while(l<=r) //O(l-r)*(l)
        {
            if(l==1)
            {
                l++; ans++;
                continue;
            }
            
            for(int i =2; i<=l ;i++)
            {
                if(isPrime[i] && l%i==0)
                ans+=i;
            }
            
            l++;
            
        }
        return ans;
        
    }
}
