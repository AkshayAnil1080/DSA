class Solution {
  public:
    string removeKdigits(string S, int K) {
        
       string result;

        for (int i = 0; i < S.length(); i++) {
            char c = S[i];

            while (!result.empty() && result.back() > c && K > 0) {
                result.pop_back(); // make sure characters in result are in ascending order
                K--;               // remove one char
            }

            if (!result.empty() || c != '0') {
                result.push_back(c);
            } // can't have leading '0'
        }

        // remove remaining characters if needed
        while (!result.empty() && K-- > 0) {
            result.pop_back();
        }

        return (result.empty()) ? "0" : result;
    }
    
};
