class Solution {
    public String decodeString(String s) {
          Stack<String> st = new Stack<>();
        char c[] = s.toCharArray();
        int n = s.length();
        
        for (int i = 0; i < n;) {
            if (Character.isDigit(c[i])) {  // Case 1: Number
                StringBuilder str = new StringBuilder();
                while (i < n && Character.isDigit(c[i])) {
                    str.append(c[i]);
                    i++;
                }
                st.push(str.toString());
            } 
            else if (c[i] == ']') {  // Case 2: Closing bracket
                StringBuilder str = new StringBuilder();
                
                while (!st.isEmpty() && st.peek()!="[") 
                    str.insert(0, st.pop()); //  insert at the beginning
                
                if (!st.isEmpty()) st.pop(); 
                //repeat cnt
                int times = !st.isEmpty() && Character.isDigit(st.peek().charAt(0)) ? Integer.parseInt(st.pop()) : 1; 
                
                StringBuilder repeatedStr = new StringBuilder();
                while (times-- > 0) {
                    repeatedStr.append(str);
                }
                st.push(repeatedStr.toString());
                i++;
            } 
            else if (c[i] == '[') {  // Case 3: Opening bracket
                st.push("[");
                i++;
            } 
            else {  // Case 4: Letters
                StringBuilder str = new StringBuilder();
                while (i < n && Character.isLetter(c[i])) {
                    str.append(c[i]);
                    i++;
                }
                st.push(str.toString());
            }
        }
        
         StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.insert(0, st.pop()); // Insert at beginning
        }
        return res.toString();
    }
}