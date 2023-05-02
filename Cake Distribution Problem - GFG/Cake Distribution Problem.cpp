
class Solution{
    public:
    
     bool isPoss(vector<int>& sweetness, int mid, int k) {
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < sweetness.size(); i++) {
            sum += sweetness[i];
            if (sum >= mid) {
                cnt++;
                sum = 0;
            }
        }
        return cnt >= k + 1;
    }



    int maxSweetness(vector<int>& sweetness, int N, int k) {
    // Write your code here.
     int sum = 0;
        int min_sweetness = INT_MAX;
        for (int i = 0; i < N; i++) {
            sum += sweetness[i];
            min_sweetness = min(min_sweetness, sweetness[i]);
        }

        int l = min_sweetness;
        int h = sum;
        int ans = 0;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (isPoss(sweetness, mid, k)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return ans;
    }
};
