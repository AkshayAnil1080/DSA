//{ Driver Code Starts
//Initial Template for C++
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution{   
public:
    long long solve(int X,int Y,string S){
      //code here
       // code here
	   // X - pr(String s1), Y - rp(String s2)
	    string s1="pr"; string s2="rp";
	   // decide which has greater cost
	   //if X is greater - np - proceed
	   if(X<Y)
	   {
	       int temp = X; X=Y; Y=temp; 
	       
	       string t =s1; s1=s2; s2=t;
	   }
	   
	   long long ans=0;
	   //now we know X has larger cost in any case and has string associated named a.
	   //Stack<Character> st = new Stack<>();
	   stack<char> st;
	   for(int i =S.size()-1; i>=0; i--)
	   {
	     char curr=S[i], first = s1[0], second= s1[1];
	       if(st.size()>0 && curr==first && st.top()==second)
	       {
	           st.pop();
	           ans+=X;
	       }
	       else
	       st.push(curr);
	   }
	   
	  S="";
	   while(st.size()>0)
	  {
	      S.push_back(st.top());
	      st.pop();
	  }
	   
	
	   //in rem string check for the other cost Y, if any instances present , remove them now
	   for(int i =S.size()-1; i>=0; i--)
	   {
	     char curr=S[i], first = s2[0], second= s2[1];
	       if(st.size()>0 && curr==first && st.top()==second)
	       {
	           st.pop();
	           ans+=Y;
	       }
	       else
	       st.push(curr);
	   }
	   return ans;
    }
};

//{ Driver Code Starts.
signed main()
{
  int t;
  cin>>t;
  while(t--)
  {
      int X,Y;
      cin>>X>>Y;
      string S;
      cin>>S;
      Solution obj;
      long long answer=obj.solve(X,Y,S);
      cout<<answer<<endl;
  }
}
// } Driver Code Ends