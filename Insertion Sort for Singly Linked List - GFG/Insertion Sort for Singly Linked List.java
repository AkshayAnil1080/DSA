   */
class Solution
{
    public static Node insertionSort(Node head)
    {
        //code here
        Node ans =  new Node(head.data);
        Node curr=  head.next;
        while(curr!=null)
        {
            //store the next node
            Node next_node = curr.next;
            
            //traverse in ans list and insert the curr node to its right pos
            Node t1 = ans;
            Node preptr = null;
            while(t1!=null && t1.data < curr.data)
            {
                preptr = t1;
                t1=t1.next; 
            }
            //insert a node in starting
            if(preptr==null){
            curr.next=t1;
            ans = curr;
            }
            //at last
            else if(preptr.next==null){
                preptr.next=curr;
                curr.next=null;
            }
            //inserting in middle
            else{
                preptr.next = curr;
                curr.next =t1;
            }
            
            curr = next_node;
        }
        return ans;
    }
}

//c-pp
class Solution
{
    public:
    Node* insertionSort(struct Node* head)
    {
        Node* ans = new Node(head->data);
        Node* curr = head->next;

        while (curr != nullptr) {
            // store the next node
            Node* next_node = curr->next;

            // traverse in ans list and insert the curr node to its right position
            Node* t1 = ans;
            Node* preptr = nullptr;

            while (t1 != nullptr && t1->data < curr->data) {
                preptr = t1;
                t1 = t1->next;
            }

            // insert a node at the beginning
            if (preptr == nullptr) {
                curr->next = t1;
                ans = curr;
            }
            // at last
            else if (preptr->next == nullptr) {
                preptr->next = curr;
                curr->next = nullptr;
            }
            // inserting in the middle
            else {
                preptr->next = curr;
                curr->next = t1;
            }

            curr = next_node;
        }
        return ans;
    }
    
};
