class Solution {
    static int minCandy(int n, int a[]) {
        int ans[] = new int[n];
        
        Arrays.fill(ans, 1);
        //fix right
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[i + 1]) {
                ans[i] =  ans[i+1] + 1;
            }
        }
        // fix left
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                ans[i] = Math.max(ans[i], ans[i-1] + 1);
            }
        }
        int sum = 0;
        for (int x : ans) 
            sum += x;
        return sum;
    }
}
//cpp
class Solution {
  public:
    int minCandy(int n, vector<int> &a) {
        // code here
        int ans[n];
        for (int i =0; i<n; i++)
        ans[i]=1;
        
        //fix right
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[i + 1]) {
                ans[i] =  ans[i+1] + 1;
            }
        }
        // fix left
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                ans[i] = max(ans[i], ans[i-1] + 1);
            }
        }
        int sum = 0;
        for (int x : ans) 
            sum += x;
        return sum;
    }
};
