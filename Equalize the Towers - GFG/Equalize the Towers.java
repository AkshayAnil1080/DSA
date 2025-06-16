Problem Link  https://www.geeksforgeeks.org/problems/equalize-the-towers2804/1
Solution Video - https://youtu.be/xBu4f4-iQq4

m1
class Solution {
    public int minCost(int[] heights, int[] costs) {
        // code here
        
        int n = heights.length;
       long ans = Long.MAX_VALUE;
        for(int i=0; i<n ;i++){//try for all poss towers
            long curr_cost=0;
           for(int j=0;j<n; j++){
                curr_cost += costs[j] * Math.abs(heights[i]-heights[j]);
            }
            ans= Math.min(curr_cost,ans);
        }
        return (int) ans;
    }
}
m2

class Solution {
    public int minCost(int[] heights, int[] costs) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int h : heights) {
            min = Math.min(min, h);
            max = Math.max(max, h);
        }

        int l = min, h = max;
        int ans = 0;

        while (l < h) {
            int mid = l + (h - l) / 2;
             int x1 = helpercostfunction(heights, costs, mid);
            int x2 = helpercostfunction(heights, costs, mid + 1);
        
            if(x1>=x2){
               l = mid + 1;
            } else {
               h=mid;
            }
        }
          return helpercostfunction(heights, costs, l);
        }

    int helpercostfunction(int[] heights, int[] costs, int h) {
        int totalCost = 0;
        for (int i = 0; i < heights.length; i++) {
            totalCost += costs[i] * Math.abs(heights[i] - h);
        }
        return totalCost;
    }
}
