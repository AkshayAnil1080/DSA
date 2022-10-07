// https://practice.geeksforgeeks.org/problems/mila-and-strings0435/1
// Expected Time Complexity: O(n+k), n is size of the string
// Expected Auxiliary Space: O(n)
  
  class Solution {
    static String lexicographicallySmallest(String S, int k) {
        // code here
        
        int n = S.length();
        if((n&(n-1))==0)
        k=k/2;
        else
        k=k*2;
        
        if(k>=n) return "-1";
        
        int rem=0;
        Stack<Character> st = new Stack<>();
        for(int i =0; i<n; i++)
        {
            char ch = S.charAt(i);
            while(!st.isEmpty() && rem<k && st.peek()>ch)
            {
                st.pop(); rem++;
            }
            st.push(ch);
        }
        while(rem<k)
        {
            st.pop();
            rem++;
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty())
        {
            str.append(st.pop());
        }return str.toString();
    }
}
