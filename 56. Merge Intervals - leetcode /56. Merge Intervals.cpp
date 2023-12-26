class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
         vector<pair<int, int>> arr;

        for (int i = 0; i < intervals.size(); i++) {
            arr.push_back(make_pair(intervals[i][0], intervals[i][1]));
        }

        sort(arr.begin(), arr.end());

        int res = 0;

        for (int i = 1; i < intervals.size(); i++) {
            if (arr[i].first <= arr[res].second) {
                arr[res].second = max(arr[i].second, arr[res].second);
                arr[res].first = min(arr[i].first, arr[res].first);
            } else {
                res++;
                arr[res] = arr[i];
            }
        }

        vector<vector<int>> result(res + 1, vector<int>(2, 0));

        for (int i = 0; i <= res; i++) {
            result[i][0] = arr[i].first;
            result[i][1] = arr[i].second;
        }

        return result;
    }
};
