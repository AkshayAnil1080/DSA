https://leetcode.com/problems/valid-parentheses/description/
https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1



class Solution
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String str)
    {
        // add your code here
        ArrayDeque<Character> st = new ArrayDeque<>();
		
		for ( int i =0 ;  i <str.length() ; i++){
			if(str.charAt(i)=='('  || str.charAt(i) =='['  || str.charAt(i) =='{'  )
				st.push(str.charAt(i));
			
			else{
				if(st.isEmpty()) return false;   // too handle str =")" , "(()))" else throws exception.			
			   
				//not empty
				else if( (str.charAt(i) ==')' && st.pop()=='(') ||
					(str.charAt(i) ==']' && st.pop()=='[') ||
					(str.charAt(i) =='}' && st.pop()=='{') )
			    continue;
				
				else return false;   // when str.charAt(i) is closing say } but pop is opening but not same type say (, [, in this case directly return false;
				// Eg: {(}))}
			}
		}
	return(st.isEmpty());
    }
}
