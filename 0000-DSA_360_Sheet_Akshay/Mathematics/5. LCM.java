

full video explanation -  https://youtu.be/FpboZ9vrxBQ
  
// log(min(a,b)), // log(min(a,b))
class Solution {
    public int lcm(int a, int b) {
        // code here
        return (a*b)/gcd(a,b);
    }
    
    int gcd(int a, int b) {
            // code here
           if(b==0)
           return a;

           else
           return gcd(b, a%b);
    }
}
