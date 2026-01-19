Best video Solution
https://youtu.be/WVRC9NsGovs

class Solution {
    String ans="";
    Stack<Character> st = new Stack<>();
    public void append(char x) {
        // append x into document
        ans+=x;
        //empty stack
        while(!st.isEmpty()) st.pop();
        
    }

    public void undo() {
        // undo last change
        if(ans.length()>0){
             st.push(ans.charAt(ans.length()-1));
            ans = ans.substring(0, ans.length()-1);
        }
    }
 
    public void redo() {
        // redo changes
        if(!st.isEmpty()){
            ans+=st.pop();
        }
    }

    public String read() {
        // read the document
        return ans;
    }
}


11
1 A
1 B
1 C
2
2
4
3
4
1 D
3
4
