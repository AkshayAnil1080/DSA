// https://practice.geeksforgeeks.org/problems/maximize-the-sum-of-selected-numbers-from-an-array-to-make-it-empty0836/1
//maps 
// TC: O(2n) , SC: O(n) stored all ele in maps
class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        //Complete the function
     
     int sum=0;
     HashMap<Integer, Integer> map = new HashMap<>();
     for(int i=0; i<n; i++)
     {
         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
     }
     for(int i=n-1; i>=0; i--)
     {
         if(map.containsKey(arr[i]))
         {
             sum+=arr[i];
             map.put(arr[i], map.get(arr[i])-1);
             if(map.get(arr[i])==0) map.remove(arr[i]);
             
             int torem=arr[i]-1;
             if(map.containsKey(torem))
             {
                map.put(torem, map.get(torem)-1);
                if(map.get(torem)==0) map.remove(torem);
             }
         }
     }
     return sum;
    }
    
    
}
