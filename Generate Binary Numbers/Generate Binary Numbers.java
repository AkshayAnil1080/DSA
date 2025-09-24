Video link - https://youtu.be/0hEcFohQ6sM
Bitwise


  class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> al = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        
        q.add("1");
        for(int i=0; i<n; i++){
            String curr = q.remove();
            
            al.add(curr);
            q.add(curr+"0");
            q.add(curr+"1");
        }
        return al;
    }
}
