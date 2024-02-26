class Solution
{
    List<String> al;
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        al = new ArrayList<>();
        subsets(s, "", 0);
         Collections.sort(al);
         return al;
    }
    void subsets(String s, String curr, int idx)
    {
        if(idx==s.length() && curr.length()>0){
            al.add(curr);
            return;
        }
          if (idx < s.length()) {
        subsets(s, curr, idx+1);
        subsets(s, curr+s.charAt(idx), idx + 1);
        }
    }
}
