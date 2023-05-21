# Tree Transformation
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">You are given a tree containing&nbsp;</span><strong>N</strong><span style="font-size: 18px;">&nbsp;nodes in the form of an array&nbsp;</span><strong>P</strong><span style="font-size: 18px;">&nbsp;where&nbsp;</span><strong>P<sub>i</sub></strong><span style="font-size: 18px;">&nbsp;represents the parent of the&nbsp;</span><em>i-</em><span style="font-size: 18px;">th node and&nbsp;</span><strong><span style="font-size: 18px;">P<sub>0</sub></span></strong><span style="font-size: 18px;">&nbsp;= -1 as the tree is rooted at node 0.</span><span style="font-size: 18px;"> In one move, you can merge any two adjacent nodes. Calculate the minimum number of moves required to turn the tree into a <strong>star</strong> tree.</span></p>
<blockquote>
<p><span style="font-size: 18px;">-&gt; Merging adjacent nodes means deleting the edge between them and considering both the nodes as a single one.<br>-&gt;&nbsp;A Star tree is a tree with a center&nbsp;node, and all other nodes are connected to the center node only.</span></p>
</blockquote>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 5
p[] = {-1, 0, 0, 1, 1}
<strong>Output:
</strong>1
<strong>Explanation</strong>: 
Tree looks like:
            0
&nbsp;          / \ 
         1    2 
       /  \ 
      3    4
Merge the edge 0 - 2 in one operation

Our Tree will look like:</span>
&nbsp;           <span style="font-size: 18px;">0
&nbsp;          /
&nbsp;         1
&nbsp;       /  \
&nbsp;      3    4</span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> N = 8
p[] = {-1 0 0 0 0 2 2 5}
<strong>Output:</strong>
2
<strong>Explanation</strong>:
Tree looks like:

              0
          / /  \   \
        1   2   3   4
           / \
          5   6
          |
          7

Merge node 5 to 2, tree will look like

&nbsp;             0
&nbsp;         /  / \  \
&nbsp;        1   2  3  4
&nbsp;           / \
&nbsp;          7   6

and then 2 to 0, finally the tree will be:

&nbsp;            0
&nbsp;       /  / / \  \
       1  7  6  3  4

thus tree formed will be a star tree.
 </span>
</pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read, input, or print anything. Your task is to complete the function <strong><em>solve( )</em>, </strong>which takes integer <strong>N, </strong>and an array <strong>p[ ] </strong>as input parameters and returns the minimum number of moves required to turn the tree into a <strong>star</strong> tree.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N ≤ 10<sup>5</sup><br>0 ≤ p[i] &lt; N<br>p[0] = -1, 0 is the root node.</span></p></div>