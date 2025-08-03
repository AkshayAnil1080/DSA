Video link  with best solution - https://youtu.be/D_FYRO60dJo

  class Solution {
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) {
        // code here
        int n =mat.length, m=mat[0].length;
        int weightage[][] = new int[n][m];

        for (int[] op : opr) {
            int value = op[0];
            int r1 = op[1], c1 = op[2], r2 = op[3], c2 = op[4];
            weightage[r1][c1] += value;
            if (c2 + 1 < m) weightage[r1][c2 + 1] -= value;
            if (r2 + 1 < n) weightage[r2 + 1][c1] -= value;
            if (r2 + 1 < n && c2 + 1 < m) weightage[r2 + 1][c2 + 1] += value;
        }

        for (int i = 0; i < n; i++) { //row wise psum
            for (int j = 1; j < m; j++) {
                weightage[i][j] += weightage[i][j - 1];
            }
        }

        for (int j = 0; j < m; j++) { //col wose psum
            for (int i = 1; i < n; i++) {
                weightage[i][j] += weightage[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] += weightage[i][j];
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                rowList.add(mat[i][j]);
            }
            result.add(rowList);
        }

        return result;
    }
}
