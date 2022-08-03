/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        
        if(node==null)return null;
        
        HashMap<Integer,Node> map = new HashMap<>();
        return clone(node,map);
    }
    
    Node clone(Node node, Map<Integer,Node>map ){
        
        // containsKey
        if(map.containsKey(node.val)){
            return map.get(node.val);
        }
        
        //doesnotcontainsKey - create new , put in map and recur for neighbors of original node i.e the one passes as paremeter
        Node copy = new Node(node.val);
        map.put(node.val,copy);
        
        for(Node neigh : node.neighbors)
        copy.neighbors.add (clone(neigh, map));  // open list of copy node neigh and add them(recur for original node neigh)
        
        
        return copy;
        
            
    }
}