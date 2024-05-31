Solution Explained Here - https://youtu.be/b62KQ5-XbHg
// User function Template for Java
// class Solution {
//     static int swapNibbles(int n) {
//         // code here
//         int arr[] = new int[8];
//         for(int i=0; i<8; i++){
//             arr[i] = n&1;
//             n/=2; //n>>=2;
//         }
//         // for(int x: arr)
//         // System.out.print(x+ " /" );
        
//         swap(0,3,arr); swap(4,7,arr);
//         int pow=1, res=0;
//         for(int i=7;i>=0; i--){
//             res += arr[i]*pow;
//             pow*=2; //pow<<=2;
//         }
//         return res;
        
//     }
//     static void swap(int st, int end, int arr[]){
//         while(st<end){
//             int temp= arr[st];
//             arr[st] = arr[end];
//             arr[end] = temp;
//             st++; end--;
//         }
//     }
// }

class Solution {
    static int swapNibbles(int n) {
        // code here
        int a = n&15;
        a <<=4;
        
        int b = n>>4;
        
        return a|b;
    }
}
