class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if (root == null)
            return true;
            
        Stack<Node> st = new Stack<>();
        st.push(root.left);
        st.push(root.right);
        
        while(!st.isEmpty())
        {
            Node t1=  st.pop(), t2 = st.pop();
            if(t1==null && t2==null)  continue;
            if(t1==null || t2==null) return false;
            if(t1.data!=t2.data) return false;
            
            st.push(t1.right);    st.push(t2.left); 
             st.push(t1.left);    st.push(t2.right); 
        }
        return true;
    }
