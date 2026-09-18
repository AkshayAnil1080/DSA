Full video explanation by me - watch here - https://youtu.be/PVhN0P3L0rw
  https://leetcode.com/problems/perfect-number/

class Solution {
    public boolean checkPerfectNumber(int n) {
      if (n == 1) return false;
        int sum=0;
        int temp=n;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                sum+=i;
                 if(i!= n/i && n!=n/i){
                    sum+= (n/i);
                 }
            }
           
        }
     return temp==sum;
    }
}
