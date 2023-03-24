//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++


class Solution{   
public:
    string removeBrackets(string Exp){    
         vector<char> s(Exp.begin(), Exp.end());
        int n = Exp.length();

        vector<int> ans(n+1, 1);
        vector<int> lasta(n+1);
        vector<int> nxta(n+1);

        // last[i] = last op explored before index i ,
        int l=-1;
        for(int i=0;i<n;i++){
            lasta[i]=l;
            if(s[i]=='*'||s[i]=='+'||s[i]=='-'||s[i]=='/')
                l=s[i];
        }
        // nxta[i] = next operator explored after index i
        l=-1;
        for(int i=n-1;i>=0;i--){
            nxta[i]=l;
            if(s[i]=='*'||s[i]=='+'||s[i]=='-'||s[i]=='/')
                l=s[i];
        }

        stack<int> st;
        vector<int> sign(256, -1); // index of last occ of operators in exp
        vector<int> mp(256); // stores whether an op is present in sub_expresssion
        vector<char> operand = {'*', '+', '-', '/'};

        for(int p=0;p<n;p++)
        {
            for(char x : operand){
                if(x == s[p]) // string the operators index if present
                    sign[x] = p;
            }
            if(s[p] == '(')
                st.push(p);

            else if(s[p] == ')'){
                int i = st.top(); st.pop();
                int j = p;

                int nxt = nxta[j];
                int last = lasta[i];

                for(char x : operand){
                    if(sign[x] >= i){
                        mp[x] = 1;
                    }
                }
                int ok=0;

                // the sub exp we are comparing, checking if it has redundant braces
                if(i>0 && j+1<n && s[i-1]=='(' && s[j+1]==')') 
                    ok = 1;
                if(mp['+']==0 && mp['*']==0 && mp['-']==0 && mp['/']==0) // no operators are present in b/w sub exp
                    ok = 1;
                if(last==-1 && nxt==-1) // if no opeators before i and after j
                    ok = 1;
                if(last=='/'){

                }
                else if(last=='-'&&(mp['+']==1||mp['-']==1)){
                    
                }
                else if(mp['-']==0&&mp['+']==0){
                    ok = 1;
                }
                else{
                    if((last==-1||last=='+'||last=='-')&&(nxt==-1||nxt=='+'||nxt=='-'))
                        ok = 1;
                }
                if(ok==1){ // not req paranthese
                    ans[i] = 0; // not req ch
                    ans[j] = 0;
                }
            }
        }
        string res = "";
        for(int i=0;i<n;i++){
            if(ans[i]>0){
                res.push_back(s[i]);
            }
        }
        return res;
    }
};


//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        string Exp;
        cin >> Exp;
        
        Solution ob;
        cout << ob.removeBrackets(Exp) << endl;
    }
    return 0; 
} 

// } Driver Code Ends