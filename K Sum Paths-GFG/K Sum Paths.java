

class Solution
{
     int mod = 1000000007; 
    int ans;
     HashMap<Integer,Integer> mp;

    public int sumK(Node root,int k)
    {
        mp= new HashMap<>(); 
        ans = 0;
        dfs(root, k, 0);
        return ans;
    }
    
    public void dfs(Node root, int k, int cur)
    {

        if(root == null)  return;
            
        //two case where we can get the answer
         if((cur + root.data) == k) 
            ans = (ans+1)%mod;

        //check if( currsum - k ) exists in the HashMap
        ans = (ans + (mp.getOrDefault(cur + root.data - k,0))%mod)%mod;

        //update the current path
        mp.put(cur + root.data, (mp.getOrDefault(cur + root.data,0)+1)%mod);
        
        dfs(root.left, k, cur+root.data);
        dfs(root.right, k, cur+root.data);
        
        //remove the path after processing it
        mp.put(cur + root.data, ((mp.getOrDefault(cur + root.data,0)-1) + mod)%mod);
    }
}
