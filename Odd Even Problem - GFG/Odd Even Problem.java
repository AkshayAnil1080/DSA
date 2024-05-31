
class Solution {
    public static String oddEven(String s) {
        // code here
       HashMap<Character, Integer> map = new HashMap<>();
       for(char x : s.toCharArray()){
           map.put(x, map.getOrDefault(x,0)+1);
       }
       int x=0,y=0;
       for(char ch : map.keySet()){
            if(map.get(ch)%2==0 && (ch-'0')%2==0)
            x++;
            else if(map.get(ch)%2!=0 && (ch-'0')%2!=0)
            y++;
       }
       return (x+y)%2==0 ? "EVEN" : "ODD";
    }
}
