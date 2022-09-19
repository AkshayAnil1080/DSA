
// https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1
//User function Template for Java
//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int arr[])
    {
        //code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
    
    st.push(arr[0]);
    al.add(-1);
        for( int i= 1 ;i<n;i++)
        {
            while(!st.isEmpty() && st.peek() >= arr[i])
            st.pop();
            
            
            int ans = (st.isEmpty())? -1 : st.peek();
            al.add(ans);
            
            st.push(arr[i]);
        }
        return al;
    }
}
