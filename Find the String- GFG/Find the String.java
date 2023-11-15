
class Solution{
    public String findString(int n, int k){
       StringBuilder ans = new StringBuilder(), temp = new StringBuilder();
        Map<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) 
            ans.append('0');

        temp.append(ans);
        mp.put(temp.toString(), 1);
        dfs(temp, ans, mp, k);
        return ans.toString();
    }
    
     public void dfs(StringBuilder curr, StringBuilder ans, Map<String, Integer> mp, int k) 
     {
        StringBuilder temp;
        for (int i = k - 1; i >= 0; i--) 
        {
            temp = new StringBuilder(curr.substring(1)); // leave first ch and take rest n-1 ch
            //append next ch
            temp.append((char) (i + '0'));
            if (!mp.containsKey(temp.toString())) 
            {
                mp.put(temp.toString(), 1);
                ans.append((char) (i + '0'));
                dfs(temp, ans, mp, k);
                return;
            }
        }
    }
}
