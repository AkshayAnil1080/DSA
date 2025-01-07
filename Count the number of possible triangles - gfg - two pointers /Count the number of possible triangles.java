
class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length, ans=0;
        for(int i=2; i<n; i++){
           int l=0; int h=i-1;
           while(l<h){
               
               if(arr[l]+arr[h]>arr[i]){
                   ans+= h-l;
                   h--;
               }
               else // sum is lower. need to increase it 
               l++;
           }
        }
        return ans;
    }
}

// class Solution {
//     // Function to count the number of possible triangles.
//     static int countTriangles(int arr[]) {
//         // code here
//         int n = arr.length, ans=0;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n-1; j++){
//                 for(int k=j+1; k<n; k++){
//                     if(arr[i]+arr[j]>arr[k] && arr[k]+arr[j]>arr[i] && arr[i]+arr[k]>arr[j] )
//                     ans++;
//                 }
//             }
//         }
//         return ans;
//     }
// }
