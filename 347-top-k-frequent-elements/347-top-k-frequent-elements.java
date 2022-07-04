class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int res[]= new int[k];
        HashMap<Integer, Integer>map = new HashMap<>();
        for( int i=0; i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());          // storing the entire map  in one list, basically providing index to each entry set.
        
        // using sort. list to get inside map using map.entry to access value and then comparator call(a,b)->b-a;        
        list.sort(Map.Entry.comparingByValue((a, b) -> b - a));
        
        for(int i=0; i<k ;i++)
        {
            res[i] = list.get(i).getKey();   // list.get(i) is actually an entry set - to get a key from it we use getKey and getValue
        }
        // System.out.println(list);  // [1=3,2=2,3=1] // sort by value in desc order
        return res;
        
    }
}