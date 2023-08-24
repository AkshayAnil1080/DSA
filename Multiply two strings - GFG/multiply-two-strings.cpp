//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
 

// } Driver Code Ends
class Solution{
  public:
    /*You are required to complete below function */
    string multiplyStrings(string s1, string s2) {
       int sign = 1;
        if (s1[0] == '-' && s2[0] != '-')
            sign = -1;
        else if (s1[0] != '-' && s2[0] == '-')
            sign = -1;

        int n = s1.length(), m = s2.length();

        int carry = 0, shift, n1, n2, k, pro, sum, i;
        std::vector<int> res(n + m, 0);
        std::string a;
        std::vector<int> product(n + m, 0);
        for (int j = m - 1; j >= 0; j--) {
            if (s2[j] == '-')
                break;

            shift = m - 1 - j;
            carry = 0;

            for (i = 0; i < n + m; i++) {
                product[i] = 0;
            }

            n1 = s2[j] - '0';
            for (i = n - 1, k = n + m - 1 - shift; i >= 0; i--, k--) {
                if (s1[i] == '-')
                    break;
                n2 = s1[i] - '0';
                pro = n1 * n2 + carry;

                if (pro >= 10) {
                    product[k] = pro % 10;
                    pro = pro / 10;
                    carry = pro;
                } else {
                    product[k] = pro;
                    carry = 0;
                }
            }
            if (carry > 0)
                product[k] = carry;

            carry = 0;
            for (i = n + m - 1; i >= 0; i--) {
                sum = product[i] + res[i] + carry;
                if (sum >= 10) {
                    res[i] = sum % 10;
                    sum = sum / 10;
                    carry = sum;
                } else {
                    res[i] = sum;
                    carry = 0;
                }
            }
        }
        i = 0;
        while (i < n + m && res[i] == 0)
            i++;

        if (sign == -1)
            a += '-';
        for (; i < n + m; i++) {
            a += char(res[i] + 48);
        }
        return a;
    }

};

//{ Driver Code Starts.
 
int main() {
     
    int t;
    cin>>t;
    while(t--)
    {
    	string a;
    	string b;
    	cin>>a>>b;
    	Solution obj;
    	cout<<obj.multiplyStrings(a,b)<<endl;
    }
     
}
// } Driver Code Ends