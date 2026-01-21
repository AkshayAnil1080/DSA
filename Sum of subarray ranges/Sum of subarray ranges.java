Video - https://youtu.be/pOTYqIMw0RA

class Solution {
    public int subarrayRanges(int[] arr) {
        // code here
        int n = arr.length;
        int[] leftMin = new int[n], rightMin = new int[n];
        int[] leftMax = new int[n], rightMax = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        
        
        // sum of max subarrys - sum of min subarrays
        
        
        // 1. sum of max subarrys
        // for each ele at index i,
        // find prevGreate ele index (k) and next greater ele index(j) ,
        // total number of sub array having arr[i] as max will be (i-k)*(j-k)
        // contribution = (i-k)*(j-k)*arr[i];
        
        // prev greater // https://www.youtube.com/watch?v=OCBp3x_QQBo&t=2s
        // previous Greater Element (leftMax)
            
       for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) st.pop();
            leftMax[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
          st.clear();
            
        //next greater rigthMax
       for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            rightMax[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }
          st.clear();
        
        //2. sum of min subarrays
        //prev samller
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
            leftMin[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        st.clear();
        
        //next smaller
         // next Smaller Element (rightMin)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            rightMin[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }

        st.clear();
        
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int maxContri = leftMax[i] * rightMax[i] * arr[i];
            int minContri = leftMin[i] * rightMin[i] * arr[i];
            ans += (maxContri - minContri);
        }
        return ans;
        
    }
}



