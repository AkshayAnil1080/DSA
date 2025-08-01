

// class Solution {
//     public int longestSubarray(int[] arr, int k) {
//         // Code Here
//         int ans=0;
//         int n = arr.length;
//         //form all substrings
//         for(int i=0;i<n;i++){
           
//           int cnt=0;
//             for(int j=i;j<n;j++){
//                 if(arr[j]>k)
//                 cnt++;
//                 else
//                 cnt--;
                
//                 if(cnt>0)
//                 ans=Math.max(ans, j-i+1);
//             }
//         }
//         return ans;
//     }
// }


class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
      HashMap<Integer, Integer> map = new HashMap<>();
         int n = arr.length;
        int ans=0;
        //1
         for(int i=0; i<n; i++){
             if(arr[i]>k)
             arr[i]=1;
             else 
              arr[i]=-1;
         }
        int preSum=0;
      
        for(int i=0; i<n; i++){
            preSum+=arr[i];
            if(preSum>0){
                ans=Math.max(ans, i+1);
            }
             
             if(map.containsKey(preSum-1))
            ans=Math.max(ans, i-map.get(preSum-1));
             
             if(!map.containsKey(preSum))
          map.put(preSum, i);
        }
        return ans;
    }
}


