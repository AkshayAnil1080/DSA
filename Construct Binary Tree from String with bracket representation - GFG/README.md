# Construct Binary Tree from String with bracket representation
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Construct a binary tree from a string consisting of parenthesis and integers. The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis. The integer represents the roots value and a pair of parenthesis contains a child binary tree with the same structure. Always start to construct the left child node of the parent first if it exists.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> "1(2)(3)" 
<strong>Output:</strong> 2 1 3
<strong>Explanation:</strong>
           1
          / \
         2   3
Explanation: first pair of parenthesis contains 
left subtree and second one contains the right 
subtree. Inorder of above tree is "2 1 3".</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> "4(2(3)(1))(6(5))"
<strong>Output:</strong> 3 2 1 4 5 6
<strong>Explanation:</strong>
           4
         /   \
        2     6
       / \   / 
      3   1 5   </span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>treeFromString()&nbsp;</strong>which takes a string <strong>str </strong>as input parameter and returns the root node of the tree.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= |str| &lt;= 10<sup>5</sup></span></p>
</div>