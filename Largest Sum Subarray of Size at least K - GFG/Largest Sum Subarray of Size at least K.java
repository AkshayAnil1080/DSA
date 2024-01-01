
class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        //1. kadanes - store the max sum from 0-i(inclusive)
        long maxSum[] = new long[(int)n];
        int curr=0;
        
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n;i++){    
            curr+=a[i];
            max=Math.max((int)a[i],curr);
            maxSum[i] = max;

            if(curr<0)
                curr=0;
        }
        // for(int i=0; i<n;i++){    
        //     System.out.println(maxSum[i]);
        // }
        // for eg -   {-4, -2, 1, -3} , o/p {-4, -2, 1, -2}
        
        // return 0;
        //2 sliding window for eaxctly k size
        long sum=0;
         for(int i=0; i<k; i++){    
             sum+=a[i];
         }
         long ans=sum;
           for(int i=(int)k; i<n; i++){ 
               sum+= a[i] - a[i-(int)k];
               
               ans=Math.max(ans, (int)sum); //handling exaclty k
               
                ans=Math.max(ans, (int)sum + maxSum[i-(int)k]); // for more than k
           }
             
        return ans;
    }
}
