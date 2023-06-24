//{ Driver Code Starts
import java.lang.Math;
import java.io.*;
import java.util.*;
class UniqueRows{
public static void main(String[] args)throws IOException
 {  
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
     PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    String s[]=in.readLine().trim().split(" ");
			int r=Integer.parseInt(s[0]);
			int c=Integer.parseInt(s[1]);
			s=in.readLine().trim().split(" ");
			int ind=0;
			int[][] a=new int [r][c];
			for(int i=0;i<r;i++)
				for(int j=0;j<c;j++)
					a[i][j]=Integer.parseInt(s[ind++]);
			GfG g=new GfG();
			ArrayList<ArrayList<Integer>> arr = g.uniqueRow(a,r,c);
			for(int i = 0;i<arr.size();i++){
			    ArrayList<Integer> demo = arr.get(i);
			    for(int j = 0;j<demo.size();j++){
			        out.print(demo.get(j)+" ");
			    }
			    out.print("$");
			}
			out.println();
		}
		out.close();
 }
}
// } Driver Code Ends


/*Complete the given function*/
class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int arr[][],int n, int m)
    {
        //add code here.
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       
        HashSet<ArrayList<Integer>> set =new LinkedHashSet<>();
        for(int i=0; i<n; i++)
        {
            ArrayList<Integer> curr = new ArrayList<>();
            for(int j=0; j<m; j++)
            {
                curr.add(arr[i][j]);
            }
            if(!set.contains(curr))
            set.add(curr);
        }
        for(ArrayList<Integer> x:  set)
        ans.add(x);
        
        return ans;
    }
}
