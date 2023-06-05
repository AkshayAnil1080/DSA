# Predecessor and Successor
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">There is BST given with the root node with the key part as an integer only. You need to find the in-order <strong>successor</strong> and <strong>predecessor</strong> of a given key. If either predecessor or successor is not found, then set it to <strong>NULL</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Note</strong>:- In an inorder traversal the number just <strong>smaller</strong> than the target is the predecessor and the number just <strong>greater</strong> than the target is the successor.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>        10
&nbsp;     /   \
&nbsp;    2    11
&nbsp;  /  \ 
&nbsp; 1    5
&nbsp;     /  \
&nbsp;    3    6
&nbsp;     \
&nbsp;      4
key = 8
<strong>Output: <br></strong>6 10<strong>
Explanation: <br></strong>In the given BST the inorder predecessor of 8 is 6 and inorder successor of 8 is 10.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>      8
&nbsp;   /   \
&nbsp;  1     9
&nbsp;   \     \
&nbsp;    4    10
&nbsp;   /
&nbsp;  3
key = 11
<strong>Output: <br></strong>10 -1<strong>
Explanation: <br></strong>In given BST, the inorder predecessor of 11 is 10 whereas it does not have any inorder successor.</span></pre>
<p><span style="font-size: 14pt;"><strong>Your Task: </strong>You don't need to print anything. You need to update <strong>pre </strong>with the predecessor of the key or <strong>NULL </strong>if the predecessor doesn't exist and <strong>succ </strong>to the successor of the key&nbsp;</span><span style="font-size: 18.6667px;">or <strong>NULL </strong>if the </span><span style="font-size: 18.6667px;">successor </span><span style="font-size: 18.6667px;">doesn't exist</span><span style="font-size: 14pt;">. pre and succ are passed as an argument to the function&nbsp;</span><strong><span style="font-size: 18.6667px;">findPreSuc()</span></strong><span style="font-size: 14pt;">.&nbsp;</span></p>
<p><strong style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong><span style="font-weight: 400;">O(Height of the BST).</span><br style="font-weight: 400;"><strong>Expected Auxiliary Space:&nbsp;</strong><span style="font-weight: 400;">O(Height of the BST).</span></strong></p>
<p><strong style="font-size: 18px;">Constraints:&nbsp;</strong><span style="font-size: 18px;"><br>1 &lt;= Number of nodes &lt;= 10<sup>4</sup><br>1 &lt;= key of node &lt;= 10<sup>7</sup><br>1 &lt;= key &lt;= 10<sup>7</sup></span><br>&nbsp;</p></div>