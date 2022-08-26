
/*complete the Function*/
//1. intilaize three ptr and itr for the dots range in str.
//2. pick the ip and vialidate it ? if true add in ans;

        
class Solution {
    public ArrayList<String> genIp(String s) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        
        //bc
        int n=s.length();
        if(n>12){
            ans.add("-1");
            return ans;
        }
        for(int i=1;i<n-2;i++){ //i range the ch range i can pich from str such that 3 ch are still left.
        
            for(int j=i+1;j<n-1;j++){
                
                for(int k=j+1;k<n;k++){
                    
                    String a=s.substring(0,i);
                    String b=s.substring(i,j);
                    String c=s.substring(j,k);
                    String d=s.substring(k,n);
                     if(is_Valid_Octet(a) && is_Valid_Octet(b) &&
                        is_Valid_Octet(c) && is_Valid_Octet(d) )
                    {
                        ans.add(a+"."+b+"."+c+"."+d);
                    }
                }
            }
        }
        return ans;
    }
    boolean is_Valid_Octet(String s){
        
         //1. length>0 //2. length>3 //3. first ch==0 and rest not //4.integet value>255
        int n=s.length();
        if(n==0 || n>3 || (s.charAt(0)=='0' && n>1) || Integer.parseInt(s)>255)return false;
        return true;

    }
}
