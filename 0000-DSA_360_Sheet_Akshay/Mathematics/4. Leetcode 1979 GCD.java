
Full video explanation - https://youtu.be/FpboZ9vrxBQ

class Solution {
    public static int gcd(int a, int b) {
        // code here
       if(b==0)
       return a;

       else
       return gcd(b, a%b);
    }
}


// log(min(a,b))

// class Solution {
//     public static int gcd(int a, int b) {
//         // code here
//       while(a!=b){
//           if(a>b)
//           a=a-b;
//           else b=b-a;
//       }
//       return a;
//     }
// }


//(a-b)






// class Solution {
//     public static int gcd(int a, int b) {
//         // code here
//         int res = Math.min(a,b);
//         while(res>0){
//             if(a%res==0 && b%res==0)
//             return res;
            
//             res--;
//         }
//         return res;
//     }
// }

//O(min(a,b))
