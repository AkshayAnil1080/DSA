
class Tree
{
     // Recursive function to print right view of a binary tree.
    ArrayList<Integer> al;
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
         al = new ArrayList<>();
         dfs(root,k);
         return al;
     }
     void dfs(Node root, int k){
          if(root==null) return ;
          if(k==0) al.add(root.data);
          else{
            dfs(root.left,k-1);
            dfs(root.right, k-1);
          }
     }
}
