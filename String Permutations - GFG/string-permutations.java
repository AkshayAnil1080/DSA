//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java




class Solution
{
    ArrayList<String> arr=new ArrayList<>();
    private void permute(String str, int l, int r) 
    { 
        //base condition
        if (l == r) 
            arr.add(str); 
        else
        { //process each character of the remaining string
            for (int i = l; i <= r; i++) 
            { // swap character at index i with current character
                str = swap(str,l,i); 
                permute(str, l+1, r); // recurse for string [i+1, n-1]
                str = swap(str,l,i); // backtrack (restore the string to its original state)
            } 
        } 
    } 
  
    
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
    
    
    public ArrayList<String> permutation(String S)
    {
    	permute(S,0,S.length()-1);
    	Collections.sort(arr); 
    	return arr;
    }
	   
}
