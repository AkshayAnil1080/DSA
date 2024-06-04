class Solution {
    String binaryNextNumber(String s) {
        // code here.
        int n = s.length();
        char arr[] = s.toCharArray();
        int i=0;
        for( i=n-1; i>=0;i--){
            if(arr[i]=='1'){
                arr[i] = '0';
            }
            else{
                arr[i] ='1';
                break;
            }
        }
         StringBuilder res = new StringBuilder();

        //no zeros found => all set bit - eg 111 => 1000
        if(i<0){
            res.append("1");
            for(i=0 ;i<n; i++)
           res.append(arr[i]);
        }
        else{
            //leave leading zeros and return remaining
            i=0;
          while(i<n && arr[i]=='0'){
              i++;
          }
         for(i=i ;i<n; i++)
           res.append(arr[i]);
          
        }
        return res.toString();
        
    }
}
