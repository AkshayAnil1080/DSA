// class Solution
// {
//     long mod = 1000000007;
//   long DecimalValue(Node head)
//   {
//       long cnt=0;  long ans=0;
//  	   for(Node curr=head; curr!=null;  curr=curr.next)
//  	   cnt++;
 	   
 	  
//  	    for(Node curr=head; curr!=null;  curr=curr.next)
//  	   {
//  	       ans = ans + (curr.data<<(cnt-1));
//  	       cnt--;
//  	   }
//  	  // System.out.print(cnt);
//  	   return ans;
//   }
   
// }

class Solution
{
    long mod = 1000000007;
   long DecimalValue(Node head)
   {
        long ans=0;
 	    for(Node curr=head; curr!=null;  curr=curr.next)
 	       ans = ((ans*2)%mod + curr.data)%mod;

 	   return ans;
   }
   
}
