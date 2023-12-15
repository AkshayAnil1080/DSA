//java

class Solution {
    public int rangeBitwiseAnd(int left, int right) {         
        int c=0;
        while(left!=right)
        {
            left/=2; // or x>>=1;
            right/=2; // or y>>=1;
            c++;
        }
        return left<<c; // right<<c ;
    }
}
//c++
class Solution {
public:
    int rangeBitwiseAnd(int left, int right) {
          int c=0;
        while(left!=right)
        {
            left/=2; // or x>>=1;
            right/=2; // or y>>=1;
            c++;
        }
        return left<<c; // right<<c ;
    }
};
