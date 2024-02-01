class Solution {
    public int myAtoi(String s) {
        int n = s.length();
	int sign=1;
	int idx=0; long num=0;
    //1.
    while(idx<n && s.charAt(idx)==' '){
        idx++;
    }
    //2
   if(idx<n && s.charAt(idx)=='+'){
       sign=1; idx++;
   }
   else if(idx<n && s.charAt(idx)=='-'){
       sign= -1; idx++;
   }

    //3 itr next digits and stop it is not a digit
    while(idx<n  && s.charAt(idx)>='0' && s.charAt(idx)<='9'){
        if ((num > Integer.MAX_VALUE / 10) || 
                (num == Integer.MAX_VALUE / 10 && s.charAt(idx) > Integer.MAX_VALUE % 10))
         return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

         num = num*10 + s.charAt(idx) -'0';
        
         idx++;
    }
	

	return sign*(int)num;
    }
}

