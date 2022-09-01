class Solution {
    public boolean isValid(String str) {
        ArrayDeque<Character> st = new ArrayDeque<>();
		
		for ( int i =0 ;  i <str.length() ; i++)
		{
			if(str.charAt(i)=='('  || str.charAt(i) =='['  || str.charAt(i) =='{'  )
			{
				st.push(str.charAt(i));
			}
			
			else
			{
				if(st.isEmpty()) return false;   // too handle str =")" , "(()))" else throws exception.			
			   
				
				else if( (str.charAt(i) ==')' && st.peek()=='(') ||
					(str.charAt(i) ==']' && st.peek()=='[') ||
					(str.charAt(i) =='}' && st.peek()=='{') )
			   st.pop();
				
				else return false;   // when str.charAt(i) is closing say } but pop is opening but not same type say (, [, in this case directly return false;
				// Eg: {(}))}
			}
		}
		return(st.isEmpty());
    }
}