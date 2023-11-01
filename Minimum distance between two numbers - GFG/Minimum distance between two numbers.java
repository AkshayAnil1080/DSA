
// User function Template for Java

// class Solution {
//     int minDist(int a[], int n, int x, int y) {
//       int ans = Integer.MAX_VALUE;
   
//     for(int i=0; i<n; i++)
//     {
//          for(int j=i+1; j<n; j++)
//          {
//               if( (a[i]==x && a[j]==y) || (a[i]==y && a[j]==x))
//                 ans = Math.min(ans, Math.abs(i -j));
//          }
//     }
//     return ans==Integer.MAX_VALUE ? -1 : ans;
//     }
// }

// class Solution {
//     int minDist(int a[], int n, int x, int y) {
//         // code here
//     int last_x=-1, last_y=-1;
//     int ans = Integer.MAX_VALUE;
//     for(int i=0; i<n; i++)
//     {
//         if(a[i]==x){
//             last_x=i;
//             if(last_y!=-1)
//             ans = Math.min(ans, Math.abs(last_x - last_y)); //Math.abs(i - last_y
//         }
//         else if(a[i]==y){
//             last_y=i;
//             if(last_x!=-1)
//             ans = Math.min(ans, Math.abs(last_x - last_y)); // Math.abs(last_x - i)
//         }
//     }
//     return ans==Integer.MAX_VALUE ? -1 : ans;
//     }
// }


class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
   int last_idx=-1;
    int ans = Integer.MAX_VALUE;
    for(int i=0; i<n; i++)
    {
        if(a[i]==x || a[i]==y){
            if(last_idx!=-1 && a[last_idx]!=a[i])
            ans = Math.min(ans, i-last_idx);
            
            last_idx=i;
        }
    }
    return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}

