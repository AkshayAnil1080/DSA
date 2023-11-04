
class Solution {
    public int[] topK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) { //N
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>( //min heap by default
        //and we cannot use max heap since we wan top k largest
            (a, b) -> {//CUSTOM COMPARATOR
                if (!a.getValue().equals(b.getValue())) {
                    return a.getValue() - b.getValue(); //  frequency in asc
                } else {
                    return a.getKey() - b.getKey(); // if freq same, sort by key in asc
                }
            }
        );

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {//N
            pq.add(entry);
            if(pq.size()>k)//logK
            pq.poll();
         
        }
    //  while(!pq.isEmpty()){
    //  System.out.println(pq.poll());
    //  }
        
        int[] ans = new int[k];
        int idx=k-1;
        while(!pq.isEmpty())
        {
            ans[idx--]=pq.poll().getKey();
        }
      return ans;

   
