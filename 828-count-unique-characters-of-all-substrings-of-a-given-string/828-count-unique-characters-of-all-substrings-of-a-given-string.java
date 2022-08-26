class Solution {
    public int uniqueLetterString(String s) {
    
        int n = s.length();
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for( int i =0; i<26;i++)
        {
            map.putIfAbsent(i, new ArrayList<Integer>());
        List<Integer> al = map.get(i);
            al.add(-1);
            map.put(i, al);
        }
        
        for( int i =0; i<n; i++)
        {
            int a = s.charAt(i)-'A';
             List<Integer> al = map.get(a);
            al.add(i);
             map.put(a, al);
        }
      
        
        for( int i =0; i<26; i++)
         {
             List<Integer> al = map.get(i);
            al.add(n);
             map.put(i, al);
        }
      
        
        int sum =0;
        
	for(List<Integer> l : map.values())
    {
        for( int i=1; i<=l.size()-2; i++)
        {
            sum +=  (l.get(i) - l.get(i-1)) * (l.get(i+1) - l.get(i));
        }
    }
        return sum;
    }
}