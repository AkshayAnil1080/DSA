class Solution {
    public int sumSubarrayMins(int[] arr) {
    
        // M1. O (n^2)
//         int n = arr.length;
//         long ans =0;
//         int mod = 1000000007;
        
//         for( int i =0; i<n; i++)
//         {
//             int min =Integer.MAX_VALUE;
//             for( int j =i; j<n; j++)
//             {
//                 min  = Math.min(min, arr[j]);
//                 ans = ((ans%mod) +  (min%mod))%mod;
//             }
//         }
//         return (int)ans;
        
        
        //1. m2. 9 7  8  3 4 6 1 = > at 3 > ele (>3 in right) till next samller(4,6) ie 2 > ele(>3 in left) till prev smaller(9,7,8) i.e 3=> g1=3 , g2 =2, total subarrays formedis (g1+1)*(g2+1)- and min is 3 in all of them
        //2. find next smaller and prev smaller, get the count and retur sum for every i: A[i]*(next_Sm)*(pre_sm)
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int n = arr.length;
        
        //3.bc(V.Imp) for i , if next smaller is not found -> ret a.size()-i-1 and for prev_Samll return i;
        int pre_sm[]  = new int[n];
        int next_sm[] = new int[n];
        
        for( int i=0 ;i<n; i++)
        {
            next_sm[i] = n-i-1;
            pre_sm[i] =i;
        }
        
        //next samller code
        for( int i =0; i<n; i++){
            
            while(!s1.isEmpty() && arr[s1.peek()] > arr[i])
            {
                next_sm[s1.peek()] = i-s1.peek()-1;
                s1.pop();
            }
            s1.push(i);
        }
        
        //prev smaller
        for( int i=n-1; i>=0; i--){
            
            while(!s2.isEmpty() && arr[s2.peek()] >= arr[i])
            {
                pre_sm[s2.peek()] = s2.peek()-i-1;
                s2.pop();
            }
            s2.push(i);
        }
        
        long ans =0;
        
        for(int i=0 ;i<n; i++)
        {
              long leftCount = pre_sm[i]+1;
                long rightCount = next_sm[i]+1;
            ans +=  (arr[i]* leftCount * rightCount);
           
        }
        return (int)(ans % 1000000007);
    }
        
}