//java
//User function Template for Java
// //User function Template for Java
// class Solution{
//     static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
//          int ans = -1;
       
//          for (int i = 0; i < N-K+1; i++) {
//             int s = 0;
//             for (int j = 0; j < K; j++) {
//                 s += Arr.get(i + j);
//             }
//             ans = Math.max(ans, s);
//         }
        
//         return ans;
       
//     }
// }

class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long curr_sum=0,ans=Integer.MIN_VALUE;
        
        for(int i=0;i<K;i++)
            curr_sum+=Arr.get(i);
            
        ans=Math.max(ans,curr_sum);
        int j=0;
        for(int i=K;i<N;i++)
        {
            curr_sum-=Arr.get(j++); // remove first ele of window
            curr_sum+=Arr.get(i); // add new ele.
            ans=Math.max(ans,curr_sum);
        }
        return ans;
    }
};
