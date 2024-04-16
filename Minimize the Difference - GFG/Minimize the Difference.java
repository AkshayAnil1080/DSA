//N*N,n
class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        // code here
        //add all ele in set and in map with frequency
        Set<Integer> set = new HashSet<>();
        for(int x : arr)
        set.add(x);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : arr)
        map.put(x, map.getOrDefault(x, 0)+1);
        
        //s2 //handling the first window
        int st=0,end=0;
        for( end =0; end<k; end++){
            map.put(arr[end], map.get(arr[end])-1);
            if(map.get(arr[end])==0)
            set.remove(arr[end]);
        }
        int ans = Collections.max(set) - Collections.min(set);
         
         //s3    
        //end = 3; starting point of 2nd window
        while(end<n){
            //add the st
            map.put(arr[st], map.get(arr[st])+1);
            set.add(arr[st]);
            
            //remove the end index
             map.put(arr[end], map.get(arr[end])-1);
              if(map.get(arr[end])==0)
            set.remove(arr[end]);
            
            st++; end++;
            
             ans = Math.min(ans, Collections.max(set) - Collections.min(set));
        }
        return ans;
    }
}

//nlogn,n
class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        // code here
        //s1
          //add all ele in set and in map with frequency
        TreeSet<Integer> set = new TreeSet<>();
        for(int x : arr)
        set.add(x);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : arr)
        map.put(x, map.getOrDefault(x, 0)+1);
        
        
      //s2 //handling the first window
      int st =0, end=0;
      for( end=0; end<k; end++){
          map.put(arr[end] , map.get(arr[end])-1);
          if(map.get(arr[end])==0)
          set.remove(arr[end]);
           
      }
      int ans = set.last() - set.first(); //1
       
       
        //s3    remove end index and add st index
        //end = 3; last ele of 2nd widow need to be removed
        while(end<n){
             map.put(arr[st], map.get(arr[st])+1);
            set.add(arr[st]);
            
            //remove the end index
             map.put(arr[end], map.get(arr[end])-1);
              if(map.get(arr[end])==0)
            set.remove(arr[end]);
            
            st++; end++;
            
             ans = Math.min(ans, set.last() - set.first());
        }
        return ans;
    }
}
     //n,n   
class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        // code here
        //s1
      int rmax[] = new int[n]; rmax[n-1] = arr[n-1];
      int rmin[] = new int[n]; rmin[n-1] = arr[n-1];
      for(int i=n-2; i>=0; i--){
          rmax[i] = Math.max(arr[i], rmax[i+1]);
          rmin[i] = Math.min(arr[i], rmin[i+1]);
      }
      // 1st window
      int ans = rmax[k] - rmin[k];
      int lmax = arr[0], lmin = arr[0];
      //3//handling second window onwards till second last window
      // for each i , removing k ele starting from i
       for(int i=1; i<n-k; i++){
           int maxInRemaining  = Math.max(lmax, rmax[i+k]);
           int minInRemaining = Math.min(lmin, rmin[i+k]);
           int currDiff = maxInRemaining - minInRemaining;
            ans = Math.min(ans, currDiff);
           
           //update the lmax and lmin for next itr
            lmax = Math.max(arr[i],lmax);
          lmin = Math.min(arr[i], lmin);
       }
       //last window
       ans =  Math.min(ans, lmax-lmin);
       return ans;
     
    }
}
