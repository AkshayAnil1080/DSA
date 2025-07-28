
Video Link - https://youtu.be/Nk8qYnIZa94
m1 - Better
  O(n)
  O(n)

  class Solution {
    public ArrayList<Integer> asciirange(String s) {
        int n = s.length();
        int[] prefixSum = new int[n];
        Map<Character, int[]> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            //1 prefix sum
            prefixSum[i] = s.charAt(i) + (i > 0 ? prefixSum[i - 1] : 0);
            
            //2 store first and last index
            if (!map.containsKey(c)) 
                map.put(c, new int[]{i, i}); 
            else
                map.get(c)[1] = i;
        }

    //3 traverse in map, to get the sum of ascii values 
    // of characters strictly between its first and last occurrence.
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Character, int[]> entry : map.entrySet()) {
            int start = entry.getValue()[0];
            int end = entry.getValue()[1];

            if (end - start > 1) {
                int sum = prefixSum[end - 1] - prefixSum[start];
                result.add(sum);
            }
        }

        return result;
    }
}


m2 - Optimal
  O(n)
O(1)

  class Solution {
    public ArrayList<Integer> asciirange(String s) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = s.length();
        int first[] = new int [26];
        int last[] = new int [26];
        
        //as 0 can be the possible index
        Arrays.fill(first,-1);
         Arrays.fill(last,-1);
        
        //
        for(int i=0; i<n ;i++){
            int j = s.charAt(i)-'a';
            if(first[j]==-1)
            first[j] =i;
            else 
             last[j] = i;
        }
        // get ind sum for each group.
         for(int i=0; i<26 ;i++){
             if (first[i] != -1 && last[i] != -1 && last[i] - first[i] > 1) {
                 int curr_sum=0;
                 for(int j = first[i]+1 ; j<last[i]; j++){
                     curr_sum += s.charAt(j);
                 }
                 res.add(curr_sum);
             }
         }
         return res;
        
    }
}
