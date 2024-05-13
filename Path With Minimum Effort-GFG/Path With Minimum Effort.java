
class Solution {
     static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    
    
    public static int MinimumEffort(int rows, int columns, int[][] heights) {
        // code here
       PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]); // {x, y, effort}
        boolean[][] visited = new boolean[rows][columns];
        
          pq.offer(new int[]{0, 0, 0}); 
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int x = current[0];
            int y = current[1];
            int effort = current[2];
            
             if (x == rows - 1 && y == columns - 1) {
                return effort;
            }
              visited[x][y] = true;
           for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];   
                if (nx >= 0 && nx < rows && ny >= 0 && ny < columns && !visited[nx][ny]) {
                      int diff = Math.abs(heights[x][y] - heights[nx][ny]);
                       int maxDiff = Math.max(diff, effort);
                       
                         pq.offer(new int[]{nx, ny, maxDiff});
                }
           }
        }
          return -1; 
    }
}
