Best Video Solution with Live Coding: https://youtu.be/6y1Q8Cm9SK0
LIKE | SHARE | SUBSCRIBE



// Morris , k,1
class Solution {
    public int kthSmallest(Node root, int k) {
        // code here
        Node ans = morris(root,k);
        return ans!=null? ans.data : -1;
        
    }
    Node morris(Node curr, int k){
        while(curr!=null){
            if(curr.left!=null){
                Node prev = curr.left;
                while(prev.right!=null && prev.right!=curr)
                prev = prev.right;
                
                if(prev.right==null){
                    //no thread now
                    prev.right =curr;
                    curr = curr.left; // keep on processing the next nodes
                }
                else{
                    //prev.right=curr, there is a thread, remove it, print th curr node, move  right
                    prev.right=null; // deleting the thread
                    //print the data
                    if(k==1)return curr;
                    k--;
                    curr=curr.right;
                }
            }
            else{
                //print the curr node. move right
                 if(k==1)return curr;
                    k--;
                curr=curr.right;
            }
        }
        return null;
    }
}


//n,ht of tree
class Solution {
    int count;
    int result;

    public int kthSmallest(Node root, int k) {
        count = 0;
        result = -1;
        inorder(root, k);
        return result;
    }
    
    void inorder(Node root, int k) {
        if (root == null || count >= k) return;
        inorder(root.left, k);
        count++;
        // When count == k, we've found our answer
        if (count == k) {
            result = root.data;
            return;
        }
        inorder(root.right, k);
    }
}












