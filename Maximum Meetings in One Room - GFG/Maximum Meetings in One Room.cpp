
class Pair {
public:
    int s, e, x;

    Pair(int s, int e, int x) : s(s), e(e), x(x) {}

    bool operator<(const Pair &a) const {
        return e < a.e;
    }
};

class Solution{
public:
    vector<int> maxMeetings(int N,vector<int> &S,vector<int> &F){
        vector<Pair> arr;

        for (int i = 0; i < N; i++) {
            arr.push_back(Pair(S[i], F[i], i + 1));
        }

        sort(arr.begin(), arr.end());

        int tym = arr[0].e;
        vector<int> ans;
        ans.push_back(arr[0].x);

        for (int i = 1; i < N; i++) {
            if (arr[i].s > tym) {
                ans.push_back(arr[i].x);
                tym = arr[i].e;
            }
        }

        sort(ans.begin(), ans.end());

        return ans;
    }
