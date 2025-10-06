best video solution ever - https://youtu.be/V8lpOgP_5fk

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
//
 class Pair {
    Node node;
    int width;   // actually the width 

    Pair(Node node, int width) {
       this.node = node;
       this.width = width;
    }
}


class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
         ArrayList<Integer> al = new ArrayList<>();
         if(root==null){
             return al;
         }
         //
         Node temp =null;
         // q for bfs
         Queue<Pair> q = new LinkedList<>();
          // map to store node at each vartical distance
        Map<Integer, Integer> mp = new TreeMap<Integer, Integer>();

        q.add(new Pair(root, 0));
        
        while(q.size()>0){
            
            //store the top node // poll it // 
             temp = q.peek().node;
            int d = q.peek().width;
            q.remove();
            // add in map  
            mp.put(d, temp.data);
    
            // process its children
            if(temp.left!=null){
                q.add(new Pair(temp.left, d-1));
            }
            
            if (temp.right != null) {
                q.add(new Pair(temp.right, d + 1));
            }
        }
        for(int data : mp.values()){
            al.add(data);
        }
        return al;
        
        
    }
}
