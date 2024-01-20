class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int ans=0;
        int arr[] = new int[m];
        for(int i =0; i<n; i++){
            for(int j =0; j<m ;j ++){
                if(matrix[i][j]=='0') // imp 
                 arr[j]=0;
                else
                arr[j]+=1;
            }
            ans = Math.max(ans,largestRectangleArea(arr));
        }
        return ans;
    }
    int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int l_nse[] =new int[n];
        //
        l_nse[0]=-1;
        Stack<Integer> s1 = new Stack<>();
        s1.push(0);
        for(int i=1; i<n; i++){
            while(!s1.isEmpty() && arr[s1.peek()] >= arr[i]){
                s1.pop();
            }
            l_nse[i] = (s1.isEmpty()) ? -1 : s1.peek();
            s1.push(i);
        }
        // 
        int r_nse[] =new int[n];
        r_nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i =n-2; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            r_nse[i] = (st.isEmpty()) ? n : st.peek();
            st.push(i);
        }

        // 
        int max_area=  Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int height = arr[i];
            int length =  (r_nse[i]-1) - (l_nse[i]+1) + 1;
            max_area=  Math.max(max_area, height*length);
        }
        return max_area;

    }
}
