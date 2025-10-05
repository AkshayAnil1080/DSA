class Solution {
    public boolean checkValidGrid(int[][] grid) {
         int n = grid.length;

        // 8 possible knight moves
        int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
        int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

        // The first cell must be visited first
        if (grid[0][0] != 0) return false;

        // Position array: pos[step] = [row, col]
        int[][] pos = new int[n * n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pos[grid[i][j]][0] = i;
                pos[grid[i][j]][1] = j;
            }
        }

        // Check if every consecutive move is a valid knight move
        for (int step = 0; step < n * n - 1; step++) {
            int x1 = pos[step][0], y1 = pos[step][1];
            int x2 = pos[step + 1][0], y2 = pos[step + 1][1];

            boolean validMove = false;
            for (int k = 0; k < 8; k++) {
                if (x1 + dx[k] == x2 && y1 + dy[k] == y2) {
                    validMove = true;
                    break;
                }
            }
            if (!validMove) return false;
        }

        return true;

    }
}

// Best video Solution ever: https://youtu.be/2-_gngqTGio
Lee
