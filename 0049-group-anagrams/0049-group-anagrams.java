class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
            // code here
      // code here
         int n = arr.length;
        List<List<String>> al = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<n ;i ++){
            String curr = getHash(arr[i]);
            
        //  if not in map - new anagram group found, initilize al, and add into map
            if(!map.containsKey(curr)){
                map.put(curr, al.size()); // we need to group the angrams in 2d al
                al.add(new ArrayList<>());
            }
            // else - anagrams found, place them into respective grps
            al.get(map.get(curr)).add(arr[i]);
        }
        return al; 
    }

    String getHash(String str){
        int freq[] = new int [26];
        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder hash = new StringBuilder();
        for(int x: freq){
            hash.append(x);
            hash.append('#'); // delimiter,[ convetion]. however, in this case not req.
        }
        return hash.toString();
    }
}