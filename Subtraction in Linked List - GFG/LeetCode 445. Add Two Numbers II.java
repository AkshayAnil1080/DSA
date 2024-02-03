class Solution {
    public ListNode addTwoNumbers(ListNode first , ListNode second) {
         int carry =0 ;
       ListNode prev=null;
       ListNode temp=null;
       ListNode res=null;
       ListNode curr1=reverse(first);
       ListNode curr2=reverse(second);
        while(curr1!=null || curr2!=null)
        {
           
            int s = carry + ((curr1!=null)? curr1.val: 0) + ((curr2!=null)? curr2.val:0);
            int sum =s%10;
            
             carry = s/10;
             
            temp = new ListNode(sum);
           if(res==null)
           {
               res=temp;
           }
           else
           {
               prev.next=temp;
           }
           prev=temp;
           
        
            
            if(curr1!=null) curr1=curr1.next;
            if(curr2!=null) curr2=curr2.next;
        }
        if(carry>0)
        {
            temp.next=new ListNode(carry);
        }
        
        ListNode ans = reverse(res);
        return ans;
        
    
    }
    ListNode reverse(ListNode root)
    {
        ListNode curr=root;
        ListNode prev =null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
