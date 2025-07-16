class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
            // code here
        int n = arr.length;
        List<List<String>> al = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<n ;i ++){
            //sort the stirngs 
            char temp[] = arr[i].toCharArray();
            Arrays.sort(temp);
            String curr = new String(temp);
            
            //if not in map - new anagram group found, initilize al, and add into map
            if(!map.containsKey(curr)){
                map.put(curr, al.size()); // we need to group the angrams in 2d al
                al.add(new ArrayList<>());
            }
            // else - anagrams found, place them into respective grps
            al.get(map.get(curr)).add(arr[i]);
        }
        return al;
    }
}