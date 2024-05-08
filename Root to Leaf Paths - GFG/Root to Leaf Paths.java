class Solution {
    static  ArrayList<Integer> curr_path;
    static  ArrayList<ArrayList<Integer>> ans;
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        curr_path = new ArrayList<>();
        ans =  new ArrayList<>();
        
        dfs(root);
        return ans;
    }
   static void dfs(Node root){
        if(root==null) return;
        
       curr_path.add(root.data);
        
            
        if(root.left==null && root.right==null){
           ans.add(new ArrayList<>(curr_path));
        }
        else{
            dfs(root.left);
            dfs(root.right);
        }
        
         curr_path.remove(curr_path.size() - 1); //backtrack
    }
}
