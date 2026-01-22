https://www.geeksforgeeks.org/problems/maximum-people-visible-in-a-line/1

Video Solution -  https://youtu.be/Zniza4bKnms
brute force n^2,1
  
class Solution {
    public int maxPeople(int[] arr) {
        // code here
        int n = arr.length;
        
        int ans=1;
        for(int i=0; i<n; i++){
           int cnt=1;
           for(int j=i+1; j<n; j++){ // looking right
               if(arr[i] > arr[j])
               cnt++;
               else break;
           }
           for(int j=i-1; j>=0; j--){ // looking left
               if(arr[i]> arr[j])
               cnt++;
               else 
               break;
               
           }
           ans = Math.max( ans, cnt);
           
        }
        return ans;
    }
}

optimal - n,n

class Solution {
    public int maxPeople(int[] arr) {
        // code here
     int n = arr.length;
        int[] leftMax = new int[n], rightMax = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();
     
     
     // previous Greater Element (leftMax) n, n,
            
       for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) st.pop();
            leftMax[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
          st.clear();
            
        //next greater rigthMax n,n
       for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) st.pop();
            rightMax[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }
          st.clear();
          
         int ans = 1;
        for (int i = 0; i < n; i++) {
      
            ans = Math.max(ans, leftMax[i] + rightMax[i]-1);
        }
        return ans;
        
          
          
           
    }
}

