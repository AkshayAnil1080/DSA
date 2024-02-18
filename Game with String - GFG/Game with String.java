
class Solution{
    static int minValue(String s, int k){
        // code here
     Map<Character, Integer> map = new HashMap<>();
     for(char ch : s.toCharArray())
     map.put(ch, map.getOrDefault(ch, 0)+1);
     
     PriorityQueue<Integer> pq  = new PriorityQueue<>(Collections.reverseOrder());
     for(int x : map.values())
     pq.add(x);
     
     while(k>0){
         int curr = pq.poll();
         pq.add(curr-1);
         k--;
     }
     int ans=0;
     while(!pq.isEmpty()){
         int curr = pq.poll();
         ans+= (curr*curr);
     }
     return ans;
     
     
    }
}
