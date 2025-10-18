Best Video Solution with Live Coding: https://youtu.be/ImQsFoO0e4A
LIKE | SHARE | SUBSCRIBE


  

class Solution {
    vector<int> in;
public:
    vector<int> getKClosest(Node* root, int target, int k) {
        vector<int> res;
        inorder(root);
        int n = (int)in.size();
        
        int idx = getElementClosestToTarget(in, target);
        
        int l = idx, h = idx + 1;
        while (k > 0) {
            if (l >= 0 && (h == n || abs(in[l] - target) <= abs(in[h] - target))) {
                res.push_back(in[l]);
                l--;
            } else {
                res.push_back(in[h]);
                h++;
            }
            k--;
        }
        
        return res;
    }
    
private:
    void inorder(Node* root) {
        if (root == nullptr) return;
        inorder(root->left);
        in.push_back(root->data);
        inorder(root->right);
    }
    
    int getElementClosestToTarget(const vector<int>& arr, int target) {
        int l = 0, h = (int)arr.size() - 1, idx = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] <= target) {
                idx = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return idx;
    }
};
