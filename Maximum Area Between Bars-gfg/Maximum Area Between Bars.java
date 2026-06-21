https://youtu.be/WbyP-vKKFg4

class Solution {
    public int maxArea(List<Integer> a) {
        // code here
        int n = a.size();
        int ans=0;
        int i=0, j=n-1;
        
       while(i<j){
            int curr_area = Math.min(a.get(i), a.get(j)) * (j-i-1);
                ans = Math.max(ans, curr_area);
                
            if(a.get(i)<a.get(j))
            i++;
            else 
            j--;
       }
        return ans;
    }
}


