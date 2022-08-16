
https://drive.google.com/file/d/1Rt1dfBOBVKfyCCRwzL3wcxqDG6oX99WP/view?usp=sharing

class Pair{
    TreeNode node; int hd;
    Pair(TreeNode n, int  h)
    {
        node=n; hd=h;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();// y? to do level order
        Map<Integer, List<Integer>> map= new TreeMap<>(); //y ? we are storing in vertical lines and need to print in sorted order of hd
        
        q.add(new Pair(root,0)); // adding first node
        
        while(!q.isEmpty())
        {
            Pair p=q.poll(); TreeNode curr = p.node;  int hd = p.hd;
            if(map.containsKey(hd))  // if same vertical line is present => list create ho chuka tha, just add the ele in it.
               {
                   map.get(hd).add(curr.val);
               }
               
               else // create new list for this hd and append ele
               {
                   List<Integer> l =  new ArrayList<>();
                   l.add(curr.val);
                   map.put(hd,l);
               }
            if(curr.left!=null) q.add(new Pair(curr.left,hd-1));
             if(curr.right!=null) q.add(new Pair(curr.right,hd+1));
        }
               
               List<List<Integer>> ans = new ArrayList<>();
               for(Map.Entry<Integer,List<Integer>> itr : map.entrySet())
               {
                   List l = new ArrayList<>(itr.getValue());
                   Collections.sort(l);
                   ans.add(l);
               }
              return ans;
    }
}
