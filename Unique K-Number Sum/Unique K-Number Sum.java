Best Video Solution - https://youtu.be/LhvY3JCqaMg
class Solution {
    ArrayList<ArrayList<Integer>> result;
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        result = new ArrayList<>();
        
        backtrack(1, 0, new ArrayList<>(), k, n);
        return result;
        
        
    }
    void backtrack(int start, int  currSum, List<Integer> path, int remaining, int target ){
        //base cond
        if(remaining==0){
            if(currSum == target){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        
        
        //for loop- rec - backtrack
        for(int i=start; i<=9; i++){
            //
            if(currSum+i > target) break;
            
            path.add(i);
            backtrack(i+1, currSum+i, path, remaining-1, target);
            
            // 
            path.remove(path.size()-1);
        }
    }
}
