

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int s) {
 
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = arr.length;
        int st=0; int end=0;
        int sum=0;
           for (int i = 0; i < n; i++) {
                sum += arr[i];
                
                if(sum==s){
                    al.add(st+1); al.add(i+1);
                    return al;
                }
                // sum>s
                while(sum > s && st<i){
                    sum-=arr[st++];
                    if(sum==s){
                            al.add(st+1); al.add(i+1);
                            return al;
                        }
                    }
           }

        al.add(-1);
        return al;
        
    }
}



// class Solution
// {
//     //Function to find a continuous sub-array which adds up to a given number.
//     static ArrayList<Integer> subarraySum(int[] arr, int s) 
//     {
//         // Your code here
//         int n = arr.length;
//         ArrayList<Integer> al = new ArrayList<Integer>();
//         for(int i=0; i<n; i++)
//         {
//             int sum=0;
//             for(int j=i;j<n; j++){
//                 sum+=arr[j];
//                 if(sum==s)
//                 {
//                     al.add(i+1);
//                     al.add(j+1);
//                   return al;
//                 }
//             }
//         }
      
//      al.add(-1);
//         return al;
        
//     }
// }
