// class Solution {
//     public int findPair(int n, int x, int[] arr) {
      
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++)
//             if(Math.abs(arr[i]-arr[j])==x)
//             return 1;
//         }
//         return -1;
//     }
// }


// class Solution {
//     public int findPair(int n, int x, int[] arr) {
      
//         Arrays.sort(arr);
 
//         int i =0 ;
//         int j =1;
//       while(i<n && j<n)
//         {
//             if(i!=j && arr[j]-arr[i] ==x) 
//             // to handle target as 0, arr[] = 1 2 3 4 5 
//             return 1;
//             else if(arr[j]-arr[i] <x)
//             j++;
//             else
//             i++;
            
//         }
//         return -1;
//     }
// }

class Solution {
    public int findPair(int n, int x, int[] arr) {

    HashSet<Integer> set = new HashSet<>();
    
        for(int i=0; i<n; i++){
          if (set.contains(arr[i] - x) || set.contains(arr[i] + x)) 
            return 1;
            else set.add(arr[i]);
        }
        return -1;
    }
}
