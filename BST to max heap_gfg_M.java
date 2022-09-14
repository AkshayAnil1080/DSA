https://practice.geeksforgeeks.org/problems/bst-to-max-heap/1
//User function Template for Java
// sotore the bst in inorder => sorted List => SC O(n), 
// do the post order on it.
// TC-O(2n)
class Solution
{
    public static void convertToMaxHeapUtil(Node root)
    {
        //code here
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root,al);
        
        post(root, al , new int[]{0});  // array of size 1;
    }
    static void post(Node node, ArrayList<Integer> al, int [] i)
    {
        if(node==null) return;
        post(node.left, al, i);
        post(node.right, al, i);
        node.data= al.get(i[0]);
        
        i[0]++;
    }
   static void inorder(Node root, ArrayList<Integer> al)
    {
        if(root==null) return;
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right,al);
    }
}
