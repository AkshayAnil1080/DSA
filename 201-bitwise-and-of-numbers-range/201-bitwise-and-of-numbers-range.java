class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
        // to find the constant part , as the rest of the bits are flipping in such a way,
        // that it will become zero, and once becomes 0 doing and with any other pair with be 0 as resultant.
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