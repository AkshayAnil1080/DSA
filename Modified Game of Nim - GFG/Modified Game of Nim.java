class Solution{
    static int findWinner(int n, int A[]){
        // code here
        int res=0;
        for(int num : A)
        res^=num;
        
        if(res==0)
        return 1;
        
        else
        return n%2==0 ? 1: 2;
        
    }
}
