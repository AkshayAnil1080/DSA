
class Solution {
    static List<Long> jugglerSequence(long n) {
        // code here
        
        List<Long> ans = new ArrayList<>();
        ans.add(n);
        while(n>1){
            
            if(n%2==0)
              n = (long)(Math.sqrt(n));
                
            else
            n = (long)(Math.sqrt(n)*n);
              
                
            ans.add(n);
        }
        return ans;
        
    }
}
