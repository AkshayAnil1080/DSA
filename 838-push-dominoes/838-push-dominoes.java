class Solution {
    public String pushDominoes(String dominoes) {
        
        int n = dominoes.length();
        int left[] = new int[n];
        int nearestLeft = -1; // for index
        for(int i=n-1; i>=0; i--)
            
        {
            char ch = dominoes.charAt(i);
            if(ch=='L')
            {
                nearestLeft = i;
            }
            else if(ch=='R')
            {
                nearestLeft =-1;
            }
            left[i] = nearestLeft;
        }
        //2.
        int right[] = new int[n];
        int nearestRight =-1;
        for(int i=0; i<n; i++)
        {
            char ch = dominoes.charAt(i);
            if(ch=='L')
                nearestRight= -1;
            else if(ch=='R')
                nearestRight = i;
            
            right[i] = nearestRight;
        }
        //3
        StringBuilder str = new StringBuilder();
        for(int i=0; i<n ; i++)
        {
            if(dominoes.charAt(i)=='.')
            {
                int nearestL = left[i];
                int nearestR = right[i];
                
                int leftDiff = nearestL == -1 ? Integer.MAX_VALUE : Math.abs(nearestL-i);
                int rightDiff = nearestR == -1 ? Integer.MAX_VALUE : Math.abs(nearestR-i);
                
                if(leftDiff == rightDiff)
                str.append('.');
                
                else if(leftDiff < rightDiff)
                    str.append('L');
                else
                    str.append('R');
                
            }
            else
                str.append(dominoes.charAt(i));
        }
        return str.toString();
    }
}