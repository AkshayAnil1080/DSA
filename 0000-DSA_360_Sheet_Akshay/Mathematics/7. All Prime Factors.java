Full Video explanation by me , watch here - https://youtu.be/gkNp3J26awk
https://www.geeksforgeeks.org/problems/prime-factor-of-a-number/1

class Solution {
    ArrayList<Integer> primeFactors(int n) {
        // code here
        
         ArrayList<Integer>  al = new  ArrayList<Integer> ();
         for(int i =2; i<=n ; i++){ // n
            while(n%i==0){
                al.add(i);
                n=n/i;
            }
         }
         if(n>1)
         al.add(n);
         
         return al;
    }
}



class Solution {
    ArrayList<Integer> primeFactors(int n) {
        // code here
        ArrayList<Integer>  al = new ArrayList<Integer>();
        for(int i =2; i<=n ; i++){ // n
            if(isPrime(i)){ // sqrt(n)
                int x =i;
                while(n%x==0){ //logn
                    al.add(i);
                    x=x*i;
                }
            }
        }
        return al;
    }
    boolean isPrime(int n) {
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

O(n* sqrt(n) ) >>10^8 iterations

