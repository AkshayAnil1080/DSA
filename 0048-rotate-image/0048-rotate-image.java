// 90 degree clock wise
// Transpose the matrix.
// Reverse each row.

// 180 degree CW == 180 ACW
// Reverse each row.
// Reverse the entire matrix (i.e. reverse all rows).

// 270 deg CW
// Transpose the matrix.
// Reverse each column (or reverse the order of rows in the transposed matrix).

// 90 ACW == 270 CW
// 180 ACW == 180 CW
// 270ACW == 90 CW

class Solution {
    public void rotate(int[][] mat) {
        //transpose
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}