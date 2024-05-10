class Solution {
     List<Integer> curr ;
    List<List<Integer>> ans;
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        // Code Here.
         curr = new ArrayList<>();
         ans =  new ArrayList<>();
         
           Arrays.sort(arr);// proprocessing to avoid going for same combinations
           dfs(arr, 0, k);
           
           return ans;
    }
    void dfs(int arr[], int idx, int k){
        if(k==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(idx==arr.length || k<0)
        return;
        
        for(int i = idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;// to avoid going for same combinations
            
            curr.add(arr[i]);
                
            dfs(arr, i+1, k-arr[i]);
                
            curr.remove(curr.size()-1); //backtrack
            
        }
    }
}
