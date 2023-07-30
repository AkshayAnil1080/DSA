# Inorder Successor in BST
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a BST, and a reference to a Node x in the BST. Find the Inorder Successor of the given node in the BST.</span><br>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
&nbsp;     2</strong>
&nbsp;   /   \
<strong>   </strong>1     3
K(data of x) = 2
<strong>Output: </strong>3 
<strong>Explanation:</strong> 
Inorder traversal : 1 2 3 
Hence, inorder successor of 2 is 3.</span>
</pre>
<p><br><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong><strong>            </strong> 20
&nbsp;           /   \
&nbsp;          8<strong>     </strong>22
&nbsp;         / \
&nbsp;        4   12
&nbsp;           /<strong>  </strong>\
&nbsp;          10   14
K(data of x) = 8
<strong>Output: </strong>10<strong>
Explanation:
</strong>Inorder traversal: 4 8 10 12 14 20 22
Hence, successor of 8 is 10.</span></pre>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read input or print anything. Your task is to complete the function</span><span style="font-size: 18px;">&nbsp;<strong>inOrderSuccessor()</strong>. This function takes the root node and the reference node as argument and returns the node that is inOrder successor of&nbsp;the reference node. If there is no successor, return null value.</span></p>
<p><br><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong>&nbsp;O(Height of the BST).<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>
<p><br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= N &lt;= 10<sup>5</sup><sup>,</sup> where N is number of nodes</span></p></div>