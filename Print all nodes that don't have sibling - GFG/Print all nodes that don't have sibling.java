class Tree
{
    ArrayList<Integer> al;
    ArrayList<Integer> noSibling(Node root)
    {
        // code here
        al = new ArrayList<Integer>();
        dfs(root); //n
        if(al.size()==0)
        al.add(-1);
        
        Collections.sort(al); //nlogn
        return al;
    }
    void dfs(Node root){
        if(root==null) return;
        
        if(root.right!=null && root.left!=null){
            dfs(root.left);
            dfs(root.right);
        }
        else if(root.left!=null){ // root.right ==null
            al.add(root.left.data);
            dfs(root.left);
        }
        else if(root.right!=null){ // root.left ==null
             al.add(root.right.data);
            dfs(root.right);
        }
    }
}
