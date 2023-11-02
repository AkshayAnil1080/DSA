
//m1 - n^3
// class Solution {
//     boolean checkTriplet(int[] arr, int n) {
//          for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
                   
//                     int a = arr[i] * arr[i], b = arr[j] * arr[j],c = arr[k] * arr[k];
//                     if (a == b + c || b == a + c || c == a + b)
//                         return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

//m2-n^2
// class Solution {
//     boolean checkTriplet(int[] arr, int n) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<n; i++)
//         set.add(arr[i]*arr[i]);
//          for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//               int c = arr[i] * arr[i] + arr[j] * arr[j];
//                     if (set.contains(c))
//                         return true;
//             }
//         }
//         return false;
//     }
// }

//m3-n^2
// class Solution {
//     boolean checkTriplet(int[] arr, int n) {
    
//         for(int i=0; i<n; i++)
//         arr[i] = arr[i]*arr[i];
//          Arrays.sort(arr);
//         for( int c  = n-1 ; c>1; c--)
//       {
//         int a=0, b = c-1;
//          while(a<b)
//             {
//                 if(arr[a] + arr[b] ==arr[c])
//                 return true;
                
//                 else if(arr[a]+arr[b]<arr[c])
//                 a++;
//                 else
//                 b--;
//             }
//       }

//         return false;
//     }
// }

// n + max(a[i])^2
class Solution {
    boolean checkTriplet(int[] arr, int n) {
       int max = 0;
//s1.
        // Find the maximum element
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        } 
         max = max*max;

        int[] freq = new int[max + 1];

        // Increase the freq of array elements 
        for (int i = 0; i < n; i++) {
            freq[arr[i]*arr[i]]++;
        }
        
//s2.
        // for all poss a
        for (int i = 1; i <= max ;i++) { //since we want to itr in sorted form and in linear
            // If a is not there
            if (freq[i] == 0) 
                continue;
            
            // for all possible b
            for (int j = 1; j <= max ; j++) {
                // if there is no b 
                 // If a and b are the same and there is only one a
                if (freq[j] == 0 ||(i == j && freq[i] == 1) ) {
                    continue;
                }
                //now we have possibility of a and b, evaluate c, and check if it is present
                int c = (i+j);
                  if (c > max) {
                    continue;
                }
                if(freq[c]>0)
                return true;

            }
        }
        return false;
    }
}
