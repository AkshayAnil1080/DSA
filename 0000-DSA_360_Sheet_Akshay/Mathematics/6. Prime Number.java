Full Video explanation by me , watch here - https://youtu.be/gkNp3J26awk

class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n==1){
            return false;
        }
        for(int i =2; i*i<=n; i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
}


O(sqrt(n))
