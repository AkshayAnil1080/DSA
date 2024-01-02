//sliding window, two ptr , map
class Solution {
    public int smallestSubstring(String S) {
        // Code here
        HashMap<Character, Integer> map = new HashMap<>();
        int n = S.length();

        int ans=Integer.MAX_VALUE;
        int st=0;
        for(int i=0; i<n; i++){
            char ch = S.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
            if(map.size()==3){
                
                while(st<i && map.get(S.charAt(st))>1){
                map.put(S.charAt(st), map.getOrDefault(S.charAt(st),0)-1);
                st++;
                }
                ans=Math.min(ans, i-st+1);
            }
        }
            
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
};
//cpp
class Solution {
  public:
    int smallestSubstring(string S) {
     map<char, int> map;
        int n = S.size();

        int ans = INT_MAX;
        int st = 0;
        for (int i = 0; i < n; i++) {
           map[S[i]]++;
            if (map.size() == 3) {
                while (st < i && map[S[st]] > 1) {
                    map[S[st]]--;
                    st++;
                }
                ans = min(ans, i - st + 1);
            }
        }

        return ans == INT_MAX ? -1 : ans;
    }
};
