class Solution {
    public String removeKdigits(String S, int K) {
          Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            while (!stack.isEmpty() && stack.peek() > c && K > 0) {
                stack.pop(); //  stack  in ascending order
                K--;        // number of deletion remaining
            }

            // if (!stack.isEmpty()) {//push c irres of its 0 or not 
            //      stack.push(c);
            // } 
            // if(stack.isEmpty() && c!='0')
            // stack.push(c);
             
            //  if(stack.isEmpty() && c=='0') // no leading zeros
            //  continue;
            
            if(!stack.isEmpty() || c!='0')
             stack.push(c);
        }   
        // number of deletion remaining >0
        while (!stack.isEmpty() && K > 0) {
            stack.pop();
            K--;
        } 

        if (stack.isEmpty()) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        // Appends characters one by one
        for (Character ch : stack) {
            sb.append(ch); //O(1)
        }

        return sb.toString();
    }
}


// class Solution {
//     public String removeKdigits(String S, int K) {
//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < S.length(); i++) {
//             char c = S.charAt(i);

//             while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && K > 0) {
//                 sb.deleteCharAt(sb.length() - 1); // make sure characters in sb are in ascending order
//                 K--;                               // remove one char
//             }

//             if (sb.length() > 0 || c!='0')
//                 sb.append(c);

          
//         }

//         // remove remaining characters if needed
//         while (sb.length() > 0 && K-- > 0) {
//             sb.deleteCharAt(sb.length() - 1);
//         }

//         return (sb.length() == 0) ? "0" : sb.toString();
//     }
// }
