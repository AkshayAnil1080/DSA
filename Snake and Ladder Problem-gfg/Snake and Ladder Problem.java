Snake and Ladder Problem
Complete video explanation - 
https://youtu.be/M6ipvuBnbI4



class Solution {
    public int minThrows(int n, int[] lad, int[] sn) {

        int total = n * n;

        // jump[i] = destination if we land on i
        int[] jump = new int[total + 1];

        for (int i = 1; i <= total; i++) {
            jump[i] = i;
        }

        // Ladders
        for (int i = 0; i < lad.length; i += 2) {
            jump[lad[i]] = lad[i + 1];
        }

        // Snakes
        for (int i = 0; i < sn.length; i += 2) {
            jump[sn[i]] = sn[i + 1];
        }

        // BFS - position, throw number
        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[total + 1];

        q.add(new int[]{1,0});
        visited[1] = true;
        
        
        while(!q.isEmpty()){
            int current[] = q.poll();
            int pos = current[0], dist = current[1];
            if(pos==n*n)
            return dist;
    
            // Try dice values 1 to 6
            for (int i = 1; i <= 6; i++) {
    
                int next = pos + i;
                if (next <= total) {
                    int nextDest = jump[next];
                    if (!visited[nextDest]) {
                        visited[nextDest] = true;
                        q.add(new int[]{nextDest, dist+1});
                    }
                }
            }
        }
        return -1;
    }
}
