Best Video Solution with Live Coding: https://youtu.be/Gmr0PikB2d0

class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );
        int n = points.length;
        
        for(int i=0; i<n;i++){
            int curr_dist[] = new int[]{getEucledianDistance(points[i]), i};
            
            if(pq.size()<k)
            pq.add(curr_dist);
            
            else{
                if(curr_dist[0] < pq.peek()[0]){
                    pq.poll();
                    pq.add(curr_dist);
                }
            }
        }
       
        while(!pq.isEmpty()){
            int curr_idx = pq.poll()[1];
            ans.add(new ArrayList<>(Arrays.asList(points[curr_idx][0], points[curr_idx][1])));
        }
        return ans;
    }
     int getEucledianDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
