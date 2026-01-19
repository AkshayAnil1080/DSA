Best video solution - https://youtu.be/WVRC9NsGovs

class Solution {
    string ans = "";
    stack<char> st;

public:
    void append(char x) {
        // append x into document
        ans.push_back(x);

        // clear redo stack
        while (!st.empty()) {
            st.pop();
        }
    }

    void undo() {
        // undo last change
        if (!ans.empty()) {
            st.push(ans.back());
            ans.pop_back();
        }
    }

    void redo() {
        // redo changes
        if (!st.empty()) {
            ans.push_back(st.top());
            st.pop();
        }
    }

    string read() {
        // read the document
        return ans;
    }
};
