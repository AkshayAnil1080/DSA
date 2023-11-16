Binary Tree to CDLL

// class Solution
// { 
//     //Function to convert binary tree into circular doubly linked list.
//       Node head = null, prev = null;
//         ArrayList<Node> al;
//       Node bTreeToClist(Node root){
          
//       al = new ArrayList<>();
//         inorder(root);

//         // Traverse the array to make Circular Doubly Linked List
//         int n = al.size();
//         for (int i = 0; i < n; i++) {
//             Node curr = al.get(i);

//             if (head == null) {
//                 head = prev = curr;
//             } else {
//                 prev.right = curr;
//                 curr.left = prev;
//             }

//             // Before moving to the next node, update prev to curr.
//             prev = curr;
        
//       }

//         // Fixing the last node
//         head.left = prev;
//         prev.right = head;

//         return head;
//     }
//      void inorder(Node curr) {
//         if (curr == null)
//             return;

//         inorder(curr.left);

//         // Add the current node to the inorder list
//         al.add(curr);

//         inorder(curr.right);
//     }
    
// }
class Solution
{ 
    //Function to convert binary tree into circular doubly linked list.
     Node head = null, prev = null;
    Node bTreeToClist(Node root)
    {
         inorder(root);

        // fixing the last node
        head.left = prev;
        prev.right = head;

        return head;
    }

    void inorder(Node curr) {
        if (curr == null)
            return;

        inorder(curr.left);

        if (head == null)
            head = prev = curr;
        else {
            prev.right = curr;
            curr.left = prev;
        }

        // before moving right update prev to curr.
        prev = curr;
        inorder(curr.right);
    }
    
}
