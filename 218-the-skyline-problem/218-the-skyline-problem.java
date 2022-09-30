class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>>  res = new ArrayList();
        List<int[]> heights = new ArrayList<>();
        
        // preprocessing
        for(int building[] : buildings)  //O(N)
        {
            heights.add(new int[]{building[0], -building[2]});
             heights.add(new int[]{building[1], building[2]});
        }
        Collections.sort(heights, (a,b) -> (a[0]==b[0]) ? a[1]-b[1] : a[0]-b[0]); //o(nlogn)
        
        //
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //max heap
        pq.offer(0);
        int preMax =0;
        
        
        for(int height[] : heights)
        {
            if(height[1]<0) pq.offer(-height[1]);
            
            else
                pq.remove(height[1]); //O(logn)
            
            int currMax = pq.peek();
            if(currMax != preMax)
            {
                List<Integer> subRes =  new ArrayList<>();
                subRes.add(height[0]);
                subRes.add(currMax);
                res.add(subRes);
                preMax = currMax;
            }
        }
        return res;
    }
}

// TC :O(nlogn)
// SC: O(2n)