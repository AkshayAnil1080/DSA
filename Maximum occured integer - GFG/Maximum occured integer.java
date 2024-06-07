Video Link - https://youtu.be/tirt8Spk1mw
LinkedIn -  https://www.linkedin.com/in/akshay-a-26672a172/
Twitter - https://twitter.com/akshay_anil_
Instagram
https://www.instagram.com/code_with_akshay/
https://www.instagram.com/itzz_aksh_yay/

class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int L[], int R[], int maxx) {
        
        Map<Integer, Integer> map = new HashMap<>();

        // Populate the map with frequencies of each integer in the ranges
        for (int i = 0; i < n; i++) {
            for (int j = L[i]; j <= R[i]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }
        int max_freq=Integer.MIN_VALUE;
        int min_ans= Integer.MAX_VALUE;
        
      for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            int key = x.getKey();
            int freq = x.getValue();
            
            if (freq > max_freq || (freq == max_freq && key < min_ans)) {
                max_freq = freq;
                min_ans = key;
            }
        }
        return min_ans;

    }
}


class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int L[], int R[], int maxx) {
         int arr[] = new int[maxx+2];
        for( int  i = 0; i<n ;i++)
        {
            arr[L[i]]++;
            arr[R[i]+1] --;
            
            
        }
        
        int max = arr[0] , res = 0;
        for( int i  = 1; i<maxx+1; i++)
        {
            arr[i] +=arr[i-1];
            if(max  <arr[i])
            {
                max =arr[i];
                res= i;
            }
        }
        return res;
    }
}
