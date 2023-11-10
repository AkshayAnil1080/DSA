
class Solution
{
    public:
    //Function to check if two strings are isomorphic.
    bool areIsomorphic(string s1, string s2)
    {
        
        int n1 = s1.length(), n2 = s2.length();
        if (n1 != n2)
            return false;

        unordered_map<char, char> map; // store mapping of s1 to s2
        unordered_map<char, int> vis; // for s2

        for (int i = 0; i < n1; i++) {
            char c1 = s1[i], c2 = s2[i];
            if (map.find(c1) == map.end())
            {
                // c1 seen for the first time
                if (vis.find(c2) == vis.end()) {
                    // c2 also seen for the first time, map c1->c2 and mark c2 vis.
                    map[c1] = c2;
                    vis[c2] = 1;
                } 
                //c1 is seen for first time , but c2 is already mapped somewhere.
                else if (vis[c2] == 1) 
                return false;
            }
            
            else if (map[c1] != c2) 
                return false;
            
        }
        return true;
        
    }
};
