class Solution {

    double maxVolume(double P, double A) {
        // code here
         // calculate length
        double l
            = (double)(P - Math.sqrt(P * P - 24 * A)) / 12;
 
    double height = (P / 4) - (2 * (l));
        
         double ans = l * l* height;
          return ans;
    }
}
