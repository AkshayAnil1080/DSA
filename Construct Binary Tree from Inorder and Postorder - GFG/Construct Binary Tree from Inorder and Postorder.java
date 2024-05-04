class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
    int postIdx;
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        postIdx =n-1;
        return dfs(in, post, 0, n-1);
        
    }
    Node dfs(int in[], int post[], int is, int ie){
        if(is>ie) return null;
        
        Node root = new Node(post[postIdx--]);
        
       int inIdx = is; //O(n)
        for(int i=is; i<=ie; i++){
            if(in[i]==root.data){
                inIdx=i; break;
            }
        }
        //rec
      
        root.right = dfs(in, post, inIdx+1, ie);
        root.left =  dfs(in, post, is, inIdx-1);
        return root;
    }
}
