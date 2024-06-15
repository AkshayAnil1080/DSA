class Solution {
    public int romanToInt(String str) {
         HashMap<Character, Integer> map = new HashMap<>();
       int n =  str.length();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i <n-1; i++) {
            if ( map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) 
                sum -= map.get(str.charAt(i));
             else
                sum += map.get(str.charAt(i));
        }
          sum += map.get(str.charAt(n-1));
        return sum;
    }
}
