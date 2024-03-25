class Solution {
    
    ArrayList<String> NBitBinary(int n) {
        // code here
    int cnt1=0; int cnt0 =0; 
    ArrayList<String> al = new ArrayList<>();
    StringBuilder curr = new StringBuilder();
        
        
    fun(n, cnt1, cnt0, curr, al);
    return al;
        
    }
    void fun(int n , int cnt1, int cnt0,  StringBuilder curr,List<String> al ){
        if(n==0){
        al.add(curr.toString()); 
        return;
        }
        
         fun(n - 1, cnt1 + 1, cnt0, new StringBuilder(curr).append("1"), al);

        if (cnt1 > cnt0) {
            // Create a new StringBuilder instance for each recursive call
            fun(n - 1, cnt1, cnt0 + 1, new StringBuilder(curr).append("0"), al);
        }
    }
}
