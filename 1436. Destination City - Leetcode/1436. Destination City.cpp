class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        unordered_set<std::string> dest;
        
        for (int i = 0; i < paths.size(); i++) {
            dest.insert(paths[i][0]);
        }

        for (int i = 0; i < paths.size(); i++) {
           string finalDest = paths[i][1];
            if (dest.find(finalDest) == dest.end()) {
                return finalDest;
            }
        }

        return "";
    }
};
