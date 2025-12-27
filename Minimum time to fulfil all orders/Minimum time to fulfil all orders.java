Video solution explanation by me - https://youtu.be/yKJV41FM0nc
  class Solution {
    public int minTime(int[] A, int N) {
        int low = 0, high = Integer.MAX_VALUE;
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long cnt = 0;

            for (int r : A) {
                cnt += countDonut(r, mid);
                if (cnt >= N) break; // early stop
            }

            if (cnt >= N) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static long countDonut(int R, int T) {
        // k = floor((-1 + sqrt(1 + 8T/R)) / 2)
        long val = 1L + 8L * T / R;
        long k = (long) ((Math.sqrt(val) - 1) / 2);
        return k;
    }
}




class Solution {
    public int minTime(int[] A, int N) {
        // code here
        int ans = Integer.MAX_VALUE;
        int low = 0, high = Integer.MAX_VALUE;
        
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            int cnt = 0;
            
            for(int it : A)
            cnt += countDonut(it, mid);
            
            if(cnt >= N)
            {
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        
        return ans;
    }
    
    static int countDonut(int R, int T)
    {
        int cnt = 1;
        
        while(T-R*cnt >= 0)
        {
            T -= R*cnt;
            cnt++;
        }
        
        return cnt-1;
    }
}



   
 
   
   
