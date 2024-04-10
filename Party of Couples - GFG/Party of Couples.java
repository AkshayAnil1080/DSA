
class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        Arrays.sort(arr);
        // for(int x : arr)
        // System.out.print(x+" ");
        int i =0;
        while(i<n){
             if(i==n-1  && arr[i]!= arr[i-1])
            return arr[i];
            
            else if(arr[i]==arr[i+1])
            i+=2;
        
            else if(arr[i]!=arr[i+1])
            return arr[i];
            
        }
        return 0;
    }
}



class Solution{
    static int findSingle(int n, int arr[]){
        // code here
      int ans=0;
      for(int x : arr)
      ans^=x;
       
      return ans;
    }
}


class Solution{
    static int findSingle(int n, int arr[]){
        // code here
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int x : arr)
      map.put(x,  map.getOrDefault(x,0)+1);
       
      for(Map.Entry<Integer, Integer> ent : map.entrySet()){
          if(ent.getValue()%2!=0)
          return ent.getKey();
      }
      return 0;
    }
}
