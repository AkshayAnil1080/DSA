Video solution  by me - https://youtu.be/C7XN27WvZAQ

class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // by def its min
        for(int i=0;i <n; i++){
            for(int j=0; j<m; j++){
                pq.add(mat[i][j]);
                
                if(pq.size()>k)
                    pq.poll();
            }
        }
        return pq.peek();
    }
}

N^2 logk


--
n * log(max-min)
class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
         int n = mat.length;
        int low = mat[0][0];
        int high = mat[n - 1][n - 1];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // count elements less than or equal to mid
            int count = countSmallerEqual(mat, mid);

            if (count < k) {
                
                // if there are less than k elements
                // <= mid, the kth smallest is larger
                low = mid + 1;
            } 
            
            else {
                
                // otherwise, mid might be the answer, 
                // but we need to check for smaller values
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
        
    }
    int countSmallerEqual(int[][] mat, int x) {
        int n = mat.length;
        int count = 0;
        int row = 0;
        int col = n - 1;

        // traverse from the top-right corner
        while (row < n && col >= 0) {
            if (mat[row][col] <= x) {
                
                // if current element is less than 
                // or equal to x, all elements in this
                // row up to the current column are <= x
                count += (col + 1);
                row++;
            } 
            else{
                // move left in the mat
                col--;
            }
        }

        return count;
    }
}

