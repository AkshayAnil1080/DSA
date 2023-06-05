# Ceil in BST
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a&nbsp;BST and a number <strong>X</strong>, find <strong>Ceil of X</strong>.</span><br>
<span style="font-size:18px"><strong>Note:</strong> Ceil(X) is a number that is either equal to X or is immediately greater than X.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>      5
&nbsp;   /   \
&nbsp;  1     7
&nbsp;   \
&nbsp;    2 
&nbsp;     \
&nbsp;      3
X = 3
<strong>Output: </strong>3<strong>
Explanation: </strong>We find 3 in BST, so ceil
of 3 is 3.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>     10
&nbsp;   /  \
&nbsp;  5    11
&nbsp; / \ 
&nbsp;4   7
&nbsp;     \
&nbsp;      8
X = 6
<strong>Output: </strong>7<strong>
Explanation: </strong>We find 7 in BST, so ceil
of 6 is 7.</span></pre>

<p><span style="font-size:18px"><strong>Your task:</strong><br>
You don't need to read input or print anything. Just complete the function <strong>findCeil</strong>() to implement ceil in BST which returns the ceil of&nbsp;<strong>X&nbsp;</strong>in the given&nbsp;<strong>BST.</strong></span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(Height of the BST)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(Height of the BST).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Number of nodes &lt;= 10<sup>5</sup><br>
1 &lt;= Value of nodes&lt;= 10<sup>5</sup></span></p>
</div>