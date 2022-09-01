class Solution {
    public List<String> generateParenthesis(int n) {
    
        // template
        //1. make and output array , pass in a fun( some bc and op) , return op_array;
        List<String> ans = new ArrayList<>();
        fun(ans , "" ,0 , 0, n);
        return ans;
        
    }
    void fun(List<String> ans, String curr_str, int open, int close, int max){
        // observe, ans is obtained onyl if str_length is 2*n
        if(curr_str.length()== max*2){
            ans.add(curr_str);
            return;
        }
        
        if(open<max) fun(ans, curr_str + "(", open+1, close, max);
        if(close<open) fun(ans, curr_str+")", open, close+1, max);

   
        }
}

//open ins number of '(' that should be addeded only if<n,
//close is number of ")" that should be added only if<open
// as we can every ans start from (. and we do not want asnwers like  "())(" see the tree