Best Video Solution with Live Coding: https://youtu.be/ImQsFoO0e4A
LIKE | SHARE | SUBSCRIBE


n,n


  /*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> in = new ArrayList<>();
    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        // code here
         ArrayList<Integer> res = new ArrayList<>();
        inorder(root);
        int n = in.size();
        
        int idx = getElementClosestToTarget(in, target);
        
        //two ptr
        int l = idx, h=idx+1;
        while(k>0){
            //take from lower side
            if( l>=0 && (h==n || Math.abs(in.get(l)-target) <= Math.abs(in.get(h)-target))  ){
                res.add(in.geat(l));
                l--;
            }
            else{
                res.add(in.get(h));
                h++;
            }
            k--;
        }
        return res;
        
    }
    void inorder(Node root){
        if(root==null)
        return;
        
        inorder(root.left);
        in.add(root.data);
        inorder(root.right);
    }
    //binary seach to get ele closest to target
    int getElementClosestToTarget(ArrayList<Integer> arr, int target){
        int l =0, h=arr.size()-1, idx=0;
        while(l<=h){
            int mid = l + (h-l)/2;
            
            if(arr.get(mid) <=target){
                idx = mid;
                l = mid+1;
            }
            else
            h=mid-1;
        }
        return idx;
    }
}

in + bs + k two ptr
n + logn + k ~ O(n)


n + ht of tree
store all node in on  + rec stack
