Balancing Consonants and Vowels Ratio
Vdieo Link  - https://youtu.be/d2eSqc2wtvo


// // n*n*l
// // 1
class Solution {
    public int countBalanced(String[] arr) {
        // code here
        int ans=0;
        int n = arr.length;
        //form all substrings
        for(int i=0;i<n;i++){
            int cons=0, vow=0;
           
            for(int j=i;j<n;j++){
                 StringBuilder currstr = new StringBuilder();
                 
                currstr.append(arr[j].toString());
                for(char ch: currstr.toString().toCharArray()){
                    if(isVowel(ch))
                    vow++;
                    else
                    cons++;
                }
                if(vow==cons)
                    ans++;
            }
        }
        return ans;
    }
    boolean isVowel(char ch){
        return ch=='a' || ch=='e' ||  ch=='i' || ch=='o' || ch=='u';
    }
}

// {a,b, e,i }
// 0,1 ""
// 1,2 a,e


// 0,2 b



class Solution {
    public int countBalanced(String[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum=0;
        int n = arr.length;
        int ans=0;
        map.put(0,1); // for "" string.
        for(int i=0; i<n; i++){
             for(char ch: arr[i].toCharArray()){
                 if(isVowel(ch))
                 preSum++;
                 else
                 preSum--;
                 
             }
             if(map.containsKey(preSum))
             ans+= map.getOrDefault(preSum,0);
             
           map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return ans;
    }
    boolean isVowel(char ch){
        return ch=='a' || ch=='e' ||  ch=='i' || ch=='o' || ch=='u';
    }
}
