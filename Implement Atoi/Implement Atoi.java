class Solution
{
    int atoi(String s) {
	// Your code here
	int n = s.length();
	int sign=1;
	int i=0;
	if(s.charAt(0)=='-'){
	    sign=-1; i++;
	}
	
	int num=0;
	for(int j=i; j<n; j++){
	    char ch = s.charAt(j);
	    if(ch>='0' && ch<='9')
	    num = num*10 + ch-'0';
	    else
	    return -1;
	}
	return sign*num;
    }
}
