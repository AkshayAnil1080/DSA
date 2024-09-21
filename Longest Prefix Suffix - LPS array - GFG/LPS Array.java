
public class lps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abacabad";
		int n=s.length();
		int[]lps= LPS(s);
 		for(int x : lps)
 		System.out.print(x+" ");

	}
	public static int[] LPS(String str)
	{
	    int n = str.length();
	    int lps[] = new int[n];
	    int i = 1, len = 0;
	    lps[0] = 0; // lps[0] is always 0
	     
	    while (i < n)
	    {
	        if (str.charAt(i) == str.charAt(len))
	        {
	            len++;
	            lps[i] = len;
	            i++;
	        }
	        else
	        {
	           
	            if (len == 0)
	            {
	                lps[i] = 0;
	                i++;
	 
	            }
	            else
	            {
	                len = lps[len - 1];
	            }
	        }
	    }
	    return lps;
	}

}
