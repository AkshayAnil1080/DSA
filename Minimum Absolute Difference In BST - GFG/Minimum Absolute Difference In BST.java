*/
class Solution
{
      ArrayList<Integer> al;
    int absolute_diff(Node root)
    {
       int ans = Integer.MAX_VALUE;
        al  = new ArrayList<>();
         inorder(root);
         
         for(int i=0; i<al.size()-1; i++){
             ans = Math.min(ans, al.get(i+1) - al.get(i));
         }
         return ans;
         
    }
     void inorder(Node root ) {
        if (root == null) {
            return;
        }

        inorder(root.left);
       al.add(root.data);
        inorder(root.right);
    }
}


//m2 space optimized
class Solution
{
    int prev;
    int ans;
    int absolute_diff(Node root)
    {
        ans = Integer.MAX_VALUE;
         prev=Integer.MAX_VALUE;
         inorder(root);
         
         return ans;
         
    }
     void inorder(Node root ) {
        if (root == null) {
            return;
        }
       
        inorder(root.left);
        
         if(prev!=Integer.MAX_VALUE){
         ans = Math.min( ans, root.data-prev);
        }
        prev=root.data;
        
        inorder(root.right);
    }
}
