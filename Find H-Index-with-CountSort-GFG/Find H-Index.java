class Solution {
    public int hIndex(int[] citations) {
    
        int n= citations.length;
        // convert int[] → Integer[] //primitive to obj
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, Collections.reverseOrder()); // now works
        
       int idx=0;
        while(idx<n && arr[idx]>idx)
        idx=idx+1;
        
        return idx;
    }
}

--
  class Solution {
    public int hIndex(int[] citations) {
        // code here
     
     int n = citations.length;
     int freq[] = new int[n+1];   
     
     //store freq of sll c.value //obs1
     //f[i] = cnt of papers having ith citations
     for(int i=0; i<n; i++){
         if(citations[i]>=n) //obs2
          freq[n]+=1;
          else
          freq[citations[i]]+=1;
     }
     //ob3
     int sum = freq[n];
     int idx=n;
     for(idx=n; idx>=0; idx--){
         if(sum>=idx)
         break;
         sum+=freq[idx-1];
     }
     return idx;
    }
}
