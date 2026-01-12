
video solution - https://youtu.be/Z3jDcLYn3Z0
class Solution {
    public boolean canServe(int[] arr) {
        // code here
        int N=arr.length;
        int five=0; int ten=0;
        for(int i=0; i<N; i++)
        {
            int x = arr[i];
            if(x==5)
            five++;
            else if(x==10)
            {
                five--; ten++;
            }
            else
            {
                if(x==20) //will not use anytime for returning as change
                {
                    if(ten>0)
                    {
                        ten--; five--;
                    }
                    else
                    {
                        five-=3;
                    }
                }
            }
            if(five<0)
            return false;
        }
        return true;
    }
}


