https://practice.geeksforgeeks.org/problems/number-of-turns-in-binary-tree/1
https://auth.geeksforgeeks.org/user/akshayanil/practice
https://drive.google.com/file/d/1bctCBKbXevkTEfbwQeQLgWoD7j6fLRzH/view?usp=sharing

//TC:  lca + findNode =  O(2n), 
SC: recursove stack = O(n).
*/
class Solution
{
    static int ans;
    static int NumberOfTurns(Node root, int first, int second)
    {
        //your code here
         ans =0;
        Node LCA =  lca(root, first, second);   //1. find lca o(n)
        //2. if lca == first  - find second in keep ++ if dir changes (keep boolean track for dir)
        //3. if lca == second  - find first in keep ++ if dir changes (keep boolean track for dir)
        //4. lca of first and second not matches with any of them.
        boolean dir=true; //left
        
        if(LCA.data == first){
            findNode(LCA.left, dir, second);
            findNode(LCA.right, !dir, second);
        }
        else if(LCA.data==second)
        {
            findNode(LCA.left, dir, first);
            findNode(LCA.right, !dir, first);
        }
        else{ // lca of first and second not matches with any of them.
            //first first from lca- move in both dir
          findNode(LCA.left, dir, first);
          findNode(LCA.right, !dir, first);
            //find second from lcas - move in both dir
            findNode(LCA.left, dir, second);
            findNode(LCA.right, !dir, second);
            return ans+1;
        }
        return ans;
    }
    static boolean findNode(Node node, boolean dir, int key) // O(n)
    {
        if(node==null) return false;
        if(node.data == key) return true;
        
        if(dir){ //moving in left say,  if got it retrurn true; , else change the dir for each call made here. write another if for !dir(if changes => ans++) for checking all its subsequent right
            if(findNode(node.left, dir, key))
            return true;
            
            if(findNode(node.right, !dir, key))
            {
                ans++; return true;
            }
        }
        else{///moving right in same dir // this the node was not presernt in left (say) , traversing to right and checking its subsequent left(if chnages => ans++)
             if(findNode(node.right, dir, key))
            return true;
            
            if(findNode(node.left, !dir, key))
            {
                ans++; return true;
            }
        }
        return false;
    }
    
   static Node lca( Node root, int n1, int n2)
    {
        if(root==null) return null;
        
        if(root.data==n1 || root.data==n2)
        return root;
        
        Node left =  lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        
        if(left!=null && right!=null)
        return root;
        
        // if(left!=null && right==null)
        // return left;
        
        // else
        // return right;
        // in one line 
        return left!=null ? left : right;
    }
}
