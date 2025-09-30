Video link - https://youtu.be/P8jr1z_G3LE
https://www.geeksforgeeks.org/problems/all-unique-permutations-of-an-array/1

class Solution {
    static ArrayList<ArrayList<Integer>> ans;
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        // code here
        int n= arr.length;
        ans = new ArrayList<>();
        Arrays.sort(arr);
        boolean vis[] = new boolean[n];
        backtrack(arr, vis, new ArrayList<>());
        
        return ans;
        
        
    }
    static void backtrack(int arr[], boolean vis[], List<Integer> path){
        // base cond
        if(path.size()==arr.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        // for loop 
        for(int i=0; i<arr.length; i++){
            if(vis[i]) continue;
            
            if(i>0 && arr[i]==arr[i-1] && !vis[i-1] ) continue;
            
            //choose
            vis[i]=true;
            path.add(arr[i]);
            
            //rec
            backtrack(arr, vis, path);
            
            //undo
            path.remove(path.size()-1);
            vis[i]=false;
        }
        
        
    }
};
