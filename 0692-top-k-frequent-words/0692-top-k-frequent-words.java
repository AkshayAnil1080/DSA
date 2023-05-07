class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
            int n = words.length;
         
        HashMap<String,Integer> map = new HashMap<>();
         for(int i =0; i<n; i++)
         {
             map.put(words[i], map.getOrDefault(words[i],0)+1);
         }
        
    
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> map.get(a).equals(map.get(b)) ? b.compareTo(a) : map.get(a)-map.get(b)); // sorting the string in min heap and if string exists with same count then sort it via freq
       for(String curr : map.keySet())
       {
           
           pq.add(curr);
           if(pq.size()>k)
               pq.remove();
       }
        for(int i=0; i<k; i++)
        { 
            ans.add(0,pq.remove());   // reversing the array list while adding in the list.e
        }
        return ans;///
    }
}
