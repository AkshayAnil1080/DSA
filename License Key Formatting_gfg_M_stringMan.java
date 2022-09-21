// https://practice.geeksforgeeks.org/problems/license-key-formatting/1

// idea = traverse form last to 0 - keep adding k char and ,maintain count for k while appending and if cnt==k append '-',
// some base cases, are mentioned below

// User function Template for Java

class Solution{
    static String ReFormatString(String S, int K){
        // code here =
        
        StringBuilder str =new StringBuilder();
        int c =0;
        int  n= S.length();
         for( int i=n-1; i>=0 ;i--)
         {
             char ch=S.charAt(i);
             if(ch=='-') continue;
             else if(Character.isLowerCase(ch))
             str.append(Character.toUpperCase(ch));
             
             else
             str.append(ch);
             
             c++;
             if(c==K) {str.append('-'); c=0;}
         }
         str.reverse();
         //now it can be like lasty it can have k ch and one - will be inserted so remove it
         if(str.length()>0 && str.charAt(0)=='-') {
             str.deleteCharAt(0);
         }
         // constraint says, s length can be 1 -> say '-', sp out written code will remove this ch-> 
         // do this str.deleteChar(0); only out actual ans length>0;

         return str.toString();
    }
}
