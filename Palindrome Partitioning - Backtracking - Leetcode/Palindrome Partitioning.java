class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
         List<String> curr = new ArrayList<>();
        solve(curr, s,0);
        return res;
    }

     void solve(List<String> curr, String s, int idx ){
        if(idx==s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        StringBuilder temp =  new StringBuilder();
        for(int i = idx ; i<s.length(); i++){
            temp.append(s.charAt(i));
            String tempStr =temp.toString();
          if(isPalin(temp.toString())){
              //make partition
              curr.add(temp.toString());
              
            //   recur for rest i+1
            solve(curr, s, i+1);
            
            //once one branch of recursion is done , need to pop out chr for parent call to recur for another branch
            // => backtrack
            curr.remove(curr.size()-1);
          }
        }
    }
    
    boolean isPalin(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++; j--;
        }
        return true;
    }
}

