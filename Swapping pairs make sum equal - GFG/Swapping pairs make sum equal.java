// class Solution {
//     long findSwapValues(long a[], int n, long b[], int m) {
//         // Your code goes here
//         long s1=0,s2=0;
//         for(long x : a)
//         s1+=x;
//         for(long x: b)
//         s2+=x;
        
//         long c1=0,c2=0;
//         for(int i=0; i<n ;i++){
//             for(int j=0; j<m ;j++){
//                 c1 = s1-a[i] +b[j];
//                 c2 = s2-b[j] + a[i];
//                 if(c1==c2)
//                 return 1;
//             }
//         }
//         return -1;
//     }
// }
// class Solution {
//     long findSwapValues(long a[], int n, long b[], int m) {
//         // Your code goes here
//         long s1=0,s2=0;
//         for(long x : a)
//         s1+=x;
//         for(long x: b)
//         s2+=x;
        
//         if((s1-s2)%2!=0)
//         return -1;
        
//         Arrays.sort(a);
//         Arrays.sort(b);
        
//         long temp = (s1-s2)/2;
        
//         int i=0,j=0;
//         while(i<n && j<m){
//             long curr = a[i]-b[j];
//             if(curr==temp)
//             return 1;
            
//             else if(curr<temp){
//                 i++;
//             }
//             else
//             j++;
//         }
       
//         return -1;
//     }
// }


class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        long s1=0,s2=0;
        for(long x : a)
        s1+=x;
        for(long x: b)
        s2+=x;
        
        if((s1-s2)%2!=0)
        return -1;
        
        long temp = (s1-s2)/2;
        HashSet<Long> set = new HashSet<>();
        for(long x : a) set.add(x);
        
        for(int i=0; i<m; i++){
            long need = (temp)+b[i];
            
            if(set.contains(need))
            return 1;
        }
       
        return -1;
    }
}

