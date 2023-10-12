# Floor in BST
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">You are given a BST(Binary Search Tree) with <strong>n</strong>&nbsp;number of nodes and value <strong>x</strong>. your task is to find the greatest value node of the BST which is smaller than or equal to x.<br><strong>Note:</strong> when x is smaller than the smallest node of BST then returns -1.</span></p>
<p><strong><span style="font-size: 18px;">Example:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input:</span></strong><span style="font-size: 18px;">
n = 7               2
                     \
                      81
                    /     \
                 42       87
                   \       \
                    66      90
                   /
                 45
x = 87
<strong>Output:</strong>
87
<strong>Explanation:</strong>
87 is present in tree so floor will be 87.</span>
</pre>
<p><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
n = 4                     6
                           \
                            8
                          /   \
                        7       9
x = 11
<strong>Output:</strong>
9</span>
</pre>
<p><strong><span style="font-size: 18px;">Your Task:-</span></strong><br><span style="font-size: 18px;">You don't need to read input or print anything. Complete the function <strong>floor() </strong>which takes<strong>&nbsp;</strong>the integer&nbsp;<strong>n</strong>&nbsp;and BST&nbsp;and integer x returns the floor&nbsp;value.</span></p>
<p><strong><span style="font-size: 18px;">Constraint:</span></strong><br><span style="font-size: 18px;">1 &lt;= Noda data &lt;= 10<sup>9</sup><br>1 &lt;= n &lt;= 10<sup>5</sup></span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Space Complexity:</strong> O(1)</span></p></div>