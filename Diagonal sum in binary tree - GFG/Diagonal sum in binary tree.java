class Tree {
   static ArrayList <Integer> res;
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        // code here.
        res = new ArrayList <Integer> ();
        dfs(root,0);
       
        return res;
    }
    static void dfs(Node root, int l){
        if(root==null)
        return;
        
        if (res.size() <= l) {
            res.add(root.data);
        } else {
            res.set(l, res.get(l) + root.data);
        }
        dfs(root.right, l);
        dfs(root.left, l+1);
    }
}
