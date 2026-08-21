Youtube Video solution - https://youtu.be/mZ0PF1lQftA


/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public int numberOfTurns(Node root, int p, int q) {
        // code here
        // lca
        int turns=0;
        Node lca = lca(root, p,q);

         // 3 store path from lca -> p
        StringBuilder pathP = new StringBuilder();
        findPath(lca, p, pathP);

        // 4 store path from lca -> q 
         StringBuilder pathQ = new StringBuilder();
            findPath(lca, q, pathQ);

        // 5 - path from p -> lca -> q
        String path = pathP.reverse().toString() + pathQ.toString();

        for(int i=1; i<path.length(); i++){
            if(path.charAt(i)!=path.charAt(i-1))
            turns++;
        }
        return turns!=0 ? turns : -1;
        
    }
    // 1 - lca
    Node lca( Node root, int n1, int n2)
    {
        if(root==null) return null;

        if(root.data==n1 || root.data==n2)
        return root;

        Node left =  lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if(left!=null && right!=null)
        return root;

        return left!=null ? left : right;
    }
    
    //2 - find path
    
    static boolean findPath(Node root, int target, StringBuilder path){
        if(root==null)
        return false;

        if(root.data==target)
        return true;

        path.append('L');
        if(findPath(root.left, target, path)){
            return true;
        }
        path.deleteCharAt(path.length()-1);


         path.append('R');
         if(findPath(root.right, target, path)){
             return true;
         }
          path.deleteCharAt(path.length()-1);

        return false;
    }
}
