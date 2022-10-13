// Input: s = 3[b2[ca]]
// Output: bcacabcacabcaca

// https://practice.geeksforgeeks.org/problems/decode-the-string2444/1


class Solution{
    static String decodedString(String s){
        // code here
          Stack<String> st=new Stack<>();
        char c[]=s.toCharArray();
        
        int n=s.length();
        
        for(int i=0;i<n;)
        {
            if(c[i]>='0' && c[i]<='9')  //case1
            {
                String str="";
                while(i<n && c[i]>='0' && c[i]<='9'){
                    str+=c[i];
                    i++;
                }
                st.push(str);
            }
           
            else if(c[i]==']')  //case 2;
            {
                String str="";
                while(st.peek().charAt(0)!='['){
                    str=st.pop()+str;
                }
                st.pop();
                int times=Integer.parseInt(st.pop());
                String spare=str;
                while(times-->1){
                    str+=spare;
                }
                st.push(str);
                i++;
            }
            else if(c[i]=='[')  // case 3;
            {
                st.push("[");
                i++;
            }
            else // letters
            {
                String str="";
                while(i<n && c[i]>='a' && c[i]<='z'){
                    str+=c[i];
                    i++;
                }
                st.push(str);
            }
        }
        StringBuilder res= new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
    }
}
