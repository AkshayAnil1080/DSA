class Solution {
    ArrayList<Node> al;
    public void populateNext(Node root) {
        // code here
        al = new ArrayList<>();
        in_order(root);
        
        for(int i=0; i<al.size()-1; i++){
            al.get(i).next = al.get(i+1);
        }
    }
    void in_order(Node root){
        if(root==null) return;
        in_order(root.left);
        al.add(root);
        in_order(root.right);
    }
}
