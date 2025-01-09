
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
       int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al  = new ArrayList<>();
        
         for( int i=0; i<n;i++){
             map.put(arr[i], map.getOrDefault(arr[i],0)+1);
             
            if(i>=k){
                 map.put(arr[i-k], map.getOrDefault(arr[i-k],0)-1);
                 if(map.get(arr[i-k])==0)
                  map.remove(arr[i-k]);
            }
            if(i>=k-1)
            al.add(map.size());
         }
         return al;
        
    }
}
