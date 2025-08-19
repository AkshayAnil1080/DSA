Problem Link: https://www.geeksforgeeks.org/problems/farthest-smaller-right/1

Best video solution ever: https://youtu.be/dYvHa6eedzk

// class Solution {
//     public ArrayList<Integer> farMin(int[] arr) {
//         // Code Here
//         int n = arr.length;
//         ArrayList<Integer>  ans = new ArrayList<Integer>();
//         for(int i=0; i<n ;i++)
//         ans.add(-1);
        
//         //n^2
//          for(int i=0; i<n ;i++){
//              for(int j=n-1; j>i; j--){
//                  if(arr[j] < arr[i]){
//                      ans.set(i,j);
//                      break;
//                  }
//              }
//          }
//          return ans;
//     }
// }

class Solution {
    public ArrayList<Integer> farMin(int[] arr) {
        // Code Here
        int n = arr.length;
        ArrayList<Integer>  ans = new ArrayList<Integer>();
        for(int i=0; i<n ;i++)
        ans.add(-1);
        
        
        //min track array
        int min[] = new int[n];
        min[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            min[i] = Math.min(arr[i], min[i+1]);
        }
        //nlogn
         for(int i=0; i<n ;i++){
             int l=i+1, h=n-1, res=-1;
             
             while(l<=h){
                 int mid = (l+h)/2;
                 if(min[mid] < arr[i]){
                     res = mid;
                     l=mid+1;
                 }
                 else{
                     h=mid-1;
                 }
                 
             }
             ans.set(i,res);
             
         }
         return ans;
    }
}






