class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        
       
        for (int i = 0; i < r; ++i) {
             StringBuilder curr = new StringBuilder();
                for (char ch : s.toCharArray()) {
                    if (ch == '0') 
                        curr.append("01");
                    else 
                        curr.append("10");
                        
                    if(curr.length() > n) //   if(curr.length() > s.length())
                    break;
                }
            
            s = curr.toString();
        }
        return s.charAt(n);
    }
}
