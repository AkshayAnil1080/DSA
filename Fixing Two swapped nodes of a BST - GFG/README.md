# Fixing Two swapped nodes of a BST
## Hard
<div class="problems_problem_content__Xm_eO"><div><span style="font-size:18px">Two of the nodes of a Binary Search Tree (BST) are swapped. Fix (or correct) the BST by swapping them back. Do not change the structure of the tree.</span></div>

<div><span style="font-size:18px"><strong>Note:</strong> It is guaranteed than the given input will form BST, except for 2 nodes that will be wrong.</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Example 1:</strong></span></div>

<pre><span style="font-size:18px"><strong>Input:
</strong>       10
&nbsp;    /    \
&nbsp;   5      8
&nbsp;  / \
&nbsp; 2   20
<strong>Output: </strong>1<strong>
Explanation:
 </strong><img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20190528095934/FixNodes.jpg" style="height:252px; width:374px"></span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
&nbsp;        </strong>11
&nbsp;      /    \
&nbsp;     3      17
&nbsp;      \    /
&nbsp;       4  10
<strong>Output: </strong>1 
<strong>Explanation:</strong> 
By swapping nodes 11 and 10, the BST 
can be fixed.
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to take any input. Just complete the function <strong>correctBst()&nbsp;</strong>that takes root node as <strong>parameter</strong>. The function should return the root of corrected BST.&nbsp;BST will then be checked by driver code and 0 or 1 will be printed.</span></p>

<div><span style="font-size:18px"><strong>Expected Time Complexity :</strong>&nbsp;O(Number of nodes)</span></div>

<div><span style="font-size:18px"><strong>Expected Auxiliary Space :&nbsp;</strong>O(logN), N = number of nodes</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Number of nodes &lt;= 10^5</span></div>
</div>